public class Main {
    public static void main(String[] args) {

        // 1.5 Массивы ч.1
        System.out.println ();
        System.out.println ("     1.5. Массивы ч.1");
        // Это не удалять, а исправить.

        // Задание 1
        System.out.println ();
        System.out.println ("     Задание 1");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        double[] arrayDouble = {1.57, 7.654, 9.986};

        boolean[] arrayBoolean = {true, false, false};

        System.out.println ("   Готово");

        // Задание 2
        System.out.println ();
        System.out.println ("     Задание 2");
        for (int i = 0; i < arrayInt.length - 1; i++) {
            System.out.print (arrayInt[i] +", ");
        }
        System.out.println (arrayInt[arrayInt.length - 1]);
        for (int i = 0; i < arrayDouble.length - 1; i++) {
            System.out.print (arrayDouble[i] +", ");
        }
        System.out.println (arrayDouble[arrayDouble.length - 1]);
        for (int i = 0; i < arrayBoolean.length - 1; i++) {
            System.out.print (arrayBoolean[i] +", ");
        }
        System.out.println (arrayBoolean[arrayBoolean.length - 1]);

        System.out.println ("   Готово");

        // Задание 3
        System.out.println ();
        System.out.println ("     Задание 3");
        for (int i = arrayInt.length - 1; i > 0; i--) {
            System.out.print (arrayInt[i] +", ");
        }
        System.out.println (arrayInt[0]);
        for (int i = arrayDouble.length - 1; i > 0; i--) {
            System.out.print (arrayDouble[i] +", ");
        }
        System.out.println (arrayDouble[0]);
        for (int i = arrayBoolean.length - 1; i > 0; i--) {
            System.out.print (arrayBoolean[i] +", ");
        }
        System.out.println (arrayBoolean[0]);
        System.out.println ("   Готово");

        // Задание 4
        System.out.println ();
        System.out.println ("     Задание 4");

        for (int i = 0; i < arrayInt.length - 1; i++) {
            if (arrayInt[i] % 2 != 0) arrayInt[i]++;
            System.out.print (arrayInt[i] +", ");
        }
        if (arrayInt[arrayInt.length - 1] % 2 != 0) arrayInt[arrayInt.length - 1]++;
        System.out.println (arrayInt[arrayInt.length - 1]);

        System.out.println ();
        System.out.println ("...");

        // Задание 5
//        System.out.println ();
//        System.out.println ("     Задание 5");
//        System.out.println ();
//        System.out.println ("...");

        // Задание 6
//        System.out.println ();
//        System.out.println ("     Задание 6");
//        System.out.println ();
//        System.out.println ("...");

    }
}