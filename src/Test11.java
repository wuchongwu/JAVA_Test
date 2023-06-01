import java.util.ArrayList;
import java.util.List;

/**
 * @author 伍崇武
 * @date 2023-03-29 0029 - 上午 10:39:00
 */
public class Test11 {
    public static void main(String[] args) {
//        String s4 = Test4.test();
//        System.out.println(s4);
//
//        try {
//            String s5 = Test5.test();
//            System.out.println(s5);
//        } catch (Exception e){
//
//        }
//
//        String s6 = Test6.test();
//        System.out.println(s6);

        List<String> list = new ArrayList<>();
        StringBuffer newsLeveSql = new StringBuffer();
        String[] split = "".split(",");
        newsLeveSql.append(" ( ");
        for (String s : split) {
            list.add(s);
        }
        newsLeveSql.append(" ) ");
        // TODO
        System.out.println("修改1");
    }
}
