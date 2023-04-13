package posttest6;

public final class NonFiksi extends DataBuku {
    private String Subject;  
    private String Bahasa;
    public final String Kategori = "NonFiksi";


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
          

          
      public static void CoverBuku(){
        System.out.println("Cover buku yang tersedia :");
        System.out.println("[1] Softcovers");
        System.out.println("[2] Hardcover");
    }
         
        
}



