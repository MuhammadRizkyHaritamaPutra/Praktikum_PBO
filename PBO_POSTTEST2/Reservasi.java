import java.util.ArrayList;

class Reservasi {
    private ArrayList<Tamu> daftarTamu = new ArrayList<>();

    public void tambahTamu(String nama, String nomorKamar) {
        daftarTamu.add(new Tamu(nama, nomorKamar));
        System.out.println("Tamu berhasil ditambahkan.");
    }

    public void lihatTamu() {
        if (daftarTamu.isEmpty()) {
            System.out.println("Tidak ada tamu dalam daftar.");
        } else {
            for (int i = 0; i < daftarTamu.size(); i++) {
                System.out.println((i + 1) + ". " + daftarTamu.get(i));
            }
        }
    }

    public void perbaruiTamu(int index, String namaBaru, String nomorKamarBaru) {
        if (index >= 0 && index < daftarTamu.size()) {
            daftarTamu.get(index).setNama(namaBaru);
            daftarTamu.get(index).setNomorKamar(nomorKamarBaru);
            System.out.println("Data tamu berhasil diperbarui.");
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void hapusTamu(int index) {
        if (index >= 0 && index < daftarTamu.size()) {
            daftarTamu.remove(index);
            System.out.println("Tamu berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
}