package Models.supplies;

public class Clothing extends Supplies {

    private String size;

    public Clothing(String name, int stock, int supplyId, String description, String size) {
        super(name, stock, supplyId, description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
