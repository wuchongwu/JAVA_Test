import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 伍崇武
 * @date 2021/5/30 - 14:11
 * 一位雇主想要招聘一个工人，有个人前来应聘，这位雇主让每个人写下期望的薪资，然后再进行选择。
 * 因为这个雇主十分狡猾，ta会选择期望薪资最低的人，但是这个人可能不是唯一的，为了避免纠纷，ta会选择在没有和其他人提出的期望薪资相同的情况下期望薪资最低的人录用。
 * 求这个最低薪资，如果没有合适的人，则输出
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i] - a[i+1] > 0){

            }
        }

    }
}
