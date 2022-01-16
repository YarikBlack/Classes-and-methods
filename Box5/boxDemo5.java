
package Box5;
public class boxDemo5 {
    public static void main(String[] args){
        box5 Box = new box5 (15, 20, 5); // set a parameters to our constructor
        box5 Box1 = new box5 (20, 20, 40);

        // show area of first box
        System.out.println("Area of first Box: " + Box.volume());

        // show area of second box
        System.out.println("Area of second Box: " + Box1.volume());
    }
}
