/**
 * Created by Julia Wigenstedt
 * Date: 2020-09-28
 * Time: 21:00
 * Project: Ass9OOP
 * Copyright: MIT
 */
public class Main {
    public static void main(String[] args) {
        for(var num: RomanNumber.values()){
            System.out.println(num.name() + ": " + num.getNumber());
        }
    }
}
