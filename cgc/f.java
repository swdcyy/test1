package cgc.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import lnc.i3;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;
import k2b.u1;

public final class f	// class@000598
{
    public static boolean a;
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public static final void a(f p0,boolean p1){
       f.a = p1;
    }
    public static final boolean b(){
       String obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "screencast_plugin";
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public final void c(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("time", Long.valueOf(System.currentTimeMillis()));
       oi3.d("msg", p1);
       oi3.d("source", p2);
       u1.R(p0, oi3.toString(), 9);
       return;
    }
}
