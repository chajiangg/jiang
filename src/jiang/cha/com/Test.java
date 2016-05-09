package jiang.cha.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chajiang on 2016/5/4.
 */
public class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        int len = 0;

        while (str.length() > 0) {
            len = str.length();
            String s = str.substring(0, 1);
            str = str.replaceAll(s, "");
            map.put(s, len - str.length());
        }

        System.out.println(map);


    }
}
