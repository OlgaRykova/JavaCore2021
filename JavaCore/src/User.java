public class User { //обьявляем класс Юзер и его поля то есть аргументы
    private int id;
    private String position;
    private String name;
    private int age;

    public User(int id, String name, String position, int age){ //Это конструктор класса User
        this.id = id;
        this.name= name;
        this.position = position;
        this.age = age;
    }

    public void info(){        //метод печатающий инфу о экземпляре класса
        System.out.println("id: " + id + " имя: " + name + " должность: " + position + " возраст: " + age);
    }

    public void changePosition(String position){ //метод меняющий должность
        this.position = position;
        System.out.println("Работник " + name + " " + "получил новую должность:" + " " + position);
    }

    public static void main(String[] args){
        User user1 = new User(1, "Петя", "дворник", 40);
        user1.info();
        user1.changePosition("президент");
    }
}
