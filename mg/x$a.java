package mg.x$a;
import java.lang.Runnable;
import mg.x;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import ekd.k1;
import fw8.r;
import fw8.r$a;
import com.kwai.feature.post.api.feature.bridge.JsListenUserTouchParam;
import java.lang.CharSequence;
import k36.c;
import k36.a;
import k36.f;
import com.kwai.feature.post.api.feature.bridge.JsUserTouchResultParam;
import f55.g;

public final class x$a implements Runnable	// class@002677
{
    public final x b;

    public void x$a(x p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "user touch", objArray);
       k1.m(this.b.b.element);
       r.c().g(this.b);
       JsListenUserTouchParam mUserTouchEv = this.b.c.mUserTouchEvent;
       c uoc = (mUserTouchEv == null || !mUserTouchEv.length())? 1: null;
       if (!uoc) {
          x c = this.b.c;
          c.d().g(new a(c.mUserTouchEvent, c.mUserTouchPayloads, 0));
       }else {
          x d = this.b.d;
          if (d != null) {
             d.onSuccess(new JsUserTouchResultParam(0));
          }
       }
       return;
    }
}
