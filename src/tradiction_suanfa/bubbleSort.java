package tradiction_suanfa;// 冒泡排序算法

import java.util.Random;

public class bubbleSort {
    public static void main(String[] args)
    {
        int [] scores = new int [10];
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < scores.length; ++i)
        {
            scores[i] = random.nextInt(201);//0-200之间的随机数
        }

        System.out.println("展示排序前的数组元素");
        for(int aux:scores)
        {
            System.out.print(aux + " ");
        }
        System.out.println();

        int temp = 0;
        for(int i = 0; i < scores.length-1; i++)
            for(int j = 0; j<scores.length-i-1; j++)
            {
                if(scores[j]>scores[j+1])
                {
                    temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }

        System.out.println("展示排序前的数组元素");
        for(int aux:scores)
        {
            System.out.print(aux + " ");
        }
        System.out.println();
    }
}