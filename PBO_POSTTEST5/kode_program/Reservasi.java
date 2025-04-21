
import java.util.ArrayList;

class Reservasi {
    private ArrayList<Tamu> daftarTamu = new ArrayList<>();

    public void tambahTamu(String nama, String nomorKamar) {
        Tamu tamu = new TamuVIP(nama, nomorKamar, "Default Fasilitas");
        daftarTamu.add(tamu);
        System.out.println("Tamu (default) berhasil ditambahkan.");
    }

    public void tambahTamu(Tamu tamu) {
        daftarTamu.add(tamu);
        System.out.println("Tamu " + tamu.getClass().getSimpleName() + " berhasil ditambahkan.");
    }

    public void tambahTamu(String tipe, String nama, String nomorKamar) {
        switch (tipe.toLowerCase()) {
            case "reguler":
                tambahTamu(new TamuReguler(nama, nomorKamar));
                break;
            case "vip":
                tambahTamu(new TamuVIP(nama, nomorKamar, "Akses Kolam Renang, Sarapan Gratis"));
                break;
            case "korporat":
                tambahTamu(new TamuKorporat(nama, nomorKamar, "PT Maju Jaya"));
                break;
            default:
                tambahTamu(nama, nomorKamar);
        }
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
            System.out.println("Nama tamu berhasil diperbarui.");
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
