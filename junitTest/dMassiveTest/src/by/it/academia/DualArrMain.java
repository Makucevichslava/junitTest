package by.it.academia;

import by.it.academia.logic.DualArrLogic;
import by.it.academia.presentation.DualArrView;

import java.util.Random;

public class DualArrMain {
    public static void main(String[] args) {
        DualArrLogic logic = new DualArrLogic();

        int[][] mass = new int[5][5];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(10);
            }
        }

        DualArrView.arrPrinter(logic.increaceRowSorter(mass), 4, "Сортировка строк по возрастанию: ");
        DualArrView.arrPrinter(logic.decreaseRowSorter(mass), 4, "Сортировка строк по убыванию: ");
        DualArrView.arrPrinter(logic.diagElemCollector(mass), 4, "Элементы по диагонали: ");

        System.out.println("Количество 7-к в матрице: " + logic.sevenCountCollector(mass));

    }
}
