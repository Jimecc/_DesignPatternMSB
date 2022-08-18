/**
 * @author Jim
 * @Description
 * @createTime 2022年08月18日
 */
public class ModernFactory extends AbstractFactory{
    @Override
    AbstractFood createFood() {
        return new Bread();
    }

    @Override
    AbstractVehicle createVehicle() {
        return new Car();
    }

    @Override
    AbstractWeapon createWeapon() {

        return new AK47();
    }
}
