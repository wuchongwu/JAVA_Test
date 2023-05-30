import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 伍崇武
 * @date 2022-12-14 0014 - 下午 2:56:35
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
//        char a = (char) (Math.random()*4 + 65);
//        char b = 65;
//        System.out.println(a);
//        System.out.println(b);

//        for (int i = 0; i < 5000; i++) {
//            double a = (Math.random() + 0.001);
//            if (a <= 0 || a>= 1) {
//                DecimalFormat df = new DecimalFormat( "0.000");
//                String format = df.format(a);
//                System.out.println(format);
//            }
//        }

//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.forEach(System.out::println);
//        list.add(0, "1");
//        list.forEach(System.out::println);

        Map<String, List<String>> map = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            String s = value.get(0);
        }
//        List<String> list1 = new ArrayList<>();
//        list1.add("a");
//        list1.add("b");
//        list1.add("c");
//        List<String> list2 = new ArrayList<>();
//        list2.add("d");
//        list2.add("e");
//        list2.add("f");
//        List<String> list3 = new ArrayList<>();
//        list2.add("g");
//        list2.add("h");
//        list2.add("i");
//        map.put("1", list1);
//        map.put("2", list2);
//        map.put("3", list3);
//        List<String> all = new ArrayList<>();
//        for (int i = list1.size()-1; i > 0; i--) {
//            if (list1.get(i).equals("b")) {
//                list1.remove(i);
//            }
//        }
//        list1.add("b");
//        list1.forEach(System.out::println);
//        System.out.println("".startsWith(null));

//        Integer sum = 0;
//        double top20 = 0;
//        Integer btn20 = 0;
//        int num = 0;
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        List<Integer> a = list.subList(0, list.size());
//        System.out.println(a);

//        for (Integer i : list) {
//            sum += i/list.size();
//            if (num++ < list.size()*0.2) {
//                top20 += i/list.size()*0.2;
//            }
//        }
//        for (int i = list.size() - 1; i >= list.size()*0.8; i--) {
//            btn20 += list.get(i);
//        }
//        System.out.println(sum);
//        System.out.println(top20);
//        System.out.println(btn20);
//
//        int a = (int) (554*0.2);
//        System.out.println(a);
//
//        int s = 0;
//        for (int i = 123 - 1; i >= (123 - 12); i--) {
//            s++;
//        }
//        System.out.println(s + "次");

//        double d = 46.155565;
//        BigDecimal bg = new BigDecimal(d).setScale(2, BigDecimal.ROUND_HALF_UP);
//        System.out.println(bg.doubleValue());

//        System.out.println("前置业务");
//        try {
//            System.out.println("执行成功1");
//            test(1);
//            System.out.println("执行成功2");
//        } catch (Exception e) {
//        }
//        System.out.println("后置业务");

//        List<Integer> list = new ArrayList<>();
//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(45);
//        int num = 0;
//        for (Integer integer : list) {
//            if (num++ > 15) {
//                int a = 10/list.size();
//                System.out.println("a=" + a);
//            }
//            if (num == list.size()) {
//                System.out.println("最后");
//            }
//        }
//        System.out.println(num);
    }

    public static String test() {
        int i = 9;
        return "test4";
    }
}
