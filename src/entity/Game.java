package entity;

public class Game {
    private String name;
    private String description;
    private String price;
    private String createAt;
    private String home;

    public Game(String name, String description, String price, String createAt, String home) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void Game(String name, String description, String price, String createAt, String home) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
        this.home = home;
    }
    @Override
    public String toString(){
        return "tên: " + name + ", mô tả: " + description + ", giá: " + price + ", ngày phát hành: " + createAt + ", trang chủ: " + home;
    }

}
