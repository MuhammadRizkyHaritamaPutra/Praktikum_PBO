class TamuReguler extends Tamu {
    public TamuReguler(String nama, String nomorKamar) {
        super(nama, nomorKamar);
    }

    @Override
    public String toString() {
        return "Tamu Reguler - " + super.toString();
    }
}
