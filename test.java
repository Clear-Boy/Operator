import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class test{

    public static char Operator(int ysf)
    {
        Random random =new Random();
        int i=ysf;
        if(ysf==5)
        {
            i=random.nextInt(100)%4+1;
        }
        char ch=' ';
        switch(i)
        {
            case 1:  ch= '+';break;
            case 2:  ch= '-';break;
            case 3:  ch= '*';break;
            case 4:  ch= '/';break;
            default:break;
        }
        return ch;
    }

    public static boolean Create(int num,int ysf, int max,int bracket,int decimals)
    {
        Random random =new Random();
        double  a = 0.0,b=0.0,c=0.0,d=0.0;
        int e;
        char op,x,y,z;
        if( bracket==0 && decimals ==0 )
        {
            for (int i = 0;i< num; i++)
            {
                a=random.nextInt(max)+1;
                b=random.nextInt(max)+1;
                c=random.nextInt(max)+1;
                d=random.nextInt(max)+1;
                op=Operator(ysf);
                x=op;
                op=Operator(ysf);
                y=op;
                op=Operator(ysf);
                z=op;
                System.out.printf("%.0f %c %.0f %c %.0f %c %.0f =\n",a,x,b,y,c,z,d);
            }
        }
        if (bracket == 0 && decimals == 1)
        {

            for (int i = 0; i < num; i++)
            {
                a=random.nextFloat()*max;
                b=random.nextFloat()*max;
                c=random.nextFloat()*max;
                d=random.nextFloat()*max;
                op=Operator(ysf);
                x=op;
                op=Operator(ysf);
                y=op;
                op=Operator(ysf);
                z=op;
                System.out.printf("%.1f %c %.1f %c %.1f %c %.1f =\n",a,x,b,y,c,z,d);

            }
        }
        if (bracket == 1 && decimals == 0)
        {
            for (int i = 0; i < num; i++)
            {
                a=random.nextFloat()*max;
                b=random.nextFloat()*max;
                c=random.nextFloat()*max;
                d=random.nextFloat()*max;
                e=random.nextInt(100)%4;
                op=Operator(ysf);
                x=op;
                op=Operator(ysf);
                y=op;
                op=Operator(ysf);
                z=op;
                if (e == 0)
                {
                    System.out.printf("( %.0f %c %.0f ) %c ( %.0f %c %.0f ) =\n",a,x,b,y,c,z,d);
                }
                if (e == 1)
                {
                    System.out.printf("%.0f %c ( %.0f %c %.0f ) %c %.0f =\n",a,x,b,y,c,z,d);
                }
                if (e == 2)
                {
                    System.out.printf("( %.0f %c %.0f %c %.0f ) %c %.0f =\n",a,x,b,y,c,z,d);
                }
                if (e ==3)
                {
                    System.out.printf("%.0f %c ( ( %.0f %c %.0f ) %c %.0f ) ) =\n",a,x,b,y,c,z,d);		            }

            }
        }

        if (bracket == 1 && decimals == 1)
        {
            for (int i = 0; i < num; i++)
            {
                a=random.nextFloat()*max;
                b=random.nextFloat()*max;
                c=random.nextFloat()*max;
                d=random.nextFloat()*max;
                e=random.nextInt(100)%4;
                op=Operator(ysf);
                x=op;
                op=Operator(ysf);
                y=op;
                op=Operator(ysf);
                z=op;
                if (e == 0)
                {
                    System.out.printf("( %.1f %c %.1f ) %c ( %.1f %c %.1f ) =\n",a,x,b,y,c,z,d);
                }
                if (e == 1)
                {
                    System.out.printf("%.1f %c ( %.1f %c %.1f ) %c %.1f =\n",a,x,b,y,c,z,d);
                }
                if (e == 2)
                {
                    System.out.printf("( %.1f %c %.1f %c %.1f ) %c %.1f =\n",a,x,b,y,c,z,d);
                }
                if (e ==3)
                {
                    System.out.printf("%.1f %c ( ( %.1f %c %.1f ) %c %.1f ) =\n",a,x,b,y,c,z,d);
                }
            }
        }
        return true;

    }
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("?????????????????????:");
        int num=scan.nextInt();
        while(num<=0)
        {
            System.out.println("??????????????????????????????:");
            num=scan.nextInt();
        }

        System.out.println("?????????????????????:1.???????????? 2.???????????? 3.???????????? 4.???????????? 5.????????????");
        int ysf=scan.nextInt();
        while(ysf!=1 && ysf!=2 && ysf!=3 && ysf!=4 && ysf!=5)
        {
            System.out.println("??????????????????????????????:");
            ysf=scan.nextInt();
        }

        System.out.println("?????????????????????????????????:");
        int max=scan.nextInt();
        while(max<=0)
        {
            System.out.println("??????????????????????????????:");
            max=scan.nextInt();
        }

        System.out.println("???????????????????????????????????? 1.??? 0.??? ");
        int bracket=scan.nextInt();
        while(bracket!=0 && bracket!=1)
        {
            System.out.println("??????????????????????????????:");
            bracket=scan.nextInt();
        }

        System.out.println("???????????????????????????????????? 1.??? 0.??? ");
        int decimals=scan.nextInt();
        while(decimals!=0 && decimals!=1)
        {
            System.out.println("??????????????????????????????:");
            decimals=scan.nextInt();
        }

        System.out.println("????????????????????????????????? 1.??? 0.???");
        int file=scan.nextInt();
        while(file!=0 && file!=1)
        {
            System.out.println("??????????????????????????????:");
            file=scan.nextInt();
        }

        if(file==1)
        {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("D:\\????????????.txt");
            System.setOut(ps);
            Create(num,ysf,max,bracket,decimals);
            ps.close();
            System.setOut(out);
            System.out.println("??????????????????,??????????????????!");
            scan.close();
        }
        else
        {
            Create(num,ysf,max,bracket,decimals);
            System.out.println("??????????????????!");
            scan.close();
        }
    }
}