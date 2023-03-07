public class Cat extends Animal{
    private static int count = 0;
    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
