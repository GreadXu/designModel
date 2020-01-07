package Demo;

/**
 * 汽车经销商
 */
public class VehicleVender {

    /**
     * 获得赛车
     * @param manufacturers 赛车的厂家
     * @return
     */
    public Vehicle getVehicle(VehicleManufacturers manufacturers){
        switch (manufacturers){
            case BMW: return  new BMW();
            case Benz:return new Benz();
            case Ferrari: return  new Ferrari();
            default: return  null;
        }

    }
}
