import java.util.ArrayList;


/*public static int unique() {

}*/


public class IntDataFrame {
    static double count(double NotZero) {
        if (NotZero > 0) {
            return  NotZero * 10;
        }

        return NotZero;
    }

    public static void main(String[] args) {
        //Изначальный список
        ArrayList<Double> allNumbers = new ArrayList<>() {{
            add(3.4);
            add(2.3);
            add(0.3);
            add(0.7);
            add(8.1);
        }};

        //Вывод первого элемента по индексу
        //System.out.print(allNumbers.get(0));
        for (int i = 0; i < allNumbers.size(); i++) {
            System.out.println(count(allNumbers.get(i)));
        }
    }
}
