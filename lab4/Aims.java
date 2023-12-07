package lab4;

import java.util.Scanner;

public class Aims {

    public static void main(String[] args) {
        // Khởi tạo cửa hàng và giỏ hàng
        Store store = new Store();
        Cart cart = new Cart();

        // Tạo và thêm các đối tượng media vào kho
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 15.0f);
        cart.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Aladdin", "Rock", 10.99f, "Battle");
        cd1.addTrack(new Track("Thing", 3));
        cart.addMedia(cd1);

        CompactDisc cd2 = new CompactDisc("The Moon", "Rock", 20.99f, "Floyd");
        cart.addMedia(cd2);
        
        CompactDisc cd3 = new CompactDisc("Abbey Road", "Rock", 18.99f, "The Beatles");
        cd3.addTrack(new Track("Come Together", 4));
        cd3.addTrack(new Track("Something", 3));
        cart.addMedia(cd3);

        Book book1 = new Book("The Great Gatsby", "Novel", 10.5f);
        book1.addAuthor("F. Scott Fitzgerald");
        cart.addMedia(book1);

        Book book2 = new Book("The Chronicles of Narnia", "Fantasy", 15.0f);
        book2.addAuthor("C.S. Lewis");
        cart.addMedia(book2);

        Book book3 = new Book("To Kill a Mockingbird", "Novel", 12.75f);
        book3.addAuthor("Harper Lee");
        cart.addMedia(book3);

