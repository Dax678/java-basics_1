package pl.edu.wszib;

import pl.edu.wszib.myPackage.MyClass7;

public class Application
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        MyClass cll;
        cll = new MyClass();

        //cll.field3 = "Field3";
        cll.field2 = "Field1";
        //cll.field4 = "Field4";
        cll.run2();
        //cll.run3();
        cll.run4();

    }
}