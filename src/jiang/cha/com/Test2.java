package jiang.cha.com;



import java.util.*;

/**
 * Created by chajiang on 2016/5/4.
 */
public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShuRu  su = new ShuRu();


        for (; ; ) {
            System.out.println("1.输入字符串：");
            System.out.println("2.查找字符串：");
            System.out.println("3.排序：");
            System.out.println("4.退出：");
            int i=sc.nextInt();
            switch (i){
                case 1:
                   su.IntShu();
                    break;
                case 2:
                    su.Foundshu();
                    break;
                case 3:
                    su.paiXu();
                    break;
                case 4:
                    su.end();
                    break;
                default:
                    System.err.println("输入范围内的值");
                    break;
            }



            /**int a;
            a = sc.nextInt();
            if (a == 1){
                System.out.print("请输入字符串：");
                 str = sc.next();
                 map.put("str",str);



            }
            if (a == 2){
                System.out.print("查找字符串：");
                 str1 = sc.next();
                int j;
                for(j=1;;j++){

                if (map.get(j).equals(str1))

                {
                        int i = str.indexOf(str);
                        System.out.println("返回位置为：" + i);

                    } else {
                        System.out.println("是否保存(输入Y：保存)");

                        String b = sc.next();
                        switch (b) {
                            case "Y":
                                int i;
                                for(i=0;;i++){
                                map.put("i",str1+str);
                                System.out.println("保存成功");}
                            case "N":
                        }


                    }

            }
            if (a==3){
                int  i=map.get("str").toString().indexOf(str1);
                System.out.println("返回位置为："+i);

            }
            if(a==4) {
                System.exit(0);
            }*/
        }
    }
}






               /** System.out.println("查找字符串：");
                sc = new Scanner(System.in);
                str1 = sc.next();
                if (str.equals(str1))
                    str.charAt(2);
                else {
                    System.out.println("是否保存(输入Y：保存)");
                    sc = new Scanner(System.in);
                    String b = sc.next();
                    switch(b) {
                        case "Y":
                        cs = new String[20];
                        for (int j = 0; j < str1.length(); j++)
                        {cs[j] = sc.next();

                        }

                            System.out.println("保存成功");
                          break;
                        case "N":

                    }


                }

            }

            else if (a == 3){
                for (int j = 0; j < cs.length - 1; ++j)
                {
                    for (int k =j; k < cs.length - 1; ++k)
                    {
                        if (cs[k].compareTo(cs[k + 1]) > 0)
                        {
                            String temp;

                            temp = cs[j];
                            cs[j] = cs[k];
                            cs[k] = temp;
                        }
                    }
                }

                for (int j = 0; j < cs.length; ++j)
                {
                    System.out.print(cs[j] + " ");

                }


            }


            else if (a == 4){
                System.exit(0);
            }

        }
    }*/

