package org.example;

// создать мар ключ случайная строка из чаргет нейм, а значение индекс первой буквы ключа

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        Random rnd = new Random();
        while (hm.size() < 10) {
            int num = rnd.nextInt(25);
            String str = Character.getName(num);
            hm.put(str,(int) str.charAt(0));
        }
     //   hm.forEach((k, v) -> System.out.println(k + "=" +v));
//        ArrayList<Integer> al = new ArrayList<>(hm.values());
//        al.sort(Comparator.naturalOrder());
//        for (int v:al) {
//            for (String k:hm.keySet()) {
//                if (hm.get(k) == v) {
//                    System.out.println(k + "=" + v);
//                }
//            }
//        }
        hm.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(5)
                .forEach(e -> System.out.println(e.getKey()+ "=" + e.getValue()));
    }
}