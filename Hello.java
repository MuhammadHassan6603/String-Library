import java.lang.Math;
import java.lang.String;
public class Hello
{
    public static void main(String[] args)
    {
        int i;
        String f="hassan";
        String b="";
        char[] ch={'S','t','r','i','n','g'};
        String obj=new String(ch);
        System.out.println(obj);
        String hehe=obj.toUpperCase();
        String haha=obj.toLowerCase();
        System.out.println(hehe);
        System.out.println(haha);
        System.out.println(hehe.length());
        System.out.println(hehe.isEmpty());
        System.out.println(b.isEmpty());
        char[] aa=f.toCharArray();
        for(i=0 ; i<= aa.length ; i++)
        {
            System.out.print(aa[i] + " ");
        }
    }
}