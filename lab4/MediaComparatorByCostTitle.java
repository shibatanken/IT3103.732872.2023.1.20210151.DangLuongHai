package lab4;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    // Phương thức so sánh media theo giá sau đó theo tiêu đề (nếu giá bằng nhau)
    @Override
    public int compare(Media m1, Media m2) {
        // Sử dụng phương thức comparing() của Comparator để so sánh theo giá và tiêu đề
        // Nếu giá không bằng nhau, trả về kết quả so sánh giá
        // Nếu giá bằng nhau, sẽ so sánh theo tiêu đề và trả về kết quả
        return Comparator.comparing(Media::getCost)
                         .thenComparing(Media::getTitle)
                         .compare(m1, m2);
    }
}
