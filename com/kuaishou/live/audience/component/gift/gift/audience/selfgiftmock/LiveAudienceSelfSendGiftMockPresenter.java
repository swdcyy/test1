package com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter;
import im8.g;
import k51.c;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$a;
import nsd.u;
import rm1.b;
import rm1.b$a;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$b;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t02.a0;
import ug1.a1;
import ik1.i0;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import crd.b;
import lnc.b9;
import qrd.l1;
import java.util.concurrent.CopyOnWriteArrayList;
import msd.l;
import s00.b$a;
import s00.b;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import f92.b;
import com.kwai.robust.PatchProxyResult;
import s51.c;
import android.content.Context;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.WalletResponse$ExtraInfo;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;
import d61.l0;
import lm1.i;
import android.text.TextUtils;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse$ExtraInfo;
import lk1.a;
import km1.b;
import java.util.List;
import lp3.i;
import pm1.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import mm1.c;
import mm1.e;
import mm1.g;
import dz0.c;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.c;

public final class LiveAudienceSelfSendGiftMockPresenter extends c implements g	// class@000af5
{
    public final String p;
    public l0 q;
    public a0 r;
    public i s;
    public a t;
    public c u;
    public final b v;
    public final LiveAudienceSelfSendGiftMockPresenter$b w;
    public final a x;
    public static String sLivePresenterClassName = "LiveAudienceSelfSendGiftMockPresenter";
    public static final LiveAudienceSelfSendGiftMockPresenter$a y;

