package com.kwai.live.gzone.guess.kshell.p;
import com.kwai.live.gzone.guess.kshell.LiveGzoneAudienceGuessInputDialog$b;
import com.kwai.live.gzone.guess.kshell.q;
import java.lang.Object;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;
import x57.e;
import x57.a;
import fq5.b;
import e17.i$b;
import e17.i;
import com.kwai.live.gzone.guess.bean.KShellGuessConfig;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.CharSequence;
import brd.t;
import u37.b;
import u37.e;
import com.kwai.live.gzone.guess.bean.BetOption;
import cjd.e;
import erd.o;
import p57.s;
import p57.t;
import erd.g;
import crd.b;

public final class p implements LiveGzoneAudienceGuessInputDialog$b	// class@000d5b
{
    public final q a;

    public void p(q p0){
       this.a = p0;
    }
    public final void a(LiveGzoneAudienceGuessQuestion p0,BetOptionInfo p1,long p2){
       t ot;
       i$b uob;
       q q;
       Object[] objArray;
       p a = this.a;
       Objects.requireNonNull(a);
       q oq = q.class;
       boolean b = false;
       p op = 1;
       if (PatchProxy.isSupport(oq)) {
          Object[] obj = PatchProxy.applyOneRefs(Long.valueOf(p2), a, oq, "24");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_0026 :
             obj = null;
             if (!a.a().c("KShellQuestionPresenter", a.H.getLiveStreamId()) - null) {
                if (!PatchProxy.applyVoid(obj, a, oq, "21")) {
                   uob = i.m();
                   uob.x(R.string.arg_RES_7f1022f2);
                   i.z(uob);
                }
             }else {
                q = a.Q;
                if (p2 - q.mMinBetAmount < 0) {
                   if (!PatchProxy.applyVoid(obj, a, oq, "22")) {
                      uob = i.m();
                      objArray = new Object[op];
                      objArray[b] = String.valueOf(a.Q.mMinBetAmount);
                      uob.y(String.format(a.l8().getString(R.string.arg_RES_7f1022e9), objArray));
                      i.z(uob);
                   }
                }else if(p2 - q.mMaxBetAmount > 0){
                   if (!PatchProxy.applyVoid(obj, a, oq, "23")) {
                      uob = i.m();
                      objArray = new Object[op];
                      objArray[b] = String.valueOf(a.Q.mMaxBetAmount);
                      uob.y(String.format(a.l8().getString(R.string.arg_RES_7f1022e8), objArray));
                      i.z(uob);
                   }
                }
             }
             b = true;
          }
       }else {
          goto label_0026 ;
       }
       if (!b) {
          if (PatchProxy.isSupport(oq)) {
             ot = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), a, q.class, "8");
             if (ot != PatchProxyResult.class) {
             label_00f5 :
                a.X7(ot.map(new e()).subscribe(new s(a), new t(a)));
                a.P8();
             }
          }
          ot = e.a().c(a.H.getLiveStreamId(), p0.mBetId, p1.mBetOption.mOptionId, p2);
          goto label_00f5 ;
       }
       return;
    }
}
