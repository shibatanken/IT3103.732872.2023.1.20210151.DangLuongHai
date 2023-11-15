package LAB_02;

import java.util.Objects;
//Luong Hai Dang - 20210151
public class DigitalVideoDisc {
		private String title;
		private String category;
		private String director;
		private int lenght;
		private float cost;
		
		//Luong Hai Dang - 20210151
		// khoi tao thanh vien lop ( class member )
		private static int nbDigitalVideoDiscs = 0; 
		private int id;
		
		public int getId() {
			return id;
		}

		// Constructor methods
		public DigitalVideoDisc(String title) {
			super();
			this.title = title;
		}
		public DigitalVideoDisc(String title, String category, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.cost = cost;
			this.id = nbDigitalVideoDiscs++;
		}
		public DigitalVideoDisc(String title, String category, int lenght, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.lenght = lenght;
			this.cost = cost;
			this.id = nbDigitalVideoDiscs++;
		}
		public DigitalVideoDisc(String title, String category, String director, float cost) {
			super();
			this.title = title;
			this.category = category;
			this.director = director;
			this.cost = cost;
			this.id = nbDigitalVideoDiscs++;
		}
		
		//Luong Hai Dang - 20210151
		// getter method
		public String getTitle() {
			return title;
		}
		public String getCategory() {
			return category;
		}
		public String getDirector() {
			return director;
		}
		public int getLenght() {
			return lenght;
		}
		public float getCost() {
			return cost;
		}
		public String setTitle(String title) {
			return this.title=title;
		}
		@Override
		//Luong Hai Dang - 20210151
		// equal method
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DigitalVideoDisc other = (DigitalVideoDisc) obj;
			return Objects.equals(category, other.category)
					&& Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost)
					&& Objects.equals(director, other.director) && lenght == other.lenght
					&& Objects.equals(title, other.title);
		}
		
		
}