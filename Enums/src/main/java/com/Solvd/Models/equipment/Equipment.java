package com.Solvd.Models.equipment;

public abstract class Equipment {

    private String equipName;
    private int equipId;
    private boolean inUse;

    public Equipment(String equipName, int equipId, boolean inUse) {
        this.equipName = equipName;
        this.equipId = equipId;
        this.inUse = inUse;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public int getEquipId() {
        return equipId;
    }

    public void setEquipId(int equipId) {
        this.equipId = equipId;
    }
}
