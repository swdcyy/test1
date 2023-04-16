package com.kwai.live.gzone.guess.kshell.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.guess.kshell.widget.GuessOptionBaseView;
import android.widget.FrameLayout;
import p57.c;
import android.view.View$OnClickListener;
import p57.d;
import com.kwai.live.gzone.guess.kshell.widget.BetOptionStatBar;
import p57.e;
import android.view.ViewOutlineProvider;
import p57.g;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.guess.bean.UserBetInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import android.widget.TextView;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import com.kwai.live.gzone.guess.bean.UserBetOption;
import android.view.View;
import com.kwai.live.gzone.guess.bean.BetOption;
import android.widget.ImageView;
import lnc.a1;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import j47.c;
import k2b.u1;
import ekd.m1;
import com.kwai.live.gzone.guess.kshell.m$a;

public class l extends PresenterV2	// class@000d4c
{
    public int A;
    public View B;
    public ImageView C;
    public TextView D;
    public LiveGzoneAudienceGuessQuestion p;
    public m$a q;
    public List r;
    public TextView s;
    public GuessOptionBaseView t;
    public GuessOptionBaseView u;
    public BetOptionStatBar v;
    public View w;
    public BetOptionInfo x;
    public BetOptionInfo y;
    public c z;

    public void l(){
       super();
    }
    public void E8(){
       KShellGuessResultStatus aBORT;
       long l;
       LiveGzoneAudienceGuessQuestion liveGzoneAud = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveGzoneAud, l.class, "3")) {
          return;
       }
       int i = 3;
       if (!PatchProxy.applyVoid(objArray, liveGzoneAud, l.class, "4")) {
          liveGzoneAud.t.b(i);
          liveGzoneAud.u.b(5);
          liveGzoneAud.t.setClickable(1);
          liveGzoneAud.u.setClickable(1);
          liveGzoneAud.t.setOnClickListener(new c(liveGzoneAud));
          liveGzoneAud.u.setOnClickListener(new d(liveGzoneAud));
          liveGzoneAud.v.a(1);
          liveGzoneAud.v.setClipToOutline(1);
          liveGzoneAud.v.setOutlineProvider(new e(liveGzoneAud));
       }
       l p = liveGzoneAud.p;
       l r = liveGzoneAud.r;
       Object[] objArray1 = PatchProxy.applyTwoRefs(p, r, objArray, g.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else if(q.f(r)){
          Iterator iterator = r.iterator();
          do {
             if (iterator.hasNext()) {
             }
             objArray1 = iterator.next();
          } while (!TextUtils.x(objArray1.mBetId) && TextUtils.n(objArray1.mBetId, p.mBetId));
       }
       objArray1 = objArray;
       if (!PatchProxy.applyVoidTwoRefs(p, objArray1, liveGzoneAud, l.class, "5")) {
          liveGzoneAud.p = p;
          liveGzoneAud.s.setText(p.mTitle);
          liveGzoneAud.x = liveGzoneAud.p.getFirstOption();
          BetOptionInfo secondOption = liveGzoneAud.p.getSecondOption();
          liveGzoneAud.y = secondOption;
          if (liveGzoneAud.x != null && secondOption != null) {
             KShellGuessQuestionStatus kShellGuessQ = KShellGuessQuestionStatus.fromStatus(liveGzoneAud.p.mStatus);
             UserBetOption userBetOptio = g.a(liveGzoneAud.x, objArray1);
             UserBetOption userBetOptio1 = g.a(liveGzoneAud.y, objArray1);
             p = liveGzoneAud.t;
             boolean b = (userBetOptio != null || userBetOptio1 != null)? true: false;
             p.a(b);
             p = liveGzoneAud.u;
             b = (userBetOptio != null || userBetOptio1 != null)? true: false;
             p.a(b);
             liveGzoneAud.t.c(liveGzoneAud.x, userBetOptio, kShellGuessQ);
             liveGzoneAud.u.c(liveGzoneAud.y, userBetOptio1, kShellGuessQ);
             LiveGzoneAudienceGuessQuestion mRightBetOpt = liveGzoneAud.p.mRightBetOption;
             LiveGzoneAudienceGuessQuestion liveGzoneAud1 = mRightBetOpt;
             LiveGzoneAudienceGuessQuestion liveGzoneAud2 = mRightBetOpt;
             boolean b1 = PatchProxy.applyVoidFourRefs(kShellGuessQ, liveGzoneAud1, userBetOptio, userBetOptio1, this, l.class, "6");
             r = 0x3f800000;
             if (!b1) {
                liveGzoneAud.D.setAlpha(0x3f19999a);
                int i1 = 8;
                if (kShellGuessQ == KShellGuessQuestionStatus.PAPER_GUESSING) {
                   liveGzoneAud.B.setVisibility(i1);
                }else if(liveGzoneAud2 != null && (!TextUtils.x(liveGzoneAud2.mOptionId) && (liveGzoneAud.x != null && liveGzoneAud.y != null))){
                   liveGzoneAud.B.setVisibility(0);
                   p = (userBetOptio != null && TextUtils.n(liveGzoneAud2.mOptionId, liveGzoneAud.x.mBetOption.mOptionId))? 1: null;
                   BetOption uBetOption = (userBetOptio1 != null && TextUtils.n(liveGzoneAud2.mOptionId, liveGzoneAud.y.mBetOption.mOptionId))? 1: null;
                   if (userBetOptio == null && userBetOptio1 == null) {
                      liveGzoneAud.C.setVisibility(i1);
                      liveGzoneAud.D.setText(a1.r(R.string.arg_RES_7f101431, liveGzoneAud2.mContent));
                   }else if(p != null || uBetOption != null){
                      liveGzoneAud.D.setAlpha(r);
                      liveGzoneAud.D.setText(R.string.arg_RES_7f101439);
                      liveGzoneAud.C.setVisibility(0);
                      liveGzoneAud.C.setImageResource(R.drawable.arg_RES_7f0805ad);
                   }else {
                      liveGzoneAud.D.setAlpha(r);
                      liveGzoneAud.D.setText(R.string.arg_RES_7f101433);
                      liveGzoneAud.C.setVisibility(0);
                      liveGzoneAud.C.setImageResource(R.drawable.arg_RES_7f080ccb);
                   }
                }else if(kShellGuessQ == KShellGuessQuestionStatus.PAPER_ABORT){
                   liveGzoneAud.B.setVisibility(0);
                   liveGzoneAud.C.setVisibility(i1);
                   liveGzoneAud.D.setText(R.string.arg_RES_7f101434);
                }else {
                   liveGzoneAud.B.setVisibility(i1);
                }
             }
             if (kShellGuessQ == KShellGuessQuestionStatus.PAPER_ABORT) {
                aBORT = KShellGuessResultStatus.ABORT;
                liveGzoneAud.t.setResultStatus(aBORT);
                liveGzoneAud.u.setResultStatus(aBORT);
             }else if(liveGzoneAud2 != null && !TextUtils.x(liveGzoneAud2.mOptionId)){
                if (TextUtils.n(liveGzoneAud2.mOptionId, liveGzoneAud.x.mBetOption.mOptionId)) {
                   liveGzoneAud.t.setResultStatus(KShellGuessResultStatus.WIN);
                   liveGzoneAud.u.setResultStatus(KShellGuessResultStatus.LOSE);
                }else if(TextUtils.n(liveGzoneAud2.mOptionId, liveGzoneAud.y.mBetOption.mOptionId)){
                   liveGzoneAud.t.setResultStatus(KShellGuessResultStatus.LOSE);
                   liveGzoneAud.u.setResultStatus(KShellGuessResultStatus.WIN);
                }
             }else {
                aBORT = KShellGuessResultStatus.UNKNOWN;
                liveGzoneAud.t.setResultStatus(aBORT);
                liveGzoneAud.u.setResultStatus(aBORT);
             }
             if (!PatchProxy.applyVoid(objArray, liveGzoneAud, l.class, "7")) {
                p = liveGzoneAud.x;
                BetOptionInfo mOptionAmoun = p.mOptionAmount;
                l = liveGzoneAud.y.mOptionAmount + mOptionAmoun;
                float f = (l)? (float)mOptionAmoun / (float)l: 0x3f000000;
                liveGzoneAud.v.b(f, (r - f), String.valueOf(p.mDisplayAmount), String.valueOf(liveGzoneAud.y.mDisplayAmount), true);
             }
             liveGzoneAud.A = 0;
             if (userBetOptio1 != null) {
                liveGzoneAud.A = 1;
             }else if(userBetOptio != null){
                liveGzoneAud.A = 2;
             }
             p = liveGzoneAud.y;
             if (p != null) {
                secondOption = p.mBetOption;
                if (secondOption != null) {
                   BetOption mOptionId = secondOption.mOptionId;
                   r = liveGzoneAud.A;
                   if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidTwoRefs(mOptionId, Integer.valueOf(r), liveGzoneAud, l.class, "8")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "GAME_LIVE_PK_PREDICT_AUTHOR";
                      i3 oi3 = i3.f();
                      oi3.d("pk_user_id", mOptionId);
                      oi3.c("predict_status", Integer.valueOf(r));
                      uElementPack.params = oi3.e();
                      u1.u0(3, uElementPack, liveGzoneAud.z.h3());
                   }
                }
             }
          }
       }
    label_02c9 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a115c);
       this.v = m1.f(p0, 0x7f0a2eec);
       this.w = m1.f(p0, 0x7f0a1f78);
       this.u = m1.f(p0, 0x7f0a2ee6);
       this.t = m1.f(p0, 0x7f0a2ee5);
       this.B = m1.f(p0, 0x7f0a1159);
       this.C = m1.f(p0, 0x7f0a1156);
       this.D = m1.f(p0, 0x7f0a1158);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAudienceGuessQuestion.class);
       this.q = this.r8("questionListener");
       this.r = this.r8("guessUserBets");
       this.z = this.q8(c.class);
       return;
    }
}
