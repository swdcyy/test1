package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$b;
import ekd.f$j;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.util.Objects;
import android.widget.ViewFlipper;
import android.widget.ImageView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeBaseFlipperItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView;

public class LiveHourlyRankStrengthNoticeView$b extends f$j	// class@000c36
{
    public final LiveHourlyRankStrengthNoticeView a;

    public void LiveHourlyRankStrengthNoticeView$b(LiveHourlyRankStrengthNoticeView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeView$b.class, "2")) {
          return;
       }
       this.a.d.setVisibility(8);
       LiveHourlyRankStrengthNoticeView$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, LiveHourlyRankStrengthNoticeView.class, "6")) {
          ta.b.setVisibility(0);
          ta.c.setVisibility(0);
          if (ta.t.a() instanceof LiveHourlyRankStrengthNoticeNarrowItemView) {
             LiveHourlyRankStrengthNoticeNarrowItemView liveHourlyRa = ta.t.a();
             liveHourlyRa.g();
             liveHourlyRa.f();
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankStrengthNoticeView$b.class, "1")) {
          return;
       }
       this.a.t.c();
       LiveHourlyRankStrengthNoticeView d = this.a.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoid(null, d, LiveHourlyRankStrengthNoticeExpandView.class, "3")) {
          d.K.d();
       }
       return;
    }
}
