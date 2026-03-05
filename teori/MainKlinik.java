package teori;

public class MainKlinik {

    public static void main(String[] args) {

        KlinikData data = new KlinikData();
        AntrianPasien antrian = new AntrianPasien();

        Pasien p1 = new Pasien("P01", "Bimo", 20);
        Pasien p2 = new Pasien("P02", "Andi", 21);

        data.tambahPasien(p1);
        data.tambahPasien(p2);

        data.tambahDiagnosa("P01", "Flu");
        System.out.println("===== SISTEM PENCATATAN KLINIK =====");

        // LIST
        System.out.println("\n=== Daftar Pasien (List) ===");
        for (Pasien p : data.daftarPasien) {
            System.out.println("ID: " + p.id()
                    + " | Nama: " + p.nama()
                    + " | Umur: " + p.umur());
        }

        // SET
        System.out.println("\n=== ID Pasien Unik (Set) ===");
        for (String id : data.pasienUnik) {
            System.out.println(id);
        }

        // QUEUE & DEQUE
        System.out.println("\n=== Sistem Antrian Pasien (Queue & Deque) ===");

        antrian.tambahAntrian("Bimo");
        antrian.tambahAntrian("Andi");
        antrian.pasienDarurat("Pasien Darurat");

        System.out.println("Pasien dipanggil: " + antrian.panggilPasien());

        // CONCURRENT COLLECTION
        System.out.println("\n=== Data Diagnosa (ConcurrentHashMap) ===");
        System.out.println(data.dataPasienConcurrent);

        // OPTIONAL
        System.out.println("\n=== Hasil Pencarian Diagnosa (Optional) ===");
        System.out.println("Diagnosa pasien P01: "
                + data.cariDiagnosa("P01").orElse("Diagnosa belum ada"));

        // IMMUTABLE COLLECTION
        System.out.println("\n=== Informasi Klinik (Immutable Collection) ===");
        data.tampilkanInfoKlinik();
    }
}