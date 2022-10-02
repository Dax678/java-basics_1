package pl.edu.wszib;

public class MyClass {
    String field1;
    protected String field2;
    private String field3;

    private String field4;

    public MyClass() {
    }

    public MyClass(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    void run1() {
        System.out.println("Field1 = " + this.field1);
    }

    protected void run2() {
        System.out.println("Field2 = " + this.field2);
    }

    private void run3() {
        System.out.println("Field3 = " + this.field3);
    }

    public void run4() {
        System.out.println("Field4 = " + this.field4);
    }
}
