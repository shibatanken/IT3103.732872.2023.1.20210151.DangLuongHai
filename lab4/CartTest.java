package lab4;
public class CartTest {
    public static void main(String[] args) {
        // Tạo đối tượng giỏ hàng
        Cart cart = new Cart();
     // Luong Hai Dang - 20210151
        // Tạo và thêm DVD vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 29.99f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 21.50f);
        cart.addMedia(dvd2);
        
        // Tạo và thêm CD vào giỏ hàng
        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", 19.99f, "Michael Jackson");
        cd1.addTrack(new Track("Thriller", 5));
        cd1.addTrack(new Track("Beat It", 4));
        cart.addMedia(cd1);
     // Luong Hai Dang - 20210151
        CompactDisc cd2 = new CompactDisc("Back in Black", "Rock", 14.99f, "AC/DC");
        cd2.addTrack(new Track("Back in Black", 4));
        cd2.addTrack(new Track("You Shook Me All Night Long", 3));
        cart.addMedia(cd2);
     // Luong Hai Dang - 20210151
        // Tạo và thêm sách có nhiều tác giả vào giỏ hàng
        Book book1 = new Book("To Kill a Mockingbird", "Fiction", 12.99f);
        book1.addAuthor("Harper Lee");
        cart.addMedia(book1);
       
        Book book2 = new Book("The Hobbit", "Fantasy", 18.0f);
        book2.addAuthor("J.R.R. Tolkien");
        book2.addAuthor("Alan Lee");
        cart.addMedia(book2);
        
        // In ra thông tin giỏ hàng
        cart.printCart();
    }
}
