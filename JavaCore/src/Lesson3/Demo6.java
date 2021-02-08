package Lesson3;//обощенный интерфейс

import org.jetbrains.annotations.NotNull;

public class Demo6 {
    public static class Box implements Comparable{
        private int size;
        public Box (int size){
            this.size = size;
        }

        @Override
        public int compareTo(@NotNull Object o) {
            return 0;
        }
    }
}
