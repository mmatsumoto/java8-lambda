package br.com.functional.imp;

/**
 * Created by mmatsumoto on 6/28/17.
 */
public class Sample1 {


    public static void main(String[] args) {

//        Runnable r1 = new Runnable() {
//            public void run() {
//                System.out.println("in runnable");
//            }
//        };
//        Runnable r2 = new Runnable() {
//            public void run() {
//                System.out.println("in runnable");
//            }
//        };
//
//        Thread th = new Thread(r1);
//        th = new Thread(r2);
//        th.start();

        Thread th;
        th = new Thread(() -> System.out.print("in runn"));
        th = new Thread(() -> System.out.print("in runn"));
        th = new Thread(() -> System.out.print("in runn"));
        th = new Thread(() -> System.out.print("in runn"));
        th = new Thread(() -> System.out.print("in runn"));
        th = new Thread(() -> System.out.print("in runn"));



        System.out.println("in main");

    }


}
