package org.example.callbacks;

public class CallbackDemo {

    public static void main(String[] args) {
        Calc calc = new Calc();
      int sum =  calc.add(10,20);
        System.out.println("sum is "+sum);
        MobilePhone mobilePhone = new ElderBrother();
        new Thread(){
            @Override
            public void run() {
                calc.addKid(30,40, mobilePhone);
            }
        }.start();
        System.out.println("i can continue working while kid is adding");
       // System.out.println("sum from the kid is"+ delayedSum);
    }
}
