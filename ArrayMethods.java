package sk.itsovy.sestak.project;

public interface ArrayMethods {
        public double getAverageValue();
        public int min();
        public int max();

        public int min2(); //volitelne
        public int max2();//volitelne

        public void generateValue(int a, int b);
        public boolean contains(int value);
        public int countOfValue(int value);
        public int countOfValues();
        public void incrementValue();
        public void sort(boolean asc);
        public void addItem(int newValue);
        public void addItem(int newValue, int position);//volitelne
        public int[] copy();
        public int getItem(int position);
        public String toString();
        public void error(String message);


    }
}
