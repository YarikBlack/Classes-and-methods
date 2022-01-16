package Box;
public class boxDemo {
    public static void main (String[] args){
        box myBox = new box();
        box myBox1 = new box();

        double vol;

            // adding a value to our box
        myBox.depth = 20;
        myBox.height = 20;
        myBox.width = 20;

          // count area of our box
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Area of box:  " + vol);

          // adding a value to our second box
        myBox1.depth = 15;
        myBox1.height = 20;
        myBox1.width = 10;

          // count area of our second box
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Area of second box:  " + vol);
        
    }
}
