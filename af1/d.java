package af1.d;
import vf1.b;
import brd.v;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import brd.g;

public final class d implements b	// class@00006e
{
    public final v b;

    public void d(v p0){
       this.b = p0;
    }
    public final void x6(LiveAudienceDelayInfosResponse p0){
       d tb = this.b;
       p0 = p0.mHighFrequencyStyle;
       if (p0 == null) {
          tb.onError(new RuntimeException("Style Is Empty"));
       }else {
          tb.onNext(p0);
          tb.onComplete();
       }
       return;
    }
}
