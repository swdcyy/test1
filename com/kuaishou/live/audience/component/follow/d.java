package com.kuaishou.live.audience.component.follow.d;
import im8.g;
import k51.c;
import xs5.a;
import oy0.e;
import com.kuaishou.live.audience.component.follow.d$a;
import oy0.h;
import erd.g;
import com.kwai.framework.model.user.User;
import oe6.e;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import oy0.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wca.n;
import com.kuaishou.live.audience.component.follow.a;
import ra1.a;
import w02.g;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.h;
import android.widget.TextView;
import oy0.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.follow.d$b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import brd.t;
import ry1.b;
import oy0.l;
import com.gifshow.tuna.player.poi.e;
import crd.b;
import gq5.c;
import gq5.f;
import oy0.i;
import vq5.b;
import vq5.d;
import android.animation.ValueAnimator;
import lnc.b9;
import java.lang.Runnable;
import e93.f;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Activity;
import va1.d0;
import oy0.j;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import java.lang.Boolean;
import java.lang.Integer;
import ekd.r0;
import oy0.d;
import jga.c;
import wca.b;
import y41.i$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.core.basic.utils.e;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import y41.i;
import e17.i;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import oy0.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import android.widget.RelativeLayout;
import kg1.i;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import ekd.m1;
import android.view.ViewGroup;
import oy0.u;
import java.util.Map;
import java.util.HashMap;
import mq5.b;

public class d extends c implements g	// class@000ad3
{
    public b A;
    public d B;
    public BaseFragment C;
    public boolean D;
    public a E;
    public ValueAnimator F;
    public b G;
    public a H;
    public boolean I;
    public final c J;
    public RelativeLayout p;
    public View q;
    public ViewGroup r;
    public View s;
    public boolean t;
    public TextView u;
    public final Runnable v;
    public Runnable w;
    public a x;
    public a0 y;
    public g z;
    public static String sLivePresenterClassName = "LiveAudienceFollowUserPresenter";

