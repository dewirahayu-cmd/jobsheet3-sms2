import java.util.Scanner;

public class matakuliahDemo08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah yang akan diinput: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        matakuliah08[] arrayOfMatakuliah = new matakuliah08[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah[i] = new matakuliah08(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}
