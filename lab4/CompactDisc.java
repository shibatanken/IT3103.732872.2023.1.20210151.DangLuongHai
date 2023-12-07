package lab4;
import java.util.*;


//Luong Hai Dang - 20210151
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private static int nbCD = 0;
	
	public CompactDisc(String title, String category, float cost, String artist) {
		super();
		this.id = ++nbCD;
	    this.artist = artist;
		this.title = title;
		this.category = category;
		this.cost = cost;

	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
	    if(tracks.contains(track)) {
	         System.out.println("Bản nhạc đã có trong danh sách!");
	    }else{
	         tracks.add(track);
	         System.out.println("Đã thêm bản nhạc có tiêu đề: ' " + getTitle() + "'");
	       }
	}

	public void removeTrack(Track track) {
	    if(tracks.contains(track)) {
	         tracks.remove(track);
	         System.out.println("Đã xóa bản nhạc có tiêu đề: ' " + getTitle() + "'");
	    }else{
	         System.out.println("Bản nhạc không có trong danh sách!");
	    }
	}

	public int getLength() {
	    int length = 0;
	    for(Track track : tracks) {
	         length += track.getLength();
	    }
	    return length;
	}
	
	
	//Phương thức play()
	public void play() {
	     System.out.println("Chơi đĩa CD: " + this.getTitle());
	     System.out.println("Tổng chiều dài của CD: " + this.getLength());
	     for (Track track : tracks) {
	            track.play();
	     }
	}
	
	// toString() method
	@Override
	public String toString() {
        return "ID CD: " + getId() + " //- Tiêu đề: " + getTitle() + " //- Nghệ sĩ: " + getArtist() 
        		+ " //- Category:  " + getCategory() 
        		+ " //- Độ dài:  " + getLength() + " //- Giá:  " + getCost() + " $";
	}
}
