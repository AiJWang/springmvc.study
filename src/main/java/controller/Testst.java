package controller;

import java.util.Calendar;

public class Testst {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2021,8,28);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.DAY_OF_WEEK,-180);
        System.out.println(calendar.get(Calendar.DATE));

        calendar.set(2020,8,28);
        calendar.add(Calendar.MONTH,6);
        System.out.println(calendar.YEAR+""+calendar.MONTH+""+calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DAY_OF_MONTH,-90);
        System.out.println(calendar.YEAR+""+calendar.MONTH+""+calendar.DAY_OF_MONTH);

        calendar.set(2020,8,28);
        calendar.add(Calendar.MONTH,3);
        System.out.println(calendar.YEAR+""+calendar.MONTH+""+calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DAY_OF_MONTH,-30);
        System.out.println(calendar.YEAR+""+calendar.MONTH+""+calendar.DAY_OF_MONTH);
    }
}
