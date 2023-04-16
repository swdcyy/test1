package mg.r2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsListenUserTouchParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import mg.w;
import mg.x;
import fw8.r;
import fw8.r$a;
import ekd.k1;

public final class r2 implements Runnable	// class@002657
{
    public final JsListenUserTouchParam b;
    public final g c;

    public void r2(JsListenUserTouchParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       r2 tb = this.b;
       r2 tc = this.c;
       a.p(tb, "params");
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "listenUserTouch "+tb, objArray);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
       objectRef1.element = null;
       objectRef.element = new w(objectRef1, tb, tc);
       objectRef1.element = new x(objectRef, tb, tc);
       r.c().a(objectRef1.element);
       k1.r(objectRef.element, tb.mDuration);
    }
}
