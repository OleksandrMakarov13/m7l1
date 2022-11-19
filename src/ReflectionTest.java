import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Integer> integerClass = Integer.class;
        System.out.println("integerClass.getName() = " + integerClass.getName());

        Class<String> stringClass = String.class;
        System.out.println("stringClass.getInterfaces() = " + Arrays.toString(stringClass.getInterfaces()));

        Object o1 = String.valueOf(1);
        Object o2 = "kjhlkjh";
        Object o3 = 234;
        System.out.println("o1.getClass().equals(o2.getClass()) = " + o1.getClass().equals(o2.getClass()));
        System.out.println("o1.getClass().equals(o3.getClass()) = " + o1.getClass().equals(o3.getClass()));

        System.out.println("stringClass.getSuperclass() = " + stringClass.getSuperclass());

        Class<List> listClass = List.class;
        System.out.println("listClass.getSuperclass() = " + listClass.getSuperclass());

        String myString = String.class.getDeclaredConstructor().newInstance();
        Method[] methods = String.class.getMethods();
        System.out.println(Arrays.toString(methods));
        Method method = String.class.getMethod("length");
        int length = (int)method.invoke("kjjljk");
        System.out.println(length);

    }
}
