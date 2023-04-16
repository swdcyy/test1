package er.l;
import java.lang.Object;
import com.kuaishou.android.vader.config.LogPolicy;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import er.e;

public abstract class l	// class@001593
{

    public void l(){
       super();
    }
    public static l a(boolean p0,long p1,LogPolicy p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), p2, null, l.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new e(p0, p1, p2);
    }
    public abstract LogPolicy b();
    public abstract long c();
    public abstract boolean d();
}
