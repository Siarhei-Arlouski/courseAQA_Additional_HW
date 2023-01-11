import java.util.Scanner;

public class AdditionalTasks {
    public void taskOne() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int z = scanner1.nextInt();
        if (z > 10) {
            System.out.println("Число больше десяти");
        } else if (z < 10) {
            System.out.println("Число меньше десяти");
        }
    }

    public void taskTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int x2 = scanner2.nextInt();
        if (x > x2) {
            System.out.println("Первое число больше, чем второе");
        } else if (x < x2) {
            System.out.println("Первое число меньше, чем второе");
        }
    }

    public void taskThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину первой стороны треугольника: ");
        int x = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите длину второй стороны треугольника: ");
        int x2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите длину третьей стороны треугольника: ");
        int x3 = scanner3.nextInt();
        if (x == x2 & x == x3) {
            System.out.println("Треугольник является равносторонним");
        } else if (x == x2 || x == x3 || x2 == x3) {
            System.out.println("Треугольник является равнобедренным");
        } else {
            System.out.println("Треугольник является разносторонним");
        }
    }

    public void taskFour() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int x2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите третье число: ");
        int x3 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите четвертое число: ");
        int x4 = scanner4.nextInt();
        int positive = 0;
        int negative = 0;
        if (x > 0) positive++;
        if (x < 0) negative++;
        if (x2 > 0) positive++;
        if (x2 < 0) negative++;
        if (x3 > 0) positive++;
        if (x3 < 0) negative++;
        if (x4 > 0) positive++;
        if (x4 < 0) negative++;
        System.out.println("Количество положительных чисел: " + positive);
        System.out.println("Количество отрицательных чисел: " + negative);
    }

    public void taskFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int x2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите третье число: ");
        int x3 = scanner3.nextInt();
        int max = Math.max(x, x2);
        System.out.println("Самое большое число: " + Math.max(x3, max));
    }

    public void taskSix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int x2 = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите третье число: ");
        int x3 = scanner3.nextInt();
        int sum1 = x + x2;
        int sum2 = x + x3;
        int sum3 = x2 + x3;
        int max = Math.max(sum1, sum2);
        System.out.println("Наибольшая сумма: " + Math.max(sum3, max));
        int min = Math.min(sum1, sum2);
        System.out.println("Наименьшая сумма: " + Math.min(sum3, min));
    }

    public void taskSeven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x%2 == 0) {
            System.out.println("Число четное");
        } else {System.out.println("Число нечетное");}
    }

    public void taskEight() {
        System.out.println("Магазин:\n 1. Чипсы (4 рубля)\n 2. Кола (2 рубля)\n 3. Батончик (3 рубля)\nВыберите товар: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            switch (x) {
                case 1 -> {
                    System.out.println("Ваш товар Чипсы. Внесите 4 рубля");
                    Scanner firstCase = new Scanner(System.in);
                    int c1 = firstCase.nextInt();
                    if (c1 == 4) {
                        System.out.println("Спасибо за покупку!");
                    } else if (c1 < 4) {
                        System.out.println("Денег не хватает!");
                    } else {
                        int sum = c1 - 4;
                        System.out.println("Спасибо за покупку! Ваша сдача: " + sum + " рубля");
                    }
                    return;
                }
                case 2 -> {
                    System.out.println("Ваш товар Кола. Внесите 2 рубля");
                    Scanner secondCase = new Scanner(System.in);
                    int c2 = secondCase.nextInt();
                    if (c2 == 2) {
                        System.out.println("Спасибо за покупку!");
                    } else if (c2 < 2) {
                        System.out.println("Денег не хватает!");
                    } else {
                        int sum = c2 - 2;
                        System.out.println("Спасибо за покупку! Ваша сдача: " + sum + " рубля");
                    }
                    return;
                }
                case 3 -> {
                    System.out.println("Ваш товар Батончик. Внесите 3 рубля");
                    Scanner thirdCase = new Scanner(System.in);
                    int c3 = thirdCase.nextInt();
                    if (c3 == 3) {
                        System.out.println("Спасибо за покупку!");
                    } else if (c3 < 3) {
                        System.out.println("Денег не хватает!");
                    } else {
                        int sum = c3 - 3;
                        System.out.println("Спасибо за покупку! Ваша сдача: " + sum + " рубля");
                    }
                    return;
                }
                default -> {
                    System.out.println("Такого товара не существует.");
                    return;
                }
            }
        }
    }

    public void taskOneCycle() {
        System.out.println("Таблица умножения числа 4: ");
        for (int x = 0; x <11; x++) {
            System.out.println("4 * " + x + " = " + x * 4);
        }
    }

    public void taskTwoCycle() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i+=2) {
            System.out.println(i);
        }
    }

    public void taskThreeCycle() {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 0; i < x; i++) {
            n3 = n1 + n2;
            System.out.println(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }

    public int taskFourCycle(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public void taskFiveCycle() {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        for (int i = 0; i < x.length(); i++) {
            System.out.println(x.charAt(i));
        }
    }
}
