package com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$a;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import mrd.c;
import kotlin.jvm.internal.a;
import u22.m;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import u22.l;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import java.lang.Throwable;
import h62.c;
import h22.a;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import h62.d;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import o22.b;
import java.lang.StringBuilder;
import java.lang.Enum;
import nt5.a;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import z0.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.common.core.component.follow.cache.c;
import u22.i;
import u22.j;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketGrabButtonInfo;
import u22.h;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import y41.i$a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p91.m;
import com.kwai.framework.model.user.User;
import y22.q;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.basic.utils.e;
import t02.r1;
import y41.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import h22.h;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$c;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonView;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView;
import com.kuaishou.live.core.show.activityredpacket.reward.d;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import y22.d$c;
import y22.d;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonTipView$b;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import u22.q;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$e;

public class LiveActivityRedPacketGrabButtonPresenter extends c implements g	// class@000983
{
    public a A;
    public boolean B;
    public final LiveActivityRedPacketGrabButtonTipView$b C;
    public final LiveRedPackSnatchView$c D;
    public m p;
    public a q;
    public LiveActivityRedPacketService r;
    public LiveActivityRedPacketPresenter$e s;
    public LiveActivityRedPacketGrabButtonPresenter$d t;
    public LiveActivityRedPacketGrabButtonView u;
    public LiveActivityRedPacketGrabButtonInfo v;
    public UserInfo w;
    public String x;
    public long y;
    public LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType z;
    public static String sLivePresenterClassName = "LiveActivityRedPacketGrabButtonPresenter";

