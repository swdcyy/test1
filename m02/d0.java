package m02.d0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import pp.c;
import com.kuaishou.android.live.log.b;
import tj3.k;
import tj3.e;
import z12.n;
import kuaishou.perf.page.impl.b;

public final class d0 implements Runnable	// class@0030b1
{
    public final LivePlayFragment b;

    public void d0(LivePlayFragment p0){
       this.b = p0;
    }
    public final void run(){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LivePlayFragment.class, "37")) {
       }else {
          long l = System.currentTimeMillis() - tb.F.getStartActivityTime();
          b.Z(LiveLogTag.PLAY_FRAGMENT, "bizViewOnDrawCallback: "+tb.H.getUserId()+" duration: "+l);
          tb.V.x().m0 = l;
          if (!PatchProxy.applyVoid(null, null, n.class, "5")) {
             b.d("live_click_to_destroy").h("PageClickToAppearDuration");
          }
       }
       return;
    }
}
