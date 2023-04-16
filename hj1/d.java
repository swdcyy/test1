package hj1.d;
import hj1.d$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import hj1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class d	// class@0026f1
{
    public static final d$a a;

    static {
       d.a = new d$a(null);
    }
    public void d(){
       super();
    }
    public static final c a(LiveGiftGuideConfig p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.a.b(p0, p1);
    }
}
