public class matakuliah08 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Constructor 1: tanpa parameter, untuk instansiasi kosong dulu
    public matakuliah08() {
    }

    // Constructor 2: berparameter lengkap, semua atribut langsung terisi
    public matakuliah08(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Constructor 3: berparameter sebagian, hanya kode dan nama saja
    public matakuliah08(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    // Method untuk menambah / memperbarui data
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
        System.out.println("Data matakuliah berhasil diperbarui.");
    }
}