package LAB_02;

public class Aims {
	public static void main(String[] args) {
		Cart Order = new Cart() ;
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece","Anime",5,20.0f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Infinity War","Sci-fi",6,50.5f);
		System.out.println(" Luong Hai Dang - 20210151: Total Cost is "+ Order.totalCost());
		DigitalVideoDisc[] dvdlist = {dvd1 ,dvd2};
		Order.addDigitalVideoDisc(dvdlist);
		}
}
