
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservasi reservasi = new Reservasi();
        int pilihan;

        do {
            System.out.println("\n===== Sistem Reservasi Hotel =====");
            System.out.println("1. Tambah Tamu Reguler");
            System.out.println("2. Tambah Tamu VIP");
            System.out.println("3. Lihat Tamu");
            System.out.println("4. Perbarui Nama Tamu");
            System.out.println("5. Hapus Tamu");
            System.out.println("6. Lihat Jumlah Reservasi");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            try {
                pilihan = Integer.parseInt(scanner.nextLine());

                switch (pilihan) {
                    case 1:
                        System.out.print("Nama: ");
                        String namaReg = scanner.nextLine();
                        System.out.print("No. Kamar: ");
                        String kamarReg = scanner.nextLine();
                        TamuReguler reg = new TamuReguler(namaReg, kamarReg);
                        reservasi.tambahTamu(reg);
                        reg.sambutan();
                        TamuInfo.instruksiUmum();
                        break;
                    case 2:
                        System.out.print("Nama: ");
                        String namaVIP = scanner.nextLine();
                        System.out.print("No. Kamar: ");
                        String kamarVIP = scanner.nextLine();
                        System.out.print("Fasilitas: ");
                        String fasilitas = scanner.nextLine();
                        TamuVIP vip = new TamuVIP(namaVIP, kamarVIP, fasilitas);
                        reservasi.tambahTamu(vip);
                        vip.sambutan();
                        TamuInfo.instruksiUmum();
                        break;
                    case 3:
                        reservasi.lihatTamu();
                        break;
                    case 4:
                        reservasi.lihatTamu();
                        System.out.print("Masukkan nomor tamu yang ingin diubah: ");
                        int idxUbah = Integer.parseInt(scanner.nextLine()) - 1;
                        System.out.print("Nama baru: ");
                        String namaBaru = scanner.nextLine();
                        reservasi.perbaruiTamu(idxUbah, namaBaru);
                        break;
                    case 5:
                        reservasi.lihatTamu();
                        System.out.print("Masukkan nomor tamu yang ingin dihapus: ");
                        int idxHapus = Integer.parseInt(scanner.nextLine()) - 1;
                        reservasi.hapusTamu(idxHapus);
                        break;
                    case 6:
                        System.out.println("Total reservasi: " + Reservasi.getJumlahReservasi());
                        break;
                    case 7:
                        System.out.println("Program berhenti Terima kasih telah Menggunakan Sistem Ini.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harus berupa angka!");
                pilihan = -1;
            }
        } while (pilihan != 7);

        scanner.close();
    }
}
