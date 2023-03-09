public class Dog extends Animal{
    private static int count;
    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
        count++;
    }


    public static int getCount() {
        return count;
    }
}
