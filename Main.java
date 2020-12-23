class Main{
    public static void main(String[] args) {

    }
}

class Box{
    public double weidht;
    public double height;
    public double depth;

    Box(double w, double h, double d){
        weidht = w;
        height = h;
        depth = d;
    }
    public double volume(){
        return weidht*depth*height;
    }
}