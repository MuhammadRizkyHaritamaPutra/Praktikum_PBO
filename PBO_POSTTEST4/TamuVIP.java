
class TamuVIP extends Tamu {
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
    public String toString() {
        return "Tamu VIP - " + super.toString() + ", Fasilitas: " + fasilitasTambahan;
    }
}
