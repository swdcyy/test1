package com.kuaishou.live.common.core.component.like.i;
import im8.g;
import k51.c;
import lnc.a1;
import com.kuaishou.live.common.core.component.like.a;
import com.kuaishou.live.common.core.component.like.i$a;
import w4.e;
import java.lang.Object;
import com.airbnb.lottie.LottieAnimationView;
import android.os.Build$VERSION;
import android.widget.ImageView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.widget.RelativeLayout;
import go1.o;
import android.view.ViewOutlineProvider;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Math;
import java.lang.Boolean;
import android.util.Property;
import com.kuaishou.live.common.core.component.like.i$b;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import ekd.m1;
import com.kuaishou.live.common.core.component.like.widget.LiveLikeNewStyleTopBarTextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import go1.v;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import lo1.c;
import lp3.e;

public class i extends c implements g	// class@00146a
{
    public RelativeLayout A;
    public ImageView B;
    public ProgressBar C;
    public LiveLikeNewStyleTopBarTextView D;
    public LiveLikeNewStyleTopBarTextView E;
    public LottieAnimationView F;
    public LottieAnimationView G;
    public LottieAnimationView H;
    public KwaiBindableImageView I;
    public KwaiBindableImageView J;
    public b K;
    public AnimatorSet L;
    public AnimatorSet M;
    public AnimatorSet N;
    public ObjectAnimator O;
    public a P;
    public ObjectAnimator Q;
    public AnimatorSet R;
    public Handler S;
    public e T;
    public m U;
    public LiveStreamFeedWrapper V;
    public c W;
    public Uri X;
    public l Y;
    public final c p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public RelativeLayout y;
    public RelativeLayout z;
    public static final int Z = 0;
    public static String sLivePresenterClassName = "LiveLikeNewStyleTopBarPresenter";

    static {
       i.Z = a1.d(0x7f070809);
    }
    public void i(){
       super();
       this.p = a.b;
       this.Y = new i$a(this);
    }
    public static Object P8(i p0,e p1){
       p0.W8(p1);
       return null;
    }
    private Object W8(e p0){
       this.F.setSpeed(2.00f);
       this.F.setComposition(p0);
       if (Build$VERSION.SDK_INT > 21) {
          this.B.setElevation(2.00f);
       }
       this.F.s();
       return null;
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       this.S = new Handler();
       this.q = true;
       this.G.setVisibility(8);
       this.H.setVisibility(8);
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          this.A.setClipToOutline(true);
          this.A.setOutlineProvider(new o(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.R8();
       this.q = false;
       this.r = false;
       this.s = false;
       this.t = false;
       this.S.removeCallbacksAndMessages(null);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "18")) {
          return;
       }
       i tL = this.L;
       if (tL != null) {
          tL.end();
          this.L.cancel();
          this.L.removeAllListeners();
       }
       tL = this.M;
       if (tL != null) {
          tL.end();
          this.M.cancel();
          this.M.removeAllListeners();
       }
       tL = this.F;
       if (tL != null) {
          tL.f();
          this.F.t();
       }
       tL = this.N;
       if (tL != null) {
          tL.cancel();
          this.N.removeAllListeners();
       }
       tL = this.Q;
       if (tL != null) {
          tL.end();
          this.Q.cancel();
          this.Q.removeAllListeners();
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, i.class, "21")) {
          return;
       }
       this.B.forceHasOverlappingRendering(false);
       this.C.forceHasOverlappingRendering(false);
       this.E.forceHasOverlappingRendering(false);
       this.F.forceHasOverlappingRendering(false);
       this.I.forceHasOverlappingRendering(false);
       return;
    }
    public int V8(){
       i obj = PatchProxy.apply(null, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj == null) {
          obj = this.z;
       }
       return Math.max(obj.getWidth(), i.Z);
    }
    public void X8(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "13")) {
          return;
       }
       if (p0) {
          this.L = new AnimatorSet();
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.B, View.ROTATION, new float[3]{0,0x41800000,0}).setDuration(100);
          this.Q = objectAnimat;
          objectAnimat.setRepeatCount(-1);
          this.Q.start();
          this.L.addListener(new i$b(this));
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.B, View.SCALE_X, new float[2]{0x3f800000,0x3f000000}).setDuration(200),ObjectAnimator.ofFloat(this.B, View.SCALE_Y, new float[2]{0x3f800000,0x3f000000}).setDuration(200)};
          this.L.playTogether(uAnimatorArr);
          this.L.start();
       }else {
          this.R8();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a334f);
       this.y = m1.f(p0, 0x7f0a18b1);
       this.A = m1.f(p0, 0x7f0a209c);
       this.B = m1.f(p0, 0x7f0a209d);
       this.C = m1.f(p0, 0x7f0a2098);
       this.D = m1.f(p0, 0x7f0a2095);
       this.E = m1.f(p0, 0x7f0a209a);
       this.F = m1.f(p0, 0x7f0a209e);
       this.I = m1.f(p0, 0x7f0a189d);
       this.J = m1.f(p0, 0x7f0a189c);
       this.G = m1.f(p0, 0x7f0a2097);
       this.H = m1.f(p0, 0x7f0a2096);
       if (Build$VERSION.SDK_INT >= 24) {
          this.S8();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new v());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.U = this.t8("LIVE_BASIC_CONTEXT");
       this.V = this.t8("LIVE_PHOTO");
       this.W = this.r8("LIVE_HEART_PARTICLE_SERVICE");
       this.T = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
