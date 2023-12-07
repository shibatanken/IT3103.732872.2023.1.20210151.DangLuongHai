package lab4;

//Luong Hai Dang - 20210151
public abstract class Media {
    protected int id;       // ID của media
    protected String title; // Tiêu đề của media
    protected String category; // Thể loại của media
    protected float cost;   // Giá của media
    // Phương thức getter cho ID
    public int getId() {
        return id;
    }
    // Phương thức setter cho ID
    public void setId(int id) {
        this.id = id;
    }
    // Phương thức getter cho tiêu đề
    public String getTitle() {
        return title;
    }
    // Phương thức setter cho tiêu đề
    public void setTitle(String title) {
        this.title = title;
    }
    // Phương thức getter cho thể loại
    public String getCategory() {
        return category;
    }
    // Phương thức setter cho thể loại
    public void setCategory(String category) {
        this.category = category;
    }
    // Phương thức getter cho giá
    public float getCost() {
        return cost;
    }
    // Phương thức setter cho giá
    public void setCost(float cost) {
        this.cost = cost;
    }
    // Luong Hai Dang - 20210151
    // Phương thức kiểm tra xem tiêu đề có khớp với chuỗi đầu vào không
    public boolean isMatch(String title) {
        return this.title.equals(title);
    }
    // Phương thức equals để so sánh media dựa trên tiêu đề
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Media media)) return false;
        return this.isMatch(media.getTitle());
    }
}
