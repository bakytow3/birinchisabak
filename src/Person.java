public class Person {
    private String name;
    private String designation;

    public Person(String name,String designation){
        this.name=name;
        this.designation=designation;

    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }



    public void learn(){
        System.out.println("I can learn ");
    }

    public void walk(){
        System.out.println("I can walk");

    }
    public void eat(){
        System.out.println(" I can eat");
    }

public String toString( ) {
return "name:"+name+" "+
        " designation:"+ designation;
}
}