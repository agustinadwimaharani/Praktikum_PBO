package posttest1;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Posttest1 {
    public static void main(String[] args) throws IOException {
        
        ArrayList<DataBuku> DataBuku = new ArrayList<DataBuku>();
        
        String Judul;
        String NamaPenulis;
        String NamaPenerbit;
        String KategoriBuku;
        int HargaBuku;
   
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        
        while (true) {
            System.out.println("======================================");
            System.out.println("Program Pendataan Buku DI TOko Buku");
            System.out.println("======================================");
            System.out.println("1. Create Data Buku");
            System.out.println("2. Read Data Buku");
            System.out.println("3. Update Data Buku");
            System.out.println("4. Delete Data Buku");
            System.out.println("5. Exit");
            System.out.println("======================================");
            System.out.print("Masukan Pilihan Yang Ingin Anda Lakukan: ");
            int pilihan = Integer.parseInt(br.readLine());
            
            if (pilihan == 1) {
                System.out.println("+++ Crate Data Buku +++");
                System.out.println("Masukan Judul Buku : ");
                Judul = br.readLine();
                System.out.println("Masukkan Nama Penulis : ");
                NamaPenulis = br.readLine();
                System.out.println("Masukkan Nama Penerbit : ");
                NamaPenerbit = br.readLine();
                System.out.println("Masukkan Kategoori Buku : ");
                KategoriBuku = br.readLine();
                System.out.println("Masukkan Harga Buku : ");
                HargaBuku = Integer.parseInt(br.readLine());
                
                DataBuku dbuku = new DataBuku( Judul, NamaPenerbit, NamaPenulis, KategoriBuku, HargaBuku);
                
                DataBuku.add(dbuku);
                
                System.out.println("----------------------------------");
                System.out.println(" Data Buku Berhasil DiBuat");
                System.out.println("----------------------------------"); 
     
            } else if (pilihan == 2){
                System.out.println("+++ Read Data Buku +++"); 
                for (int i = 0; i < DataBuku.size(); i++) {
                    System.out.println("Judul Buku    :" + DataBuku.get(i).Judul);
                    System.out.println("Nama Penulis  :" + DataBuku.get(i).NamaPenulis);
                    System.out.println("Nama Penerbit :" + DataBuku.get(i).NamaPenerbit);
                    System.out.println("Kategori Buku :" + DataBuku.get(i).KategoriBuku);
                    System.out.println("Harga Buku    :" + DataBuku.get(i).HargaBuku);
                    System.out.print("\n");
                }
            } else if (pilihan == 3){
                System.out.println("+++ Update Data Buku +++"); 
                System.out.println("Masukkan Data Buku Ke-");              
                int index = Integer.parseInt(br.readLine());
                System.out.println("Masukan Judul Buku : ");
                String upJudul = br.readLine();
                System.out.println("Masukkan Nama Penulis : ");
                String upNamaPenulis = br.readLine();
                System.out.println("Masukkan Nama Penerbit : ");
                String upNamaPenerbit = br.readLine();
                System.out.println("Masukkan Kategoori Buku : ");
                String upKategoriBuku = br.readLine();
                System.out.println("Masukkan Harga Buku : ");
                int upHargaBuku = Integer.parseInt(br.readLine());  
                
                // memasukan data yang baru ke array list (mengubah)
                DataBuku.get(index-1).Judul = upJudul;
                DataBuku.get(index-1).NamaPenulis = upNamaPenulis;
                DataBuku.get(index-1).NamaPenerbit = upNamaPenerbit;
                DataBuku.get(index-1).KategoriBuku = upKategoriBuku;
                DataBuku.get(index-1).HargaBuku = upHargaBuku;
                
                System.out.println("----------------------------------");
                System.out.println(" Data Buku Berhasil Di Update");
                System.out.println("----------------------------------");                 
                
            } else if (pilihan == 4){
                System.out.println("+++ Delete Data Buku +++"); 
                for (int i = 0; i < DataBuku.size(); i++) {
                System.out.println("Judul Buku    :" + DataBuku.get(i).Judul);
                System.out.println("Nama Penulis  :" + DataBuku.get(i).NamaPenulis);
                System.out.println("Nama Penerbit :" + DataBuku.get(i).NamaPenerbit);
                System.out.println("Kategori Buku :" + DataBuku.get(i).KategoriBuku);
                System.out.println("Harga Buku    :" + DataBuku.get(i).HargaBuku);
                }
                System.out.print("Masukan Data Buku ke-");
                int index = Integer.parseInt(br.readLine());
                DataBuku.remove(index-1);

            } else if (pilihan == 5){
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia!");
                }
            }
        }
    }

        

