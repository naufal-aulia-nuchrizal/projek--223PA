import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat daftar buku dalam bentuk array
        Book[] books = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 150000, "Cerita klasik tentang cinta dan ambisi."),
            new Book("1984", "George Orwell", 100000, "Distopia tentang pengawasan totaliter."),
            new Book("Sejarah Indonesia", "Joko Widodo", 25000, "Penjelasan tentang sejarah Indonesia."),
            new Book("Legenda Naga", "Jane Doe", 50000, "Menceritakan bagaimana seorang manusia menjadi kesatria naga.")
        };

        // Input untuk membuat LibraryMember
        LibraryMember student = new Student("", 0, "", ""); 
        student.inputMemberDetails(); // Input detail anggota
        ((Student) student).inputNim(); // Input NIM khusus untuk Student

        LibraryMember lecturer = new Lecturer("", 0, "", "");
        lecturer.inputMemberDetails(); // Input detail dosen
        System.out.println();
        ((Lecturer) lecturer).inputKodeDosen(); // Input Kode Dosen khusus untuk Lecturer

        // Polymorphism: Both student and lecturer are treated as LibraryMember
        student.borrowBook(books[2]); // Alice (Student) borrows "The Great Gatsby"
        lecturer.borrowBook(books[2]); // "The Great Gatsby" is already borrowed, so Mr. Smith can't borrow it.
        lecturer.borrowBook(books[1]); // Mr. Smith (Lecturer) borrows "1984"

        // Mengembalikan buku dengan input keterlambatan
        System.out.println("Berapa hari keterlambatan pengembalian buku oleh student? ");
        int studentLateDays = scanner.nextInt();
        student.returnBook(books[2], studentLateDays); // Alice returns "The Great Gatsby" late by user-input days

        System.out.println("Berapa hari keterlambatan pengembalian buku oleh lecturer? ");
        int lecturerLateDays = scanner.nextInt();
        lecturer.returnBook(books[1], lecturerLateDays); // Mr. Smith returns "1984" on time or late by user-input days

        scanner.close();
    }
}
