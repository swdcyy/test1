package gy2.g;
import gy2.g$a;
import nsd.u;
import java.lang.Object;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import java.util.Objects;
import gy2.f;
import gy2.c;
import java.util.List;
import java.util.Collection;

public final class g	// class@002bcc
{
    public static final g$a a;

    static {
       g.a = new g$a(null);
    }
    public void g(){
       super();
    }
    public static final boolean a(Activity p0,int p1){
       g$a obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, og, "7");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = g.a;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(g$a.class)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, g$a.class, "8");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 == null){
             List list = f.e.a(p0).c(p1);
             if (list != null && !list.isEmpty()) {
                b = true;
             }
          }
          b = false;
       }else {
          goto label_003e ;
       }
       return b;
    }
}
