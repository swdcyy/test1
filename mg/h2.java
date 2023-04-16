package mg.h2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsApplyRecordMagicFaceParam;
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
import w16.a;
import w16.m;
import mg.l;
import w16.m$a;
import k36.f;
import android.os.Bundle;

public final class h2 implements Runnable	// class@002606
{
    public final JsApplyRecordMagicFaceParam b;
    public final g c;

    public void h2(JsApplyRecordMagicFaceParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h2 tb = this.b;
       h2 tc = this.c;
       a.p(tb, "params");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "JsGrowthBridgeFuns";
       l.D().w(str, "applyMagicFace, magicFaceId: "+tb.mMagicFaceId, objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity == null || !c.d().f("triggerApplyMagicEvent")) {
          if (tc != null) {
             tc.a(7, null, null);
          }
          Object[] objArray1 = new Object[i];
          l.D().w(str, "applyMagicFace, not found listener", objArray1);
       }else {
          c.d().g(new a(tb, new m(new l(tc)), uActivity.hashCode()));
       }
       return;
    }
}
