package lab4;
public class StoreTest {
	public static void main(String[] args) {
		
		// Tạo một đối tượng Store
		Store store = new Store();
		
		// Tạo và thêm các đối tượng DigitalVideoDisc vào kho
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion", "Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Rager", 87, 18.99f);
		store.addMedia(dvd3);
		
		// Hiển thị thông tin kho trước khi xóa
        System.out.println("Thông tin kho trước khi xóa:");
        store.printStore();
        
        // Thử nghiệm việc xóa một đối tượng từ kho
		store.removeMedia(dvd3);
		
		// Hiển thị thông tin kho sau khi xóa
        System.out.println("Thông tin kho trước khi xóa:");
        store.printStore();
	}
}