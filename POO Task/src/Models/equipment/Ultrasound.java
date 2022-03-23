package Models.equipment;

public class Ultrasound extends Equipment  {

    private String result;

    public Ultrasound(String equipName, int equipId, boolean inUse, String result) {
        super(equipName, equipId, inUse);
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
