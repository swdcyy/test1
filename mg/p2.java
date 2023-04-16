package mg.p2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsGrowthGuideLifeCycleEventParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import r46.e;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public final class p2 implements Runnable	// class@00264a
{
    public final JsGrowthGuideLifeCycleEventParam b;
    public final g c;

    public void p2(JsGrowthGuideLifeCycleEventParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       p2 tb = this.b;
       p2 tc = this.c;
       a.p(tb, "param");
       JsGrowthGuideLifeCycleEventParam mBundleId = tb.mBundleId;
       mBundleId = (mBundleId == null || !mBundleId.length())? 1: null;
       if (mBundleId) {
          if (tc != null) {
             tc.a(-1, "bundle id is null", null);
          }
       }else {
          mBundleId = tb.mBundleId;
          a.o(mBundleId, "param.mBundleId");
          e.c(mBundleId, tb.mEventType, tb.mExtraParams);
          if (tc != null) {
             tc.onSuccess(new JsSuccessResult());
          }
       }
       return;
    }
}
