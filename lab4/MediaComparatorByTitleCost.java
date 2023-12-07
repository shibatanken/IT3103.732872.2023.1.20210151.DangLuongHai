package lab4;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    // Phương thức so sánh media theo tiêu đề sau đó theo giá (nếu tiêu đề bằng nhau)
    @Override
    public int compare(Media m1, Media m2) {
        // Sử dụng phương thức comparing() của Comparator để so sánh theo tiêu đề và giá
        // Nếu tiêu đề không bằng nhau, trả về kết quả so sánh tiêu đề
        // Nếu tiêu đề bằng nhau, sẽ so sánh theo giá và trả về kết quả
        return Comparator.comparing(Media::getTitle)
                         .thenComparing(Media::getCost)
                         .compare(m1, m2);
    }
}
