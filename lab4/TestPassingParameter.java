package lab4;

public class TestPassingParameter {

	public static void main(String[] args) {
		// Tạo đối tượng DigitalVideoDisc với tiêu đề "Jungle"
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		
		// Tạo đối tượng DigitalVideoDisc với tiêu đề "Cinderella"
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		// Gọi phương thức swap để đổi chỗ giữa hai đối tượng
		swap(jungleDVD, cinderellaDVD);
		
		// In ra tiêu đề của đối tượng jungleDVD sau khi gọi swap
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		// In ra tiêu đề của đối tượng cinderellaDVD sau khi gọi swap
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		// Gọi phương thức changeTitle để thay đổi tiêu đề của đối tượng jungleDVD
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		
		// In ra tiêu đề của đối tượng jungleDVD sau khi gọi changeTitle
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	// Phương thức swap để đổi chỗ giữa hai đối tượng
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	// Phương thức changeTitle để thay đổi tiêu đề của một đối tượng DigitalVideoDisc
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
