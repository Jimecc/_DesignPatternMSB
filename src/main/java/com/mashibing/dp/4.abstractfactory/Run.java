/**
 * @author Jim
 * @Description
 * @createTime 2022年08月17日
 */
public class Run {
    public static void main(String[] args) {


//        Car c = new Car();
//        c.go();
//
//        AK47 ak47 = new AK47();
//        ak47.shoot();
//
//        Bread bread = new Bread();
//        bread.printName();


        AbstractFactory f = new ModernFactory();
        AbstractWeapon weapon = f.createWeapon();
        weapon.shoot();
        AbstractFood food = f.createFood();
        food.printName();
        AbstractVehicle vehicle = f.createVehicle();
        vehicle.go();
    }
}
