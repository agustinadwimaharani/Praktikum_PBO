package posttest2;


public class DataBuku {
    // property
    private String Judul;
    private String NamaPenulis;    
    private String NamaPenerbit;
    private String KategoriBuku;
    private Float HargaBuku;
    
    // constructor  
    public DataBuku(String Judul, String NamaPenerbit, String NamaPenulis, String KategoriBuku, Float HargaBuku){
        this.Judul = Judul;
        this.NamaPenulis = NamaPenulis;
        this.NamaPenerbit = NamaPenerbit;
        this.KategoriBuku = KategoriBuku;
        this.HargaBuku = HargaBuku;        
    }


    public String getJudul() {
        return Judul;
    }


    public void setJudul(String Judul) {
        this.Judul = Judul;
    }


    public String getNamaPenulis() {
        return NamaPenulis;
    }


    public void setNamaPenulis(String NamaPenulis) {
        this.NamaPenulis = NamaPenulis;
    }

  
    public String getNamaPenerbit() {
        return NamaPenerbit;
    }


    public void setNamaPenerbit(String NamaPenerbit) {
        this.NamaPenerbit = NamaPenerbit;
    }


    public String getKategoriBuku() {
        return KategoriBuku;
    }


    public void setKategoriBuku(String KategoriBuku) {
        this.KategoriBuku = KategoriBuku;
    }


    public Float getHargaBuku() {
        return HargaBuku;
    }


    public void setHargaBuku(Float HargaBuku) {
        this.HargaBuku = HargaBuku;
    }
}
