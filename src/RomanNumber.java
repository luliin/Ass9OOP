/**
 * Created by Julia Wigenstedt
 * Date: 2020-09-28
 * Time: 20:55
 * Project: Ass9OOP
 * Copyright: MIT
 */
public enum RomanNumber {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int number;

    RomanNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
