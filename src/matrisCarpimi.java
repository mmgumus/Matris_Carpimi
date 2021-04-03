import java.io.*;
import java.util.*;

public class matrisCarpimi {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("birinci matrisin satirini giriniz ");
        int birSatir = read.nextInt();
        System.out.println("birinci matrisin sutununu giriniz");
        int birSutun = read.nextInt();
        System.out.println("ikinci matrisin satirini giriniz ");
        int ikiSatir = read.nextInt();
        System.out.println("ikinci matrisin sutununu giriniz");
        int ikiSutun = read.nextInt();



        int[][] son = new int[birSatir][ikiSutun];
//        List<int[]> son = new ArrayList<int[]>();;


        if (birSutun == ikiSatir) {

//          ikinci matris olusturuluyor
            int[][] ilkmatris = new int[birSatir][birSutun];

            for (int i = 0; i < birSutun; i++) {
                for (int j = 0; j < birSatir; j++) {
                    System.out.println("ilk matrisin "+j+" satiri "+i+" sutunu giriniz");
                    ilkmatris[j][i] = read.nextInt();
                }
            }

//          Ikinci matris olusturuluyor
            int[][] sonraki = new int[ikiSatir][ikiSutun];

            for (int i = 0; i <ikiSutun ; i++) {
                for (int j = 0; j <ikiSatir ; j++) {
                    System.out.println("sonraki matrisin "+j+" satiri "+i+" sutunu giriniz");
                    sonraki[j][i] = read.nextInt();
                }
            }

//          Carpim islemi yapiliyor
            for (int i = 0; i < birSatir; i++) {
                for (int j = 0; j < ikiSutun; j++) {
                    for (int k = 0; k < birSutun; k++) {

                        son[i][j] += ilkmatris[i][k] * sonraki[j][k];

                    }
                }
            }

//          Ekrana yazdirma islemi
            for (int i = 0; i < birSatir; i++) {
                for (int j = 0; j < ikiSutun; j++) {
                    System.out.print(son[i][j]+" ");
                }
                System.out.print("\n");
            }


        }
//      Hata durumu
        else {
            System.out.println("matrisiniz carpim icin uyumlu degil ");
        }


    }
}
