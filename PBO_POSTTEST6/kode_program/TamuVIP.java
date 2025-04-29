
class TamuVIP extends Tamu implements TamuInfo {
    private String fasilitasTambahan;

    public TamuVIP(String nama, String nomorKamar, String fasilitasTambahan) {
        super(nama, nomorKamar);
        this.fasilitasTambahan = fasilitasTambahan;
    }

    public String getFasilitasTambahan() {
        return fasilitasTambahan;
    }

    public void setFasilitasTambahan(String fasilitasTambahan) {
        this.fasilitasTambahan = fasilitasTambahan;
    }

    @Override
    public String getJenisTamu() {
        return "VIP";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah tamu VIP.");
    }

    @Override
    public void sambutan() {
        System.out.println("Selamat datang tamu VIP istimewa!");
    }

    @Override
    public String toString() {
        return "Tamu VIP - " + super.toString() + ", Fasilitas: " + fasilitasTambahan;
    }
}
