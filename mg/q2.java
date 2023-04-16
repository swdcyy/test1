package mg.q2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsGrowthWebDialogParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import i46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import mg.z;
import mg.a0;
import erd.g;
import crd.b;

public final class q2 implements Runnable	// class@002650
{
    public final JsGrowthWebDialogParam b;
    public final g c;

    public void q2(JsGrowthWebDialogParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       q2 tb = this.b;
       q2 tc = this.c;
       a.p(tb, "param");
       JsGrowthWebDialogParam mUrl = tb.mUrl;
       ActivityContext uActivityCon = (mUrl == null || !mUrl.length())? 1: null;
       Bundle uBundle = null;
       int i = -1;
       if (uActivityCon) {
          if (tc != null) {
             tc.a(i, "url is null", uBundle);
          }
       }else {
          uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (uActivity == null) {
             if (tc != null) {
                tc.a(i, "activity is null", uBundle);
             }
          }else {
             y6.s(b.class, LoadPolicy.DIALOG).R(new z(uActivity, tb, tc), new a0(tc));
          }
       }
       return;
    }
}
