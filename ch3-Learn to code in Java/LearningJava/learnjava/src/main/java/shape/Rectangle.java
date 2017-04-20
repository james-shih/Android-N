package shape;

/**
 * Created by James on 2017/4/19.
 */

public class Rectangle extends Shape {

    @Override
    public void calculateArea(int length, int width) {
        this.area = length * width;
        super.calculateArea();
    }
}
