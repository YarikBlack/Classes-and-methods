package Box1;
public class box1{
    double width;
    double height;
    double depth;

    // set a default name for boxes
    String name = "Box";

    double vol;

    // method that count and show Area of boxes
    void volume(){
        vol = width * height * depth;
        System.out.println("Area of " + name + ": " + vol);
    }
}