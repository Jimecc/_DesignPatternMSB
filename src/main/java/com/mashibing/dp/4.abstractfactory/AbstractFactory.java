/**
 * @author Jim
 * @Description 抽象工厂
 * @createTime 2022年08月18日
 */
public abstract class AbstractFactory {
    abstract AbstractFood createFood();
    abstract AbstractVehicle createVehicle();
    abstract AbstractWeapon createWeapon();
}
