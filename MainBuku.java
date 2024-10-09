public class MainBuku {
    public static void main(String[] args) {

        // instantiating object
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println("Judul buku1: " + buku1.getJudul());
        System.out.println("Pengarang buku1: " + buku1.getPengarang());
        System.out.println("Harga buku1: " + buku1.getHarga());

        System.out.println();

        System.out.println("Judul buku2: " + buku2.getJudul());
        System.out.println("Pengarang buku2: " + buku2.getPengarang());
        System.out.println("Harga buku2: " + buku2.getHarga());
    }
}
