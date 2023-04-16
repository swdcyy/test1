package ft1.b;
import it1.a;
import zs1.d;
import ft1.b$a;
import nsd.u;
import zs1.b;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zh3.c;
import zh3.d;
import it1.b;
import java.util.ArrayList;
import ft1.b$b;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import ut1.p;
import java.lang.IllegalArgumentException;
import com.kuaishou.live.common.core.component.multipk.core.statemachine.MultiPkState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import com.kuaishou.android.live.log.b;
import w12.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkStatistic;
import com.kuaishou.live.common.core.component.multipk.core.LiveMultiPkStatisticUpdateType;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import java.lang.Long;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeam;
import ft1.c;
import java.lang.Enum;
import java.util.Iterator;
import java.lang.Iterable;
import bt1.c;
import java.util.Objects;
import bt1.a;
import crd.b;
import lnc.b9;
import ut1.j;
import ut1.e;
import pu1.m;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ft1.j;
import erd.g;
import java.lang.Number;
import usd.q;
import ft1.g;
import erd.o;
import ft1.h;
import ft1.i;
import zs1.c;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkEnd;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kwai.robust.PatchProxyResult;
import ut1.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import ut1.g;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinuousWin;
import ut1.c;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkBottomTip;
import java.lang.Boolean;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import ut1.k;
import java.util.Collection;
import ut1.l;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeamMember;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import trd.n;
import ut1.n;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;

public final class b implements a, d	// class@002399
{
    public final c a;
    public final c b;
    public final c c;
    public a d;
    public final d e;
    public boolean f;
    public final b g;
    public final ArrayList h;
    public f i;
    public p j;
    public b k;
    public b l;
    public final g m;
    public final b n;
    public final a o;
    public static final b$a p;

