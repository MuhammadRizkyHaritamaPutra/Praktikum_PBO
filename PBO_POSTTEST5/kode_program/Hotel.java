
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservasi reservasi = new Reservasi();
        int pilihan;

        do {
            System.out.println("\n===== Sistem Reservasi Hotel =====");
            System.out.println("1. Tambah Tamu");
            System.out.println("2. Lihat Tamu");
            System.out.println("3. Perbarui Tamu");
            System.out.println("4. Hapus Tamu");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tipe tamu (reguler/vip/korporat): ");
                    String tipe = scanner.nextLine();
                    System.out.print("Masukkan nama tamu: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor kamar: ");
                    String nomorKamar = scanner.nextLine();
                    reservasi.tambahTamu(tipe, nama, nomorKamar);
                    break;
                case 2:
                    reservasi.lihatTamu();
                    break;
                case 3:
                    reservasi.lihatTamu();
                    System.out.print("Masukkan nomor tamu yang ingin diperbarui: ");
                    int indexUpdate = scanner.nextInt() - 1;
                    scanner.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan nomor kamar baru (tidak dapat diubah): ");
                    scanner.nextLine(); // dummy input
                    reservasi.perbaruiTamu(indexUpdate, namaBaru, "");
                    break;
                case 4:
                    reservasi.lihatTamu();
                    System.out.print("Masukkan nomor tamu yang ingin dihapus: ");
                    int indexHapus = scanner.nextInt() - 1;
                    reservasi.hapusTamu(indexHapus);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem reservasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
