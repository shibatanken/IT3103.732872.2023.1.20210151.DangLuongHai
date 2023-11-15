package LAB_02;

// Luong Hai Dang - 20210151
public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
	
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",19.95f);
		// Add The Lion King, id =1
		cart.addDigitalVideoDisc(dvd1);    
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War","Science Fiction","George Lucas",24.95f);
		cart.addDigitalVideoDisc(dvd2);		//  Add Star War, id = 2
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		cart.addDigitalVideoDisc(dvd3);		// Add Aladin, id = 3
		
		System.out.println("**************Cart****************");
	    // goi phuong thuc print in ra cac DVD duoc ordered
		cart.print();						
		
		System.out.println("**********************************");
		System.out.println("Luong Hai Dang - 20210151");


		cart.searchDVDById(1);				 
		cart.searchDVDByTitle("Star War");	
		cart.searchDVDById(4);              
		cart.searchDVDByTitle("The Avenger"); 
		
	}
}
