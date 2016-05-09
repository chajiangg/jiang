package jiang.cha.com;

import java.util.*;

/**
 * Created by chajiang on 2016/5/4.
 */
public class ShuRu {
    //Map<Integer, String> map = new LinkedHashMap<>();
    ArrayList<String> list = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    public void IntShu() {
        System.out.print("请输入字符串：");
        String str = sc.next();
        list.add(str);
        //map.put(map.size() + 1, str);
        System.out.println("添加成功！");
    }

    public void Foundshu() {

        System.out.println("输入需要查找的字符串");
        String str1 = sc.next();
       // Collection<String> mvalue = map.values();

        //for (Object value : mvalue) {

           // System.out.println(value);
            if (list.contains(str1)) {

                System.out.println("字符串存在。返回位置是："+list.indexOf(str1));

            }

        //}
                else {
                System.out.println("是否保存（Y:保存）");
                String sh = sc.next();
                switch (sh) {
                    case "Y":
                        list.add(str1);
                        System.out.println("保存成功");
                        break;
                    case "N":
                        break;


                }
            }

        }
    public void paiXu(){

        ArrayList list1 = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            String str = (String)it.next();
            int i = list.indexOf(str);
            list1.add(i);
        }

        System.out.println("原来字符串的位置：");
        System.out.println(list1);
        System.out.println("原来的字符串");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("                                " +
                "        ");
        System.out.println("排序后的字符串位置：");
        System.out.println(list1);
        Collections.sort(list);
        System.out.println("排序后的字符串：");
        System.out.println(list);

        }
    public void end(){
        System.exit(0);

    }
        //list.sort(list,new Comparator<ShuRu>());
    }





