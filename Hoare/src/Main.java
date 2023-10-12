import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INPUT"));
        int[] mas = new int[sc.nextInt()];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 1; i < mas.length; i++)
        {
            if (mas[0] <= mas[i])
            {
                for (int j = i+1; j < mas.length; j++)
                {
                    if (mas[i] > mas[j])
                    {
                        int t = mas[j];
                        mas[j] = mas[i];
                        mas[i] = t;
                    }
                }
            }
            else
            {
                for (int j = i-1; j == 1; j--)
                {
                    if (mas[i] < mas[j])
                    {
                        int p = mas[j];
                        mas[j] = mas[i];
                        mas[i] = p;
                    }
                }
            }
        }
        for (int i = 0; i < mas.length - 1; i++)
        {
            if (mas[i] > mas[i+1])
            {
                int p = mas[i];
                mas[i] = mas[i+1];
                mas[i+1] = p;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}