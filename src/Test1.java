import java.util.Scanner;

/**
 * @author 伍崇武
 * @date 2021/5/24 - 21:29
 * 定义为：每个数字的十进制表示中(0~9)，每个数位各不相同且各个数位之和等于N。
 * 满足条件的数字可能很多，找到其中的最小值即可。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //每个数位各不相同且各个数位之和等于N——1+2+3+4+5+6+7+8+9 = 45，如果大于45一定会重复
        if(N > 45){
            System.out.println(-1);
            return;
        }
        //如果N<10，可以直接返回数字本身
        if(N < 10){
            System.out.println(N);
            return;
        }
        //右侧数位越大，越能保证左侧数位越小，越能保证整个数最小
        int nums = 0;
        int digit = 0;
        for(int i = 9; i>0; i--){
            if(N != 0 && i <= N){
                N -= i;
                nums += (int)Math.pow(10,digit)*i;
                System.out.println(nums);
                digit++;
            }
        }
        System.out.println(nums);
        System.out.println("hello git!");
        System.out.println("master test");
        System.out.println("hot-fix test");
    }
}
