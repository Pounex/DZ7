package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person pr1 = new Person("Alex", "Makarenko", Gender.FEMALE);
        Person pr2 = new Person("Anna", "Vorobyova", Gender.FEMALE);
        Person pr3 = new Person("Innokentiy", "Kalitka", Gender.MALE);
        Person pr4 = new Person("Sasha", "Makarenko", Gender.MALE);
        Person pr5 = new Person("Sasha", "Makarenko", Gender.MALE);
        List<Person> list = new ArrayList<>();

        list.add(pr1);
        list.add(pr2);
        list.add(pr3);
        list.add(pr4);
        list.add(pr5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Количество элементов :" + list.size());

        Set<Person> set = new HashSet<>();
        set.add(pr1);
        set.add(pr2);
        set.add(pr3);
        set.add(pr4);
        set.add(pr5);

        for (Person item : set) {
            System.out.println(item);

        }
        System.out.println("Количество элементов :" +set.size());

        Map<Integer,Person> map = new HashMap<>();
        map.put(1,pr1);
        map.put(2,pr2);
        map.put(3,pr3);
        map.put(4,pr4);
        map.put(5,pr5);

        for(Map.Entry<Integer,Person> pair : map.entrySet())
        {
            System.out.println(pair.getValue()+ " "+  pair.getKey());
        }
        System.out.println(map.size());

    }
}
