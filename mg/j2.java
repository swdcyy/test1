package mg.j2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsApplyRecordMusicParam;
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
import w16.b;
import w16.m;
import mg.m;
import w16.m$a;
import k36.f;
import android.os.Bundle;

public final class j2 implements Runnable	// class@002612
{
    public final JsApplyRecordMusicParam b;
    public final g c;

    public void j2(JsApplyRecordMusicParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j2 tb = this.b;
       j2 tc = this.c;
       a.p(tb, "params");
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "JsGrowthBridgeFuns";
       l.D().w(str, "applyMusic, musicId: "+tb.mMusicId, objArray);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity == null || !c.d().f("triggerApplyMagicEvent")) {
          Object[] objArray1 = new Object[i];
          l.D().w(str, "applyMusic, not found listener", objArray1);
          if (tc != null) {
             tc.a(7, null, null);
          }
       }else {
          c.d().g(new b(tb, new m(new m(tc)), uActivity.hashCode()));
       }
       return;
    }
}
