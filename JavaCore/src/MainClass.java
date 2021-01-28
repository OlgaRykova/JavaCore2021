import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Cat cat1 = new Cat("Барсик", "белый", 2); //создали оьект типа Cat (экземпляр класса Cat) Теперь,
        //при создании объектов класса Cat, все коты будут иметь одинаковые имена,
        //цвет и возраст (а именно, белый двухлетний Барсик).
        Cat cat2 = new Cat("Мурочка", "Разноцветная", 3);

        animal.animalInfo();
        cat1.animalInfo();
        cat1.catInfo();
        animal.voice();
        cat1.voice();

        Cat[] cats = new Cat[2];
        cat1.putMeImArray(cats, 0);
        cat2.putMeImArray(cats, 1);
       // Cat cat3 = new Cat("Васька"); //перегруженный конструктор

//        cat1.name = "Барсик";  (так мы делали сначала, но так делать не будем, слишком много строк кода.
//        cat1.color = "белый";     будем использовать конструктор из класса Cat)
//        cat1.age = 4;

        System.out.println(cat1);

        Cat cat3 = new Cat("Барсик", "black", 5);
        Cat cat4 = new Cat("Барсик", "black", 5);
        System.out.println(cat3.equals(cat4)); //сравниваем два обьекта с помощью переопределения метода equals

    }

}
