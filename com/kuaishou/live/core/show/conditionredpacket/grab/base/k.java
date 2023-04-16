package com.kuaishou.live.core.show.conditionredpacket.grab.base.k;
import im8.g;
import b62.j0;
import mrd.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketResultDialogFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment;
import u52.t;
import j62.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import u52.y;
import hi2.b;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import dx1.b;
import gi2.d;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketGiftSendView;
import java.lang.Integer;
import hi2.c;
import android.widget.TextView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import java.util.Collections;
import android.widget.ImageView;
import fi2.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import i62.t$c;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import p91.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.m;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult;
import java.util.concurrent.TimeUnit;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import u52.u;
import android.view.View;
import java.lang.CharSequence;
import lnc.a1;
import o62.b;
import androidx.lifecycle.LifecycleOwner;
import b62.m0;
import lp3.e;
import b62.q0;
import com.kuaishou.live.common.core.component.redpacket.normal.model.GrabRedPacketResponse$RedPacketResultPageGiftSendButton;
import xp5.i;
import com.yxcorp.gifshow.models.Gift;
import lm1.i;
import tw1.d;
import h62.c;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import h62.a;
import lnc.i3;
import java.lang.Number;
import h62.d;
import sh3.a;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import h62.e;
import java.lang.StringBuilder;
import java.lang.Enum;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k$b;
import b62.p0;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class k extends j0 implements g	// class@000a8f
{
    public a M;
    public LiveConditionRedPacketResultDialogFragment$a N;
    public a O;
    public b P;
    public LiveConditionRedPacketLotteryResultResponse Q;
    public static String sLivePresenterClassName = "LiveConditionRedPacketResultLayoutPresenter";

    public void k(){
       super();
       this.M = a.g();
    }
    public void B3(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveConditionRedPacketResultDialogFragment$a uoa = LiveConditionRedPacketResultDialogFragment$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "18")) {
          return;
       }
       k tN = this.N;
       Objects.requireNonNull(tN);
       Object obj = PatchProxy.apply(objArray, tN, uoa, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          LiveConditionRedPacketResultDialogFragment$a a1 = tN.a;
          LiveConditionRedPacketInfo liveConditio1 = y.d(a1.s, a1.t);
          b = (liveConditio1 != null && liveConditio1.z != null)? true: false;
       }
       if (b) {
          tN = this.N;
          Objects.requireNonNull(tN);
          b obj1 = PatchProxy.apply(objArray, tN, uoa, "1");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             LiveConditionRedPacketResultDialogFragment$a a = tN.a;
             LiveConditionRedPacketInfo liveConditio = y.d(a.s, a.t);
             if (liveConditio != null) {
                liveConditio = liveConditio.A;
                if (liveConditio != null) {
                   obj1 = new b(liveConditio);
                   if (obj1.g()) {
                      objArray = obj1;
                   }
                }
             }
          }
          if (objArray != null) {
             j0 tG = this.G;
             obj1 = objArray.i;
             b redPacketSim = this.getRedPacketSimpleExtra();
             Objects.requireNonNull(tG);
             if (!PatchProxy.applyVoidTwoRefs(obj1, redPacketSim, tG, LiveConditionRedPacketGiftSendView.class, "3") && obj1 != null) {
                Integer integer = obj1.b();
                if (integer != null) {
                   tG.C.setTextColor(integer.intValue());
                   tG.D.setTextColor(integer.intValue());
                   List list = (q.f(obj1.a()))? Collections.singletonList(new CDNUrl("", c0.a.b(tG.getDefaultGiftSendButtonBgResource().getResourcePath()))): obj1.a();
                   if (!tG.E.getVisibility() && !q.f(list)) {
                      d.b.a(tG.E, list, -1, redPacketSim);
                   }
                }
             }
          }
       }
    label_00d6 :
       return;
    }
    public void E8(){
       j0 tq;
       int i;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, ok, "13")) {
          tq = this.q;
          m.a(this.s, this.r, this.p.c.l(tq.a, tq.b), this.q.a);
       }
       tq = this.q;
       LiveConditionRedPacketLotteryResultResponse liveConditio = this.p.c.e(tq.a, tq.b);
       this.S8(liveConditio);
       j0 tq1 = this.q;
       b.d0(LiveLogTag.LIVE_CONDITION_RED_PACKET, "show result dialog", "redPackId", tq1.b, "redPackType", Integer.valueOf(tq1.a));
       if (liveConditio != null) {
          liveConditio = liveConditio.mLotteryResult;
          if (liveConditio != null) {
             i = liveConditio.mAwardValue;
          label_0064 :
             if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, ok, "3")) {
                j0 tq2 = this.q;
                LiveConditionRedPacketInfo liveConditio1 = this.p.c.l(tq2.a, tq2.b);
                LiveConditionRedPacketInfo liveConditio2 = (liveConditio1 == null)? null: TimeUnit.MILLISECONDS.toMinutes(liveConditio1.j);
                long l = liveConditio2;
                int i1 = (liveConditio1 == null || liveConditio1.v.getValue() == null)? 0: liveConditio1.v.getValue().intValue();
                tq2 = this.q;
                u.j(this.p.a.b(), this.p.a.a(), this.p.a.y(), tq2.b, tq2.a, l, i1, 2, i, LiveConditionRedPacketInfo.a(liveConditio1));
             }
             this.B3();
             return;
          }
       }
       i = -1;
       goto label_0064 ;
    }
    public final void S8(LiveConditionRedPacketLotteryResultResponse p0){
       k q1;
       LiveConditionRedPacketLotteryResultResponse mGiftSendBut;
       int i3;
       k p;
       a uoa;
       a uoa1;
       ClientContent$LiveStreamPackage liveStreamPa1;
       LiveConditionRedPacketLotteryResultResponse liveConditio = this;
       LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult obj = p0;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(obj, liveConditio, ok, "7")) {
          return;
       }
       if (obj != null) {
          LiveConditionRedPacketLotteryResultResponse mLotteryResu = obj.mLotteryResult;
          if (mLotteryResu == null) {
          label_02e2 :
             obj = new LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult();
             obj.mIsInValidData = true;
             liveConditio.M.onNext(obj);
             this.Z8();
             liveConditio.W8(LiveRedPacketPopupPageType.RESULT_ERROR_PANEL, -1);
          }else {
             liveConditio.M.onNext(mLotteryResu);
             liveConditio.Q = obj;
             if (obj.mLotteryResult != null) {
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, liveConditio, ok, "11")) {
                   k q = liveConditio.Q;
                   if (q != null && q.mLotteryResult != null) {
                      int i = 8;
                      liveConditio.C.setVisibility(i);
                      int i1 = 0;
                      liveConditio.Y8(i1);
                      liveConditio.y.setText(liveConditio.Q.mLotteryResult.mRedPacketCountDescription);
                      boolean b = this.P8();
                      if (b) {
                         liveConditio.X8(i);
                         liveConditio.w.setVisibility(i);
                      }else {
                         mGiftSendBut = liveConditio.Q.mLotteryResult;
                         if (mGiftSendBut.mIsLuckyUser != null) {
                            if (!PatchProxy.applyVoid(objArray, liveConditio, ok, "14")) {
                               q1 = liveConditio.Q;
                               if (q1 != null) {
                                  mGiftSendBut = q1.mLotteryResult;
                                  if (mGiftSendBut != null) {
                                     liveConditio.t.setText(String.valueOf(mGiftSendBut.mAwardValue));
                                  }
                               }
                               liveConditio.u.setText(a1.p(R.string.arg_RES_7f101c07));
                               liveConditio.v.setText(a1.p(R.string.arg_RES_7f1025e4));
                            }
                            liveConditio.X8(i1);
                            liveConditio.w.setVisibility(i);
                         }else if(!q.f(mGiftSendBut.mLuckyUsers)){
                            if (!PatchProxy.applyVoid(objArray, liveConditio, ok, "19")) {
                               liveConditio.w.setText(a1.p(R.string.arg_RES_7f101fea));
                            }
                            liveConditio.w.setVisibility(i1);
                         }else {
                            liveConditio.w.setVisibility(i);
                         }
                         liveConditio.X8(i);
                      }
                      if (!PatchProxy.applyVoid(objArray, liveConditio, ok, "12")) {
                         q1 = liveConditio.Q;
                         if (q1 == null || (q1.mLotteryResult != null && (q1.mGiftSendButtonInfo != null && !liveConditio.r.e()))) {
                            q1 = liveConditio.Q;
                            if (q1.mLotteryResult.mIsLuckyUser != null) {
                               mGiftSendBut = q1.mGiftSendButtonInfo;
                               if (!PatchProxy.applyVoidOneRefs(mGiftSendBut, liveConditio, ok, "15")) {
                                  if (!PatchProxy.applyVoid(objArray, liveConditio, ok, "17") && liveConditio.P == null) {
                                     p = liveConditio.N;
                                     if (p != null && p.b() != null) {
                                        b uob = new b(liveConditio.r.t5(), liveConditio.N, new m0(liveConditio), this.n6());
                                        liveConditio.P = uob;
                                        liveConditio.G.L(uob);
                                     }
                                  }
                                  p = liveConditio.P;
                                  if (p != null) {
                                     GrabRedPacketResponse$RedPacketResultPageGiftSendButton mGift = mGiftSendBut.mGift;
                                     ClientContent$LiveStreamPackage liveStreamPa = liveConditio.p.h.a();
                                     k o = liveConditio.O;
                                     a b1 = o.b;
                                     a a = o.a;
                                     if (PatchProxy.isSupport(b.class)) {
                                        uoa = a;
                                        uoa1 = b1;
                                        liveStreamPa1 = liveStreamPa;
                                        if (!PatchProxy.applyVoidFourRefs(mGift, liveStreamPa, b1, Integer.valueOf(a), p, b.class, "5")) {
                                        label_0174 :
                                           i oi = p.b(mGift);
                                           if (mGift == null) {
                                              p.e(oi, "PRE_SEND_GIFT", "CLIENT_LEEE_GIFT_BUTTON_SHOW", "[LiveConditionRedPacketGiftSendButtonViewModel][onGiftSendButtonShow]: show button, gift is null", 0x18707);
                                           }else {
                                              p.e(oi, "PRE_SEND_GIFT", "CLIENT_LEEE_GIFT_BUTTON_SHOW", "[LiveConditionRedPacketGiftSendButtonViewModel][onGiftSendButtonShow]: show button ", 1);
                                              d.o(liveStreamPa1, uoa1, uoa, mGift.mId);
                                              if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(mGift, uoa1, Integer.valueOf(uoa), p, b.class, "7")) {
                                                 c uoc = new c(p.c(), LiveRedPacketStage.RED_PACKET_RESULT, LiveRedPacketAction.RED_PACK_POPUP_RESULT_SEND_GIFT_SHOW, uoa1, RedPacketType.RED_PACKET_TYPE_CONDITION, -1, -1, FirstReportType.FIRST, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
                                                 c uoc1 = liveStreamPa1.e(a.a(uoa));
                                                 i3 oi3 = i3.f();
                                                 oi3.c("giftId", Integer.valueOf(mGift.mId));
                                                 uoc1.d(oi3.e());
                                                 d.j(uoc1);
                                              }
                                           }
                                        }
                                     }else {
                                        uoa = a;
                                        uoa1 = b1;
                                        liveStreamPa1 = liveStreamPa;
                                        goto label_0174 ;
                                     }
                                     p = liveConditio.P;
                                     GrabRedPacketResponse$RedPacketResultPageGiftSendButton mGiftSendBut1 = mGiftSendBut.mGiftSendButtonContent;
                                     Objects.requireNonNull(p);
                                     if (!PatchProxy.applyVoidOneRefs(mGiftSendBut1, p, b.class, "1")) {
                                        p.b.setValue(mGiftSendBut1);
                                     }
                                     p = liveConditio.P;
                                     mGiftSendBut1 = mGiftSendBut.mGiftSendButtonDescription;
                                     Objects.requireNonNull(p);
                                     if (!PatchProxy.applyVoidOneRefs(mGiftSendBut1, p, b.class, "2")) {
                                        p.c.setValue(mGiftSendBut1);
                                     }
                                     if (!PatchProxy.applyVoidOneRefs(mGiftSendBut, liveConditio, ok, "16")) {
                                        GrabRedPacketResponse$RedPacketResultPageGiftSendButton mGift1 = mGiftSendBut.mGift;
                                        if (mGift1 != null) {
                                           k p1 = liveConditio.P;
                                           if (p1 != null) {
                                              Gift mId = mGift1.mId;
                                              if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mId), p1, b.class, "3")) {
                                                 p1.e.setValue(Integer.valueOf(mId));
                                              }
                                           }
                                        }
                                        LiveLogTag lIVE_CONDITI = LiveLogTag.LIVE_CONDITION_RED_PACKET;
                                        String str = (mGift1 == null)? "true": "false";
                                        b.c0(lIVE_CONDITI, "show result gift send icon error : gift or view model is null", "gift is null ? ", str);
                                     }
                                     p = liveConditio.P;
                                     Objects.requireNonNull(p);
                                     if (PatchProxy.isSupport(b.class)) {
                                        i3 = 0;
                                        if (PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), p, b.class, "4")) {
                                        label_027e :
                                           i3 = 8;
                                           liveConditio.w.setVisibility(i3);
                                           liveConditio.v.setVisibility(i3);
                                        label_028a :
                                           liveConditio.s.setVisibility(i3);
                                        }
                                     }else {
                                        i3 = 0;
                                     }
                                     p.d.setValue(Integer.valueOf(i3));
                                     goto label_027e ;
                                  }
                               }
                               i3 = 8;
                               goto label_028a ;
                            }
                         }
                      }
                      if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), liveConditio, ok, "20")) {
                         int i2 = 201;
                         if (!b) {
                            i2 = 133;
                         }
                         if (liveConditio.x.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                            liveConditio.x.getLayoutParams().bottomMargin = a1.e((float)i2);
                         }
                      }
                   }
                }
             label_02c1 :
                LiveConditionRedPacketLotteryResultResponse mLotteryResu1 = liveConditio.Q.mLotteryResult;
                if (mLotteryResu1.mIsLuckyUser != null) {
                   liveConditio.W8(LiveRedPacketPopupPageType.RESULT_SUCCESS_PANEL, mLotteryResu1.mAwardValue);
                }else {
                   liveConditio.W8(LiveRedPacketPopupPageType.RESULT_EMPTY_PANEL, -1);
                }
             }else {
                this.Z8();
                liveConditio.W8(LiveRedPacketPopupPageType.RESULT_ERROR_PANEL, -1);
             }
          }
       }else {
          goto label_02e2 ;
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, k.class, "6")) {
          return;
       }
       if (this.E.getVisibility() != 8) {
          this.E.a();
          this.E.setVisibility(8);
       }
       return;
    }
    public final void W8(LiveRedPacketPopupPageType p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "21")) {
          return;
       }
       i3 oi3 = null;
       if (p1 != -1) {
          oi3 = i3.f();
          oi3.c("count", Integer.valueOf(p1));
       }
       j0 tq = this.q;
       j0 tq1 = this.q;
       tq = this.q;
       d.c(e.e(this.p, tq.b, tq.a), tq1.b, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(tq1.a), LiveRedPacketStage.RED_PACKET_RESULT, p0, e.a(this.p, tq.b, tq.a, LiveRedPacketAction.RED_PACK_POPUP.name()+p0), oi3);
       return;
    }
    public final void X8(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "9")) {
          return;
       }
       this.t.setVisibility(p0);
       this.u.setVisibility(p0);
       this.v.setVisibility(p0);
       return;
    }
    public final void Y8(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "8")) {
          return;
       }
       this.X8(p0);
       this.z.setVisibility(p0);
       this.R8(p0);
       this.w.setVisibility(p0);
       this.x.setVisibility(p0);
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       this.Y8(8);
       this.C.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       super.doBindView(p0);
       this.D.setOnClickListener(new k$a(this));
       this.F.setOnClickListener(new k$b(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new p0());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.q8(LiveConditionRedPacketResultDialogFragment$a.class);
       this.O = this.q8(a.class);
       return;
    }
}
