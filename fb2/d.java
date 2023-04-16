package fb2.d;
import ok.x;
import java.lang.Object;
import fb2.f;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Long;

public final class d implements x	// class@002922
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       LiveConfigStartupResponse$LiveSquareFeedConfig liveSquareFe = a.I(LiveConfigStartupResponse$LiveSquareFeedConfig.class);
       if (liveSquareFe != null) {
          liveSquareFe = liveSquareFe.mSlideOnceGuideDelayShowMs;
          if (liveSquareFe > 0) {
          label_0015 :
             return Long.valueOf(liveSquareFe);
          }
       }
       long l = 5000;
       goto label_0015 ;
    }
}
