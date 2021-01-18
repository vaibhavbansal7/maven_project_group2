import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        StringFunctions objectOfStringFunction=new StringFunctions();
        Scanner s=new Scanner(System.in);
        String str= s.nextLine();
        int length=objectOfStringFunction.sizeOfString(str);
        System.out.println(length);
        String reverseAns=objectOfStringFunction.reverse(str);
        System.out.println(reverseAns);

    }
}
