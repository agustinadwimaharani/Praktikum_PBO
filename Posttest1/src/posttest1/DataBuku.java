package posttest1;

// class
public class DataBuku {
    
    // property
    String Judul;
    String NamaPenulis;    
    String NamaPenerbit;
    String KategoriBuku;
    int HargaBuku;
    
    
    // constructor  
    public DataBuku(String Judul, String NamaPenerbit, String NamaPenulis, String KategoriBuku, int HargaBuku){
        this.Judul = Judul;
        this.NamaPenulis = NamaPenulis;
        this.NamaPenerbit = NamaPenerbit;
        this.KategoriBuku = KategoriBuku;
        this.HargaBuku = HargaBuku;        
    }
    
}
