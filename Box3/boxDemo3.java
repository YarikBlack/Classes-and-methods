package Box3;
public class boxDemo3 {
    public static void main(String[] args){
        box3 Box = new box3();
        box3 Box1 = new box3();
        
        // set parameters to first box
        Box.setDim(10, 20, 5);
        
        // show area of first box
        System.out.println("Area of first Box: " + Box.vol());

        // set parameters to second box
        Box1.setDim(20, 40, 2);

        // show area of second box
        System.out.println("Area of second Box: " + Box1.vol());
    }
}
