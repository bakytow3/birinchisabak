public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(" I can singing");
    }
    public void playGitar(){
        System.out.println("I can playGitar");
    }

    public String getcompanyName() {
        return bandName;
    }
    public String toString(){
        return "Name:"+getName()+" "+"designation:"+getDesignation()+"bandName:"+bandName;
    }
}
