package Box4;
public class box4 {
    double width;
    double heigth;
    double depth;

    // Constructor of class box4
    box4(){
        System.out.println("Construction Box");
        width = 10;
        heigth = 15;
        depth = 5;
    }
    
    //count and show box area
    double volume(){
        return width * depth * heigth;
    }
}
