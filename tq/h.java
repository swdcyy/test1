package tq.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import tq.a;

public abstract class h	// class@002564
{

    public void h(){
       super();
    }
    public static h a(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport2(h.class, "3")) {
          Object obj = PatchProxy.applyThreeRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), null, h.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(h.class, "3");
       return new a(p0, p1, p2);
    }
    public abstract boolean b();
    public abstract boolean c();
    public abstract boolean d();
}
