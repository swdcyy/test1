package mg.m2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsGrowthFlyWheelEventParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k36.c;
import k36.a;
import k36.f;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import android.os.Bundle;

public final class m2 implements Runnable	// class@002638
{
    public final JsGrowthFlyWheelEventParam b;
    public final g c;

    public void m2(JsGrowthFlyWheelEventParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m2 tb = this.b;
       m2 tc = this.c;
       a.p(tb, "param");
       JsGrowthFlyWheelEventParam mEventName = tb.mEventName;
       String str = 1;
       mEventName = (mEventName == null || !mEventName.length())? 1: null;
       if (!mEventName) {
          mEventName = tb.mPayload;
          if (mEventName != null && mEventName.length()) {
             str = null;
          }
          if (str) {
          label_004b :
             if (tc != null) {
                tc.a(-1, "event param is null", null);
             }
          }else {
             c.d().g(new a(tb.mEventName, tb.mPayload, tb.mNeedCache));
             if (tc != null) {
                tc.onSuccess(new JsSuccessResult());
             }
          }
       }else {
          goto label_004b ;
       }
       return;
    }
}
