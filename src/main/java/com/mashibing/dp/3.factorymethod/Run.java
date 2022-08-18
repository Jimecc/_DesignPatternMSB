/**
 * @author Jim
 * @Description
 * @createTime 2022年08月17日
 */
public class Run {
    public static void main(String[] args) {
        VMoveable car = new Car();
        car.go();
        VMoveable plane = new VPlane();
        plane.go();

        VMoveable vBroom = new VBroom();
        vBroom.go();
        VMoveable vCar = new VCarFactory().createCar();

    }
}
