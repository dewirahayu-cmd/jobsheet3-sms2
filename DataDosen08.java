public class DataDosen08 {

    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        for (Dosen08 d : arrayOfDosen) {
            d.cetakInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria    : " + pria);
        System.out.println("Jumlah Dosen Wanita  : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalPria += d.usia;
                countPria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        if (countPria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / countPria));
        if (countWanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / countWanita));
    }

    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tertua = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
    }

    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 termuda = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
    }
}

