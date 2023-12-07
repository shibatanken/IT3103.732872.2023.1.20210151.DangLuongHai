package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Luong Hai Dang - 20210151
public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    private int qtyOrdered;

    // Lấy danh sách các mục trong giỏ hàng
    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    // Lấy số lượng mục trong giỏ hàng
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    // Thêm media vào giỏ hàng
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("media đã có trong giỏ hàng!");
        } else {
            itemsOrdered.add(media);
            System.out.println("Đã thêm tiêu đề media: '" + media.getTitle() + "' vào giỏ hàng.");
        }
    }

    // Xóa media khỏi giỏ hàng
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Đã xóa tiêu đề media '" + media.getTitle() + "' từ giỏ hàng.");
        } else {
            System.out.println("media không có trong giỏ hàng.");
        }
    }
 // Luong Hai Dang - 20210151
    // In thông tin giỏ hàng
    public void printCart() {
        System.out.println("***********************GIỎ HÀNG***********************");
        System.out.println("Các mặt hàng đã đặt hàng:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Tổng chi phí: " + totalCost());
        System.out.println("***************************************************");
    }

    
 // Luong Hai Dang - 20210151
    // Tìm media theo ID
    public void searchByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("media được tìm thấy: " + media.toString());
                found = true;
                break; // Không cần tiếp tục tìm kiếm khi đã tìm thấy
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy media nào có ID: " + id);
        }
    }

    // Tìm media theo title
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        return null;
    }

    // Tính tổng chi phí của giỏ hàng
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
 // Luong Hai Dang - 20210151
    // Xóa toàn bộ giỏ hàng
    public void clearCart() {
        itemsOrdered.clear();
    }

 // Luong Hai Dang - 20210151
    // Comparator để sắp xếp theo Title và Cost
    public static final java.util.Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final java.util.Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    // Sắp xếp theo Cost trước, sau đó theo Title
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, COMPARE_BY_COST_TITLE);
    }

    // Sắp xếp theo Title trước, sau đó theo Cost
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, COMPARE_BY_TITLE_COST);
    }
}
