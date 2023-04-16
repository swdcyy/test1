package cx8.g;
import java.lang.Object;
import cx8.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;

public class g	// class@002016
{

    public void g(){
       super();
    }
    public static h a(){
       Object obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x49cd5c65);
    }
}
