import java.util.ArrayList;

public class java313 {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box();
        Box<Apple> appleBox = new Box();
        Box<Orange> anotherOrangeBox = new Box();
        Box<Apple> anotherAppleBox = new Box();

        orangeBox.addObj(new Orange(1));
        orangeBox.addObj(new Orange(2));
        orangeBox.addObj(new Orange(3));

        appleBox.addObj(new Apple(1));
        appleBox.addObj(new Apple(2));
        appleBox.addObj(new Apple(3));

        orangeBox.getStorage();

        appleBox.getStorage();

        appleBox.compare(orangeBox);

        appleBox.transfer(anotherAppleBox);

        anotherAppleBox.getStorage();

        appleBox.getStorage();

    }
}

interface Fruits {
    double getWeight();
}

class Orange implements Fruits {
    private int id;
    private double weight = 1.5;

    public Orange(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Экземпляр объекта " + id;
    }
}

class Apple implements Fruits {
    private int id;
    private double weight = 1.0;

    public Apple(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Экземпляр объекта " + id;
    }
}

class Box<T extends Fruits> {
    private ArrayList<T> Storage = new ArrayList<>();
    private double weight;

    public void addObj(T obj) {
        Storage.add(obj);
        this.weight += obj.getWeight();

    }

    public void getStorage() {
        System.out.println("В контейнере содержатся:");
        for (T n : Storage) {
            System.out.println(n);
        }
        System.out.println("Вес контейнера: " + weight + "\n");
    }

    public double getStorageWeightToCompare() {
        return weight;
    }

    public boolean compare(Box obj) {
        if (weight == obj.getStorageWeightToCompare()) {
            System.out.println("Контейнеры равны по весу \n");
            return true;
        } else {
            System.out.println("Контейнеры не равны по весу \n");
            return false;
        }
    }

    public void transfer(Box<T> newBox) {
        for (T n : Storage) {
            newBox.addObj(n);
        }
        Storage.clear();
        weight = 0;
    }
}