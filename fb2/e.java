package fb2.e;
import ok.x;
import java.lang.Object;
import fb2.f;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Long;

public final class e implements x	// class@002923
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       LiveConfigStartupResponse$LiveSquareFeedConfig liveSquareFe = a.I(LiveConfigStartupResponse$LiveSquareFeedConfig.class);
       if (liveSquareFe != null) {
          liveSquareFe = liveSquareFe.mSlideOnceGuideDurationMs;
          if (liveSquareFe > 0) {
          label_0015 :
             return Long.valueOf(liveSquareFe);
          }
       }
       long l = 5000;
       goto label_0015 ;
    }
}
