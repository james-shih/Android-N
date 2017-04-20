package shape;

/**
 * Created by James on 2017/4/19.
 */

public class Triangle extends Shape {

    @Override
    public void calculateArea(int base, int height) {
        this.area = base * height / 2;
        super.calculateArea();
    }
}
