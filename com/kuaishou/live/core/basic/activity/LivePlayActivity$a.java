package com.kuaishou.live.core.basic.activity.LivePlayActivity$a;
import sfc.a;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.core.basic.utils.e;

public class LivePlayActivity$a extends a	// class@00180a
{
    public final long c;
    public final LivePlayActivity d;

    public void LivePlayActivity$a(LivePlayActivity p0,long p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayActivity$a.class, "1")) {
          return;
       }
       e.t(this.c, 8, this.d.z.mLiveStreamId, null);
       super.b(p0);
       return;
    }
}
