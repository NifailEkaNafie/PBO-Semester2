import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //deklarasi objek
        mahasiswa datamahasiswa = new mahasiswa();
        Scanner input = new Scanner(System.in);

        //inisialisasi value
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println(" 1. tambah data mahasiswaa");
            System.out.println(" 2. tampilkan nama mahasiswa");
            System.out.println(" 3. keluar");
            System.out.println("masukkan pilihan anda (1-3) : ");
            Scanner objInput = new Scanner(System.in);

            pilihan = objInput.nextInt();
            switch (pilihan){
                case 1:
                    mahasiswa.inputdata();
                    break;
                case 2:
                    System.out.print("data mahasiswa\n");
                    System.out.println(mahasiswa.tampiluniversitas());
                    System.out.println(mahasiswa.tampildataMahasiswa());
                    break;
                case 3:
                    System.out.println("data mahasiswa berhasil ditambahkan");
                default:
                    break;

            }
        }
    }
}
