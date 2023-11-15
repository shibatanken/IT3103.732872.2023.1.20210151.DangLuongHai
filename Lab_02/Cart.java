package LAB_02;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered=0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered<MAX_NUMBER_ORDERED) { 
			qtyOrdered++;
			itemsOrdered[qtyOrdered]=disc;
			System.out.println("Luong Hai Dang - 20210151: Da them san pham vao gio hang !");

		}
		else { 
			System.out.println("Luong Hai Dang - 20210151: Gio hang cua ban da day !");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=1;i<=qtyOrdered;i++) {
			if(itemsOrdered[i].equals(disc)) { 
				for(int j=i;j<=qtyOrdered-1;j++) {
					itemsOrdered[j]=itemsOrdered[j+1];
				}
				qtyOrdered--;
				System.out.println("Luong Hai Dang - 20210151: Da xoa san pham !");
				return;
			}
		}
				System.out.println("Luong Hai Dang - 20210151: Khong tim thay san pham !");
				return;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] listDvd) {
		if(qtyOrdered<MAX_NUMBER_ORDERED) { // co the them item
			qtyOrdered++;
			for(int i=0;i<listDvd.length;i++) {
				itemsOrdered[qtyOrdered]= listDvd[i];	
			}
			System.out.println("Luong Hai Dang - 20210151: Da them san pham vao gio hang !");

		}
		else { // gio hang da full
			System.out.println("Luong Hai Dang - 20210151: Gio hang cua ban da day !");
		}
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered<MAX_NUMBER_ORDERED-1) { // co the them item
			qtyOrdered +=2 ;
			itemsOrdered[qtyOrdered]=dvd1;
			itemsOrdered[qtyOrdered]=dvd2;
			System.out.println("Luong Hai Dang - 20210151: Da them san pham vao gio hang !");

		}
		else { // gio hang da full
			System.out.println("Luong Hai Dang - 20210151: Gio hang cua ban da day !");
		}
	}
	
	public float totalCost() {
		float sum=0;
		for(int i=1;i<=qtyOrdered;i++) {
			sum+=itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	}

