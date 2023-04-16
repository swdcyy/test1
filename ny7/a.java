package ny7.a;
import ny7.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.kwai.yoda.kernel.container.YodaWebView;
import ny7.c;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ny7.a$b;
import java.util.concurrent.Callable;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import com.kwai.yoda.function.system.GetAppInfoFunction;
import sv8.a;
import cy7.b;
import java.lang.StringBuilder;

public abstract class a	// class@00273b
{
    public String a;
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(){
       super();
       this.a = "yoda";
    }
    public abstract String c();
    public abstract String d();
    public abstract Object e(YodaWebView p0,c p1);
    public t f(YodaWebView p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p1, "invokeContext");
       t ot = t.fromCallable(new a$b(this, p0, p1));
       a.h(ot, "Observable.fromCallable \x20\x02 ?: EmptyResponse\(\)\n    }\x00");
       if (this.j()) {
          ot = ot.subscribeOn(AzerothSchedulers.b.c());
          a.h(ot, "observable.subscribeOn\(A¡­hSchedulers.mainThread\(\)\)");
       }
       return ot;
    }
    public boolean g(){
       return this instanceof GetAppInfoFunction;
    }
    public boolean h(){
       return (this instanceof a ^ 0x01);
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public boolean j(){
       return this instanceof b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Function ["+this.d()+'.'+this.c()+']';
    }
}
