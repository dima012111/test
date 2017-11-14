package test;

public class AssertTest {
    public static void main(String s[]){
        AssertTest c = new AssertTest();
        Class cls = c.getClass();

        // returns the name of the class
        String name = cls.getName();
        System.out.println("Class Name = " + name);

        // returns assertion status
        boolean retval = cls.desiredAssertionStatus();
        System.out.println("status = " + retval);
    }
}
