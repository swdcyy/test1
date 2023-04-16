package com.kuaishou.live.core.show.guestactivity.h;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.guestactivity.h$a;
import n92.c0;
import n92.b0;
import com.kuaishou.live.core.show.guestactivity.h$b;
import com.kuaishou.live.core.show.guestactivity.h$c;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import t02.a0;
import hf3.a;
import p91.m;
import lf3.g;
import oq5.c;
import jv1.b;
import k51.a;
import n92.e;
import android.view.View;
import ks5.b;
import ks5.c;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.rank.LiveRankResourcePathConstant;
import l12.d;
import va1.f0;
import com.kuaishou.live.core.show.guestactivity.h$d;
import android.view.View$OnClickListener;
import android.animation.Animator;
import n92.g0;
import com.kuaishou.live.core.show.guestactivity.h$e;
import android.animation.Animator$AnimatorListener;
import hb2.g$b;
import com.kuaishou.live.core.show.guestactivity.k;
import java.util.Map;
import java.util.HashMap;
import n92.z;
import com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityTopListPresenterV2$d;
import com.kuaishou.live.common.core.component.pendant.LivePendantLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityRankClearInfo;

public class h extends f implements g	// class@000bdd
{
    public e K;
    public View L;
    public boolean M;
    public boolean N;
    public Map O;
    public String P;
    public final c Q;
    public final g R;
    public final g S;
    public a0 T;
    public c U;
    public z V;
    public LiveAudienceGuestActivityTopListPresenterV2$d W;
    public d X;
    public h$f Y;
    public static String sLivePresenterClassName = "LiveAudienceGuestActivityTopPendantPresenterV2";

    public void h(){
       super();
       this.M = false;
       this.N = false;
       this.Q = new h$a(this);
       this.R = new c0(this);
       this.S = new b0(this);
       this.X = new h$b(this);
       this.Y = new h$c(this);
       this.U7(new LiveAudienceGuestActivityTopListPresenterV2());
    }
    public void Q(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "3")) {
          return;
       }
       this.O = null;
       this.P = null;
       this.d9();
       this.M = false;
       this.N = false;
       this.T.Z2.u().o(698, this.R);
       this.T.Z2.u().o(699, this.S);
       this.T.x.Q0(this.Q);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       if (a.b() && this.K == null) {
          this.K = this.b9();
       }
       this.L.setAlpha(0x3f800000);
       this.L.setVisibility(0);
       this.U.b(this.K);
       return;
    }
    public final e b9(){
       e obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e();
       if (this.L == null) {
          View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0b53);
          this.L = view;
          KwaiImageView kwaiImageVie = view.findViewById(R.id.live_guest_activity_top_list_pendant_image_view);
          LiveRankResourcePathConstant lIVE_GZONE_G = (this.T.r != null)? LiveRankResourcePathConstant.LIVE_GZONE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2: LiveRankResourcePathConstant.LIVE_GUEST_ACTIVITY_TOP_LIST_PENDANT_V2;
          f0.a(kwaiImageVie, lIVE_GZONE_G);
          this.L.setOnClickListener(new h$d(this));
       }
       obj.a = this.L;
       return obj;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.a9();
       Animator uAnimator = g0.a(this.L);
       uAnimator.addListener(new h$e(this));
       uAnimator.start();
       a0 l1 = this.T.l1;
       if (l1 != null) {
          l1.f(false);
       }
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       h tK = this.K;
       if (tK != null) {
          this.U.c(tK);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, h.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(h.class, new k());
       }else {
          obj.put(h.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       this.T = this.q8(a0.class);
       this.U = this.q8(c.class);
       this.V = this.q8(z.class);
       this.W = this.q8(LiveAudienceGuestActivityTopListPresenterV2$d.class);
       return;
    }
    public void x(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "2")) {
          return;
       }
       if (!a.b()) {
          this.K = this.b9();
       }
       b.B(LivePendantLogTag.LIVE_GUEST_ACTIVITY_PENDANT, "LiveAudienceGuestActivityNewTopPendantPresenter onBind");
       this.T.Z2.u().u0(698, LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo.class, this.R);
       this.T.Z2.u().u0(699, LiveActivitySignalMessage$LiveActivityRankClearInfo.class, this.S);
       this.T.x.H6(this.Q);
       return;
    }
}
