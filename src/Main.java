import com.company.Circle;
import com.company.Rectangle;
import com.company.Rhombus;
import com.company.Triangle;

public class Main {
    public static void main(String[] args) {
        Squar squar = new Squar(5);
        System.out.println("Square perimetr : "+ squar.getPerimetr());

        Triangle triangle = new Triangle(15,15,15);
        System.out.println("Triangle perimetr : "+ triangle.getPerimetr());

        Rectangle rectangle = new Rectangle(20,45,40,30);
        System.out.println(" Rectangle perimetr : "+ rectangle.getPerimetr());

        Rhombus rhombus = new Rhombus(30,50,40,20);
        System.out.println("Rhombus perimetr :"+ rhombus.getPerimetr());

        Circle circle = new Circle(15);
        System.out.println("Circle perimetr :"+circle.getPerimetr());
    }
}