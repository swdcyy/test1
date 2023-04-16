package n0.b;
import java.lang.String;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.CharSequence;
import java.lang.Object;

public class b	// class@0026a7
{
    public static Class a;

    static {
       try{
          b.a = Class.forName("android.text.Layout$Ellipsizer");
       }catch(java.lang.ClassNotFoundException e0){
          e0.printStackTrace();
       }
    }
    public static boolean a(CharSequence p0){
       boolean b;
       Class a = b.a;
       b = (a != null && a.isInstance(p0))? true: false;
       return b;
    }
}
