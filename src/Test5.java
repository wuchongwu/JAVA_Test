import java.util.Random;

/**
 * @author 伍崇武
 * @date 2023-03-20 0020 - 上午 11:32:06
 */
public class Test5 {
    public static void main(String[] args) {
        int i = new Random().nextInt(10);
        int a = (i % 3) + 1;
        System.out.println(a);
    }
    public static String test() {
        int i = 1/0;
        return "test5";
    }
}
