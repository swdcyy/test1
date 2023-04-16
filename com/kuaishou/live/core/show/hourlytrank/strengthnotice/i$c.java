package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$c;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank;
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
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank;
import java.lang.Integer;
import p91.m;
import my1.c;
import my1.e;
import java.lang.Long;
import ekd.k1;
import java.lang.Runnable;
import lf3.f;

public class i$c implements g	// class@000c4e
{
    public final i b;

    public void i$c(i p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       long l;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
       }else {
          LiveLogTag hOURLY_RANK = LiveLogTag.HOURLY_RANK;
          hOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController");
          b.S(hOURLY_RANK, "receive popularity rank strength notice info", "mIsPopularityStrengthNoticeEnable", Boolean.valueOf(this.b.s));
          i j = this.b.j;
          if (j != null && j.R4()) {
             hOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController");
             b.P(hOURLY_RANK, "receive popularity rank strength notice info gzone pure mode, skip msg");
          }else if(p0.shouldClose != null){
             hOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController");
             b.P(hOURLY_RANK, "receive strength notice info shouldClose, close popularity rank strength view");
             i c = this.b.c;
             if (c != null) {
                c.rj(l.e);
             }
             i$c tb = this.b;
             oi = tb.o;
             if (oi != null) {
                tb.c(oi);
             }
          }else {
             i$c tb1 = this.b;
             if (tb1.s != null) {
                LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank sCLiveBattle = PatchProxy.applyOneRefs(p0, tb1, oi, "9");
                if (sCLiveBattle != PatchProxyResult.class) {
                }else {
                   sCLiveBattle = new LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank();
                   sCLiveBattle.battleDistrictRankEndTime = p0.battleDistrictRankEndTime;
                   sCLiveBattle.battleDistrictRankFold = p0.battleDistrictRankFold;
                   sCLiveBattle.battleDistrictRankUnfold = p0.battleDistrictRankUnfold;
                   sCLiveBattle.nextUnfoldTime = p0.nextUnfoldTime;
                   sCLiveBattle.unfoldDuration = p0.unfoldDuration;
                   sCLiveBattle.waitEndTimestamp = p0.waitEndTimestamp;
                   sCLiveBattle.unfoldInterval = p0.unfoldInterval;
                   sCLiveBattle.waitDescribeText = p0.waitDescribeText;
                   sCLiveBattle.waitCountDownText = p0.waitCountDownText;
                   sCLiveBattle.waitRemindText = p0.waitRemindText;
                   sCLiveBattle.waitDisplayEndDurationMs = p0.waitDisplayEndDurationMs;
                   sCLiveBattle.waitCountDownColor = p0.waitCountDownColor;
                }
                LiveDistrictRankFinalBattle$SCLiveBattlePopularityRank popularityRa = p0.popularityRankType;
                if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(sCLiveBattle, Integer.valueOf(popularityRa), tb1, oi, "3")) {
                   LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri = sCLiveBattle.battleDistrictRankEndTime;
                   if (sCLiveBattle.waitEndTimestamp - battleDistri < 0) {
                      sCLiveBattle.waitEndTimestamp = battleDistri;
                   }
                   if (tb1.s != null) {
                      tb1.m = sCLiveBattle.unfoldInterval;
                      String str = "mIsStrengthNoticeShowing";
                      if ((battleDistri - tb1.b.s()) - 0x2710 > 0 || tb1.l != null) {
                         hOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController");
                         b.S(hOURLY_RANK, "showStrengthNotice", str, Boolean.valueOf(tb1.l));
                         tb1.n = 1;
                         tb1.c.d2(new c(l.e, popularityRa, sCLiveBattle));
                      }else {
                         hOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController");
                         b.S(hOURLY_RANK, "show strength blocked", str, Boolean.valueOf(tb1.l));
                      }
                      LiveDistrictRankFinalBattle$SCLiveBattleDistrictRank battleDistri1 = sCLiveBattle.battleDistrictRankEndTime;
                      battleDistri = sCLiveBattle.nextUnfoldTime;
                      if (PatchProxy.isSupport(oi) && (!PatchProxy.applyVoidTwoRefs(Long.valueOf(battleDistri1), Long.valueOf(battleDistri), tb1, oi, "5") && (tb1.p - battleDistri && (battleDistri1 - tb1.b.s()) - 700 > 0))) {
                         k1.n(tb1);
                         long l1 = battleDistri - tb1.b.s();
                         if (l1 >= 0) {
                            k1.s(tb1.u, tb1, l1);
                            tb1.p = battleDistri;
                         }
                      }
                      battleDistri1 = sCLiveBattle.battleDistrictRankEndTime;
                      if (battleDistri1 - sCLiveBattle.waitEndTimestamp < 0 && (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(battleDistri1), tb1, oi, "6") && tb1.r - battleDistri1))) {
                         l = battleDistri1 - tb1.b.s();
                         k1.n(tb1.t);
                         if (l > 0) {
                            k1.s(tb1.v, tb1.t, l);
                         }else if(tb1.o != null && tb1.l != null){
                            k1.n(tb1);
                            tb1.n = 2;
                            hOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController");
                            b.P(hOURLY_RANK, "show settle view by signal");
                            tb1.o.i();
                         }
                         tb1.r = battleDistri1;
                      }
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
