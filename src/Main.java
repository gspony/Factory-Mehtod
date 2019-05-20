/**
 * @Classname Main
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/10 14:55
 */
public class Main {
    public static void main(String[]args){
        LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentA.buyRice();

        LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentB.sweep();

        LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentC.wash();
    }


}
