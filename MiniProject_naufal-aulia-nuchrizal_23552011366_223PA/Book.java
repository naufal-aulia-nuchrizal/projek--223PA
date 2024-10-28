public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private int harga;
    private String deskripsi;

    // Constructor
    public Book(String title, String author, int harga, String deskripsi) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default: Book is available when created
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter to change availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Getter for description
    public String getDeskripsi() {
        return deskripsi;
    }

    // Getter for price
    public int getHarga() {
        return harga;
    }
}
