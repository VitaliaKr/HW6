import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
        if (first > second) {
            greatest = first;
            smallest = second;
        } else {
            greatest = second;
            smallest = first;
        }
        if (third > greatest) {
            greatest = third;
        }
        if (third < smallest) {
            smallest = third;
        }
        if (first != greatest && first != smallest) {
            average = first;
        } else if (second != greatest && second != smallest) {
            average = second;
        } else if (third != greatest && third != smallest) {
            average = third;
        }

        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
