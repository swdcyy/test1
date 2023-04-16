package mwb.e;
import yf7.y;
import mwb.e$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yf7.y$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import mwb.c;
import java.lang.Throwable;
import android.app.Application;
import yf7.k;
import android.content.Context;

public final class e implements y	// class@001eeb
{
    public static final e$a a;

    static {
       e.a = new e$a(null);
    }
    public void e(){
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "name");
       y$a.a(this, p0);
       return;
    }
    public void b(){
       PatchProxy.applyVoid(null, this, e.class, "5");
    }
    public boolean c(){
       Boolean obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-2022051331).h(5);
       a.o(obj, "Singleton.get\(OnlineSyst¡­eSystraceType.PAGELAUNCH\)");
       return obj.booleanValue();
    }
    public boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "name");
       y$a.b(this, p0);
       return false;
    }
    public boolean e(){
       Boolean obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-2022051331).e(k.b(), 5);
       a.o(obj, "Singleton.get\(OnlineSyst¡­eSystraceType.PAGELAUNCH\)");
       return obj.booleanValue();
    }
}
