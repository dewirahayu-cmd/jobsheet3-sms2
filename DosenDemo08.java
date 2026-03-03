import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen08[] arrayOfDosen = new Dosen08[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jenisKelamin = sc.nextLine();

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            System.out.println("-------------------------------");

            arrayOfDosen[i] = new Dosen08(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== DATA DOSEN =====");

        for (Dosen08 d : arrayOfDosen) {
            d.cetakInfo();
        }

        sc.close();
    }
}
