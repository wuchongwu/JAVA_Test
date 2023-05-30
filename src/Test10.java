import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 伍崇武
 * @date 2023-03-29 0029 - 上午 10:18:09
 */
public class Test10 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Test41");
        list.add("Test5");
        list.add("Test6");
        for (String className : list) {
            Class<?> aClass = null;
            try {
                aClass = Class.forName(className);
            } catch (ClassNotFoundException e) {
                continue;
            }
            Object obj = aClass.newInstance();
            Method newsCollect = aClass.getMethod("test");
            try {
                String s = (String) newsCollect.invoke(obj);
                System.out.println(s);
            } catch (Exception e) {
                continue;
            }
            System.out.println("操作");
        }
        System.out.println("后续");
    }
}
