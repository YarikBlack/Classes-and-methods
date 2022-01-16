package Box1;
public class boxDemo1 {
    public static void main(String[] args){
        box1 Box = new box1();
        box1 Box1 = new box1();

        Box.depth = 20;
        Box.height = 15;
        Box.width = 10;
        Box.name = "First BOX"; // set a name to first box

        Box.volume(); // call a method for first box

        Box1.depth = 5;
        Box1.height = 5;
        Box1.width = 10;
        Box1.name = "Second BOX"; // set a name to second box

        Box1.volume(); // call a similar method to second box
    }
}
