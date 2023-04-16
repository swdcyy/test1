package com.kuaishou.live.core.show.redpacket.redpackrain2.game.a;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import nh2.a;
import com.kwai.robust.PatchProxyResult;
import nh2.h;
import nh2.f;
import java.lang.Boolean;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import wj2.r0;
import ks3.r;
import ft5.b;
import com.kwai.video.waynelive.LivePlayerController;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;
import mh2.e;
import java.util.Map;
import java.util.HashMap;
import p91.m;

public class a extends c implements g	// class@000ef9
{
    public m p;
    public a0 q;
    public f r;
    public final d s;
    public d$a t;
    public a u;
    public View v;
    public boolean w;
    public boolean x;
    public static String sLivePresenterClassName = "LiveAudienceRedPackRainGamePresenter";

    public void a(){
       super();
       this.s = new a$a(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       k1.n(this);
       return;
    }
    public a P8(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u == null) {
          this.u = new h(this.r);
       }
       return this.u;
    }
    public final void R8(boolean p0){
       a0 u;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       if (p0) {
          this.q.N().Pj(AudienceBizRelation.RED_PACK_RAIN_ING);
          u = this.q.U;
          if (u != null) {
             u.i();
          }
          u = this.q.z1;
          if (u != null) {
             u.l();
          }
          this.q.Y1.J0();
          u = this.q.E;
          if (u != null) {
             u.mute();
          }
       }else {
          this.q.N().yj(AudienceBizRelation.RED_PACK_RAIN_ING);
          u = this.q.E;
          if (u != null) {
             u.unMute();
          }
       }
       SwipeLayout swipeLayout = w9.c(this.getActivity());
       if (swipeLayout != null) {
          if (swipeLayout.getTouchDetector() != null) {
             swipeLayout.getTouchDetector().h(p0);
          }
          swipeLayout.n((p0 ^ 0x01), 9);
       }
       this.q.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.RED_PACK_RAIN, (p0 ^ 0x01));
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RED_PACK_RAIN, "stopRedPackRainGame");
       this.t = null;
       a tu = this.u;
       if (tu != null) {
          tu.a();
       }
       this.R8(false);
       this.v.setVisibility(8);
       this.v.setOnClickListener(null);
       this.w = false;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a1c0e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.q8(a0.class);
       this.r = this.q8(f.class);
       return;
    }
}
