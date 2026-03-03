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

        DataDosen08 data = new DataDosen08();

        System.out.println("\n===== SEMUA DATA DOSEN =====");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== RERATA USIA PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING TUA =====");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
