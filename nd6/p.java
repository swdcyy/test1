package nd6.p;
import qj7.c;
import nd6.p$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class p implements c	// class@001f3c
{
    public static final p$a a;

    static {
       p.a = new p$a(null);
    }
    public void p(){
       super();
    }
    public void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p.class, "3")) {
          return;
       }
       Log.e("DvaLoggerImpl", p0, p1);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       Log.l("DvaLoggerImpl", p0);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "4")) {
          return;
       }
       Log.b("DvaLoggerImpl", p0);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       Log.g("DvaLoggerImpl", p0);
       return;
    }
}
