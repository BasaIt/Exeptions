import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }catch (Exception e){

        }finally {
            System.out.println("Мы в блоке файнали");
        }


        try { int name[] = new int[10];
            System.out.println(name[45]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Массив не найден");
        }
    }
}
