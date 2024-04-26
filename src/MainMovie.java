package src;
import java.util.Scanner;
public class MainMovie {  
    public static void main(String[] args) {
        User user = new User("salsadiva04@gmail.com", "diva123", "Shabrina Salsabila Diva", 0);
        Scanner scanner = new Scanner(System.in);
        boolean login = false;

        while (true) {
             if (!login) {
                System.out.println("CINEMA HAHA HIHI GABIA BOS");
                System.out.println("(1) Login");
                System.out.println("(2) Register");
                System.out.println("(3) Exit");
            System.out.print("Ayo dipilih ya dipilih :");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                   System.out.print("Masukkan nama: ");
                   String nama = scanner.nextLine();
                   System.out.print("Masukkan email: ");
                   String emailpengguna = scanner.nextLine();
                   System.out.print("Masukkan password: ");
                   String passwordpengguna = scanner.nextLine();
                   if (nama.equals(user.getfullName()) && emailpengguna.equals(user.getEmail()) && passwordpengguna.equals(user.getPasssword())) {
                    System.out.println("Login berhasil.");
                    scanner.nextLine();
                   } else {
                    System.out.println("Login gagal");
                    scanner.nextLine();
                   }
                    break;
                case 2:
                   System.out.print("Masukkan nama: ");
                   String namareg = scanner.nextLine();
                   System.out.print("Masukkan email: ");
                   String emailpenggunareg = scanner.nextLine();
                   System.out.print("Masukkan password: ");
                   String passwordpenggunareg = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Bye.");
                    login = true;
                    break;
                default:
                System.out.println("Menu egk valdi");
                scanner.nextLine();
            }
            }
         }
    }
}




