package mg.u2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsPostCacheParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import o36.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import com.feature.post.bridge.jsmodel.JsCacheIOResult;

public final class u2 implements Runnable	// class@002669
{
    public final JsPostCacheParam b;
    public final g c;

    public void u2(JsPostCacheParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       String str;
       u2 tb = this.b;
       u2 tc = this.c;
       a.p(tb, "params");
       if (tc == null) {
       }else {
          a b = a.b;
          JsPostCacheParam mKey = tb.mKey;
          JsPostCacheParam mDistinguish = tb.mDistinguishUser;
          Objects.requireNonNull(b);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             str = PatchProxy.applyTwoRefs(mKey, Boolean.valueOf(mDistinguish), b, uoa, "1");
             if (str != PatchProxyResult.class) {
             }else {
             label_002e :
                str = null;
                if (mKey != null) {
                   str = a.a.getString(b.a(mKey, mDistinguish), str);
                }
             }
          }else {
             goto label_002e ;
          }
          Object[] objArray = new Object[0];
          l.D().w("JsGrowthBridgeFuns", "readCache "+tb+", answer: "+str, objArray);
          if (str == null) {
             tc.onSuccess(JsCacheIOResult.getFailedResult());
          }else {
             tc.onSuccess(JsCacheIOResult.getSuccessResult(str));
          }
       }
       return;
    }
}
