package com.kuaishou.live.core.show.activityredpacket.k;
import im8.g;
import k51.c;
import lnc.a1;
import java.lang.String;
import com.kuaishou.live.core.show.activityredpacket.k$a;
import com.kuaishou.live.core.show.activityredpacket.user.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import u22.b0;
import t22.c;
import w22.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import h22.j;
import erd.g;
import crd.b;
import eoc.f;
import android.animation.ValueAnimator;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent$LiveShareStatus;
import uj2.a;
import h22.a;
import t02.a0;
import uw1.m;
import cx1.a;
import p91.m;
import com.kuaishou.live.common.core.component.redpacket.model.LiveRedPacketActivityTokenResponse;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import qg2.c;
import qg2.b;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.activityredpacket.j;
import h22.k;
import java.lang.Integer;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.activityredpacket.m;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.activityredpacket.a0$b;
import t22.c$a;
import w22.a$b;
import com.kuaishou.live.core.show.activityredpacket.user.f$c;
import u22.b0$b;

public class k extends c implements g	// class@000958
{
    public KwaiImageView A;
    public LiveActivityRedPacketGrabResponse B;
    public b C;
    public boolean D;
    public ValueAnimator E;
    public m F;
    public LiveTreasureBoxMessage$LiveTreasureBoxShow G;
    public a0$b H;
    public c$a I;
    public a$b J;
    public f$c K;
    public b0$b L;
    public a M;
    public k$b N;
    public ViewGroup p;
    public ViewGroup q;
    public View r;
    public View s;
    public ViewGroup t;
    public ViewGroup u;
    public ViewGroup v;
    public LiveActivityRedPacketBaseUserInfoView w;
    public KwaiImageView x;
    public ImageView y;
    public KwaiImageView z;
    public static final String O = "k";
    public static final int P = 0;
    public static final int Q = 0;
    public static final int R = 0;
    public static final int S = 0;
    public static final String T;
    public static final String U;
    public static String sLivePresenterClassName;

    static {
       k.P = a1.e(252.00f);
       k.Q = a1.e(132.00f);
       k.R = a1.e(258.00f);
       k.S = - a1.e(68.00f);
       k.T = a1.p(0x7f060005);
       k.U = a1.p(0x7f060006);
    }
    public void k(){
       super();
       this.N = new k$a(this);
       this.U7(new f());
       this.U7(new b0());
       this.U7(new c());
       this.U7(new a());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.X7(f.a(LiveShareStatusEvent.class, new j(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       k tE = this.E;
       if (tE != null) {
          tE.cancel();
       }
       return;
    }
    public final void P8(LiveShareStatusEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "16")) {
          return;
       }
       if (p0.a == LiveShareStatusEvent$LiveShareStatus.SUCCESS && p0.b instanceof a) {
          a b = this.M.b;
          if (b != null) {
             a0 a2 = b.A2;
             if (a2 != null) {
                a2.D0();
             }
          }
          p0 = p0.b;
          if (this.F.n().d(p0.a) == null) {
             b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, k.O+": shareGrab grab token null redPacketId:"+p0.a);
             return;
          }else {
             b.b().c(p0.a, p0.b, p0.c, this.F.n().d(p0.a).mGrabToken).map(new e()).subscribe(j.b, new k(p0));
          }
       }
       return;
    }
    public void R8(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "7")) {
          return;
       }
       this.w.setVisibility(p0);
       this.t.setVisibility(p0);
       this.u.setVisibility(p0);
       this.z.setVisibility(p0);
       this.v.setVisibility(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a1833);
       this.q = p0.findViewById(0x7f0a1830);
       p0.findViewById(R.id.live_activity_red_packet_atmosphere_top_image_view).setVisibility(8);
       p0.findViewById(R.id.live_activity_red_packet_atmosphere_bottom_image_view).setVisibility(8);
       this.A = p0.findViewById(0x7f0a182e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new m());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.F = this.r8("LIVE_BASIC_CONTEXT");
       this.H = this.q8(a0$b.class);
       this.I = this.q8(c$a.class);
       this.J = this.r8("LiveActivityRedPacketBackgroundService");
       this.K = this.r8("LiveActivityRedPacketUserInfoService");
       this.L = this.r8("LiveActivityRedPacketKwaiService");
       this.M = this.q8(a.class);
       return;
    }
}
