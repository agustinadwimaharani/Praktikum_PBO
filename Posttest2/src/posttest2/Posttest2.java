package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Posttest2 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<DataBuku> DataBuku = new ArrayList<> ();
    

    static void menu() throws IOException{
        System.out.println("======================================");
        System.out.println("Program Pendataan Buku DI Toko Buku");
        System.out.println("======================================");
        System.out.println("1. Create Data Buku");
        System.out.println("2. Read Data Buku");
        System.out.println("3. Update Data Buku");
        System.out.println("4. Delete Data Buku");
        System.out.println("5. Exit");
        System.out.println("======================================");
        System.out.print("Masukan Pilihan Yang Ingin Anda Lakukan: ");
        int pilihan = Integer.parseInt(br.readLine());
        
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
      
        System.out.println("+++ Crate Data Buku +++");
        System.out.println("Masukan Judul Buku : ");
        String Judul = br.readLine();
        System.out.println("Masukkan Nama Penulis : ");
        String NamaPenulis = br.readLine();
        System.out.println("Masukkan Nama Penerbit : ");
        String NamaPenerbit = br.readLine();
        System.out.println("Masukkan Kategoori Buku : ");
        String KategoriBuku = br.readLine();
        System.out.println("Masukkan Harga Buku :Rp. ");
        float HargaBuku = Float.parseFloat(br.readLine());
                
        DataBuku dbuku = new DataBuku( Judul, NamaPenerbit, NamaPenulis, KategoriBuku, HargaBuku);
                
        DataBuku.add(dbuku);
                
        System.out.println("----------------------------------");
        System.out.println(" Data Buku Berhasil DiBuat");
        System.out.println("----------------------------------"); 
        
    }static void read() throws IOException{
        if(DataBuku.isEmpty()){
            System.out.println("Data Kosong...");
        }else {
            System.out.println("+++ Read Data Buku +++"); 
            for(int i = 0; i < DataBuku.size(); i++){
                 System.out.print( i + 1 );
                System.out.println("\nJudul Buku    :" + DataBuku.get(i).getJudul()+ "\t");
                System.out.println("Nama Penulis  :" + DataBuku.get(i).getNamaPenulis()+ "\t");
                System.out.println("Nama Penerbit :" + DataBuku.get(i).getNamaPenerbit()+ "\t");
                System.out.println("Kategori Buku :" + DataBuku.get(i).getKategoriBuku()+ "\t");
                System.out.println("Harga Buku    :Rp." + DataBuku.get(i).getHargaBuku()+ "\t");
                System.out.print("\n");
            }
        }
    }static void update() throws IOException{
        read();
        System.out.println("+++ Update Data Buku +++");
        System.out.println("Masukkan Data Buku Ke-");
        int index = Integer.parseInt(br.readLine());
        index--;
        
        System.out.println("Masukan Judul Buku : ");
        DataBuku.get(index).setJudul(br.readLine());
        System.out.println("Masukkan Nama Penulis : ");
        DataBuku.get(index).setNamaPenulis(br.readLine());
        System.out.println("Masukkan Nama Penerbit : ");
        DataBuku.get(index).setNamaPenerbit(br.readLine());
        System.out.println("Masukkan Kategoori Buku : ");
        DataBuku.get(index).setKategoriBuku(br.readLine());
        System.out.println("Masukkan Harga Buku :Rp. ");
        DataBuku.get(index).setHargaBuku(Float.valueOf(br.readLine()));        
        
        System.out.println("----------------------------------");
        System.out.println(" Data Buku Berhasil Di Update");
        System.out.println("----------------------------------"); 

    }static void delete() throws IOException{
        System.out.print("Input nomor data yang ingin dihapus » ");
        int indexDel = Integer.parseInt(br.readLine());
        DataBuku.remove(indexDel-1);
    }
    
    public static void main(String args[]) throws IOException{
            while(true){
                menu();
            }
        }
    
}
