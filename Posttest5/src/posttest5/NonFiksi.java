package posttest5;

final public class NonFiksi extends DataBuku{
    private String Subject;  
    private String Bahasa;
    private String Kategori = "NonFiksi";


    public NonFiksi(String Judul, String NamaPenerbit, String NamaPenulis, int HargaBuku, String Subject, String Bahasa, String Kategori) {
        super(Judul, NamaPenerbit, NamaPenulis, HargaBuku);
        this.Subject = Subject;
        this.Bahasa = Bahasa;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
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



