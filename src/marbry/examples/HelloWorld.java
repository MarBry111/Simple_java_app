package marbry.examples;


//AWT Abstract Window Toolkit
//Swing

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        try{
            System.out.println("Hello, World");
            for(int i = 3; i>=0; i--) {
                System.out.println(10/i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}