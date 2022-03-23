package Models.supplies;

public class Disposables extends Supplies {

    private String disposableName;

    public Disposables(String name, int stock, int supplyId,String description, String disposableName) {
        super(name, stock, supplyId, description);
        this.disposableName = disposableName;
    }

    public String getDisposableName() {
        return disposableName;
    }

    public void setDisposableName(String disposableName) {
        this.disposableName = disposableName;
    }
}
