package Box2;
public class boxDemo2 {
    public static void main(String[] args){
        box2 Box = new box2();
        box2 Box1 = new box2();
        double vol;

        // set a value of first box
        Box.depth = 90;
        Box.heigth = 100;
        Box.width = 90;
        vol = Box.volume(); // call a method from box2 class

        //recive Area of first box
        System.out.println("Area of first Box: " + vol);

        // set a value of second box
        Box1.depth = 10;
        Box1.heigth = 5;
        Box1.width = 10;
        vol = Box1.volume(); // call a similar method to second box

        //recive Area of second box
        System.out.println("Area of second Box: " + vol);
    }
}
