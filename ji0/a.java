package ji0.a;
import java.util.concurrent.Callable;
import ji0.a$a;
import nsd.u;
import java.lang.Object;
import ji0.a$c;
import com.kuaishou.krn.apm.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.os.Handler;
import msd.a;
import java.lang.Boolean;
import java.util.Objects;
import ji0.b;
import android.os.HandlerThread;

public abstract class a implements Callable	// class@002baf
{
    public a b;
    public boolean c;
    public long d;
    public boolean e;
    public final a$c f;
    public static final a$a g;

    static {
       a.g = new a$a(null);
    }
    public void a(){
       super();
       this.d = 2000;
       this.e = true;
       this.f = new a$c(this);
    }
    public final a a(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a.m(obj);
       return obj;
    }
    public Handler b(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a().b.invoke();
    }
    public boolean c(){
       return this.c;
    }
    public boolean d(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, a.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(b.d.isAlive() && b.c){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
