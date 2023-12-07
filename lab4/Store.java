package lab4;
import java.util.*;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
 // Luong Hai Dang - 20210151
    // Thêm media vào kho
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media đã có sẵn trong cửa hàng!");
        } else {
            itemsInStore.add(media);
            System.out.println("Đã thêm media có tiêu đề: '" + media.getTitle() + "' vào cửa hàng.");
        }
    }

    // Xóa media khỏi kho
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Đã xóa media có tiêu đề:'" + media.getTitle() + "' khỏi cửa hàng.");
        } else {
            System.out.println("Media không có trong cửa hàng!");
        }
    }

    // Thêm nhiều media vào kho
    public void addMedia(Media... media) {
        for (Media m : media) {
            addMedia(m);
        }
    }

    // Hiển thị thông tin của kho
    public void printStore() {
        System.out.println("***********************CỬA HÀNG***********************");
        System.out.println("Các mặt hàng trong cửa hàng:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println(i + 1 + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }

    // Tìm kiếm media theo title
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        return null;
    }
    
    
 // Luong Hai Dang - 20210151
    // Thêm media với chi tiết
    public void addWithDetails(Scanner scanner) {
        System.out.print("Nhập loại media bạn muốn thêm (1-Sách; 2-CD; 3-DVD):");
        int mediaType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tiêu đề: ");
        String title = scanner.nextLine();

        System.out.print("Nhập thể loại: ");
        String category = scanner.nextLine();

        System.out.print("Nhập giá: ");
        float cost = scanner.nextFloat();
        scanner.nextLine();

        switch (mediaType) {
            case 1 -> {
                Book book = new Book(title, category, cost);
                addMedia(book);
            }
            case 2 -> {
                System.out.print("Nhập nghệ sĩ: ");
                String artist = scanner.nextLine();
                CompactDisc cd = new CompactDisc(title, category, cost, artist);
                System.out.print("Nhập số lượng bản nhạc: ");
                int numOfTracks = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < numOfTracks; i++) {
                    System.out.print("Nhập tiêu đề của bản nhạc " + (i + 1) + ": ");
                    String trackTitle = scanner.nextLine();
                    System.out.print("Nhập độ dài của bản nhạc " + (i + 1) + ": ");
                    int trackLength = scanner.nextInt();
                    scanner.nextLine();
                    Track track = new Track(trackTitle, trackLength);
                    cd.addTrack(track);
                }
                addMedia(cd);
            }
            case 3 -> {
                System.out.print("Nhập đạo diễn: ");
                String director = scanner.nextLine();
                System.out.print("Nhập độ dài: ");
                int length = scanner.nextInt();
                scanner.nextLine();
                DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
                addMedia(dvd);
            }
            default -> System.out.println("Loại media không hợp lệ.");
        }
    }
}
