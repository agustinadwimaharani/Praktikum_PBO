package posttest4;

public class DataBuku {
    // property
    String Judul;
    String NamaPenulis;    
    String NamaPenerbit;
    Float HargaBuku;
    
    // constructor  
    public DataBuku(String Judul, String NamaPenerbit, String NamaPenulis, Float HargaBuku){
        this.Judul = Judul;
        this.NamaPenulis = NamaPenulis;
        this.NamaPenerbit = NamaPenerbit;
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


    public Float getHargaBuku() {
        return HargaBuku;
    }


    public void setHargaBuku(Float HargaBuku) {
        this.HargaBuku = HargaBuku;
    }
    
     public void Buku (String NamaPenulis, Float HargaBuku) {
        System.out.println("Dengan nama penulis " + this.NamaPenulis);
        System.out.println("Dengan Harga Buku " + this.HargaBuku);
    }
    

    public void Buku (String Judul) {
        System.out.println("Buku baru dengan judul " + this.Judul);
    }    
}
