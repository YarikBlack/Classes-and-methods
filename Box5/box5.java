package Box5;
public class box5 {
    double width;
    double heigth;
    double depth;

    box5(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }

    double volume(){
        return width * heigth * depth; 
    }
}
