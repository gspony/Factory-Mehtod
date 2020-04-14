/**
 * @Description TODO
 * @Date 2020-04-14
 * @Author MaWeiJun
 * @Version 1.0
 */
public class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return  new Undergraduate();
    }
}
