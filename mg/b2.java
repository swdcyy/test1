package mg.b2;
import java.lang.Runnable;
import f55.g;
import java.lang.Object;
import i46.b;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import java.lang.String;
import com.feature.post.bridge.jsmodel.JsGetActivityCallback;

public final class b2 implements Runnable	// class@0025d1
{
    public final g b;

    public void b2(g p0){
       this.b = p0;
    }
    public final void run(){
       b2 tb = this.b;
       if (tb == null) {
       }else {
          b uob = y6.r(b.class);
          String str = (uob != null)? uob.pl(): null;
          int i = (str == null || !str.length())? 1: 0;
          if (i) {
             tb.onSuccess(JsGetActivityCallback.getFailedParams());
          }else {
             tb.onSuccess(JsGetActivityCallback.getSuccessParams(str));
          }
       }
       return;
    }
}