    static {
       b.p = new b$a(null);
    }
    public void b(b p0,a p1){
       a.p(p0, "coreModel");
       a.p(p1, "serverTime");
       super();
       this.n = p0;
       this.o = p1;
       this.a = new c();
       this.b = new c();
       this.c = new c();
       this.e = new d();
       this.g = new b(this);
       this.h = new ArrayList();
       this.m = new b$b(this);
       if (p0.l().getValue() == null || p0.o().getValue() == null) {
          throw new IllegalArgumentException("liveMultiPkInfoModel shouldn\'t be null");
       }
       p1 = p0.l().getValue();
       a.m(p1);
       this.i = p1;
       p0 = p0.o().getValue();
       a.m(p0);
       this.j = p0;
       return;
    }
    public void a(MultiPkState p0,MultiPkState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "15")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       return;
    }
    public void b(MultiPkState p0,MultiPkState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "14")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       if (p1 == MultiPkState.IDLE) {
          b.S(LiveMultiPkDebugLogKt.b(), "changeStateToIdle", "param", this.n.p());
          this.g.n(1);
       }
       return;
    }
    public void c(SCLiveMultiPkStatistic p0,LiveMultiPkStatisticUpdateType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "16")) {
          return;
       }
       a.p(p0, "multiPkStatistic");
       a.p(p1, "updateType");
       SCLiveMultiPkStatistic sCLiveMultiP = (this.g.k == MultiPkGameState.VOTE)? 1: null;
       if (sCLiveMultiP) {
          b.T(LiveMultiPkDebugLogKt.b(), "onPkStatisticUpdate", "updateType", p1, "statisticVersion", Long.valueOf(p0.statisticVersion));
          this.v(p0.enableShowRealScoreUser, this.i);
          b ti = this.i;
          ti.o = p0.pkInfoScatterDurationMs;
          if (p1 != LiveMultiPkStatisticUpdateType.LAYOUT_CHANGE) {
             this.w(p0.team, ti);
             this.x(p0.team, this.j);
          }
       }
       return;
    }
    public void d(MultiPkGameState p0,MultiPkGameState p1,Object p2){
       Iterator iterator;
       b uob = b.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "10")) {
          return;
       }
       a.p(p0, "from");
       a.p(p1, "to");
       int i = c.a[p1.ordinal()];
       String str = 1;
       if (i != str) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                   iterator = this.h.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().i2();
                   }
                }
             }else {
                Objects.requireNonNull(p2, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.multipk.game.LiveMultiPkGameInfo");
                if (!PatchProxy.applyVoidOneRefs(p2, this, uob, "11")) {
                   this.d = p2;
                   b9.a(this.k);
                   iterator = this.h.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().e2(p2);
                   }
                   e uoe = this.n.w().d();
                   if (uoe == null || uoe.a() != str) {
                      b.P(LiveMultiPkDebugLogKt.b(), "onGamePunish, enableDisplayEndPopup == false");
                   }else {
                      b9.a(this.l);
                      long l = m.a.f(p2, this.i.m(), this.o);
                      b.P(LiveMultiPkDebugLogKt.b(), "onGamePunish, start willChangePostPunishCountDown time = "+l);
                      this.l = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new j(this));
                   }
                }
             }
          }else if(PatchProxy.applyVoid(null, this, uob, "24")){
             b9.a(this.k);
             b ti = this.i;
             long l1 = q.o((ti.m().voteEndWaitDeadline - this.o.invoke().longValue()), 0);
             b.U(LiveMultiPkDebugLogKt.b(), "delayQueryMultiPkInfo", "voteEndWaitDeadLine", Long.valueOf(ti.m().voteEndWaitDeadline), "delayRequestDuration", Long.valueOf(l1), "param", this.n.p());
             this.k = t.timer(l1, TimeUnit.MILLISECONDS).flatMap(new g(this)).flatMap(new h(this, ti)).observeOn(d.a).subscribe(new i(this));
          }
          iterator = this.h.iterator();
          while (iterator.hasNext()) {
             iterator.next().Y0();
          }
       }else {
          b9.a(this.k);
          iterator = this.h.iterator();
          while (iterator.hasNext()) {
             iterator.next().Z1();
          }
       }
       return;
    }
    public void e(List p0){
       c.c(this, p0);
    }
    public void f(LiveMultiPkEnd p0,int p1){
       c.e(this, p0, p1);
    }
    public void g(MultiPkGameState p0,MultiPkGameState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "9")) {
          return;
       }
       a.p(p0, "from");
       a.p(p1, "to");
       return;
    }
    public void h(LayoutConfig p0){
       c.b(this, p0);
    }
    public final void i(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       a.p(p0, "observer");
       this.h.add(p0);
       return;
    }
    public final int j(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.i.b();
    }
    public final c k(){
       return this.c;
    }
    public final c l(){
       return this.a;
    }
    public final MultiPkGameState m(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g.k;
       a.o(obj, "stateMachine.mCurrentGameState");
       return obj;
    }
    public final boolean n(){
       return this.f;
    }
    public final long o(){
       long l;
       b obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.d;
       if (obj == null) {
          b.P(LiveMultiPkDebugLogKt.b(), "gameInfo == null");
          l = 0;
       }else {
          l = m.a.f(obj, this.i.m(), this.o);
       }
       return l;
    }
    public final c p(){
       return this.b;
    }
    public final a q(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.j();
    }
    public final void r(SCLiveMultiPkVoteEnd p0,f p1){
       Object obj = this;
       Object obj1 = p0;
       c uoc = p1;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, uoc, obj, uob, "23")) {
          return;
       }
       SCLiveMultiPkVoteEnd continuousWi = obj1.continuousWin;
       if (!PatchProxy.applyVoidTwoRefs(continuousWi, uoc, obj, uob, "18") && continuousWi != null) {
          uoc.m = g.a.a(continuousWi);
       }
       obj.v(obj1.enableShowRealScoreUser, uoc);
       obj.w(obj1.team, uoc);
       obj.x(obj1.team, obj.j);
       HashMap hashMap = new HashMap();
       SCLiveMultiPkVoteEnd team = obj1.team;
       a.o(team, "voteEnd.team");
       int len = team.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = team[i];
          hashMap.put(Integer.valueOf(oobject.teamId), Integer.valueOf(oobject.currentRank));
       }
       a uoa = new a(p1.h(), p1.g(), p1.a(), p1.l(), hashMap, obj1.prePenaltyDeadline, obj1.penaltyDeadline, obj1.penaltyText, obj1.voteEndType, obj1.bottomTip);
       obj.g.o(3, team);
       return;
    }
    public final boolean s(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       b = false;
       if (obj != null && m.g(this.n, obj).getFirst().intValue() == 2) {
          b = true;
       }
       return b;
    }
    public final void t(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       a.p(p0, "observer");
       this.h.remove(p0);
       return;
    }
    public final void u(boolean p0){
       this.f = p0;
    }
    public final void v(long[] p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "19")) {
          return;
       }
       if (p0 != null) {
          p1.n = ArraysKt___ArraysKt.ty(p0);
       }
       return;
    }
    public final void w(LiveMultiPkTeam[] p0,f p1){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       k ok = k.class;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, uob, "20")) {
          return;
       }
       Iterator iterator = p1.l().values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().f().values().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().d(true);
          }
       }
       if (obj1 != null) {
          int len = obj1.length;
          int i = 0;
          while (i < len) {
             object oobject = obj1[i];
             k ok1 = p1.l().get(String.valueOf(oobject.teamId));
             if (ok1 != null) {
                String str = String.valueOf(oobject.currentRank);
                if (!PatchProxy.applyVoidOneRefs(str, ok1, ok, "2")) {
                   a.p(str, "<set-?>");
                   ok1.d = str;
                }
                ok1.b = oobject.teamScore;
                LiveMultiPkTeam displayTeamS = oobject.displayTeamScore;
                a.o(displayTeamS, "newTeamInfo.displayTeamScore");
                String str1 = "1";
                if (!PatchProxy.applyVoidOneRefs(displayTeamS, ok1, ok, str1)) {
                   a.p(displayTeamS, "<set-?>");
                   ok1.c = displayTeamS;
                }
                ok1.e = oobject.enableClickContributionList;
                ok1.g = oobject.needFuzzyScore;
                Map map = ok1.f();
                LiveMultiPkTeam teamMember = oobject.teamMember;
                if (!PatchProxy.applyVoidTwoRefs(map, teamMember, obj, uob, "21") && teamMember != null) {
                   int len1 = teamMember.length;
                   int i2 = 0;
                   while (i2 < len1) {
                      object oobject1 = teamMember[i2];
                      int i3 = i;
                      l ol = map.get(String.valueOf(oobject1.player.userId));
                      k ok2 = ok;
                      b uob1 = uob;
                      if (ol != null) {
                         ol.c = oobject1.score;
                         LiveMultiPkTeamMember displayScore = oobject1.displayScore;
                         a.o(displayScore, "newMemberInfo.displayScore");
                         if (!PatchProxy.applyVoidOneRefs(displayScore, ol, l.class, str1)) {
                            a.p(displayScore, "<set-?>");
                            ol.d = displayScore;
                         }
                         displayScore = oobject1.topUserDetail;
                         List list = (displayScore != null)? n.t(displayScore): null;
                         ol.e = list;
                         ol.d(false);
                      }else {
                         ok = null;
                      }
                      i2 = i2 + 1;
                      ok = ok2;
                      uob = uob1;
                      i = i3;
                   }
                }
             }
             int i1 = i + 1;
             ok = ok;
             i = i1;
             uob = uob;
          }
       }
       obj.n.l().setValue(obj2);
       return;
    }
    public final void x(LiveMultiPkTeam[] p0,p p1){
       object oobject;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "22")) {
          return;
       }
       Iterator iterator = p1.b().iterator();
       while (iterator.hasNext()) {
          n on = iterator.next();
          if (p0 != null) {
             int len = p0.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   oobject = p0[i];
                   if (a.g(String.valueOf(oobject.teamId), on.c())) {
                   label_003c :
                      if (oobject != null) {
                         if (oobject.teamFrameColor != null) {
                            on.b().startColor = oobject.teamFrameColor.startColor;
                            on.b().endColor = oobject.teamFrameColor.endColor;
                         }
                         if (oobject.progressBarColor != null) {
                            on.a().startColor = oobject.progressBarColor.startColor;
                            on.a().endColor = oobject.progressBarColor.endColor;
                         }else {
                            continue ;
                         }
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = null;
                   goto label_003c ;
                }
             }
          }
          String str = "";
          on.b().startColor = str;
          on.b().endColor = str;
          continue ;
       }
       this.n.o().setValue(p1);
       return;
    }
}
