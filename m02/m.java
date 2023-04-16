package m02.m;
import erd.g;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLiveLaunchInfo;
import java.util.Objects;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.basic.utils.e;
import android.app.Activity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import tkd.b;
import tkd.d;
import nl9.b0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import xa2.k;
import nl9.r;

public final class m implements g	// class@0030ce
{
    public final LivePlayActivity b;
    public final long c;

    public void m(LivePlayActivity p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m tb = this.b;
       m tc = this.c;
       Objects.requireNonNull(tb);
       QLiveLaunchInfo mLiveStream = p0.mLiveStream;
       int i = (mLiveStream != null)? 7: 8;
       e.t(tc, i, tb.z.mLiveStreamId, mLiveStream);
       if (!tb.isFinishing()) {
          if (p0.mLiveStream == null) {
             tb.finish();
          }else {
             tb.A = new LiveStreamFeedWrapper(p0.mLiveStream);
             d.a(0x37593069).dH(null, tb.A.mEntity);
             LiveAudienceParam$a uoa = new LiveAudienceParam$a(tb.z);
             uoa.j(p0.mLiveStream);
             tb.z = uoa.a();
             if (k.c(tb.A)) {
                tb.B();
             }else {
                int i1 = 0x691527a8;
                if (d.a(i1).II(tb.L, p0.mLiveStream, false)) {
                   d.a(i1).UW(tb.L, tb.z);
                }else {
                   tb.z3();
                }
             }
          }
       }
       return;
    }
}
