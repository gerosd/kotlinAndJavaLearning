package tasks.arraySort;

public class MinMaxThreadExample {

    public static void main(String[] args) {
        int[] array = {23, -3245, 123, 6334, 124321, -3245, 0, 5634};

        // Создание потоков для поиска максимума и минимума
        MaxThread maxThread = new MaxThread(array);
        MinThread minThread = new MinThread(array);

        // Запуск потоков
        maxThread.start();
        minThread.start();

        try {
            // Ожидание завершения потоков
            maxThread.join();
            minThread.join();

            // Получение результатов из потоков
            int max = maxThread.getMax();
            int min = minThread.getMin();

            // Вывод результатов
            System.out.println("Максимум: " + max);
            System.out.println("Минимум: " + min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MaxThread extends Thread {
        private final int[] array;
        private int max;

        public MaxThread(int[] array) {
            this.array = array;
            this.max = Integer.MIN_VALUE;
        }

        public int getMax() {
            return max;
        }

        @Override
        public void run() {
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
        }
    }

    static class MinThread extends Thread {
        private final int[] array;
        private int min;

        public MinThread(int[] array) {
            this.array = array;
            this.min = Integer.MAX_VALUE;
        }

        public int getMin() {
            return min;
        }

        @Override
        public void run() {
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
        }
    }
}
