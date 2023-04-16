package mg.w;
import java.lang.Runnable;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.feature.post.api.feature.bridge.JsListenUserTouchParam;
import f55.g;
import java.lang.Object;
import fw8.r$a;
import fw8.r;
import og.l;
import java.lang.String;
import q87.c;
import java.lang.CharSequence;
import k36.c;
import k36.a;
import k36.f;
import com.kwai.feature.post.api.feature.bridge.JsUserTouchResultParam;

public final class w implements Runnable	// class@002676
{
    public final Ref$ObjectRef b;
    public final JsListenUserTouchParam c;
    public final g d;

    public void w(Ref$ObjectRef p0,JsListenUserTouchParam p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (this.b.element != null) {
          r.c().g(this.b.element);
       }
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsGrowthBridgeFuns", "listenUserTouch time out", objArray);
       JsListenUserTouchParam mNoUserTouch = this.c.mNoUserTouchEvent;
       a uoa = 1;
       c uoc = (mNoUserTouch == null || !mNoUserTouch.length())? 1: null;
       if (!uoc) {
          w tc = this.c;
          c.d().g(new a(tc.mNoUserTouchEvent, tc.mNoUserTouchPayloads, i));
       }else {
          w td = this.d;
          if (td != null) {
             td.onSuccess(new JsUserTouchResultParam(uoa));
          }
       }
       return;
    }
}
