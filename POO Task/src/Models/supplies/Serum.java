package Models.supplies;

public class Serum extends Supplies {

    private String serumName;
    private String type;

    public Serum(String name, int stock, int supplyId, String serumName, String description, String type) {
        super(name, stock, supplyId,description );
        this.serumName = serumName;
        this.type = type;
    }
}
