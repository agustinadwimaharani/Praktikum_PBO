package posttest3;

public class Fiksi extends DataBuku {
    private String Kategori;
    private String Genre;
    private int UmurPembaca;
    private String Bahasa;    

    public Fiksi(String Judul, String NamaPenerbit, String NamaPenulis, Float HargaBuku, String Kategori, String Genre, int UmurPembaca, String Bahasa) {
        super(Judul, NamaPenerbit, NamaPenulis, HargaBuku);
        this.Kategori = Kategori;
        this.Genre = Genre;
        this.UmurPembaca = UmurPembaca;
        this.Bahasa = Bahasa;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getUmurPembaca() {
        return UmurPembaca;
    }

    public void setUmurPembaca(int UmurPembaca) {
        this.UmurPembaca = UmurPembaca;
    }

    public String getBahasa() {
        return Bahasa;
    }

    public void setBahasa(String Bahasa) {
        this.Bahasa = Bahasa;
    }
}
