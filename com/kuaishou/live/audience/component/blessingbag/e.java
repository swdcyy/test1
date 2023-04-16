package com.kuaishou.live.audience.component.blessingbag.e;
import com.kuaishou.live.core.show.blessingbag.a;
import java.lang.String;
import d61.l0;
import gx0.g;
import gx0.d;
import com.kuaishou.live.audience.component.blessingbag.a;
import gx0.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import gx0.b;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import lf3.g;
import hf3.a;
import com.kuaishou.krn.event.a;
import oj0.a;
import mq5.h;
import mq5.b;
import com.kuaishou.live.audience.component.blessingbag.e$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.library.widget.popup.common.c;
import z12.x;
import e93.f;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Integer;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig;
import com.kuaishou.live.core.basic.model.LiveAudienceBlessBagConfig$CampaignConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import o63.a;
import lp3.c;
import lp3.i;
import oa1.a;
import p63.a;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import o63.d;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import v91.b;
import v91.k;
import java.lang.StringBuilder;
import p91.m;
import fq5.b;
import com.kwai.framework.model.user.User;
import p63.a$a;
import java.lang.Number;
import com.kuaishou.live.core.show.blessingbag.LiveBlessingBagContainer;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kuaishou.live.audience.component.blessingbag.b;
import u07.u;
import jl5.c;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle;
import com.kuaishou.live.audience.component.blessingbag.c;
import com.kuaishou.live.audience.component.blessingbag.d;
import w07.l;
import com.kuaishou.live.audience.component.blessingbag.e$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import u07.t;

public class e extends a	// class@000a4a
{
    public t A;
    public final h B;
    public b C;
    public a0 D;
    public boolean E;
    public LiveAudienceBlessBagConfig F;
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget G;
    public String H;
    public boolean I;
    public boolean J;
    public final g x;
    public final a y;
    public final a z;
    public static final l0 K;
    public static String sLivePresenterClassName;

