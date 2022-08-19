public class Farm {
    private String address;
    private int cows;
    private int horses;
    private int sheep;
    private String OwerName;

    public Farm(String address,int cows,int horses,int sheep,String OwerName) {
        this.address = address;
        this.OwerName=OwerName;
        this.cows=cows;
        this.horses=horses;
        this.sheep=sheep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public String getOwerName() {
        return OwerName;
    }

    public void setOwerName(String owerName) {
        OwerName = owerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", OwerName='" + OwerName + '\'' +
                '}';
    }
}