        store.addMedia(dvd1, dvd2, dvd3, cd1, cd2, cd3, book1, book2, book3);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu(); // Hiển thị menu chính
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> viewStore(store, sc, cart);
                case 2 -> updateStore(store, sc);
                case 3 -> seeCurrentCart(cart, sc);
                case 0 -> System.out.println("Kết thúc!");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        sc.close();
    }

    // Hiển thị menu chính
    public static void showMenu() {
        System.out.println("**********AIMS***********");
        System.out.println("--------------------------------");
        System.out.println("1. Xem cửa hàng");
        System.out.println("2. Cập nhật cửa hàng");
        System.out.println("3. Xem giỏ hàng hiện tại");
        System.out.println("0. Thoát");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn số: 0-1-2-3: ");
    }

    // Xem cửa hàng và thực hiện các hoạt động trong cửa hàng
    public static void viewStore(Store store, Scanner sc, Cart cart) {
        store.printStore(); // Hiển thị thông tin của kho
        int choice;

        do {
            storeMenu(); // Hiển thị menu
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> seeMediaDetail(store, cart, sc);
                case 2 -> addMediaToCart(store, cart, sc);
                case 3 -> playMedia(store, sc);
                case 4 -> cart.printCart();
                case 0 -> { /* Quay lại menu chính */ }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // Xem chi tiết media trong cửa hàng và thực hiện các hoạt động
    public static void seeMediaDetail(Store store, Cart cart, Scanner sc) {
        System.out.print("Nhập tựa đề của media: ");
        sc.nextLine();
        String title = sc.nextLine();
        Media media = store.searchByTitle(title);

        if (media != null) {
            System.out.println(media.toString());
            int subChoice;

            do {
                mediaDetailsMenu(); // Hiển thị menu
                subChoice = sc.nextInt();

                switch (subChoice) {
                    case 1 -> cart.addMedia(media);
                    case 2 -> playMedia(media);
                    case 0 -> { /* Quay lại menu trước đó */ }
                    default -> System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (subChoice != 0);
        } else {
            System.out.println("Không tìm thấy media!");
        }
    }

    // Thêm media vào giỏ hàng từ cửa hàng
    public static void addMediaToCart(Store store, Cart cart, Scanner sc) {
        System.out.print("Nhập tựa đề của media: ");
        sc.nextLine();
        String titleToAdd = sc.nextLine();
        Media mediaToAdd = store.searchByTitle(titleToAdd);

        if (mediaToAdd != null) {
            cart.addMedia(mediaToAdd);
        } else {
            System.out.println("Không tìm thấy media!");
        }
    }

    // Phát media từ cửa hàng
    public static void playMedia(Store store, Scanner sc) {
        System.out.print("Nhập tựa đề của media: ");
        sc.nextLine();
        String titleToPlay = sc.nextLine();
        Media mediaToPlay = store.searchByTitle(titleToPlay);

        if (mediaToPlay != null) {
            if (mediaToPlay instanceof Playable) {
                ((Playable) mediaToPlay).play();
            } else {
                System.out.println("Media này không thể phát!");
            }
        } else {
            System.out.println("Không tìm thấy media!");
        }
    }

    // Phát media từ giỏ hàng
    public static void playMedia(Media media) {
        if (media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media này không thể phát!");
        }
    }

    // Cập nhật cửa hàng và thực hiện các hoạt động cập nhật
    public static void updateStore(Store store, Scanner sc) {
        int choice;

        do {
            updateStoreMenu(); // Hiển thị menu cập nhật cửa hàng
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> store.addWithDetails(sc);
                case 2 -> removeMediaFromStore(store, sc);
                case 0 -> { /* Quay lại menu chính */ }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // Xóa media khỏi cửa hàng
    public static void removeMediaFromStore(Store store, Scanner sc) {
        System.out.print("Nhập tựa đề của media: ");
        sc.nextLine();
        String titleToRemove = sc.nextLine();
        Media mediaToRemove = store.searchByTitle(titleToRemove);

        if (mediaToRemove != null) {
            store.removeMedia(mediaToRemove);
        } else {
            System.out.println("Không tìm thấy media!");
        }
    }

    // Xem giỏ hàng hiện tại và thực hiện các hoạt động trên giỏ hàng
    public static void seeCurrentCart(Cart cart, Scanner sc) {
        cart.printCart();
        int choice;

        do {
            cartMenu(); // Hiển thị menu giỏ hàng
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> filterMediaInCart(cart, sc);
                case 2 -> sortMediaInCart(cart, sc);
                case 3 -> removeMediaFromCart(cart, sc);
                case 4 -> playMediaFromCart(cart, sc);
                case 5 -> placeOrder(cart, sc);
                case 0 -> { /* Quay lại menu chính */ }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // Lọc media trong giỏ hàng
    public static void filterMediaInCart(Cart cart, Scanner sc) {
        System.out.println("Lựa chọn: ");
        System.out.println("1. Lọc theo tựa đề");
        System.out.println("2. Lọc theo ID");
        System.out.print("Nhập lựa chọn của bạn: ");
        int filterChoice = sc.nextInt();
        sc.nextLine();

        switch (filterChoice) {
            case 1 -> filterMediaByTitle(cart, sc);
            case 2 -> filterMediaById(cart, sc);
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // Lọc media trong giỏ hàng theo tựa đề
    public static void filterMediaByTitle(Cart cart, Scanner sc) {
        System.out.print("Nhập tựa đề để lọc: ");
        String titleFilter = sc.nextLine();

        for (Media media : cart.getItemsOrdered()) {
            if (media.getTitle().toLowerCase().contains(titleFilter.toLowerCase())) {
                System.out.println(media.toString());
            }
        }
    }

    // Lọc media trong giỏ hàng theo ID
    public static void filterMediaById(Cart cart, Scanner sc) {
        System.out.print("Nhập ID để lọc: ");
        int idToFilter = sc.nextInt();

        for (Media media : cart.getItemsOrdered()) {
            if (media.getId() == idToFilter) {
                System.out.println(media.toString());
            }
        }
    }

    // Sắp xếp media trong giỏ hàng
    public static void sortMediaInCart(Cart cart, Scanner sc) {
        System.out.println("Lựa chọn: ");
        System.out.println("1. Sắp xếp theo giá");
        System.out.println("2. Sắp xếp theo tựa đề");
        System.out.print("Nhập lựa chọn của bạn: ");
        int sortChoice = sc.nextInt();

        switch (sortChoice) {
            case 1 -> {
                cart.sortByCostTitle();
                cart.printCart();
            }
            case 2 -> {
                cart.sortByTitleCost();
                cart.printCart();
            }
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // Xóa media khỏi giỏ hàng
    public static void removeMediaFromCart(Cart cart, Scanner sc) {
        System.out.print("Nhập tựa đề của media: ");
        sc.nextLine();
        String titleToRemove = sc.nextLine();
        Media mediaToRemove = cart.searchByTitle(titleToRemove);

        if (mediaToRemove != null) {
            cart.removeMedia(mediaToRemove);
        } else {
            System.out.println("Không tìm thấy media!");
        }
    }

    // Phát một media từ trong giỏ hàng.
    public static void playMediaFromCart(Cart cart, Scanner sc) {
        System.out.print("Nhập tựa đề của media: ");
        sc.nextLine();
        String titleToPlay = sc.nextLine();
        Media mediaToPlay = cart.searchByTitle(titleToPlay);

        if (mediaToPlay != null) {
            playMedia(mediaToPlay);
        } else {
            System.out.println("Không tìm thấy media!");
        }
    }

    // Đặt hàng dựa trên các mục trong giỏ hàng.
    public static void placeOrder(Cart cart, Scanner sc) {
        System.out.println("Tổng số lượng mục: " + cart.getQtyOrdered());
        System.out.println("Tổng chi phí: " + cart.totalCost());
        System.out.print("Bạn có chắc chắn muốn đặt hàng không? (Y/N) ");
        sc.nextLine();
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {
            System.out.println("Đã đặt hàng! Giỏ hàng đã được xóa!");
            cart.clearCart();
        } else if (confirm.equalsIgnoreCase("N")) {
            System.out.println("Đơn hàng không được đặt!");
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // Các hàm menu
    public static void storeMenu() {
        System.out.println("Lựa chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Xem thông tin media");
        System.out.println("2. Thêm media vào giỏ hàng");
        System.out.println("3. Phát media");
        System.out.println("4. Xem giỏ hàng hiện tại");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn số: 0-1-2-3-4: ");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Lựa chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Thêm vào giỏ hàng");
        System.out.println("2. Phát");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn số: 0-1-2: ");
    }

    public static void cartMenu() {
        System.out.println("Lựa chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Lọc media trong giỏ hàng");
        System.out.println("2. Sắp xếp media trong giỏ hàng");
        System.out.println("3. Xóa media khỏi giỏ hàng");
        System.out.println("4. Phát media");
        System.out.println("5. Đặt hàng");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn số: 0-1-2-3-4-5: ");
    }

    public static void updateStoreMenu() {
        System.out.println("Lựa chọn: ");
        System.out.println("1. Thêm media");
        System.out.println("2. Xóa media");
        System.out.println("0. Quay lại");
        System.out.print("Vui lòng chọn số: 0-1-2: ");
    }
}
