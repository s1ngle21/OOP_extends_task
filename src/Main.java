public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобік", 500, 10);
        Cat cat = new Cat("Барсік", 200, 0);

        dog.run(500);
        dog.swim(10);

        cat.run(200);
        cat.swim(0);


        if (Animal.getCount()== 1){
            System.out.println("Було створено " + Animal.getCount() + " тварина");
        }else System.out.println("Було створено " + Animal.getCount() + " тварини");

        if (Dog.getCount() == 1){
            System.out.println(Dog.getCount() + " з них собака");
        }else System.out.println(Dog.getCount() + " з них собаки");

        if (Cat.getCount() == 1){
            System.out.println(Cat.getCount() + " з них кіт");
        }else System.out.println(Cat.getCount() + " з них котів");
    }
}
