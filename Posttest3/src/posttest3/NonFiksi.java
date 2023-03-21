package posttest3;

public class NonFiksi extends DataBuku{
    private String Subject;  
    private String Bahasa;

    public NonFiksi(String Judul, String NamaPenerbit, String NamaPenulis, Float HargaBuku, String Subject, String Bahasa) {
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
}

