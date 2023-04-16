package f3b.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class h	// class@0015c2
{
    public static a a;
    public static boolean b;
    public static boolean c;

    public void h(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return h.b(false);
    }
    public static boolean b(boolean p0){
       return h.b;
    }
}
