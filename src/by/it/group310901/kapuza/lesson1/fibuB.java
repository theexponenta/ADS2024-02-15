package by.it.group310901.kapuza.lesson1;
import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */
public class fibuB {

        private long startTime = System.currentTimeMillis();

        private long time() {
            return System.currentTimeMillis() - startTime;
        }

        public static void main(String[] args) {
//вычисление чисел простым быстрым методом
            fibuB fibo = new fibuB();
            int n = 55555;
            System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
        }

    public BigInteger fastB(Integer n) {
        BigInteger[] mas = new BigInteger[n+1];

        if (n==0) return BigInteger.ZERO;
        else if (n==1) return BigInteger.ONE;
        else {
            mas[0]= BigInteger.valueOf(0);
            mas[1]= BigInteger.valueOf(1);
            for (int i = 2; i<(n+1); i++)
                mas[i]=mas[i-1].add(mas[i-2]);
            return mas[n];
        }
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        //return BigInteger.ZERO;

    }

        }
