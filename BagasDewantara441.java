import java.util.Scanner;

public class theRealTugas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final String ADMIN_USERNAME = "BAGAS DEWANTARA441";
        final String ADMIN_PASSWORD = "ADMIN123";
        final String MAHASISWA_USERNAME = "BAGAS DEWANTARA441";
        final String MAHASISWA_PASSWORD = "admin123";

        System.out.print("pilih: ");
        System.out.print("1. Admin ");
        System.out.print("2. mahasiswa");
        System.out.print("Masukkan pilihan anda: ");
        int input = scan.nextInt();
        scan.nextLine();

        if(input == 1){
            System.out.print("Masukkan username anda: ");
            String username = scan.nextLine();
            System.out.print("Masukkan password anda: ");
            String password = scan.nextLine();

            if(username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)){
                System.out.println("berhasil");
            }else{
                System.out.println("gagal");
            }
        }else if(input == 2){
            System.out.print("Masukkan username mahasiswa anda: ");
            String username_mahasiswa = scan.nextLine();
            System.out.print("Masukkan password mahasiswa anda: ");
            String password_mahasiswa = scan.nextLine();

            if(username_mahasiswa.equals(MAHASISWA_USERNAME) && password_mahasiswa.equals(MAHASISWA_PASSWORD)){
                System.out.println("berhasil");
            }else{
                System.out.println("gagal");
            }
        }

        scan.close();
    }
}
