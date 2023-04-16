package ay7.a;
import com.kwai.yoda.function.a;
import ny7.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import com.kwai.yoda.kernel.container.YodaWebView;
import ny7.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.yoda.function.FunctionResultParams;
import brd.t;
import ay7.a$a;
import java.util.concurrent.Callable;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;

public abstract class a extends a implements a	// class@0002e2
{
    public long c;

    public void a(){
       super();
    }
    public final void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
    }
    public void b(long p0){
       this.c = p0;
    }
    public Object e(YodaWebView p0,c p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.q(p1, "invokeContext");
       return null;
    }
    public abstract FunctionResultParams k(YodaBaseWebView p0,String p1);
    public t l(YodaBaseWebView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.fromCallable(new a$a(this, p0, p1));
       a.h(ot, "Observable.fromCallable ¡­ke\(webView, params\)\n    }");
       if (this.j()) {
          ot = ot.subscribeOn(AzerothSchedulers.b.c());
          a.h(ot, "observable.subscribeOn\(A¡­hSchedulers.mainThread\(\)\)");
       }
       return ot;
    }
}
