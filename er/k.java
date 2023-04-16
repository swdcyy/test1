package er.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import er.d;

public abstract class k	// class@001592
{

    public void k(){
       super();
    }
    public static k a(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new d(p0);
    }
    public abstract boolean b();
}
