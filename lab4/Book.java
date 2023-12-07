package lab4;

import java.util.ArrayList;
import java.util.List;

//Luong Hai Dang - 20210151
public class Book extends Media {
    private List<String> authors = new ArrayList<>();
    private static int nbBook = 0;

    // Constructor
    public Book(String title, String category, float cost) {
        super();
        this.id = ++nbBook;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Thêm tác giả mới vào danh sách tác giả
    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Tác giả đã có trong danh sách");
        } else {
            authors.add(authorName);
        }
    }

    // Xóa tác giả khỏi danh sách tác giả
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Tác giả không có trong danh sách");
        }
    }

    // Lấy danh sách tất cả các tác giả
    public List<String> getAuthors() {
        return authors;
    }

  //Luong Hai Dang - 20210151
    // Phương thức toString() để trả về thông tin chi tiết của sách
    @Override
    public String toString() {
        String authorsString = String.join(", ", getAuthors());
        return "ID Sách: " + getId() + " // - Tiêu đề: " + getTitle() + " // - Tác giả: "
                + authorsString + " // - Thể loại: "
                + getCategory() + " // - Giá: " + getCost() + " $";
    }
}
