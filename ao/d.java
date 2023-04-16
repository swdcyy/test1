package ao.d;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import java.lang.Boolean;
import brd.g;
import ao.d$a;
import nyc.e;
import o56.c;
import o56.a;
import android.app.Application;

public final class d implements g	// class@000209
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       if (q.d()) {
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
          return;
       }else {
          q.a(new d$a(p0));
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          q.b(uoc.a());
          return;
       }
    }
}
