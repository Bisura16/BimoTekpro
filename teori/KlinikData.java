package teori;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class KlinikData {

    // List: daftar pasien yang datang
    List<Pasien> daftarPasien = new ArrayList<>();

    // Set: memastikan pasien unik
    Set<String> pasienUnik = new HashSet<>();

    // Map: rekam medis pasien
    Map<String, String> rekamMedis = new HashMap<>();

    // Vector: riwayat penyakit pasien
    Vector<String> riwayat = new Vector<>();

    // Concurrent Collections digunakan ketika banyak petugas atau dokter mengakses
    // data pasien secara bersamaan.
    ConcurrentHashMap<String, String> dataPasienConcurrent = new ConcurrentHashMap<>();

    // Immutable collection: daftar layanan klinik
    List<String> layanan = List.of(
            "Pemeriksaan Umum",
            "Tes Darah",
            "Vaksinasi");

    Set<String> dokter = Set.of(
            "Dr. amor",
            "Dr. anggara",
            "Dr. surya");

    Map<String, String> ruangan = Map.of(
            "R1", "Ruang Pemeriksaan",
            "R2", "Ruang Vaksin",
            "R3", "Laboratorium");

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        pasienUnik.add(pasien.id());
    }

    public void tambahDiagnosa(String id, String diagnosa) {
        rekamMedis.put(id, diagnosa);
        dataPasienConcurrent.put(id, diagnosa);
    }

    // Optional: jika diagnosa tidak ditemukan
    public Optional<String> cariDiagnosa(String id) {
        return Optional.ofNullable(rekamMedis.get(id));
    }

    public void tampilkanInfoKlinik(){
    System.out.println("Layanan Klinik: " + layanan);
    System.out.println("Dokter: " + dokter);
    System.out.println("Ruangan: " + ruangan);
}

}