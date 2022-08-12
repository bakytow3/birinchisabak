public class Programmer extends Person{
    private String companyName;
public Programmer(String name,String designation,String companyName){
    super( name, designation);
    this.companyName=companyName;
}
public void coding(){
    System.out.println(" I can coding");
}
public String getcompanyName(){
    return companyName;

}
public String toString(){
    return "Name:"+getName()+" "+"designation:"+getDesignation()+" "+"companyName:"+companyName;
}
}
