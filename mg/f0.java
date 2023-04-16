package mg.f0;
import java.lang.Runnable;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import com.feature.post.bridge.jsmodel.JsSetActivityCallback;

public final class f0 implements Runnable	// class@0025f8
{
    public final g b;

    public void f0(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "setPostSessionActivityJson failed", objArray);
       f0 tb = this.b;
       if (tb != null) {
          tb.onSuccess(JsSetActivityCallback.getFailedParams());
       }
       return;
    }
}
