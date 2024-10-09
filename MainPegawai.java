import java.util.Scanner;


public class MainPegawai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Pegawai p1 = new Pegawai("C03", "John", "Bandung", "Keuangan", 8000000);
        // Pegawai p2 = new Pegawai("A02", "Turah", "Bali", "SDM", 7000000);
        // Pegawai p3 = new Pegawai("B03", "Yogi", "Sukapura", "Produksi", 5000000);
        // Pegawai p4 = new Pegawai("A04", "Dany", "Buahbatu", "SDM", 8000000);
        // Pegawai p5 = new Pegawai("B05", "Elif", "Bojongsoang", "Keuangan", 5000000);

        // Kantor listPegawaiKantor = new Kantor();

        // listPegawaiKantor.addPegawai(p1);
        // listPegawaiKantor.addPegawai(p2);
        // listPegawaiKantor.addPegawai(p3);
        // listPegawaiKantor.addPegawai(p4);
        // listPegawaiKantor.addPegawai(p5);

        // listPegawaiKantor.getPegawai();

        // listPegawaiKantor.getPegawai("Keuangan");

        // listPegawaiKantor.getGajiPegawai(5000000);

        Kantor listPegawaiKantor = new Kantor();

        int choice = 0;

        do { 
            System.out.println("\n--Data Pegawai--" +
            "\n1. Input Pegawai" +
            "\n2. Edit Data Pegawai" +
            "\n3. Tampilkan Seluruh Data Pegawai" +
            "\n4. Tampilkan Data Pegawai Berdasarkan Departemen" +
            "\n5. Tampilkan Data Pegawai Berdasarkan Gaji" +
            "\n0. Keluar");

            System.out.print("Pilih opsi: "); 
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Masukkan id pegawai: ");
                    String id = s.nextLine();
                    System.out.print("Masukkan nama pegawai: ");
                    String nama = s.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = s.nextLine();
                    System.out.print("Masukkan departemen: ");
                    String departemen = s.nextLine();
                    System.out.print("Masukkan gaji: ");
                    double gaji = s.nextDouble();
                    s.nextLine();

                    Pegawai p = new Pegawai(id, nama, alamat, departemen, gaji);
                    
                    listPegawaiKantor.addPegawai(p);

                    System.out.println("-- Data pegawai berhasil ditambahkan --");

                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan id pegawai yang ingin diubah: ");
                    String idPeg = s.nextLine();

                    System.out.print("Masukkan nama pegawai: ");
                    nama = s.nextLine();
                    System.out.print("Masukkan alamat: ");
                    alamat = s.nextLine();
                    System.out.print("Masukkan departemen: ");
                    departemen = s.nextLine();
                    System.out.print("Masukkan gaji: ");
                    gaji = s.nextDouble();
                    s.nextLine();

                    listPegawaiKantor.setDataPegawai(idPeg, nama, alamat, departemen, gaji);

                    System.out.println("-- Pegawai dengan id: " + idPeg + " berhasil diubah --");
                    break;
                case 3:
                    System.out.println("\n-- Data Pegawai --");
                    listPegawaiKantor.getPegawai();
                    break;
                case 4:
                    System.out.print("Masukkan nama departemen: ");
                    departemen = s.nextLine();

                    System.out.println("\n-- Data Pegawai Departemen " + departemen);
                    listPegawaiKantor.getPegawai(departemen);
                    break;
                case 5:
                    System.out.print("Masukkan nominal gaji: ");
                    gaji = s.nextDouble();

                    System.out.println("\n-- Data pegawai dengan gaji di atas " + gaji + " --");
                    listPegawaiKantor.getGajiPegawai(gaji);
                    break;
                default:
                    System.out.println("Input tidak valid");
            }

        } while (choice != 0);

    }
}
