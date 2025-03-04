import java.util.Scanner;

public class latian4 {
    public static void main(String[] args){
        Scanner zeta = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = zeta.nextInt();

        for(int i = 1; i <= angka; i++){

            if(i % 2 == 0){
                System.out.printf("%d == Genap\n", i);
            }else{
                System.out.printf("%d == ganjil\n", i);
            }
        }
    }
}
