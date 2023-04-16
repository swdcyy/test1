package com.kuaishou.live.core.show.luckystar.v2.currentinfo.a;
import erd.g;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;
import java.lang.Object;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger$StatusValue;
import yb2.i;
import java.util.Set;
import android.view.View;
import mkc.b;
import mkc.c;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$PanelBackgroundResources;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import com.kuaishou.live.core.show.luckystar.util.b;
import lnc.a1;
import crd.b;
import lnc.b9;
import brd.t;
import zb2.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import hc2.g;
import hc2.e;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.widget.TextView;
import z12.x;
import p91.m;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarParticipateButton;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import kc2.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import hc2.d;

public final class a implements g	// class@000cfd
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b q;
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLuckyStarInfo;
       tb.T = p0;
       LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo liveLuckySta = null;
       if (p0 != null) {
          b uob = b.class;
          String str = "7";
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, str)) {
             LiveLuckyStarLogger$StatusValue tRUE = (p0.getUserParticipateInfo().mParticipated != null)? LiveLuckyStarLogger$StatusValue.TRUE: LiveLuckyStarLogger$StatusValue.FALSE;
             tb.S8(tRUE, String.valueOf(p0.getUserParticipateInfo().mRequirementCompleteStatus));
             if (p0.getUserParticipateInfo().mParticipated != null) {
                q = tb.Q;
                q.h.add(q.c);
             }
             tb.w.setVisibility(0);
             b[] uobArray = new b[]{b.d};
             c.d(tb.P, uobArray);
             uobArray = new b[]{b.g};
             c.d(tb.P, uobArray);
             b.a(tb.v, p0.getPanelBackgroundResources().mPanelBackgroundUrls);
             b.b(tb.x, p0.getPanelBackgroundResources().mMainTitleUrls, a1.d(R.dimen.arg_RES_7f07081c));
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "10")) {
                b9.a(tb.V);
                tb.V = tb.Q.i.b().observeOn(a.c()).subscribe(new g(tb, p0));
             }
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "13")) {
                tb.M.setOnClickListener(new e(tb, p0));
             }
             int i = 8;
             int i1 = 0x7f061483;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "14")) {
                b.a(tb.F, p0.getPanelBackgroundResources().mActivityBackgroundUrls);
                b.a(tb.G, p0.mActivityPictureUrls);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "16")) {
                   tb.H.setText(p0.mDescription);
                   tb.H.setTextColor(x.A(p0.getPanelBackgroundResources().mActiveDescTextColor, a1.a(i1)));
                }
                if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "17")) {
                   q = tb.I;
                   LiveLuckyStarInfoResponse$LiveLuckyStarInfo mLuckyUserCo = p0.mLuckyUserCount;
                   int i2 = (mLuckyUserCo > 1)? 0x7f102636: 0x7f102635;
                   q.setText(a1.q(i2, mLuckyUserCo));
                   tb.I.setTextColor(x.A(p0.getPanelBackgroundResources().mActiveLuckyNumTextColor, a1.a(R.color.arg_RES_7f061484)));
                }
                if (tb.Q.a.e() || p0.getUserParticipateInfo().mDisableParticipateMethod != null) {
                   tb.J.setVisibility(i);
                }else {
                   tb.J.setVisibility(0);
                   if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "15")) {
                      tb.L.setText(p0.getUserParticipateInfo().mParticipateStatus);
                      tb.L.setTextColor(x.A(p0.getPanelBackgroundResources().mActiveActionReachTextColor, a1.a(i1)));
                   }
                   tb.K.setText(p0.getUserParticipateInfo().mParticipateDescription);
                }
             }
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "8")) {
                tb.N.setText(p0.mDisplayParticipantCount);
                tb.N.setTextColor(x.A(p0.getPanelBackgroundResources().mParticipantCountTextColor, a1.a(R.color.arg_RES_7f061486)));
             }
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "18")) {
                if (tb.Q.a.e()) {
                   tb.O.setVisibility(i);
                }else {
                   uob = tb.O;
                   Objects.requireNonNull(uob);
                   if (!PatchProxy.applyVoidOneRefs(p0, uob, LiveLuckyStarParticipateButton.class, "2")) {
                      LiveLuckyStarParticipateButton e = uob.e;
                      if (e != null) {
                         e.cancel();
                         uob.e = liveLuckySta;
                         float f = 0x3f800000;
                         uob.setScaleX(f);
                         uob.setScaleY(f);
                      }
                      LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo userParticip = p0.getUserParticipateInfo();
                      uob.d = userParticip;
                      uob.c.setText(userParticip.mDisplayAction);
                      uob.c.setTextColor(x.A(uob.d.mParticipateTextColor, a1.a(i1)));
                      if (uob.d.mDisplayStyle == 1) {
                         uob.b.setVisibility(0);
                         b.a(uob.b, p0.getPanelBackgroundResources().mParticipateButtonUrls);
                         if (uob.d.mIsParticipateButtonNegative != null) {
                            uob.setActivated(0);
                         }else {
                            uob.setActivated(1);
                            if (!PatchProxy.applyVoid(liveLuckySta, uob, LiveLuckyStarParticipateButton.class, str)) {
                               uob.a();
                               ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[3]{0x3f800000,0x3f70a3d7,0x3f800000}).setDuration(1000);
                               uob.e = valueAnimato;
                               valueAnimato.addUpdateListener(new d(uob));
                               uob.e.setRepeatCount(-1);
                               uob.e.start();
                            }
                         }
                      }else {
                         uob.setActivated(1);
                         uob.b.setVisibility(i);
                      }
                   }
                   if (p0.getUserParticipateInfo().mDisplayStyle == 1) {
                      LiveLuckyStarLogger.l(tb.Q.a.a(), tb.Q.c, p0.mType, String.valueOf(p0.getUserParticipateInfo().mRequirementCompleteStatus));
                      tb.O.setOnClickListener(new d(tb, p0));
                   }
                }
             }
          }
       }else {
          tb.V8(liveLuckySta);
       }
       return;
    }
}
