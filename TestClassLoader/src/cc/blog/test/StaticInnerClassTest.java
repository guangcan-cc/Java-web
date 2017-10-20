package cc.blog.test;

/**
 * Created by Elvis on 2017/10/20.
 */
public class StaticInnerClassTest {

    public static void main(String[] args) {
        System.out.println("..");
    }

    static class InnerClass{
        static void println(){

            System.out.println("....");
        }
    }
}
