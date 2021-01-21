public class java311 {
    public static void main(String[] args) {

        AttackHelicopter h1 = new AttackHelicopter(1);
        AttackHelicopter h2 = new AttackHelicopter(2);
        AttackHelicopter h3 = new AttackHelicopter(3);
        AttackHelicopter h4 = new AttackHelicopter(4);
        AttackHelicopter h5 = new AttackHelicopter(5);

        String[] arrStr = new String[]{"один", "два", "три", "четыре", "пять"};
        changeElements(arrStr, 0, 4);
        Integer[] arrInt = new Integer[]{1, 2, 3, 4, 5};
        changeElements(arrInt, 0, 4);
        Double[] arrDoub = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0};
        changeElements(arrDoub, 0, 4);
        AttackHelicopter[] arrAHs = new AttackHelicopter[]{h1, h2, h3, h4, h5};
        changeElements(arrAHs, 0, 4);

    }

    public static void changeElements(Object[] obj, int x, int y) {
        System.out.println("Первоначальный порядок");
        for (Object num : obj) {
            System.out.println(num);
        }
        System.out.println("");

        Object tempX = obj[x];
        obj[x] = obj[y];
        obj[y] = tempX;

        System.out.println("Порядок после изменения элементов");
        for (Object num : obj) {
            System.out.println(num);
        }
        System.out.println("===============================");
    }
}

class AttackHelicopter {
    int id;

    public AttackHelicopter(int id) {
        this.id = id;
    }
}