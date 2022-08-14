public class Circle {
    private double PI;

    public static void area(double radius){
        double area =Math.PI*(radius*radius);
        System.out.println(area);

    }
    public static void circumference(double radius){
        double circumference= Math.PI * 2*radius;
        System.out.println(circumference);
    }

}

