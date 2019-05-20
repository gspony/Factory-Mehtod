/**
 * @Classname SimpleFactory
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/10 15:02
 */
public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type)
    {
        LeiFeng result = null;

        if ("学雷锋的大学生".equals(type))
        {
            result = new Undergraduate();
        }
        else if ("社区志愿者".equals(type))
        {
            result = new Volunteer();
        }

        return result;
    }
}
