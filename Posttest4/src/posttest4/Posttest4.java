package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Posttest4 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<DataBuku> DataBuku = new ArrayList<> ();
    static ArrayList<Fiksi> Fiksi = new ArrayList<> ();
    static ArrayList<NonFiksi> NonFiksi = new ArrayList<> ();


    static void menu() throws IOException{
        System.out.println("======================================");
        System.out.println("Program Pendataan Buku DI Toko Buku");
        System.out.println("======================================");
        System.out.println("1. Create Data Buku");
        System.out.println("2. Read Data Buku");
        System.out.println("3. Update Data Buku");
        System.out.println("4. Delete Data Buku");
        System.out.println("5. Exit");
        System.out.print("Masukan Pilihan Yang Ingin Anda Lakukan: ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");
        
        switch (pilihan){
            case 1 -> create();
            case 2 -> read();
            case 3 -> update();
            case 4 -> delete();
            case 5 -> System.exit(0);
            default -> System.out.println(" Pilihan Tidak Tersedia!!!");
        }        

    }

    static void create() throws IOException{
        System.out.println("Create Data Buku");
        System.out.println("1. Fiksi");
        System.out.println("2. Non Fiksi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");

        switch (pilihan) {
            case 1 -> {
                System.out.println("+++ Crate Data Buku +++");
                System.out.println("Masukan Judul Buku : ");
                String Judul = br.readLine();
                System.out.println("Masukkan Nama Penulis : ");
                String NamaPenulis = br.readLine();
                System.out.println("Masukkan Nama Penerbit : ");
                String NamaPenerbit = br.readLine();
                System.out.println("Masukkan Harga Buku :Rp. ");
                float HargaBuku = Float.parseFloat(br.readLine());
                System.out.println("Masukkan Kategori Buku : ");
                String Kategori = br.readLine();
                System.out.println("Masukkan Genre Buku : ");
                String Genre = br.readLine();
                System.out.println("Masukkan Umur Pembaca Buku : ");
                int UmurPembaca = Integer.parseInt(br.readLine());
                System.out.println("Masukkan Bahasa Buku : ");
                String Bahasa = br.readLine();
                
                Fiksi fks = new Fiksi(Judul, NamaPenerbit, NamaPenulis, HargaBuku, Kategori, Genre, UmurPembaca, Bahasa);
                
                Fiksi.add(fks);  
                System.out.println("======================================");
                fks.Buku(Judul);
                fks.Buku(NamaPenulis, HargaBuku);
                
                fks.AddData();
                break;
            }
            case 2 -> {
                System.out.println("+++ Crate Data Buku +++");
                System.out.println("Masukan Judul Buku : ");
                String Judul1 = br.readLine();
                System.out.println("Masukkan Nama Penulis : ");
                String NamaPenulis1 = br.readLine();
                System.out.println("Masukkan Nama Penerbit : ");
                String NamaPenerbit1 = br.readLine();
                System.out.println("Masukkan Harga Buku :Rp. ");
                float HargaBuku1 = Float.parseFloat(br.readLine());
                System.out.println("Masukkan Subject Buku : ");
                String Subject1 = br.readLine();
                System.out.println("Masukkan Bahasa Buku : ");
                String Bahasa1 = br.readLine();
                
                NonFiksi nfks = new NonFiksi(Judul1, NamaPenerbit1, NamaPenulis1, HargaBuku1, Subject1, Bahasa1);
                
                NonFiksi.add(nfks);
                System.out.println("======================================");

                nfks.Buku(Judul1);
                nfks.Buku(NamaPenulis1, HargaBuku1);
                nfks.AddData();
                

                break; 
            }                
           
        }
    }static void read() throws IOException{
            System.out.println("Read Data Buku");
            System.out.println("1. Fiksi");
            System.out.println("2. Non Fiksi");
            System.out.print("Masukan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.println("======================================");

            switch (pilihan) {
                case 1 -> {
                    System.out.println("+++ Read Data Buku +++"); 
                    for(int i = 0; i < Fiksi.size(); i++){
                        System.out.print( "Buku ke-" + (i + 1) );
                        System.out.println("\nJudul Buku        :" + Fiksi.get(i).getJudul()+ "\t");
                        System.out.println("Nama Penulis      :" + Fiksi.get(i).getNamaPenulis()+ "\t");
                        System.out.println("Nama Penerbit     :" + Fiksi.get(i).getNamaPenerbit()+ "\t");
                        System.out.println("Harga Buku        :Rp." + Fiksi.get(i).getHargaBuku()+ "\t");
                        System.out.println("Kategori Buku     :" + Fiksi.get(i).getKategori()+ "\t");
                        System.out.println("Genre Buku        :" + Fiksi.get(i).getGenre()+ "\t");
                        System.out.println("Umur Pembaca Buku :" + Fiksi.get(i).getUmurPembaca()+"+" + "\t");
                        System.out.println("Bahasa Buku       :" + Fiksi.get(i).getBahasa()+ "\t");
                        System.out.print("\n");
                    }
                    break; 
                }
                case 2 -> {
                    System.out.println("+++ Read Data Buku +++");
                    for(int i = 0; i < NonFiksi.size(); i++){
                        System.out.print( "Buku ke-" + (i + 1) );
                        System.out.println("\nJudul Buku      :" + NonFiksi.get(i).getJudul()+ "\t");
                        System.out.println("Nama Penulis    :" + NonFiksi.get(i).getNamaPenulis()+ "\t");
                        System.out.println("Nama Penerbit   :" + NonFiksi.get(i).getNamaPenerbit()+ "\t");
                        System.out.println("Harga Buku      :Rp." + NonFiksi.get(i).getHargaBuku()+ "\t");
                        System.out.println("Subject Buku    :" + NonFiksi.get(i).getSubject()+ "\t");
                        System.out.println("Bahasa Buku     :" + NonFiksi.get(i).getBahasa()+ "\t");
                        System.out.print("\n");
                    }
                    break; 
                }  
        }
    }static void update() throws IOException{
        read();
        System.out.println("Update Data Buku");
        System.out.println("1. Fiksi");
        System.out.println("2. Non Fiksi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");

        switch (pilihan) {
            case 1 -> {
                System.out.println("+++ Update Data Buku +++");
                System.out.println("Masukkan Data Buku Ke-");
                int index = Integer.parseInt(br.readLine());
                index--;   
                
                if(index <= Fiksi.size() || index > 0){
                    System.out.println("Masukan Judul Buku : ");
                    Fiksi.get(index).setJudul(br.readLine());
                    System.out.println("Masukkan Nama Penulis : ");
                    Fiksi.get(index).setNamaPenulis(br.readLine());
                    System.out.println("Masukkan Nama Penerbit : ");
                    Fiksi.get(index).setNamaPenerbit(br.readLine());
                    System.out.println("Masukkan Harga Buku :Rp. ");
                    Fiksi.get(index).setHargaBuku(Float.valueOf(br.readLine()));
                    System.out.println("Masukkan Kategori Buku : ");
                    Fiksi.get(index).setKategori(br.readLine());
                    System.out.println("Masukkan Genre Buku : ");
                    Fiksi.get(index).setGenre(br.readLine());
                    System.out.println("Masukkan Umur Pembaca Buku : " +"+");
                    Fiksi.get(index).setUmurPembaca(Integer.parseInt(br.readLine()));
                    System.out.println("Masukkan Bahasa Buku : ");
                    Fiksi.get(index).setBahasa(br.readLine());
                    
                    System.out.println("----------------------------------");
                    System.out.println(" Data Buku Berhasil Di Update");
                    System.out.println("----------------------------------"); 
                }else{
                    System.out.println("Data Tidak ada");
                }
            }
            case 2 -> {
                System.out.println("+++ Update Data Buku +++");
                System.out.println("Masukkan Data Buku Ke-");
                int index1 = Integer.parseInt(br.readLine());
                index1--;   
                
                if(index1 <= NonFiksi.size() || index1 > 0){
                    System.out.println("Masukan Judul Buku : ");
                    NonFiksi.get(index1).setJudul(br.readLine());
                    System.out.println("Masukkan Nama Penulis : ");
                    NonFiksi.get(index1).setNamaPenulis(br.readLine());
                    System.out.println("Masukkan Nama Penerbit : ");
                    NonFiksi.get(index1).setNamaPenerbit(br.readLine());
                    System.out.println("Masukkan Harga Buku :Rp. ");
                    NonFiksi.get(index1).setHargaBuku(Float.valueOf(br.readLine()));
                    System.out.println("Masukkan Subject Buku : ");
                    NonFiksi.get(index1).setSubject(br.readLine());
                    System.out.println("Masukkan Bahasa Buku : ");
                    NonFiksi.get(index1).setBahasa(br.readLine());

                    System.out.println("----------------------------------");
                    System.out.println(" Data Buku Berhasil Di Update");
                    System.out.println("----------------------------------"); 
                }else{
                    System.out.println("Data Tidak ada");
                }
            }
        }
    }static void delete() throws IOException{
        System.out.println("Delete Data Buku");
        System.out.println("1. Fiksi");
        System.out.println("2. Non Fiksi");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.println("======================================");

        switch (pilihan) {
            case 1 -> {
                System.out.print("Input nomor data yang ingin dihapus » ");
                int indexDel = Integer.parseInt(br.readLine());
                Fiksi.remove(indexDel-1);
                System.out.println("Data berhasil dihapus!");               
                break;
            }
            case 2 -> {
                System.out.print("Input nomor data yang ingin dihapus » ");
                int indexDel1 = Integer.parseInt(br.readLine());
                NonFiksi.remove(indexDel1-1);
                System.out.println("Data berhasil dihapus!"); 
                break;
            }
        }
    }
    public static void main(String args[]) throws IOException{
            while(true){
                menu();
            }
        }
}
