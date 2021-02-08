package Lesson3;// ограничение "сверху"

public class Demo4 {
    public static class BoxWithNumbers<T extends Number> {//ограничили сверху - значит наш класс наследуется от класса
                                                            // выше ИЛИ имплементируется ИЛИ и наследуется и имплементируется,
                                                            // но писать все равно нужно extends
        private final T[] nums;
        public BoxWithNumbers(T... nums){

            this.nums = nums;
        }

        public T[] getNums() {
            return nums;
        }
        public double avg(){
            double sum = 0.0;
            for (T num : nums){
                sum += num.doubleValue();
            }
            return sum / nums.length;
        }
//метод сравнивающий две коробки с разными типами данных
        public boolean isSameAvg(BoxWithNumbers<?> anotherBox){ // ? - метасимвольный аргумент. используется когда мы до конца не знаем с каким типом данным будем работать
            return Math.abs(this.avg() - anotherBox.avg()) < 0.0001;
        }
        public static void main(String [] args){
            BoxWithNumbers<Integer>integerBoxWithNumbers = new BoxWithNumbers<>(1, 2, 3, 5, 7);
            System.out.println("ср знач = " + integerBoxWithNumbers.avg());
            BoxWithNumbers<Double>doubleBoxWithNumbers = new BoxWithNumbers<>(1.0, 2.0, 3.0, 5.0, 7.0);
            System.out.println("ср знач = " + doubleBoxWithNumbers.avg());
            System.out.println(integerBoxWithNumbers.isSameAvg(doubleBoxWithNumbers));
        }
    }
}
