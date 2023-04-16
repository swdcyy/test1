package mg.k2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsExecuteRPNParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import mn.b$a;
import mn.b;
import o36.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn.h;
import ok.x;
import mn.g;
import mn.a;
import lnc.p3;
import java.lang.Throwable;
import w46.b;
import java.util.HashMap;

public final class k2 implements Runnable	// class@00262c
{
    public final JsExecuteRPNParam b;
    public final g c;

    public void k2(JsExecuteRPNParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       k2 tb = this.b;
       k2 tc = this.c;
       a.p(tb, "params");
       JsExecuteRPNParam mContext = tb.mContext;
       if (mContext != null) {
       }else {
          mContext = new JsonObject();
       }
       b$a uoa = new b$a();
       JsExecuteRPNParam mDsl = tb.mDsl;
       uoa.b(mContext);
       b uob = uoa.a();
       Object obj = PatchProxy.applyTwoRefs(mDsl, uob, null, g.class, "9");
       if (obj == PatchProxyResult.class) {
          try{
             if (mDsl != null) {
                obj = a.b(new h(mDsl, 0, mDsl.length(), g.b.get()), "").a(uob, "");
             }
          }catch(java.lang.Exception e0){
             p3.D().e("FlyWheel", "run rpn error", e0);
          }
          obj = null;
       }
       if (obj == null) {
          if (tc != null) {
             tc.onSuccess(null);
          }
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("result", obj);
          if (tc != null) {
             tc.onSuccess(hashMap);
          }
       }
       return;
    }
}
