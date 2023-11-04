package Bottle;

public class Bottle {
    private Integer totalCapacity;
    private Integer availableLiquid;
    private boolean isOpen;

    public Bottle(Integer totalCapacity, Integer availableLiquid, boolean isOpen) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = 0;
        this.isOpen = isOpen;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public Integer getAvailableLiquid(){
        return availableLiquid;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
}
