package org.example;

import java.util.*;

public abstract class ListOfPeople{

    public static void main(String[] args) {
        List<People> stringList = new ArrayList<>();
        stringList.add(new People.Builder("Tom").build());//добавление элементов
        stringList.add(new People.Builder("jim", 23566, 84, 878784).build());
        stringList.add(new People.Builder("Sergey", 236, 102, 878).build());
        stringList.add(new People.Builder("Sergey", 2376, 12, 8758).build());
        stringList.add(new People.Builder("Andri", 11236, 132, 8078).build());
        System.out.println("add worker\n");
        Add(stringList);
        System.out.println("Every worker In list\n");
        SeeAll(stringList);

        System.out.println("Every worker In list(Sort for exp)\n");
        Collections.sort(stringList);
        SeeAll(stringList);

        System.out.println("Every worker In list(Sort for lengh name)\n");
        NameCorparator Corp = new NameCorparator();
        stringList.sort(Corp);
        SeeAll(stringList);

        System.out.println("Found sergey`s\n");
        Found(stringList);
        System.out.println("Delete all\n");
        for(int i=stringList.size()-1; i>=0; i--) {
            DeleteLast(stringList);
        }
        check(stringList);

    }

    private static void DeleteLast(List<People> stringList) {
        stringList.remove(stringList.size() - 1);
    }

    private static void Add(List<People> stringList) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name\n");
        String Name="Sergey";// in.nextLine();
        System.out.println("Input number\n");
        int Number= in.nextInt();
        System.out.println("Input exp\n");
        int LeaseTerm= in.nextInt();
        System.out.println("Input Code of pasport\n");
        int CodeP= in.nextInt();

        stringList.add(new People.Builder(Name, Number, LeaseTerm, CodeP).build());
    }

    private static void Found(List<People> stringList) {
        for(int i=0; i<stringList.size(); i++) {
            if (stringList.get(i).Name=="Sergey") {
                System.out.println((stringList.get(i)).toString());
            }
        }
    }

    private static void check(List<People> stringList) {
        System.out.println("list empty - "+ stringList.isEmpty());
    }

    private static void SeeAll(List<People> stringList) {
        for(int i=0; i<stringList.size(); i++) {
            System.out.println((stringList.get(i)).toString());
        }
    };
};