
import java.util.ArrayList;

class Reservasi {
    private static int jumlahReservasi = 0;
    private ArrayList<Tamu> daftarTamu = new ArrayList<>();

    public static int getJumlahReservasi() {
        return jumlahReservasi;
    }

    public void tambahTamu(Tamu tamu) {
        daftarTamu.add(tamu);
        jumlahReservasi++;
        System.out.println("Tamu " + tamu.getClass().getSimpleName() + " berhasil ditambahkan.");
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

    public void perbaruiTamu(int index, String namaBaru) {
        try {
            Tamu tamu = daftarTamu.get(index);
            tamu.setNama(namaBaru);
            System.out.println("Nama tamu berhasil diperbarui.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Kesalahan: Nomor tamu tidak ditemukan!");
        }
    }

    public void hapusTamu(int index) {
        try {
            daftarTamu.remove(index);
            System.out.println("Tamu berhasil dihapus.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Kesalahan: Nomor tamu tidak valid.");
        }
    }
}
