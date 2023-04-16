package er.g;
import java.lang.Object;
import com.kuaishou.android.vader.Channel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import er.a;

public abstract class g	// class@00158e
{

    public void g(){
       super();
    }
    public static g b(Channel p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, g.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(p0, p1, p2);
    }
    public abstract Channel a();
    public abstract int c();
    public abstract int d();
}
