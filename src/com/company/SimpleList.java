package com.company;

import java.util.ArrayList;

public class SimpleList
{
    public void demo()
    {
        ArrayList<String> myList = new ArrayList<>();
        myList.add ("Yellow");
        myList.add ("Green");
        myList.add ("Aqua");
        myList.add ("Mac and Cheese");
        myList.add ("Vomit");

        for (String color: myList)
        {
            System.out.println(color);
        }

        for (int index = 0; index < myList.size(); index++)
        {
            System.out.println(myList.get(index));
        }

    }
}
