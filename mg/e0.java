package mg.e0;
import java.lang.Runnable;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import com.feature.post.bridge.jsmodel.JsSetActivityCallback;

public final class e0 implements Runnable	// class@0025f2
{
    public final g b;

    public void e0(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "setPostSessionActivityJson success", objArray);
       e0 tb = this.b;
       if (tb != null) {
          tb.onSuccess(JsSetActivityCallback.getSuccessParams());
       }
       return;
    }
}
