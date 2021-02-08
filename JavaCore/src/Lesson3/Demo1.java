package Lesson3;

public class Demo1 {
    public static class Box{
        private Object object;
        public Box(Object object) {
            this.object = object;}
        public Object getObject() {
            return object;
        }
        public void setObject(Object object) {
            this.object = object;
        }
        @Override
        public String toString(){
            return "Box{ " + object.getClass().getSimpleName() + "object=" + object + "}";
        }
    }
    public static void main(String [] args){
        Box box1 = new Box("20");
        Box box2 = new Box(25);
        if (box1.getObject() instanceof Integer && box2.getObject() instanceof Integer) {//проверка принадлежит ои box1 типу int
        int sum = (Integer)box1.getObject() + (Integer)box2.getObject();
            System.out.println(sum);}
        else {
            System.out.println("В одной из коробок не число");
        }
    }
}
