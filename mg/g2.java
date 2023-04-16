package mg.g2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsApplyPrettifyParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import k36.c;
import h36.c;
import w16.m;
import mg.n;
import w16.m$a;
import k36.f;
import android.os.Bundle;

public final class g2 implements Runnable	// class@002600
{
    public final JsApplyPrettifyParam b;
    public final g c;

    public void g2(JsApplyPrettifyParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g2 tb = this.b;
       g2 tc = this.c;
       a.p(tb, "params");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "JsGrowthBridgeFuns";
       l.D().w(str, "applyPrettifyEffect, suitId: "+tb.mItemId, objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity == null || !c.d().f("triggerApplyPrettifyEvent")) {
          if (tc != null) {
             tc.a(-1, null, null);
          }
          Object[] objArray1 = new Object[i];
          l.D().w(str, "applyPrettifyEffect, not found listener", objArray1);
       }else {
          c.d().g(new c(tb, new m(new n(tc)), uActivity.hashCode()));
       }
       return;
    }
}
