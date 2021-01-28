public class Cat extends Animal { //слово extends - значит этот класс наследуется от класса Animal
    //String name; // <- this.name указывает сюда (name наследуется от Animal поэтому закомментирую эту строчку
    String color;
    int age;

    //    public Cat() {
//        System.out.println("Это конструктор класса Cat");
//        name = "Барсик";
//        color = "Белый";
//        age = 2;
//}
//будем использовать параметризованные конструкторы и ключевое слово this
    public Cat(String name, String color, int age) { // <- а name один из аргументов конструктора
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override //это "аннотация" означает что мы переопределяем метод voice
    public void voice() {
        System.out.println("кот мяукнул");
    }

    @Override
    public String toString() {
        return "Кот: " + name;
    }

    public void catInfo() {
        System.out.println("Кот имя: " + name + " цвет: " + color);
    }

    @Override    //сравниваем два обьекта с помощью переопределения метода equals
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;}
            Cat another = (Cat)o;
            return this.age == another.age && this.name.equals(another.name) && this.color.equals(another.color);
        }

    //Перегрузка конструкторов
//    имеет значение набор аргументов, не может быть нескольких конструкторов с одним и тем же набором аргументов.
    public Cat(String name){
        this.name = name;
    }


    public void putMeImArray(Cat[] cats, int arrayIndex){ //просим кота положить себя в ячейку массива Cat[] cats
        cats[arrayIndex] = this;                          //на позицию arrayIndex
//При выполнении cat1.putMeInArray() ключевое слово this укажет на объект cat1, при cat2.putMeInArray() -
// на объект cat2. То есть this указывает на объект у которого мы вызвали метод putMeInArray().
    }
    public void setAge(int age){ //сеттереы нужны для изменения значния поля, имеет тип void и именуется setИмяполя
        if (age >= 0){           //сеттер позволяет добавлять ограничения для изменния полей
            this.age = age;
        }
        else{
            System.out.println("введен некорректный возраст");
        }
    }

    public int getAge() { //Геттер позволяет узнать содержимое поля,
        return age;       // его тип совпадает с типом поля для которого он создан,
                            // а имя, как правило, начинается со слова get, к которому добавляется имя поля.
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

