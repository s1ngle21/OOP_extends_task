public class Cat extends Animal{
    private static int count;
    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
