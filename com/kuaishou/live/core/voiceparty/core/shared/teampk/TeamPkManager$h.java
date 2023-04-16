package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$h;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$h$a;
import java.lang.Object;
import ut7.h;
import com.kuaishou.livestream.message.nano.SCTeamPkStart;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;
import java.lang.Runnable;
import ekd.k1;
import np2.i;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$VoteEnd;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$c$b;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$b;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;

public final class TeamPkManager$h extends c	// class@00145a
{
    public final Runnable f;
    public final TeamPkManager g;

    public void TeamPkManager$h(TeamPkManager p0,String p1){
       this.g = p0;
       super(p1);
       this.f = new TeamPkManager$h$a(this);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TeamPkManager$h.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p0 = p0.statisticInfo;
          long l = p0.voteDeadline - p0.time;
          if (p0.voteEnd != null || l - null <= 0) {
             this.g.g(new TeamPkManager$VoteEnd());
          }else {
             k1.m(this.f);
             k1.r(this.f, l);
             this.g.c.d(l);
          }
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager$h.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       k1.m(this.f);
       if (p0 instanceof TeamPkManager$c$b) {
          this.g.c.M(this.a().a());
       }
       return;
    }
}
