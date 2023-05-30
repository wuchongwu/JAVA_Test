/**
 * @author 伍崇武
 * @date 2021-09-24 0024 - 下午 8:51
 */
public class FinalDemo {
    public static void main(String[] args) {
        String str1 = "12";
        final String str2 = "1";
        String str3= "1";
        boolean a=(str1==(str2+"2"));
        boolean b=(str1==(str3+"2"));
        System.out.println(a);
        System.out.println(b);
    }
}
