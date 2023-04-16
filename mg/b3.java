package mg.b3;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsViewUpdateParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import og.l;
import q87.c;
import android.os.Bundle;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import p36.a;
import android.view.View;
import r36.b;
import android.widget.TextView;
import com.google.gson.JsonElement;
import com.kwai.feature.post.api.flywheel.widget.a;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public final class b3 implements Runnable	// class@0025d2
{
    public final JsViewUpdateParam b;
    public final g c;

    public void b3(JsViewUpdateParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b3 tb = this.b;
       b3 tc = this.c;
       a.p(tb, "params");
       JsViewUpdateParam mTargetViewI = tb.mTargetViewId;
       int i = 0;
       Object[] objArray = (mTargetViewI == null || !mTargetViewI.length())? 1: null;
       if (objArray) {
          objArray = new Object[i];
          l.D().w("PostGrowth", "JsGrowthBridgeFuns targetViewId is null", objArray);
          if (tc != null) {
             tc.a(-1, "targetViewId is null", null);
          }
       }else {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity == null) {
             objArray = new Object[i];
             l.D().w("PostGrowth", "JsGrowthBridgeFuns activity is null", objArray);
             if (tc != null) {
                tc.a(-1, "activity is null", null);
             }
          }else {
             JsViewUpdateParam mTargetViewI1 = tb.mTargetViewId;
             a.o(mTargetViewI1, "params.mTargetViewId");
             View view = a.b.b(uActivity, mTargetViewI1);
             if (view instanceof b) {
                view = view.getFlyWheelTextView();
             }
             if (view == null) {
                objArray = new Object[i];
                l.D().w("PostGrowth", "JsGrowthBridgeFuns target view is null", objArray);
                if (tc != null) {
                   tc.a(-1, "target view is null", null);
                }
             }else {
                JsViewUpdateParam mTextConfigs = tb.mTextConfigs;
                if (mTextConfigs != null && view instanceof TextView) {
                   a.b(view, mTextConfigs.toString());
                }
                if (tc != null) {
                   tc.onSuccess(new JsSuccessResult());
                }
             }
          }
       }
       return;
    }
}
