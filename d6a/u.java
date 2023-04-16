package d6a.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.i;

public class u	// class@001eaf
{

    public void u(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.c();
    }
}
