package com.kuaishou.live.core.show.banned.d;
import im8.g;
import k51.c;
import o32.d;
import com.kuaishou.live.core.show.banned.d$a;
import com.kuaishou.live.core.show.banned.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveBanned;
import o32.f;
import lf3.g;
import o32.g;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;
import tq5.c;
import cy1.r;
import cy1.q;
import s91.c;
import s91.b;
import z12.e;
import com.kuaishou.live.core.show.banned.LiveBannedView;
import android.view.View;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.b;
import com.yxcorp.gifshow.model.CDNUrl;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import com.kuaishou.live.core.show.banned.f$b;
import com.kuaishou.live.core.show.banned.j$a;
import android.view.ViewParent;
import android.view.ViewStub;
import mq5.f;
import o32.c;
import android.view.View$OnClickListener;
import m01.a;
import android.widget.FrameLayout;
import o32.e;
import com.kuaishou.live.core.show.banned.LiveBannedView$b;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import o32.k;
import java.util.Map;
import java.util.HashMap;

public class d extends c implements g	// class@0009e8
{
    public a0 p;
    public j$a q;
    public q r;
    public b s;
    public ViewStub t;
    public View u;
    public LiveBannedView v;
    public boolean w;
    public final c x;
    public final r y;
    public d$c z;
    public static String sLivePresenterClassName = "LiveBannedAudiencePresenter";

    public void d(){
       super();
       this.w = false;
       this.x = new d(this);
       this.y = new d$a(this);
       this.z = new d$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.p.Z2.u().u0(594, LiveAdminAuditMessages$SCLiveBanned.class, new f(this));
       this.p.w1.Ci(new g(this), AudienceQuitLiveCheckOrder.BANNED);
       this.r.e(this.y);
       this.s.a(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       this.w = false;
       this.r.f(this.y);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveBannedAudience", "cancelLiveBannedViewAndStopLive", stringArray);
       d tv = this.v;
       if (tv != null) {
          tv.a();
          this.u.setVisibility(8);
          b.Z(LiveLogTag.LIVE_AUDIENCE_END, "cancelLiveBannedViewAndStopLive");
          this.p.D2.s8(LiveAudienceEndReason.LIVE_BANNED);
          this.w = false;
       }
       return;
    }
    public final void R8(String p0,CDNUrl[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       int i = 0;
       String[] stringArray = new String[i];
       e.c("LiveBannedAudience", "showLiveBannedView", stringArray);
       if (this.getActivity() != null && y.d(this.getActivity())) {
          this.getActivity().setRequestedOrientation(1);
       }
       this.p.G1.a();
       this.q.a();
       d tt = this.t;
       if (tt != null && tt.getParent() != null) {
          this.t.inflate();
       }
       this.p.J2.Uk(i);
       this.u = this.m8().findViewById(0x7f0a1a6a);
       this.v = this.m8().findViewById(0x7f0a1a6d);
       this.u.setOnClickListener(new c(this));
       this.v.setOnClickListener(a.b);
       this.v.setVisibility(i);
       this.v.setLiveBannedImageUrls(p1);
       this.v.setLiveBannedWarningContentString(p0);
       this.v.setLiveBannedTopContent("当前直播间内容涉及B类违规");
       this.v.setLiveBannedBottomContent("直播间即将被关闭！");
       this.v.setLiveBannedCountDownSecond(10);
       this.v.setLiveBannedViewCountDownListener(new e(this));
       this.v.b();
       this.s.d(this.x);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1a6b);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new k());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(j$a.class);
       this.r = this.r8("LIVE_TOP_USER_BASIC_SERVICE");
       this.s = this.r8("LIVE_AUDIENCE_SERVER_EXCEPTION_SERVICE");
       return;
    }
}
