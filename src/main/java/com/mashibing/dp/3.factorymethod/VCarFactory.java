/**
 * @author Jim
 * @Description
 * @createTime 2022年08月17日
 */
public class VCarFactory {

    public Car createCar(){
        System.out.println("Create one Car");
        return new Car();
    }
}