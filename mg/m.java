package mg.m;
import w16.m$a;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.feature.post.bridge.jsmodel.JsPostGrowthCallback;

public final class m implements m$a	// class@00263b
{
    public final g a;

    public void m(g p0){
       this.a = p0;
       super();
    }
    public void onFailed(int p0){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "applyMusic, error, "+p0, objArray);
       m ta = this.a;
       if (ta != null) {
          ta.onSuccess(JsPostGrowthCallback.getFailedParams(p0));
       }
       return;
    }
    public void onSuccess(){
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "applyMusic, success", objArray);
       m ta = this.a;
       if (ta != null) {
          ta.onSuccess(JsPostGrowthCallback.getSuccessParams());
       }
       return;
    }
}
