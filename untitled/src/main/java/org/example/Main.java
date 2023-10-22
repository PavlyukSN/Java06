package org.example;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "С 12 октября в России начинает действовать новая статья Уголовного кодекса РФ 260.1 (умышленные уничтожение " +
                "или повреждение, а равно незаконные добыча, сбор и оборот особо ценных растений и грибов, принадлежащих к видам, "+
                "занесенным в Красную книгу РФ";
        String[] str1 = str.split(" ");

  //      TreeMap<Integer, String> tm = new TreeMap<>();
        TreeMap<String, Integer> tm = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            }
        });

        for (String item : str1){
            tm.put(item, item.length());
        }
        tm.forEach((k, v) -> System.out.println(k + "=" +v));
    }
}