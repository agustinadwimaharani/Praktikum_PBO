package posttest6;

public abstract class DataBuku {
    // property
    protected String Judul;
    protected String NamaPenulis;    
    protected String NamaPenerbit;
    protected int HargaBuku;
   
    
    
    // constructor  
    public DataBuku(String Judul, String NamaPenerbit, String NamaPenulis, int HargaBuku){
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


    public int getHargaBuku() {
        return HargaBuku;
    }


    public void setHargaBuku(int HargaBuku) {
        this.HargaBuku = HargaBuku;
    }
    
    
    public abstract void AddData();
    
    
    // overload
    final public void Buku (String NamaPenulis, int HargaBuku) {
        System.out.println("Dengan nama penulis " + this.NamaPenulis);
        System.out.println("Dengan Harga Buku Rp. " +  this.HargaBuku);
    }
    

    final public void Buku (String Judul) {
        System.out.println("Buku baru dengan judul " + this.Judul);
    }    
}
