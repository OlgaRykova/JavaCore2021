package Lesson3;
//демонстрация обобщенного класса
public class Demo2 {
        public static class GenericBox<T>{
            private T obj;
            public GenericBox (T obj){
                this.obj = obj;
            }

            public T getObj() {
                return obj;
            }

            public void setObj(T obj) {
                this.obj = obj;
            }
            @Override
            public String toString(){
                return "Box{ " + obj.getClass().getSimpleName() + "object=" + obj + "}";
            }
        }
        public static void main(String [] args){
            GenericBox<Integer> intBox1 = new GenericBox<>(10);
            GenericBox<String> stringGenericBox = new GenericBox<>("String!");
            GenericBox<Integer> intBox2 = new GenericBox<>(20);
            int sum = intBox1.getObj() + intBox2.getObj();
            System.out.println(sum);
        }
}
