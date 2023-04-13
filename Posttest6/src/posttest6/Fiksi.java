package posttest6;

public final class Fiksi extends DataBuku implements Buku{
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
          
// Overide
         public void baca(){
                        System.out.println("Judul Buku                    :" + this.Judul);
                        System.out.println("Nama Penulis                  :" + this.NamaPenulis);
                        System.out.println("Nama Penerbit                 :" + this.NamaPenerbit );
                        System.out.println("Harga Buku                    :Rp." + this.HargaBuku);
                        System.out.println("Kategori Buku                 :" + this.Kategori);
                        System.out.println("Jenis Buku                    :" + this.Jenis);
                        System.out.println("Genre Buku                    :" + this.Genre);
                        System.out.println("Deskripsi Genre Buku          :" + DeskripsiGenre());
                        System.out.println("Umur Pembaca Buku             :" + this.UmurPembaca);
                        System.out.println("Deskripsi Umur Pembaca Buku   :" + DeskripsiUmur());
                        System.out.println("Bahasa Buku                   :" + this.Bahasa);
                        System.out.print("\n");
    }
          
          
    // Overide             
          public String DeskripsiGenre(){
              return "Genre buku adalah kelas atau jenis buku tertentu, dipisahkan berdasarkan kriteria tertentu, seperti nada, konten, atau latar.";
          }
    



     
    // Overide             
          public String DeskripsiUmur(){
              return " batasan umur pada buku adalah supaya kamu dapat membaca buku dengan isi yang sesuai dengan dirimu.";
          }
          
          
          
          
    }     
          

         

         


         





