package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$c;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveHourlyRankStrengthNoticeView$c extends f$j	// class@000c37
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void LiveHourlyRankStrengthNoticeView$c(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeView$c.class, "1")) {
          return;
       }
       this.a.h();
       this.a.d();
       return;
    }
}
