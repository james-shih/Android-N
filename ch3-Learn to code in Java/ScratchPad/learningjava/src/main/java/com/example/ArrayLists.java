package com.example;

import java.util.ArrayList;

/**
 * Created by jamesshih.ilink on 29/03/2017.
 */

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList names = new ArrayList();

        names.add("Carl");
        names.add("Jimmy Neutron");
        names.add("That Yellow Dancing Banana From the Peanut Butter Jelly Song");

        System.out.println(names.get(0));

        names.remove("Carl");

        System.out.println(names.get(0));

        names.remove(0);

        System.out.println(names.get(0));
    }

}
