package Models.supplies;



public abstract class Supplies {

    private String name;
    private int supplyId;
    private int stock;
    private String description;


    public Supplies(String name, int stock, int supplyId, String description) {
        this.name = name;
        this.stock = stock;
        this.supplyId = supplyId;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
