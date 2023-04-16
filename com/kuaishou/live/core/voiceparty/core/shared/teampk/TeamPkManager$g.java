package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$g;
import ut7.c;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$g$a;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$b;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$StopPk;
import nsd.u;
import ut7.e;
import com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;
import usd.q;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import ekd.k1;
import np2.i;
import java.lang.StringBuilder;

public final class TeamPkManager$g extends c	// class@001458
{
    public final Runnable f;
    public final TeamPkManager g;

    public void TeamPkManager$g(TeamPkManager p0,String p1){
       this.g = p0;
       super(p1);
       this.f = new TeamPkManager$g$a(this);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TeamPkManager$g.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          int i = 1;
          if (this.a().a() == VoicePartyTeamPkResult.DRAW) {
             this.g.g(new TeamPkManager$StopPk(null, i, null));
          }else {
             p0 = this.a().a;
             long l = (p0 != null)? p0.penaltyDeadline - q.o(p0.time, p0.voteEndWaitDeadline): 0;
             if (l <= 0) {
                this.g.g(new TeamPkManager$StopPk(null, i, null));
                b.Z(this.g.d(), "TeamPk prepare by punish timeout");
             }else {
                k1.m(this.f);
                k1.r(this.f, l);
                this.g.c.w(l);
                b.Z(this.g.d(), "TeamPk onEnter punish "+l);
             }
          }
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager$g.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       k1.m(this.f);
       return;
    }
}