    public void d(a p0){
       super();
       this.v = new e(this);
       this.E = new d$a(this);
       this.J = new h(this);
       this.x = p0;
    }
    public static void P8(d p0,g p1,User p2){
       p0.X8(p1, p2);
    }
    private void X8(g p0,User p1){
       e.f0(false);
       a0 c = this.y.c;
       if (c != null && c.isLiveStream()) {
          i0.a().e(300, this.y.c.mEntity).d(new c(this)).a();
       }
       if (p0 != null) {
          p0.accept(p1);
       }
       return;
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       a uoa = a.a(n.class, new a(this));
       this.H = uoa;
       this.z.a(uoa);
       if (!PatchProxy.applyVoid(objArray, this, uod, "9")) {
          if (this.x.i.isGRPRCustomizedLive()) {
             uod = this.x;
             if (uod.d != null || b.c(uod)) {
                this.u = h.f(this.m8(), 0x7f0a220f, 0x7f0a22ed);
             label_005f :
                this.u.setOnClickListener(new g(this));
             }
          }
          this.u = this.m8().findViewById(0x7f0a1ced);
          goto label_005f ;
       }
       this.Y8();
       if (this.y.h != null) {
          this.y.y2.P4(new d$b(this));
       }
       this.G = this.y.b3.T3().subscribe(new l(this), e.b);
       this.t = false;
       a0 g2 = this.y.g2;
       if (g2 != null) {
          g2.k(this.J);
       }
       this.B.t5("followuser", new i(this));
       return;
    }
    public void J8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "25")) {
          uod = this.F;
          if (uod != null) {
             uod.cancel();
          }
       }
       b9.a(this.G);
       this.z.b(this.H);
       this.z = objArray;
       this.t = false;
       f.f(this.v);
       f.f(this.w);
       a0 g2 = this.y.g2;
       if (g2 != null) {
          g2.l(this.J);
       }
       this.B.Z4("followuser");
       return;
    }
    public void R8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          y.a(this.getActivity(), d0.a(this.y.c), "live_follow", 42, a.a().a().getString(R.string.arg_RES_7f103077), this.y.c.mEntity, null, null, new j(this, p0));
          return;
       }else {
          LivePlayLogger.logLiveFollowButtonClickEvent(this.y.Z2.b(), this.y.Z2.a(), "TOP_BTN");
          this.S8(true, true, null, null);
          return;
       }
    }
    public void S8(boolean p0,int p1,g p2,LiveFollowExtParams p3){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, p3, this, d.class, "19")) {
          return;
       }
       if (r0.d(a.b())) {
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, p3, this, d.class, "21")) {
             User user = this.y.c.getUser();
             user.mPage = "live";
             c uoc = b.c(this.y.c.mEntity);
             LiveStreamFeedWrapper mEntity = this.y.c.mEntity;
             i$a uoa = new i$a(this.getActivity(), this.y.Z2.getLiveStreamId());
             uoa.o(user);
             uoa.m(e.j(this.y.c));
             uoa.n(p1);
             uoa.r(false);
             uoa.j(new d(this, p2));
             FeedLogCtx uFeedLogCtx = (mEntity != null)? r1.O0(mEntity): null;
             uoa.v = uFeedLogCtx;
             uoa.g(p3);
             uoa.f(uoc);
             LiveAudienceParam mLiveSourceT = this.y.o.mLiveSourceType;
             if (mLiveSourceT == 171 || mLiveSourceT == 304) {
                uoa.k(290);
             }
             i oi = uoa.a();
             if (p0) {
                oi.c();
             }else {
                oi.e();
             }
          }
       }else {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }
       return;
    }
    public final void V8(String p0,boolean p1,int p2,String p3,LiveFollowExtParams p4){
       Object[] objArray;
       Object obj = this;
       object oobject = p0;
       boolean b = p1;
       int i = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       d uod = d.class;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       int i5 = 0;
       int i6 = 5;
       if (PatchProxy.isSupport(uod)) {
          objArray = new Object[i6];
          objArray[i5] = oobject;
          objArray[i4] = Boolean.valueOf(p1);
          objArray[i3] = Integer.valueOf(p2);
          objArray[i2] = oobject1;
          objArray[i1] = oobject2;
          if (PatchProxy.applyVoid(objArray, obj, uod, "4")) {
             return;
          }
       }
       if (!QCurrentUser.me().isLogined()) {
          k ok = i6;
          k ok1 = i6;
          ok = new k(this, p0, p1, p2, p3, p4);
          d.a(-1712118428).x00(this.getContext(), 75, new LoginParams$a().a(), ok1);
       }else if(PatchProxy.isSupport(uod)){
          objArray = new Object[i6];
          objArray[i5] = oobject;
          objArray[i4] = Boolean.valueOf(p1);
          objArray[i3] = Integer.valueOf(p2);
          objArray[i2] = oobject1;
          objArray[i1] = oobject2;
          if (!PatchProxy.applyVoid(objArray, obj, uod, "5")) {
          }
       }else if(TextUtils.n(oobject1, oobject)){
          obj.S8(b, i, null, oobject2);
       }else if(PatchProxy.isSupport(uod) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), p4, this, d.class, "20")){
          if (r0.d(a.b())) {
             if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), p4, this, d.class, "22")) {
                i$a uoa = new i$a(this.getActivity(), obj.y.Z2.getLiveStreamId()).p(oobject);
                uoa.m(e.j(obj.y.c));
                uoa.n(i);
                uoa.r(i5);
                uoa.g(oobject2);
                i oi = uoa.a();
                if (b) {
                   oi.c();
                }else {
                   oi.e();
                }
             }
          }else {
             i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          }
       }
    label_012c :
       return;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (QCurrentUser.me().isLogined() && this.y.c.getUser().isFollowingOrFollowRequesting())? true: false;
       return b;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, d.class, "23")) {
          return;
       }
       if (this.W8()) {
          int i = 8;
          this.u.setVisibility(i);
          if (this.I != null) {
             this.p.setVisibility(0);
             i.h(this.y.Z2.b(), true, this.y.Z2.a());
          }else {
             this.p.setVisibility(i);
          }
       }else {
          this.Z8();
       }
       return;
    }
    public final void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "12")) {
          return;
       }
       if (this.t != null) {
          f.f(this.v);
          f.k("resetFollowState", this.v, this, 300);
          return;
       }else {
          this.p.setVisibility(8);
          this.u.setVisibility(0);
          if (this.D == null) {
             LivePlayLogger.logLiveFollowButtonShowEvent(this.y.Z2.b(), this.y.Z2.a());
             this.D = true;
          }
          this.F = objArray;
          ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
          layoutParams.width = a1.d(0x7f0708f9);
          this.u.setLayoutParams(layoutParams);
          this.u.setAlpha(0x3f800000);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1cee);
       this.p = m1.f(p0, 0x7f0a22ef);
       this.r = m1.f(p0, 0x7f0a2e04);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new u());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.y = this.q8(a0.class);
       this.z = this.r8("LIVE_AUDIENCE_EVENT_BUS_SERVICE");
       this.A = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.B = this.r8("LIVE_ROUTER_SERVICE");
       this.C = this.r8("LIVE_FRAGMENT");
       return;
    }
}