    public void LiveActivityRedPacketGrabButtonPresenter(){
       super();
       this.t = new LiveActivityRedPacketGrabButtonPresenter$a(this);
       this.y = 0;
       this.z = LiveActivityRedPacketGrabButtonPresenter$ConditionButtonType.NONE;
       this.A = null;
       this.B = true;
       this.C = new LiveActivityRedPacketGrabButtonPresenter$b(this);
       this.D = new LiveActivityRedPacketGrabButtonPresenter$c(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketGrabButtonPresenter.class, "6")) {
          return;
       }
       LiveActivityRedPacketReserveQualificationManager d = LiveActivityRedPacketReserveQualificationManager.d;
       Objects.requireNonNull(d);
       t ot = PatchProxy.applyOneRefs(objArray, d, LiveActivityRedPacketReserveQualificationManager.class, "3");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = d.a().hide();
          a.o(ot, "getReservationSubject\(\).hide\(\)");
       }
       this.X7(ot.subscribe(new m(this)));
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new l(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketGrabButtonPresenter.class, "7")) {
          return;
       }
       this.u = null;
       return;
    }
    public final boolean P8(n p0){
       LiveActivityRedPacketGrabButtonPresenter obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketGrabButtonPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       boolean b = (obj != null && TextUtils.equals(p0.b, obj.mId))? true: false;
       return b;
    }
    public final void R8(ActionStatus p0,Throwable p1){
       Object obj = this;
       c obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj1, obj, LiveActivityRedPacketGrabButtonPresenter.class, "14")) {
          return;
       }
       c uoc = new c(e.d(obj.q), LiveRedPacketStage.RED_PACKET_GRABING, LiveRedPacketAction.RED_PACK_GRAB, obj.q.d(), RedPacketType.RED_PACKET_TYPE_ACTIVITY, -1, -1, FirstReportType.DEFAULT, ActionType.TASK, p0, "1.0");
       obj1 = v2.a(obj1);
       d.j(obj1.e(obj.q.b()));
       return;
    }
    public final void S8(String p0,LiveRedPacketPopupPageType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityRedPacketGrabButtonPresenter.class, "16")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("countdown", Integer.valueOf(0));
       d.c(e.d(this.q), p0, RedPacketType.RED_PACKET_TYPE_ACTIVITY, this.q.b(), LiveRedPacketStage.RED_PACKET_RESULT, p1, this.q.c.a.b(LiveRedPacketAction.RED_PACK_POPUP.name()+LiveRedPacketPopupPageType.RESULT_SUCCESS_PANEL), oi3);
       return;
    }
    public final void V8(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityRedPacketGrabButtonPresenter.class, "4")) {
          return;
       }
       if (TextUtils.equals(p0, QCurrentUser.me().getId())) {
          p1.apply(Boolean.TRUE);
       }
       this.X7(c.b().d(p0).take(1).subscribe(new i(p1), new j(p1)));
       return;
    }
    public void W8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveActivityRedPacketGrabButtonInfo liveActivity = LiveActivityRedPacketGrabButtonInfo.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveActivityRedPacketGrabButtonPresenter.class, "5")) {
          return;
       }
       if (this.u != null) {
          LiveActivityRedPacketGrabButtonPresenter tv = this.v;
          if (tv != null && this.A != null) {
             h oh = new h(this);
             LiveFollowExtParams$a uoa = new LiveFollowExtParams$a();
             uoa.e(tv.s);
             uoa.f(this.v.t);
             uoa.b(this.v.v);
             tv = this.v;
             Objects.requireNonNull(tv);
             String str = PatchProxy.apply(objArray, tv, liveActivity, "2");
             if (str != patchProxyRe) {
             }else {
                str = TextUtils.k(tv.w);
             }
             uoa.c(str);
             tv = this.v;
             Objects.requireNonNull(tv);
             String str1 = PatchProxy.apply(objArray, tv, liveActivity, "3");
             if (str1 != patchProxyRe) {
             }else {
                str1 = TextUtils.k(tv.x);
             }
             uoa.d(str1);
             i$a uoa1 = new i$a(this.getActivity(), this.p.getLiveStreamId());
             uoa1.o(UserInfo.convertToQUser(this.w));
             uoa1.n(139);
             uoa1.r(false);
             uoa1.h(q.f());
             uoa1.g(uoa.a());
             uoa1.e(oh);
             a b = this.q.b;
             if (b != null) {
                uoa1.m(e.j(b.c));
             }
             b = this.q.a;
             if (b != null) {
                uoa1.m(b.T());
             }
             uoa1.a().c();
             h.c(this.p.a(), this.q.a(), this.q.d(), this.q.b(), "DEFAULT_FOLLOW", this.q.c());
          }
       }
       return;
    }
    public void X8(LiveActivityRedPacketGrabButtonInfo p0){
       LiveActivityRedPacketGrabButtonPresenter liveActivity = LiveActivityRedPacketGrabButtonPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveActivity, "12")) {
          return;
       }
       LiveActivityRedPacketGrabButtonPresenter tu = this.u;
       if (tu != null && p0 != null) {
          tu.setOnSnatchViewListener(this.D);
          boolean b = false;
          if (p0.c != null) {
             p0.m = p0.n - this.p.s();
             this.u.b(p0);
          }else if(p0.u == null){
             tu = this.u;
             LiveActivityRedPacketGrabButtonPresenter tC = this.C;
             Objects.requireNonNull(tu);
             if (!PatchProxy.applyVoidTwoRefs(p0, tC, tu, LiveActivityRedPacketGrabButtonView.class, "2")) {
                tu.c.setVisibility(b);
                tu.b.setVisibility(8);
                tu.c.c(true, p0.d(), p0.c());
                d.b(tu.c.c, p0.k, new d(tu, p0));
                tu.c.setTipListener(tC);
             }
          }else {
             this.u.b(p0);
          }
          if (!PatchProxy.applyVoid(null, this, liveActivity, "15") && this.B != null) {
             this.B = b;
             d.i(e.d(this.q), this.q.d(), RedPacketType.RED_PACKET_TYPE_ACTIVITY, this.q.b(), this.q.c.a.b(LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW.name()), LiveRedPacketGrabButtonType.GRAB_BUTTON);
          }
       }
    label_00b0 :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketGrabButtonPresenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketGrabButtonPresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveActivityRedPacketGrabButtonPresenter.class, new q());
       }else {
          obj.put(LiveActivityRedPacketGrabButtonPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketGrabButtonPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.q8(a.class);
       this.r = this.r8("LiveActivityRedPacketPendantService");
       this.s = this.r8("LiveActivityRedPacketDelegate");
       return;
    }
}
