import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 伍崇武
 * @date 2023-03-22 0022 - 上午 9:33:37
 */
public class Test6 {
    public static void main(String[] args) throws ParseException {
//        String a = "sad,fasd,fa";
//        int indexOf = a.indexOf(",");
//        String start = a.substring(0, indexOf + 1);
//        String end = a.substring(indexOf + 1);

        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Date result = format.parse("6:5");
        System.out.println(result);
    }
    public static String test() {
        int i = 90;
        return "test6" + i;
    }
}
