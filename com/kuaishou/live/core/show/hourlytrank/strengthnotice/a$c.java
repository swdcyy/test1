package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$c;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import x67.j;
import iy1.l;
import iy1.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import p91.m;
import java.util.Objects;
import my1.c;
import my1.e;
import java.lang.Long;
import ekd.k1;
import java.lang.Runnable;
import lf3.f;

public class a$c implements g	// class@000c3f
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       a$c tb;
       long l;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
          hOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController");
          String str = "receive strength notice info";
          b.S(hOURLY_RANK, str, "mIsStrengthNoticeEnable", Boolean.valueOf(this.b.r));
          a i = this.b.i;
          if (i != null && i.R4()) {
             hOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController");
             b.S(hOURLY_RANK, str, "gzone pure mode, skip msg", Boolean.valueOf(this.b.r));
          }else if(p0.shouldClose != null){
             hOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController");
             b.P(hOURLY_RANK, "receive strength notice info shouldClose, close hourly rank strength view");
             a c = this.b.c;
             if (c != null) {
                c.rj(l.d);
             }
             tb = this.b;
             uoa = tb.n;
             if (uoa != null) {
                tb.c(uoa);
             }
          }else {
             LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri = p0.battleDistrictRankEndTime;
             if (p0.waitEndTimestamp - battleDistri < 0) {
                p0.waitEndTimestamp = battleDistri;
             }
             a$c tb1 = this.b;
             if (tb1.r != null) {
                tb1.l = p0.unfoldInterval;
                if ((battleDistri - tb1.b.s()) - 0x2710 > 0 || this.b.k != null) {
                   tb1 = this.b;
                   Objects.requireNonNull(tb1);
                   if (!PatchProxy.applyVoidOneRefs(p0, tb1, uoa, "6")) {
                      hOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController");
                      b.S(hOURLY_RANK, "showStrengthNotice", "mIsStrengthNoticeShowing", Boolean.valueOf(tb1.k));
                      tb1.m = 1;
                      tb1.c.d2(new c(l.d, 0, p0));
                   }
                }else {
                   hOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController");
                   b.P(hOURLY_RANK, "block strength view show because rest time less than 10s");
                }
                tb1 = this.b;
                LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri1 = p0.battleDistrictRankEndTime;
                LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank nextUnfoldTi = p0.nextUnfoldTime;
                Objects.requireNonNull(tb1);
                if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(Long.valueOf(battleDistri1), Long.valueOf(nextUnfoldTi), tb1, uoa, "4") && (tb1.o - nextUnfoldTi && (battleDistri1 - tb1.b.s()) - 700 > 0))) {
                   k1.n(tb1);
                   long l1 = nextUnfoldTi - tb1.b.s();
                   if (l1 >= 0) {
                      k1.s(tb1.t, tb1, l1);
                      tb1.o = nextUnfoldTi;
                   }
                }
                LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri2 = p0.battleDistrictRankEndTime;
                if (battleDistri2 - p0.waitEndTimestamp < 0) {
                   tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(battleDistri2), tb, uoa, "5") && tb.q - battleDistri2)) {
                      l = battleDistri2 - tb.b.s();
                      k1.n(tb.s);
                      if (l > 0) {
                         k1.s(tb.u, tb.s, l);
                      }else if(tb.n != null && tb.k != null){
                         k1.n(tb);
                         tb.m = 2;
                         hOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController");
                         b.P(hOURLY_RANK, "show settle view by signal");
                         tb.n.i();
                      }
                      tb.q = battleDistri2;
                   }
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
