package tradiction_suanfa;//使用数组计算课程平均分和个人平均分

public class shizhanClass {
    public static void main(String[] args)
    {
        int [] [] scores = {
                {100,90,-1},
                {98,95,-1},
                {95,-1,90},
                {86,-1,92}
        };

        double [][] classas = new double[2][scores[0].length];
        double [][] personas = new double[scores.length][2];
        for(int i = 0; i < scores.length; i++)
            for(int j = 0; j < scores[i].length; j++)
            {
                if(scores[i][j] >= 0)
                {
                    classas[0][j] += scores[i][j];
                    classas[1][j] += 1;
                    personas[i][0] += scores[i][j];
                    personas[i][1] += 1;
                }
            }

        System.out.println("班级平均分: ");
        String [] classname = new String[] {"Java","数据库","C++"};
        for(int i =0; i < classas[0].length; i++)
        {
            classas[0][i] /= classas[1][i];
            System.out.println(classname[i] + "平均分" + ": " + classas[0][i]);
        }

        System.out.println("个人平均分: ");
        String [] personname = new String[] {"小甜甜","小粉粉","小灰灰","小羊羊"};
        for(int j = 0; j < personas.length; j++)
        {
            personas[j][0] /= personas[j][1];
            System.out.println(personname[j] + "平均分" + ": " + personas[j][0]);
        }
    }
}
