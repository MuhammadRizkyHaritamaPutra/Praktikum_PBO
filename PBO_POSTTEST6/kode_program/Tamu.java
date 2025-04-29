
abstract class Tamu {
    private final String nomorKamar;
    private String nama;

    public Tamu(String nama, String nomorKamar) {
        this.nama = nama;
        this.nomorKamar = nomorKamar;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract String getJenisTamu();

    public final void cetakTiket() {
        System.out.println("Tiket atas nama: " + nama + ", No. Kamar: " + nomorKamar);
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Nomor Kamar: " + nomorKamar + ", Jenis: " + getJenisTamu();
    }
}
