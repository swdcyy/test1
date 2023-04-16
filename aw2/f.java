package aw2.f;
import erd.g;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPlayingContainerView;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView$ThumbType;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import com.kuaishou.live.common.core.basic.degrade.j;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView;

public final class f implements g	// class@0002d7
{
    public final VoicePartyTeamPkPlayingContainerView b;
    public final boolean c;

    public void f(VoicePartyTeamPkPlayingContainerView p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       long l = p0.longValue();
       VoicePartyTeamPkPlayingContainerView j = tb.j;
       if (!PatchProxy.isSupport(VoicePartyTeamPkPlayingContainerView.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(tc), Long.valueOf(l), Boolean.valueOf(j), tb, VoicePartyTeamPkPlayingContainerView.class, "3")) {
          if (tc == null) {
             VoicePartyTeamPkPlayingContainerView b = tb.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.isSupport(VoicePartyTeamPkScoreView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), Boolean.valueOf(j), b, VoicePartyTeamPkScoreView.class, "10")) {
                if (l - 30 <= 0) {
                   b.c(VoicePartyTeamPkScoreView$ThumbType.LARGE);
                }else if(j != null){
                   b.c(VoicePartyTeamPkScoreView$ThumbType.SMALL);
                }
             }
          }else {
             tb.b.d();
          }
       }
       long l1 = p0.longValue();
       if (!PatchProxy.isSupport(VoicePartyTeamPkPlayingContainerView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l1), Boolean.valueOf(tc), tb, VoicePartyTeamPkPlayingContainerView.class, "4")) {
          if (tc == null && l1 - 10 <= 0) {
             j.i(tb.f, 2, TimeUnit.SECONDS);
          }else {
             tb.f.n();
          }
       }
       tb.c.r(p0.longValue(), tc);
       return;
    }
}
