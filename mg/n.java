package mg.n;
import w16.m$a;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.feature.post.bridge.jsmodel.JsPostGrowthCallback;

public final class n implements m$a	// class@002641
{
    public final g a;

    public void n(g p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "applyPrettifyEffect, error, "+p0, objArray);
       n ta = this.a;
       if (ta != null) {
          ta.onSuccess(JsPostGrowthCallback.getFailedParams(p0));
       }
       return;
    }
    public void onSuccess(){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "applyPrettifyEffect, success", objArray);
       n ta = this.a;
       if (ta != null) {
          ta.onSuccess(JsPostGrowthCallback.getSuccessParams());
       }
       return;
    }
}
