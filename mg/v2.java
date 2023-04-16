package mg.v2;
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
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import com.feature.post.bridge.jsmodel.JsCacheIOResult;

public final class v2 implements Runnable	// class@00266f
{
    public final JsPostCacheParam b;
    public final g c;

    public void v2(JsPostCacheParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       boolean b1;
       v2 tb = this.b;
       v2 tc = this.c;
       a.p(tb, "params");
       a b = a.b;
       JsPostCacheParam mKey = tb.mKey;
       JsPostCacheParam mValue = tb.mValue;
       JsPostCacheParam mDistinguish = tb.mDistinguishUser;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(a.class)) {
          SharedPreferences$Editor obj = PatchProxy.applyThreeRefs(mKey, mValue, Boolean.valueOf(mDistinguish), b, a.class, "2");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(mKey == null){
             b1 = false;
          }else {
             obj = a.a.edit();
             if (mValue != null) {
                obj.putString(b.a(mKey, mDistinguish), mValue);
             }else {
                obj.remove(b.a(mKey, mDistinguish));
             }
             g.a(obj);
             b1 = true;
          }
       }else {
          goto label_0037 ;
       }
       Object[] objArray = new Object[0];
       l.D().w("JsGrowthBridgeFuns", "writeCache: "+tb+", success: "+b1, objArray);
       if (b1) {
          if (tc != null) {
             tc.onSuccess(JsCacheIOResult.getSuccessResult(null));
          }
       }else if(tc != null){
          tc.onSuccess(JsCacheIOResult.getFailedResult());
       }
       return;
    }
}
