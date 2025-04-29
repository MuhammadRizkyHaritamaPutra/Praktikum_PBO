
final class TamuReguler extends Tamu implements TamuInfo {
    public TamuReguler(String nama, String nomorKamar) {
        super(nama, nomorKamar);
    }

    @Override
    public String getJenisTamu() {
        return "Reguler";
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah tamu reguler.");
    }

    @Override
    public void sambutan() {
        System.out.println("Selamat datang tamu reguler!");
    }

    @Override
    public String toString() {
        return "Tamu Reguler - " + super.toString();
    }
}
