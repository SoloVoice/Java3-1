import java.util.ArrayList;

public class java312 {
    public static void main(String[] args) {
        String[] arr = new String[] {"один", "два", "три", "четыре", "пять"};
        ArrayList arrList = arrayTransformToArrList(arr);
        for (Object i: arrList) {
            System.out.println(i);
        }
    }

    public static ArrayList arrayTransformToArrList(Object[] arr) {
        ArrayList arrList = new ArrayList();
        for (Object o: arr) {
            arrList.add(o);
        }
        return arrList;
    }
}