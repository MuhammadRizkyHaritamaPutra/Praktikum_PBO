
final class TamuReguler extends Tamu { // final class
    public TamuReguler(String nama, String nomorKamar) {
        super(nama, nomorKamar);
    }

    @Override
    public String getJenisTamu() {
        return "Reguler";
    }

    @Override
    public String toString() {
        return "Tamu Reguler - " + super.toString();
    }
}
