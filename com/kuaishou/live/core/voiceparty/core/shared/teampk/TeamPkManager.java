package com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager;
import hf3.a;
import msd.a;
import java.lang.String;
import hp2.m;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import qrd.l1;
import np2.i;
import wa1.h;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$f;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$e;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$h;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$g;
import np2.h;
import pp2.a;
import np2.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import hp2.c;
import ut7.h;
import com.kwai.statechart.StateChart;
import pp.c;
import com.kuaishou.android.live.log.b;
import ut7.e;
import com.kwai.statechart.StateChart$b;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$$inlined$apply$lambda$1;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$1$2;
import com.kwai.statechart.a;
import pp2.b;
import ut7.g;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$buildStateChart$$inlined$apply$lambda$2;
import com.kwai.statechart.b;
import msd.l;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$StartPk;
import np2.c;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.shared.teampk.TeamPkManager$StopPk;
import np2.d;
import np2.e;
import com.kuaishou.livestream.message.nano.SCTeamPkStart;
import lf3.g;
import np2.f;
import com.kuaishou.livestream.message.nano.SCTeamPkEnd;

public abstract class TeamPkManager	// class@00145b
{
    public final TeamPkManager$a a;
    public StateChart b;
    public final i c;
    public final h d;
    public final TeamPkManager$f e;
    public final TeamPkManager$e f;
    public final TeamPkManager$h g;
    public final TeamPkManager$g h;

    public void TeamPkManager(a p0,a p1,String p2,m p3){
       a.p(p0, "longConnection");
       a.p(p1, "liveStreamIdFetcher");
       a.p(p2, "voicePartyId");
       a.p(p3, "param");
       super();
       TeamPkManager$a uoa = PatchProxy.apply(null, this, TeamPkManager.class, "9");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new TeamPkManager$a();
       }
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(p1, uoa, TeamPkManager$a.class, "2")) {
          a.p(p1, "<set-?>");
          uoa.a = p1;
       }
       if (!PatchProxy.applyVoidOneRefs(p2, uoa, TeamPkManager$a.class, "8")) {
          a.p(p2, "<set-?>");
          uoa.f = p2;
       }
       if (!PatchProxy.applyVoidOneRefs(p3, uoa, TeamPkManager$a.class, "4")) {
          a.p(p3, "<set-?>");
          uoa.b = p3;
       }
       this.a = uoa;
       this.c = new i();
       this.d = new h(p0);
       this.e = new TeamPkManager$f(this, "TeamPk.Prepare");
       this.f = new TeamPkManager$e(this, p0, "Pking");
       this.g = new TeamPkManager$h(this, "TeamPk.Voting");
       this.h = new TeamPkManager$g(this, "TeamPk.Punish");
       return;
    }
    public final void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager.class, "3")) {
          return;
       }
       a.p(p0, "observer");
       this.c.j0(p0);
       return;
    }
    public TeamPkManager$a b(){
       return this.a;
    }
    public final a c(){
       Object obj = PatchProxy.apply(null, this, TeamPkManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b();
    }
    public abstract LiveVoicePartyLogTag d();
    public void e(c p0){
       TeamPkManager teamPkManage = TeamPkManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, teamPkManage, "6")) {
          return;
       }
       a.p(p0, "reason");
       if (!PatchProxy.applyVoid(null, this, teamPkManage, "8")) {
          this.d.b();
       }
       teamPkManage = this.b;
       if (teamPkManage == null) {
          a.S("stateChart");
       }
       teamPkManage.t(p0);
       b.Z(this.d(), "TeamPk release");
       return;
    }
    public final void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager.class, "4")) {
          return;
       }
       a.p(p0, "observer");
       this.c.l0(p0);
       return;
    }
    public final void g(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TeamPkManager.class, "2")) {
          return;
       }
       a.p(p0, "event");
       TeamPkManager tb = this.b;
       if (tb == null) {
          a.S("stateChart");
       }
       tb.l(p0);
       return;
    }
    public final void h(){
       TeamPkManager teamPkManage = TeamPkManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, teamPkManage, "5")) {
          return;
       }
       StateChart$b uob = PatchProxy.apply(objArray, this, teamPkManage, "10");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new StateChart$b();
          uob.b(new TeamPkManager$buildStateChart$$inlined$apply$lambda$1(this));
          uob.e(this.e, TeamPkManager$buildStateChart$1$2.INSTANCE);
          uob.f(this.e);
          uob.d(new b(false));
          uob.g(this.f, new TeamPkManager$buildStateChart$$inlined$apply$lambda$2(this));
          StateChart$b uob1 = uob;
          uob1.h("pk_start", this.e, this.f, TeamPkManager$StartPk.class, c.a);
          uob1.h("pk_stop", this.f, this.e, TeamPkManager$StopPk.class, d.a);
       }
       StateChart stateChart = uob.a();
       this.b = stateChart;
       if (stateChart == null) {
          a.S("stateChart");
       }
       stateChart.s();
       if (!PatchProxy.applyVoid(objArray, this, teamPkManage, "7")) {
          this.d.a(648, SCTeamPkStart.class, new e(this));
          this.d.a(650, SCTeamPkEnd.class, new f(this));
       }
       b.Z(this.d(), "TeamPk onEnter");
       return;
    }
}
