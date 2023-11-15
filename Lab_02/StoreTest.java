package LAB_02;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store() ;
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece","Anime",20.0f);
		store.addDVD(dvd1);		// them 1 DVD
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Infinity War","Sci-fi","Adam Bill",50.5f);
		store.addDVD(dvd2);		// them 1 DVD
			
		store.print();							// in danh sach DVD
		
		store.removeDVD(dvd1);	// xoa 1 DVD
		
		store.print();          // kiem tra xem da xoa DVD chua
		// Luong Hai Dang - 20210151
		
	}
}
