package ua.step.practice;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13
        34 89 233 610*/
public class Task01 {
    public static void main(String[] args) {
        // TODO: Пишите код здесь
        int arrResult[] = new int[15];

        arrResult[0] = 1;
        arrResult[1] = 1;


        for(int i = 1; i < arrResult.length-1;i++) {
            arrResult[i+1] = arrResult[i] + arrResult[i-1];
        }

        for(int i = 0; i < arrResult.length;i++)
        {
            if(i % 2 ==0) {
                System.out.print(arrResult[i] + " ");
            }
        }

    }
}