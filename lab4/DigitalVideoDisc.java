package lab4;

public class DigitalVideoDisc extends Disc implements Playable {
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//Luong Hai Dang - 20210151
	// Constructor (hàm khởi tạo) 1 tham số, khởi tạo DVD chỉ với tiêu đề
	public DigitalVideoDisc(String title) {
				super();
				this.title = title;
				this.id = ++nbDigitalVideoDiscs;
	}
	// Constructor 3 tham số, khởi tạo DVD với tiêu đề, thể loại và giá
	public DigitalVideoDisc(String title, String category, float cost) {
				super();
				this.title = title;
				this.category = category;
				this.cost = cost;
				this.id = ++nbDigitalVideoDiscs;
	}
	// Constructor 4 tham số, khởi tạo DVD với tiêu đề, thể loại, đạo diễn và giá
	public DigitalVideoDisc(String title, String category, String director, float cost) {
				super();
				this.title = title;
				this.category = category;
				this.director = director;
				this.cost = cost;
				this.id = ++nbDigitalVideoDiscs;
	}

	// Constructor 5 tham số, khởi tạo DVD với tiêu đề, thể loại, đạo diễn, độ dài và giá
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.cost = cost;
			this.id = ++nbDigitalVideoDiscs;//gán id
		}
	//Luong Hai Dang - 20210151
	private static int nbDigitalVideoDiscs = 0; // Class attribute

	public static int getNbDigitalVideoDiscs() {
	    return nbDigitalVideoDiscs;
	}
	
	//Phương thức play()
	public void play() {
        System.out.println("Chơi DVD: " + this.getTitle());
        System.out.println("Chiều dài DVD: " + this.getLength());
    }
	// Luong Hai Dang - 20210151
	

	// Phương thức in ra thông tin của đĩa DVD
	public String toString() {
        return "ID DVD: " + id + " //- Tiêu đề:  " + title + " //- Thể loại:  " + category + 
        		" //- Đạo diễn:  " + director + " //- Chiều dài:  " 
        		+ length + " //- Giá:  " + cost + " $";
	}
}
