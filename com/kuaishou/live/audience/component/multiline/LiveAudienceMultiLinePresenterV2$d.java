package com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$d;
import sq1.a;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t02.a0;
import lq5.a;
import com.kuaishou.live.common.core.component.multiline.model.a;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import com.kwai.robust.PatchProxyResult;
import l02.e;
import aq5.d;
import lp3.c;
import lp3.i;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import qrd.p;
import g21.a;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import rp5.a;
import d61.y;
import oq5.b;
import g21.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import android.view.View;
import g21.a$f;
import androidx.lifecycle.Observer;
import brd.t;
import i81.g;
import ls1.g;
import java.lang.Number;
import n91.f;
import f21.e;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import com.kwai.framework.model.user.User;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$d$a;
import y41.i$a;
import xp5.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import erd.g;
import y41.i;
import l02.f;
import vq5.d;
import android.content.Context;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import lp3.e;
import kq3.a;
import va1.o0;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$FlowDiversionSourceType;
import qa2.b;

public final class LiveAudienceMultiLinePresenterV2$d implements a	// class@000bb2
{
    public final LiveAudienceMultiLinePresenterV2 a;

    public void LiveAudienceMultiLinePresenterV2$d(LiveAudienceMultiLinePresenterV2 p0){
       this.a = p0;
       super();
    }
    public void A(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "9")) {
          return;
       }
       a.p(p0, "e");
       LiveAudienceMultiLinePresenterV2.Y8(this.a).V.A(p0);
       return;
    }
    public void A4(a p0,int p1){
       LiveAudienceMultiLinePresenterV2$d uod = LiveAudienceMultiLinePresenterV2$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "11")) {
          return;
       }
       String str = "participantInfo";
       a.p(p0, str);
       LiveAudienceMultiLinePresenterV2$d ta = this.a;
       Objects.requireNonNull(ta);
       LiveAudienceMultiLinePresenterV2 liveAudience = LiveAudienceMultiLinePresenterV2.class;
       if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), ta, liveAudience, "15")) {
          a.p(p0, str);
          UserInfo userInfo = new UserInfo();
          userInfo.mId = String.valueOf(p0.h.userId);
          p0 = p0.h;
          userInfo.mKwaiId = p0.kwaiId;
          userInfo.mName = p0.userName;
          userInfo.mSex = p0.userGender;
          LiveAudienceMultiLinePresenterV2 o = ta.O;
          if (o == null) {
             a.S("livePlayCallerContext");
          }
          o.U.w0(new UserProfile(userInfo), LiveStreamClickType.LIVE_LINE, 0, false, p1);
       }
       return;
    }
    public String R(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       return LiveAudienceMultiLinePresenterV2.a9(this.a).R(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceMultiLinePresenterV2$d.class, "2")) {
          return;
       }
       LiveAudienceMultiLinePresenterV2$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveAudienceMultiLinePresenterV2.class, "12")) {
          LiveAudienceMultiLinePresenterV2 n = ta.N;
          if (n == null) {
             a.S("serviceManager");
          }
          a[] uoaArray = new a[]{AudienceBizRelation.LIVE_MULTI_LINE};
          n.a(d.class).L8(uoaArray);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLinePresenterV2$d.class, "1")) {
          return;
       }
       this.a.b9();
       if (this.a.i1.isInitialized()) {
          this.a.c9().b();
       }
       return;
    }
    public void c(LiveData p0,LifecycleOwner p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiLinePresenterV2$d.class, "3")) {
          return;
       }
       String str = "userListLiveData";
       a.p(p0, str);
       String str1 = "lifecycleOwner";
       a.p(p1, str1);
       a uoa = this.a.c9();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, uoa, a.class, "2")) {
          a.p(p0, str);
          a.p(p1, str1);
          if (y.d(uoa.i.c())) {
             a h = uoa.h;
             if (h != null) {
                h.d();
             }
          }
          b.P(b.a, "onLineStartRender");
          uoa.s.post(uoa.d);
          p0.observe(p1, new a$f(uoa));
          g.l(uoa.m, uoa.c.hide(), uoa.b.hide());
       }
       return;
    }
    public long d(){
       LiveAudienceMultiLinePresenterV2 obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePresenterV2$d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a.T;
       if (obj == null) {
          a.S("serverTimeProvider");
       }
       return obj.s();
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiLinePresenterV2$d.class, "15")) {
          return;
       }
       LiveAudienceMultiLinePresenterV2$d ta = this.a;
       ta.W0 = null;
       LiveAudienceMultiLinePresenterV2 d1 = ta.d1;
       if (d1 != null) {
          d1.a();
       }
       return;
    }
    public void f(int p0,String p1){
       LiveAudienceMultiLinePresenterV2 v0;
       LiveAudienceMultiLinePresenterV2$d uod = LiveAudienceMultiLinePresenterV2$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "14")) {
          return;
       }
       a.p(p1, "giftToken");
       uod = this.a;
       LiveAudienceMultiLinePresenterV2 d1 = uod.d1;
       if (d1 != null) {
          uod.Y0 = a.a(p0);
          LiveAudienceMultiLinePresenterV2$d ta = this.a;
          if ((v0 = ta.V0) != null) {
             v0.mGiftToken = p1;
          }
          ta.W0 = p1;
          d1.b(p1);
       }
       return;
    }
    public void g(User p0,int p1){
       LiveAudienceMultiLinePresenterV2$d uod = LiveAudienceMultiLinePresenterV2$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "8")) {
          return;
       }
       a.p(p0, "user");
       if (!this.a.getActivity() instanceof GifshowActivity) {
          return;
       }
       c uoc = LiveAudienceMultiLinePresenterV2.Z8(this.a).a(g.class);
       a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
       i$a uoa = new i$a(this.a.getActivity(), uoc.getLiveStreamId());
       uoa.o(p0);
       uoa.m(e.j(LiveAudienceMultiLinePresenterV2.Y8(this.a).c));
       uoa.f(b.c(LiveAudienceMultiLinePresenterV2.Y8(this.a).j0().mEntity));
       uoa.n(p1);
       uoa.k(295);
       uoa.r(true);
       uoa.i(LiveAudienceMultiLinePresenterV2$d$a.b).a().c();
       return;
    }
    public String h(){
       LiveAudienceMultiLinePresenterV2 obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePresenterV2$d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.W;
       if (obj == null) {
          a.S("infoManager");
       }
       return obj.d();
    }
    public void i(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       LiveAudienceMultiLinePresenterV2.a9(this.a).Ed(p0);
       return;
    }
    public void j(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       LiveAudienceMultiLinePresenterV2.a9(this.a).sd(p0);
       return;
    }
    public void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "16")) {
          return;
       }
       a.p(p0, "routerUrl");
       if (LiveAudienceMultiLinePresenterV2.Y8(this.a).p2.P0(p0)) {
          LiveAudienceMultiLinePresenterV2.Y8(this.a).p2.r4(p0, this.a.getContext());
       }
       return;
    }
    public KwaiDialogFragment l(String p0){
       Activity obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "url");
       obj = this.a.getActivity();
       if (obj != null) {
          a uoa = o0.a(obj, LiveAudienceMultiLinePresenterV2.Z8(this.a).a(a.class).getChildFragmentManager(), LiveAudienceMultiLinePresenterV2.Z8(this.a));
          if (uoa != null) {
             uoa.b.setPortraitHeightRatio(0x3f0f5c29).setActionBarLeftBtnType("back");
             return a.c().h(p0, uoa);
          }
       }
       return null;
    }
    public void v1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePresenterV2$d.class, "10")) {
          return;
       }
       a.p(p0, "participantInfo");
       b.a(this.a.getActivity(), LiveAudienceMultiLinePresenterV2.Y8(this.a), String.valueOf(p0.h.userId), p0.g, 172, LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_LINE);
       return;
    }
    public LiveData w1(){
       return this.a.U0;
    }
}
