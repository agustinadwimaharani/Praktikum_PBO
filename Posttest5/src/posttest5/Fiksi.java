package posttest5;

final public class Fiksi extends DataBuku{
    private String Jenis;
    private String Genre;
    private int UmurPembaca;
    private String Bahasa;
    public final String Kategori = "Fiksi";
    

    public Fiksi(String Judul, String NamaPenerbit, String NamaPenulis, int HargaBuku, String Jenis, String Genre, int UmurPembaca, String Bahasa, String Kategori) {
        super(Judul, NamaPenerbit, NamaPenulis, HargaBuku);
        this.Jenis = Jenis;
        this.Genre = Genre;
        this.UmurPembaca = UmurPembaca;
        this.Bahasa = Bahasa;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
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
    
    public String getKategori() {
        return Kategori;
    }
    
    // Overide             
          public void AddData() {
            System.out.println("----------------------------------");
            System.out.println(" Data Buku Berhasil Di Buat");
            System.out.println("----------------------------------");
    }              
}
