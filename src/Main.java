import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
Farm farm1=new Farm("Tunguch ",5,2,3,"Asan");
        System.out.println(farm1);
        Sheep sheep1=new Sheep(20,1,"Muzhik","koy");
            Sheep sheep2=new Sheep(24,3,"Muzhik","koy");
            Sheep sheep3=new Sheep(30,6,"Urgachy","koy");
            System.out.println(sheep1);
            System.out.println(sheep2);
            System.out.println(sheep3);

Cow cow=new Cow(100,3,"Muzhik","Tolya");
        System.out.println(cow);
        Animal cow2=new Cow(101,3,"Muzhik","Tolya");
        System.out.println(cow2);
        Animal cow3=new Cow(102,4,"urgachy","Tolya");
        System.out.println(cow3);
        Animal cow4=new Cow(103,5,"urgachy","Tolya");
        System.out.println(cow4);
        Animal cow5=new Cow(104,6,"Muzhik","charala");
        System.out.println(cow5);
        Animal horses1=new Horse(160,1,"urgachy","At","Black");
            Animal horses2=new Horse(160,1,"urgachy","At","Charala");
            System.out.println(horses1);
            System.out.println(horses2);
            Farm farm2=new Farm("Alamidin",1,1,1,"Uson");
            System.out.println(farm2);
            Sheep sheep4=new Sheep(20,1,"Muzhik","koy");
            System.out.println(sheep4);
        Animal cow6=new Cow(101,3,"Muzhik","Tolya");
        System.out.println(cow6);
        Animal horses4=new Horse(160,1,"urgachy","At","Black");
        System.out.println(horses4);
    }
}
