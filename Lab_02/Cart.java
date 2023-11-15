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
	public float totalCost() {
		float sum=0;
		for(int i=1;i<=qtyOrdered;i++) {
			sum+=itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	}

