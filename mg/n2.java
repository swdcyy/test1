package mg.n2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsGrowthFlyWheelEventParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import k36.c;
import k36.f;
import com.kwai.feature.post.api.feature.bridge.JsGrowthReadFlyWheelEventResultParam;

public final class n2 implements Runnable	// class@00263e
{
    public final JsGrowthFlyWheelEventParam b;
    public final g c;

    public void n2(JsGrowthFlyWheelEventParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n2 tb = this.b;
       n2 tc = this.c;
       a.p(tb, "param");
       JsGrowthFlyWheelEventParam mEventName = tb.mEventName;
       String str = 1;
       c uoc = (mEventName == null || !mEventName.length())? 1: null;
       if (uoc) {
          if (tc != null) {
             tc.a(-1, "event param is null", null);
          }
       }else {
          f uof = c.d().e(tb.mEventName);
          JsGrowthReadFlyWheelEventResultParam jsGrowthRead = new JsGrowthReadFlyWheelEventResultParam();
          jsGrowthRead.mEventName = tb.mEventName;
          if (uof == null) {
             jsGrowthRead.mHasCache = false;
          }else {
             jsGrowthRead.mHasCache = str;
             jsGrowthRead.mPayload = uof.c();
          }
          if (tc != null) {
             tc.onSuccess(jsGrowthRead);
          }
       }
       return;
    }
}
