import com.company.Shape;

public class Squar extends Shape {
    private int x;

    public Squar(int x){
        this.x = x;
    }

    @Override
    public double getPerimetr() {
        return x*4;
    }
}
