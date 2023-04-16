package az.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.l;

public class a	// class@000227
{

    public void a(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.c("KEY_SPLASH_MOCK", false);
    }
}
