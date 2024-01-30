public class Product {

    //this.id
    private int id;
    private String name;
    private double price;
    private double discount;
    private String imageUrl;
    private int unitsInStock;

    public Product() {
        System.out.println("İçi boş olan constructor çalıştı!");
    }

    public Product(int id, String name,double price, double discount, String imageUrl,int unitsInStock){
        this();
        System.out.println("İçi dolu olan constructor çalıştı!");
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount =discount;
        this.imageUrl = imageUrl;
        this.unitsInStock = unitsInStock;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(discount<100){
            this.discount = discount;
        }

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
