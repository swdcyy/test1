package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$e;
import ut7.d;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import hf3.a;
import java.lang.String;
import wa1.h;
import java.lang.Object;
import ut7.h;
import com.kuaishou.livestream.message.nano.SCTeamPkStart;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$a;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$d;
import com.kwai.statechart.b;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$b;
import com.kuaishou.livestream.message.nano.TeamPkStatisticInfo;
import np2.i;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.a;
import com.kuaishou.livestream.message.nano.SCTeamPkStatisticInfo;
import lf3.g;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$c$a;
import np2.k;
import com.kwai.robust.PatchProxyResult;
import np2.l;
import com.kuaishou.livestream.message.nano.TeamStatisticInfo;

public final class TeamPkManager$e extends d	// class@001455
{
    public final h f;
    public final TeamPkManager g;
    public final a h;

    public void TeamPkManager$e(TeamPkManager p0,a p1,String p2){
       this.g = p0;
       this.h = p1;
       super(p2);
       this.f = new h(p1);
    }
    public void e(Object p0,h p1){
       TeamPkManager$e uoe = TeamPkManager$e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          SCTeamPkStart pkId = p0.pkId;
          a.o(pkId, "param.pkId");
          this.a().g(pkId);
          this.a().e().b(2);
          this.a().h(true);
          this.h().b(p0.statisticInfo);
          this.g.c.C();
          if (!PatchProxy.applyVoid(null, this, uoe, "4")) {
             this.f.a(649, SCTeamPkStatisticInfo.class, new a(this));
          }
          p0 = p0.statisticInfo;
          a.o(p0, "param.statisticInfo");
          this.j(p0);
       }
       return;
    }
    public void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager$e.class, "2")) {
          return;
       }
       a.p(p0, "reason");
       if (p0 instanceof TeamPkManager$c$a) {
          this.g.c.A(new k(this.a().f(), p0.d));
       }
       this.a().g("");
       this.a().e().b(1);
       this.a().h(false);
       if (!PatchProxy.applyVoid(null, this, TeamPkManager$e.class, "5")) {
          this.f.b();
       }
       return;
    }
    public final void j(TeamPkStatisticInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager$e.class, "3")) {
          return;
       }
       object oobject = null;
       object oobject1 = PatchProxy.applyOneRefs(p0, oobject, ol, "1");
       String str = "teamStatisticInfo";
       if (oobject1 != patchProxyRe) {
       }else {
          a.p(p0, "$this$yellowTeamInfo");
          TeamPkStatisticInfo teamStatisti1 = p0.teamStatisticInfo;
          a.o(teamStatisti1, str);
          int len1 = teamStatisti1.length;
          int i1 = 0;
          while (true) {
             if (i1 < len1) {
                object oobject3 = teamStatisti1[i1];
                TeamStatisticInfo teamStatisti2 = (oobject3.team == 1)? 1: null;
                if (teamStatisti2) {
                   oobject1 = oobject3;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                oobject1 = oobject;
             }
          }
       }
       Object obj = PatchProxy.applyOneRefs(p0, oobject, ol, "2");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "$this$blueTeamInfo");
          p0 = p0.teamStatisticInfo;
          a.o(p0, str);
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject2 = p0[i];
             TeamStatisticInfo teamStatisti = (oobject2.team == 2)? 1: null;
             if (teamStatisti) {
                oobject = oobject2;
             }
             i = i + 1;
          }
          obj = oobject;
       }
       if (oobject1 != null && obj != null) {
          this.g.c.v(oobject1, obj);
       }
       return;
    }
}
