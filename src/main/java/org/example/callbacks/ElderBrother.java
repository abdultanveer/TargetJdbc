package org.example.callbacks;

public class ElderBrother implements MobilePhone{
    @Override
    public void sumResult(int sum) {
        System.out.println("result  from kid brother is-"+sum);
    }
}