    static {
       LiveAudienceSelfSendGiftMockPresenter.y = new LiveAudienceSelfSendGiftMockPresenter$a(null);
    }
    public void LiveAudienceSelfSendGiftMockPresenter(){
       super();
       this.p = "LiveAudienceSelfSendGiftMockPresenter";
       this.v = new b(b.c.a());
       this.w = new LiveAudienceSelfSendGiftMockPresenter$b(this);
       this.x = new LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSelfSendGiftMockPresenter.class, "4")) {
          return;
       }
       LiveAudienceSelfSendGiftMockPresenter tr = this.r;
       if (tr == null) {
          a.S("mCallerContext");
       }
       tr.V1.Nk(this.w);
       return;
    }
    public void J8(){
       b a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceSelfSendGiftMockPresenter.class, "5")) {
          return;
       }
       LiveAudienceSelfSendGiftMockPresenter tr = this.r;
       if (tr == null) {
          a.S("mCallerContext");
       }
       tr.V1.J8(this.w);
       tr = this.v;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, b.class, "3") && tr.b != null) {
          a = tr.a;
          ArrayList uArrayList = new ArrayList(u.Y(a, 10));
          Iterator iterator = a.iterator();
          while (iterator.hasNext()) {
             b9.a(iterator.next());
             uArrayList.add(l1.a);
          }
          tr.a.clear();
       }
       return;
    }
    public final void P8(String p0,String p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveAudienceSelfSendGiftMockPresenter.class, "12")) {
          return;
       }
       try{
          byte[] uobyteArray = b.a().a(p0);
          if (uobyteArray != null) {
             int i = (!uobyteArray.length)? 1: 0;
             if (i ^ 1) {
                if (p2.invoke(uobyteArray).booleanValue()) {
                   b.Z(LiveLogTag.LIVE_SELF_GIFT_MOCK, "parseGiftFeedSucceed : "+p1);
                }else {
                   b.Z(LiveLogTag.LIVE_SELF_GIFT_MOCK, "parseGiftFeedFailed : "+p1);
                }
                return;
             }
          }
       }catch(java.lang.Exception e0){
          b.B(LiveLogTag.LIVE_SELF_GIFT_MOCK, "handleGiftFeedByteArrayError : "+p1);
       }
       b.Z(LiveLogTag.LIVE_SELF_GIFT_MOCK, e0+p1);
       return;
    }
    public final void R8(b p0){
       l0 obj;
       boolean b;
       b a;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveAudienceSelfSendGiftMockPresenter liveAudience = LiveAudienceSelfSendGiftMockPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "6")) {
          return;
       }
       b l = p0.l;
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(l, this, liveAudience, "7")) {
          LiveAudienceSelfSendGiftMockPresenter liveAudience1 = (l == null || !l.length())? 1: null;
          if (!liveAudience1) {
             liveAudience1 = this.u;
             String str2 = "mLiveRouterManager";
             if (liveAudience1 == null) {
                a.S(str2);
             }
             if (liveAudience1.P0(l)) {
                liveAudience1 = this.u;
                if (liveAudience1 == null) {
                   a.S(str2);
                }
                liveAudience1.r4(l, objArray);
             }
          }
       }
    label_0043 :
       if (!PatchProxy.applyVoidOneRefs(p0, this, liveAudience, "8")) {
          l = p0.k;
          b uob = (l == null || !l.length())? 1: null;
          int i1 = 0x7f11066a;
          if (!uob) {
             if (p0.m != null) {
                i1 = 0x7f110668;
             }
             i.f(i1, l, true);
          }else {
             l = p0.i;
             if (l != null) {
                uob = p0.d;
                a.o(uob, "event.mGift");
                if (!PatchProxy.applyVoidTwoRefs(l, uob, this, liveAudience, "9") && l instanceof WalletResponse) {
                   WalletResponse mExtraInfo2 = l.mExtraInfo;
                   if (mExtraInfo2 != null) {
                      WalletResponse$ExtraInfo mGiftSuccess = mExtraInfo2.mGiftSuccessSendToast;
                      if (!TextUtils.x(mGiftSuccess)) {
                         Gift mId = uob.mId;
                         if (PatchProxy.isSupport(liveAudience)) {
                            obj = PatchProxy.applyOneRefs(Integer.valueOf(mId), this, liveAudience, "10");
                            if (obj != patchProxyRe) {
                               b1 = obj.booleanValue();
                            }else {
                            label_00b3 :
                               obj = l0.d("liveAudienceSelfToastLimit"+mId);
                               a.o(obj, "SpVariable.ofBool\(\"liveA¡­ceSelfToastLimit$giftId\"\)");
                               this.q = obj;
                               String str1 = "mAudienceSelfSendGiftToastLimit";
                               if (obj == null) {
                                  a.S(str1);
                               }
                               Object obj2 = obj.b(Boolean.FALSE);
                               a.o(obj2, "mAudienceSelfSendGiftToastLimit.get\(false\)");
                               if (obj2.booleanValue()) {
                                  b1 = true;
                               }else {
                                  liveAudience = this.q;
                                  if (liveAudience == null) {
                                     a.S(str1);
                                  }
                                  liveAudience.i(Boolean.TRUE);
                                  b1 = false;
                               }
                            }
                         }else {
                            goto label_00b3 ;
                         }
                         if (!b1) {
                            i.f(i1, mGiftSuccess, true);
                            b.c0(LiveLogTag.LIVE_SELF_GIFT_MOCK, "[showAfterGiftSentToastIfNecessary] After audience self send gift.", "toastContent", mGiftSuccess);
                         }
                      }
                   }
                }
             }
          }
       }
    label_0107 :
       obj = p0.a("key_send_gift_context");
       if (!obj instanceof i) {
          obj = objArray;
       }
       Object obj1 = obj;
       obj = PatchProxy.apply(objArray, p0, b.class, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0.n != null && (!TextUtils.isEmpty(p0.j) && p0.b != null)){
          b d = p0.d;
          if (d != null && d.mDisableMockEffect == null) {
             i = 1;
          }
       }
    label_013f :
       b = i;
       if (!b) {
          b.Z(LiveLogTag.LIVE_SELF_GIFT_MOCK, "handleGiftSendResultEventFailed disableMockGiftEffect");
          this.S8(obj1, "CLIENT_MOCK_RESULT", '['+this.p+"][handleGiftSendResultEvent]disableMockGiftEffect", 615);
          return;
       }else {
          LiveAudienceSelfSendGiftMockPresenter tx = this.x;
          a = p0.a;
          a.o(a, "event.mLiveStreamId");
          String str = String.valueOf(p0.b.mComboKey);
          GiftMessage mComboCount = p0.b.mComboCount;
          b j = p0.j;
          a.m(j);
          a.o(j, "event.mGiftSentInfo!!");
          p0 = p0.i;
          if (p0 instanceof WalletResponse) {
             WalletResponse mExtraInfo = p0.mExtraInfo;
             if (mExtraInfo != null) {
                objArray = mExtraInfo.mSendGiftExtraInfo;
             }else if(p0 instanceof LiveSendNoPanelGiftResponse){
                LiveSendNoPanelGiftResponse mExtraInfo1 = p0.mExtraInfo;
                if (mExtraInfo1 != null) {
                   objArray = mExtraInfo1.mSendGiftExtraInfo;
                }
             }
          }else {
             goto label_0198 ;
          }
          tx.Li(obj1, a, str, mComboCount, j, objArray);
          return;
       }
    }
    public final void S8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveAudienceSelfSendGiftMockPresenter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LiveAudienceSelfSendGiftMockPresenter.class, "16")) {
          return;
       }
       if (p0 == null) {
          b.P(b.a, "[LiveGiftFeedBasePresenter][logEffectMockResult]context is null");
          return;
       }else {
          LiveAudienceSelfSendGiftMockPresenter ts = this.s;
          if (ts == null) {
             a.S("mLiveServiceManager");
          }
          if (ts.b()) {
             b.P(b.a, "[LiveGiftFeedBasePresenter][logEffectMockResult]service manager cleared");
             return;
          }else {
             b uob = new b(p0.e(), "SENDING_GIFT", p1);
             uob.g(p3, p2);
             LiveAudienceSelfSendGiftMockPresenter tt = this.t;
             if (tt == null) {
                a.S("mLiveSendGiftTraceService");
             }
             tt.Ia(uob);
             return;
          }
       }
    }
    public final void V8(i p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(LiveAudienceSelfSendGiftMockPresenter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, LiveAudienceSelfSendGiftMockPresenter.class, "17")) {
          return;
       }
       if (p0 == null) {
          b.P(b.a, '['+this.p+"][logTraceInfo]context is null");
          return;
       }else {
          LiveAudienceSelfSendGiftMockPresenter ts = this.s;
          if (ts == null) {
             a.S("mLiveServiceManager");
          }
          if (!ts.b()) {
             ts = this.t;
             if (ts == null) {
                a.S("mLiveSendGiftTraceService");
             }
             ts.yk(p0.e()).d(p1).f("SENDING_GIFT").g(p3).e(p2).a();
          }
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSelfSendGiftMockPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSelfSendGiftMockPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceSelfSendGiftMockPresenter.class, new c());
       }else {
          obj.put(LiveAudienceSelfSendGiftMockPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSelfSendGiftMockPresenter.class, "3")) {
          return;
       }
       c obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.r = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.s = obj;
       obj = obj.a(a.class);
       a.o(obj, "mLiveServiceManager.getS¡­TraceService::class.java\)");
       this.t = obj;
       LiveAudienceSelfSendGiftMockPresenter ts = this.s;
       if (ts == null) {
          a.S("mLiveServiceManager");
       }
       obj = ts.a(c.class);
       a.o(obj, "mLiveServiceManager.getS¡­ManagerProxy::class.java\)");
       this.u = obj;
       return;
    }
}