    static {
       e.K = l0.d("LiveAnchor.blessingBag.LiveAudienceBlessingBagPresenter.sIsNeverShowNotice");
    }
    public void e(){
       super();
       this.x = new g(this);
       this.y = new d(this);
       this.z = new a(this);
       this.B = new h(this);
       this.E = false;
       this.H = "";
       this.I = true;
       this.J = false;
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       super.E8();
       this.X7(this.D.b3.W().subscribe(new b(this)));
       if (!PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          this.s.u0(1017, LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice.class, this.x);
          a.b().a("LUCKY_BAG_LIFECYCLE", this.y);
          a.b().a("COUNTDOWN_LUCKY_BAG_STATUS", this.z);
          this.D.D2.Km(this.B);
       }
       if (this.D.h != null) {
          this.D.y2.P4(new e$a(this));
       }
       return;
    }
    public void J8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.s.o(1017, this.x);
          a.b().c("LUCKY_BAG_LIFECYCLE", this.y);
          a.b().c("COUNTDOWN_LUCKY_BAG_STATUS", this.z);
          this.D.D2.le(this.B);
          x.f(this.A);
          f.g("LiveAudienceBlessingBagPresenter");
       }
       return;
    }
    public void R8(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.G = p0;
       LiveLogTag lIVE_BLESSIN = LiveLogTag.LIVE_BLESSING_BAG;
       String str = "LiveAudienceBlessingBagPresenter";
       lIVE_BLESSIN.appendTag(str);
       e tG = this.G;
       b.T(lIVE_BLESSIN, "handleBlessingBagMessage", "campaignId", tG.campaignId, "status", Integer.valueOf(tG.status));
       e tF = this.F;
       if (tF == null) {
          b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, mBlessBagConfig == null");
          return;
       }else if(tF.mEnableBlessBagCampaign == null){
          b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, mEnableBlessBagCampaign is false");
          return;
       }else {
          LiveAudienceBlessBagConfig mCampaignCon = tF.mCampaignConfig;
          b = false;
          e uoe = 3;
          if (mCampaignCon == null) {
             if (this.G.status == uoe) {
                b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, mBlessBagConfig.mCampaignConfig == null, close msg");
                return;
             }else {
                b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, mBlessBagConfig.mCampaignConfig == null, updateBlessingBagPendant");
                this.H = this.G.campaignId;
                LiveAudienceBlessBagConfig$CampaignConfig uCampaignCon = new LiveAudienceBlessBagConfig$CampaignConfig();
                e tG1 = this.G;
                uCampaignCon.mCampaignId = tG1.campaignId;
                uCampaignCon.mEnablePrimaryBag = true;
                uCampaignCon.mPrimaryJobFinish = b;
                tF = this.F;
                tF.mCampaignConfig = uCampaignCon;
                this.X8(tF, tG1);
                return;
             }
          }else if(mCampaignCon.mEnablePrimaryBag == null){
             b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, mEnablePrimaryBag is false");
             return;
          }else if(this.G.status == uoe){
             b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, close msg");
             this.V8();
             return;
          }else if(!TextUtils.x(this.H) && !TextUtils.n(this.H, this.G.campaignId)){
             lIVE_BLESSIN.appendTag(str);
             b.S(lIVE_BLESSIN, "handleBlessingBagMessage, campaignId change", "mLastCampaignId", this.H);
             this.V8();
             LiveAudienceBlessBagConfig$CampaignConfig uCampaignCon1 = new LiveAudienceBlessBagConfig$CampaignConfig();
             uCampaignCon1.mCampaignId = this.G.campaignId;
             uCampaignCon1.mEnablePrimaryBag = true;
             uCampaignCon1.mPrimaryJobFinish = b;
             this.F.mCampaignConfig = uCampaignCon1;
          }
          b.P(lIVE_BLESSIN.appendTag(str), "handleBlessingBagMessage, updateBlessingBagPendant");
          e tG2 = this.G;
          this.H = tG2.campaignId;
          this.X8(this.F, tG2);
          return;
       }
    }
    public void S8(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       b.a.b(this.r.a(a.class), LiveKrnPageKey.LiveAudienceBlessingBagDetailPage, this.a9(), this.b9());
       return;
    }
    public void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (!this.Y8()) {
          b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveAudienceBlessingBagPresenter"), "showCountDownTimerOverDialog, canShowNoticeBySpAndFrequency\(\) == false");
          return;
       }else {
          LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice sCLiveRevenu = new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice();
          sCLiveRevenu.taskType = 0;
          this.c9(sCLiveRevenu, true);
          return;
       }
    }
    public final boolean Y8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoe, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.C == null) {
          k ok = PatchProxy.apply(objArray, this, uoe, "10");
          if (ok != patchProxyRe) {
          }else {
             ok = new k("LiveAudienceBlessingBagPresenter"+this.q.getLiveStreamId(), 0x5265c00, true);
          }
          this.C = ok;
       }
       l0 k = e.K;
       Boolean fALSE = Boolean.FALSE;
       if (k.b(fALSE).booleanValue()) {
          if (this.C.b()) {
             k.i(fALSE);
          }else {
             b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag("LiveAudienceBlessingBagPresenter"), "canShowNotice, mNoticeFrequencyConsumer.canConsume\(\) == false");
             return false;
          }
       }
       return true;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, e.class, "15")) {
          return;
       }
       if (e.K.b(Boolean.FALSE).booleanValue() && this.C.b()) {
          this.C.a();
       }
       return;
    }
    public final a a9(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       User obj = PatchProxy.apply(objArray, this, e.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.D.b().I();
       if (obj == null) {
          return new a$a().b();
       }
       a$a uoa = new a$a();
       Object obj1 = PatchProxy.apply(objArray, this, a.class, "8");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          a tw = this.w;
          l = (tw != null)? tw.getCountBagEndTime(): 0;
       }
       return uoa.a("countBagEndTime", String.valueOf(l)).a("isFollowed", String.valueOf(obj.isFollowingOrFollowRequesting())).b();
    }
    public final a b9(){
       a obj = PatchProxy.apply(null, this, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.b(0x3f19999a);
       obj.d(16);
       obj.c(1);
       return obj;
    }
    public final void c9(LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice p0,boolean p1){
       String str2;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "14")) {
          return;
       }
       String str = "LiveAudienceBlessingBagPresenter";
       if (this.I == null) {
          b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "mIsCurrentPageShow == false");
          return;
       }else if(this.J != null){
          b.P(LiveLogTag.LIVE_BLESSING_BAG.appendTag(str), "mIsLiveStop == true");
          return;
       }else {
          a uoa = this.r.a(a.class);
          t$a uoa1 = new t$a(this.getActivity());
          uoa1.v(true);
          uoa1 = f.d(uoa1);
          uoa1.V0(true);
          uoa1.s0(new b(this, p0));
          String str1 = (p1)? "天降福袋砸中你啦": c.g(R.string.arg_RES_7f1024b7);
          uoa1.X0(str1);
          if (PatchProxy.isSupport(uoe)) {
             str2 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "12");
             if (str2 != PatchProxyResult.class) {
             }else if(p1){
                str2 = "你的快币已到账。看得越久，领得越多！";
             }else {
                LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice noticeTextCa = p0.noticeTextCaption;
                str2 = (noticeTextCa != null && !TextUtils.x(noticeTextCa.content))? p0.noticeTextCaption.content: "";
             }
          }else {
             goto label_0083 ;
          }
          uoa1.z0(str2);
          String str3 = (p1)? "领快币": c.g(R.string.arg_RES_7f101ec0);
          uoa1.T0(str3);
          uoa1.u0(new c(this, p0, uoa));
          uoa1.a0(new d(this));
          this.A = uoa1.Y(new e$b(this, p0));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.D = this.q8(a0.class);
       return;
    }
}
