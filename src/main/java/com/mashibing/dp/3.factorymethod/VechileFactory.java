/**
 * @author Jim
 * @Description 交通工具 ｜ 简单工厂模式
 * @createTime 2022年08月17日
 */
public class VechileFactory {

    public Car createCar(){
        return new Car();
    }


    public VPlane createPlane(){
        return new VPlane();
    }


    public VBroom createBroom(){
        return new VBroom();
    }
}
