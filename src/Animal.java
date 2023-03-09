public class Animal {
    private static int count = 0;
    private String name;
    private int runDistance;
    private int swimDistance;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }

    public void run(int distance) {
        if (distance <= runDistance && distance >= 0) {
            System.out.println(name + " пробіг " + distance + " м");
        } else if (distance < 0) {
            System.out.println("Помилка! Дистанція бігу не може бути меньше 0!");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistance && distance > 0) {
            System.out.println(name + " проплив " + distance + " м");
        } else if (distance < 0) {
            System.out.println("Помилка! Дистанція пропливу не може бути меньше 0!");
        } else if (distance == 0) {
            System.out.println(name + " не вміє плавати");
        } else {
            System.out.println(name + " не зміг проплити " + distance + " м");
        }
    }

    public static int getCount() {
        return count;
    }

}
