
class Tamu {
    private String nama;
    private String nomorKamar;

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

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Nomor Kamar: " + nomorKamar;
    }
}
