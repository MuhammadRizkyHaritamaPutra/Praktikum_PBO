
class TamuKorporat extends Tamu {
    private String namaPerusahaan;

    public TamuKorporat(String nama, String nomorKamar, String namaPerusahaan) {
        super(nama, nomorKamar);
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    @Override
    public String toString() {
        return "Tamu Korporat - " + super.toString() + ", Perusahaan: " + namaPerusahaan;
    }
}
