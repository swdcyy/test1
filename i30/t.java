package i30.t;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import i30.u;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i30.y;
import l30.e;
import l30.y;
import com.kuaishou.romid.inlet.OaidHelper;

public class t	// class@001797
{
    public Context a;
    public e b;
    public AtomicBoolean c;
    public CountDownLatch d;
    public y e;
    public c0 f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean m = false;
    public static int n;
    public static AtomicBoolean o;
    public static AtomicBoolean p;

    static {
       t.o = new AtomicBoolean(false);
       t.p = new AtomicBoolean(false);
    }
    public void t(){
       super();
       this.b = null;
       this.c = new AtomicBoolean(false);
       this.d = new CountDownLatch(1);
       this.h = false;
       this.i = true;
       this.j = false;
    }
    public void t(u p0){
       super();
       this.b = null;
       this.c = new AtomicBoolean(false);
       this.d = new CountDownLatch(1);
       this.h = false;
       this.i = true;
       this.j = false;
    }
    public static int a(int p0){
       t.n = p0;
       return p0;
    }
    public static Context b(t p0){
       return p0.a;
    }
    public static final t c(){
       Object obj = PatchProxy.apply(null, null, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.a;
    }
    public static e e(t p0){
       return p0.b;
    }
    public static y g(t p0){
       return p0.e;
    }
    public static CountDownLatch h(t p0){
       return p0.d;
    }
    public static AtomicBoolean k(){
       return t.p;
    }
    public Context d(){
       return this.a;
    }
    public boolean f(){
       return this.h;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       this.h = true;
       OaidHelper.getSingletonInstance().initOAIDImpl(this.a);
       return;
    }
    public e j(){
       t tb = this.b;
       if (tb != null) {
          return tb;
       }
       return null;
    }
}
