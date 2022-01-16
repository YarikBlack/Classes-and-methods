package Box3;
public class box3 {
    double width;
    double depth;
    double heigth;

    // count and return area of box
    double vol(){
        return width * depth * heigth;
    }

    //set a parameters to box
    public void setDim(double w, double d, double h){
        width = w;
        depth = d;
        heigth = h;
    }
}
