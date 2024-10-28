import java.util.Scanner;

public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String alamat;

    public LibraryMember(String name, int memberId, String alamat) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getAlamat() {
        return alamat;
    }

    public void inputMemberDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan nama anggota: ");
        this.name = scanner.nextLine();
        
        System.out.print("Masukkan ID anggota: ");
        this.memberId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan alamat anggota: ");
        this.alamat = scanner.nextLine();
    }

    // Abstraksi metode umum yang harus diimplementasikan oleh subclass
    public abstract void borrowBook(Book book);

    public abstract void returnBook(Book book, int daysLate);
}
