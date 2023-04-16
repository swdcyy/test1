package com.kuaishou.live.core.show.activityredpacket.o;
import im8.g;
import a51.c;
import lnc.a1;
import h22.p;
import com.kuaishou.live.core.show.activityredpacket.o$a;
import com.kuaishou.live.core.show.activityredpacket.user.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter;
import u22.w;
import u22.b0;
import w22.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import y22.q;
import tx1.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kwai.framework.model.user.UserInfo;
import h22.a;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import t02.r1;
import tx1.d;
import tx1.a;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.activityredpacket.q;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.live.core.show.activityredpacket.k$b;
import com.kuaishou.live.core.show.activityredpacket.reward.LiveActivityRedPacketGrabButtonPresenter$d;
import u22.w$b;
import com.kuaishou.live.core.show.activityredpacket.user.f$c;
import u22.b0$b;
import w22.a$b;
import p91.m;

public class o extends c implements g	// class@000968
{
    public View A;
    public LiveActivityRedPacketGrabButtonView B;
    public LiveActivityRedPacketBaseUserInfoView C;
    public LiveActivityRedPacketCoupleUserView D;
    public FrameLayout E;
    public KwaiImageView F;
    public KwaiImageView G;
    public KwaiImageView H;
    public TextView I;
    public ObjectAnimator J;
    public ObjectAnimator K;
    public ObjectAnimator L;
    public AnimatorSet M;
    public ObjectAnimator N;
    public ObjectAnimator O;
    public AnimatorSet P;
    public a Q;
    public k$b R;
    public LiveActivityRedPacketGrabButtonPresenter$d S;
    public w$b T;
    public f$c U;
    public b U0;
    public a V;
    public final Observer V0;
    public b0$b W;
    public o$b W0;
    public a$b X;
    public LiveTreasureBoxMessage$LiveTreasureBoxShow Y;
    public m Z;
    public ViewGroup v;
    public ViewGroup w;
    public View x;
    public KwaiImageView y;
    public KwaiImageView z;
    public static final int X0 = 0;
    public static final int Y0 = 0;
    public static final int Z0 = 0;
    public static final int a1 = 0;
    public static final int b1 = 0;
    public static final int c1 = 0;
    public static String sLivePresenterClassName = "LiveActivityRedPacketPrepareOpenPresenter";

    static {
       o.X0 = a1.e(0x42f20000);
       o.Y0 = a1.e(129.00f);
       o.Z0 = a1.e(112.00f);
       o.a1 = a1.e(158.00f);
       o.b1 = a1.e(100.00f);
       o.c1 = a1.e(0x42fa0000);
    }
    public void o(){
       super();
       this.V0 = new p(this);
       this.W0 = new o$a(this);
       this.U7(new f());
       this.U7(new LiveActivityRedPacketGrabButtonPresenter());
       this.U7(new w());
       this.U7(new b0());
       this.U7(new a());
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       super.J8();
       q.q(this.M);
       q.q(this.P);
       return;
    }
    public final b S8(){
       b obj = PatchProxy.apply(null, this, o.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.a = q.f();
       return obj;
    }
    public final LiveFollowExtParams V8(){
       Object[] objArray = null;
       o obj = PatchProxy.apply(objArray, this, o.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Y;
       if (obj == null) {
          return objArray;
       }
       LiveFollowExtParams$a uoa = new LiveFollowExtParams$a();
       uoa.e(obj.treasureBoxId);
       uoa.f(this.Y.boxType);
       return uoa.a();
    }
    public final boolean W8(){
       o tY = this.Y;
       boolean b = (tY != null && (tY.enableContributorDisplay != null && tY.contributorInfo != null))? true: false;
       return b;
    }
    public void X8(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "11")) {
          return;
       }
       o tV = this.V;
       a b = tV.b;
       if (b != null) {
          b.U.g(new UserProfile(p0), LiveStreamClickType.UNKNOWN, 0, false, 139, this.V8(), this.S8());
       }else {
          a a = tV.a;
          if (a != null) {
             a.Z.d(new UserProfile(p0), LiveStreamClickType.UNKNOWN, 0, false, null, 139, this.V8(), this.S8());
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.v = p0.findViewById(0x7f0a1833);
       this.w = p0.findViewById(0x7f0a1830);
       this.y = p0.findViewById(0x7f0a1836);
       this.z = p0.findViewById(0x7f0a1835);
       this.F = p0.findViewById(0x7f0a182e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(o.class, new q());
       }else {
          obj.put(o.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.R = this.s8(k$b.class);
       this.S = this.r8("LiveActivityRedPacketGrabButtonService");
       this.T = this.q8(w$b.class);
       this.U = this.r8("LiveActivityRedPacketUserInfoService");
       this.V = this.q8(a.class);
       this.W = this.r8("LiveActivityRedPacketKwaiService");
       this.X = this.r8("LiveActivityRedPacketBackgroundService");
       this.Z = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
