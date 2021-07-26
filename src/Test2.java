import java.util.*;

/**
 * @author 伍崇武
 * @date 2021/5/30 - 13:42
 *
 * 交换任意两个相邻的字符，代价为0。
 * 将任意一个字符a修改成字符b，代价为 |a - b|（绝对值）。
 * 现在有两个长度相同的字符串X和Y，多多君想知道，如果要将X和Y变成两个一样的字符串，
 * 需要的最少的代价之和是多少。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = 0;
        String X = sc.next();
        String Y = sc.next();
        char[] a = X.toCharArray();
        char[] b = Y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < length; i++) {
            count += Math.abs(Integer.valueOf(a[i]) - Integer.valueOf(b[i]));
        }
        System.out.println(count);
    }
}
