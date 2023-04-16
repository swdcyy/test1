package com.kuaishou.commercial.splash.presenter.w0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import gz.q4;
import com.kuaishou.commercial.splash.presenter.w0$a;
import gz.p4;
import gz.t4;
import gz.u4;
import gz.r4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kuaishou.commercial.splash.presenter.r0;
import android.app.Activity;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import android.view.View;
import yx.j0;
import com.yxcorp.gifshow.util.t0;
import gz.s;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.core.b;
import android.net.Uri;
import java.io.File;
import j80.g;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.builder.PlayerCommonBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import com.kuaishou.commercial.splash.i;
import nc6.d;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import sc6.b;
import gz.x4;
import com.kuaishou.commercial.splash.presenter.v0;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.commercial.splash.presenter.u0;
import com.kuaishou.commercial.splash.presenter.s0;
import nc6.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import gz.y4;
import android.animation.Animator$AnimatorListener;
import android.view.View$OnLayoutChangeListener;
import gz.w4;
import com.kuaishou.commercial.splash.presenter.t0;
import java.lang.Runnable;
import ekd.k1;
import yy.x0;
import java.lang.StringBuilder;
import bz.a;
import gz.s4;
import ai7.e;
import io.reactivex.subjects.PublishSubject;
import android.view.Surface;
import mrd.c;

public class w0 extends PresenterV2	// class@001610
{
    public boolean A;
    public long B;
    public r0 C;
    public boolean D;
    public b E;
    public Surface F;
    public boolean G;
    public boolean H;
    public t0 I;
    public boolean J;
    public View K;
    public final Runnable L;
    public String M;
    public final b N;
    public final View$OnLayoutChangeListener O;
    public final IMediaPlayer$OnErrorListener P;
    public final IMediaPlayer$OnPreparedListener Q;
    public final b$b R;
    public f p;
    public f q;
    public PublishSubject r;
    public t s;
    public f t;
    public PublishSubject u;
    public c v;
    public KwaiContentFrame w;
    public View x;
    public View y;
    public boolean z;

    public void w0(){
       super();
       this.A = false;
       this.B = a.t().b("normalVideoOverTime", 0);
       this.L = new q4(this);
       this.N = new w0$a(this);
       this.O = new p4(this);
       this.P = new t4(this);
       this.Q = new u4(this);
       this.R = new r4(this);
    }
    public void E8(){
       s a;
       w0 ow0 = w0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ow0, "3")) {
          return;
       }
       r0 or0 = this.q.get();
       this.C = or0;
       if (or0 == null) {
          this.R8();
          return;
       }else if(this.y == null || this.getActivity() == null){
          this.R8();
          return;
       }else {
          int i = 2;
          int i1 = 0;
          if (a.t().d("enableSplashSurfaceView", true)) {
             this.w.setSurfaceType(i);
          }else {
             this.w.setSurfaceType(i1);
          }
          this.K = this.getActivity().findViewById(0x1020002);
          if (!PatchProxy.applyVoid(objArray, this, ow0, "13")) {
             this.x.bringToFront();
             this.y.setVisibility(8);
          }
          int i2 = 0;
          if (!PatchProxy.applyVoid(objArray, this, ow0, "8")) {
             Object[] objArray1 = new Object[i1];
             String str = "SplashAdVideoPlayPresen";
             j0.f(str, "initPlayer", objArray1);
             this.I = new t0();
             a = this.C.a;
             b uob = PatchProxy.applyOneRefs(a, this, ow0, "9");
             if (uob != PatchProxyResult.class) {
             }else {
                File uFile = g.b(a);
                if (uFile != null && uFile.exists()) {
                   d uod1 = new d("FeedSplash");
                   uod1.setBizFt(":ks-features:ft-commercial:commercial-splash");
                   uod1.setNormalUrl(uFile.getAbsolutePath(), true);
                   if (a.t().d("enableHwDecForSplashVideoPlayback", i1)) {
                      uod1.setMediaCodecPolicy(true);
                   }
                   if (a.t().d("enableStartOnPrepareForSplashVideoPlayback", i1)) {
                      uod1.setStartPlayType(i);
                   }
                   try{
                      uob = c.a(uod1);
                   }catch(java.lang.Exception e2){
                      j0.b(str, "KpMidVodHlsBuilder.createPlayer, bizType:FeedSplash", e2);
                   }
                   uob = objArray;
                }else {
                   objArray1 = new Object[i1];
                   j0.c(str, "file check failed ", objArray1);
                   goto label_00e0 ;
                }
             }
             if (uob == null) {
                this.S8(i.w);
             }else {
                this.E = uob;
                d uod = uob.x();
                if (uod != null) {
                   uod.e(true);
                   uod.g(this.M);
                   this.getActivity();
                }
                this.E.addOnPreparedListener(this.Q);
                this.E.w(this.R);
                this.E.addOnErrorListener(this.P);
                this.E.setLooping(this.C.T);
                this.E.setVolume(i2, i2);
                this.E.prepareAsync();
                this.w.setPlayer(this.E);
                this.w.b(this.N);
                this.t.set(this.E);
             }
          }
          this.X7(this.s.subscribe(new x4(this), ow0.b));
          this.X7(this.r.subscribe(new u0(this), s0.b));
          this.M = a.a();
          if (!PatchProxy.applyVoid(objArray, this, ow0, "24")) {
             w0 tx = this.x;
             Property aLPHA = View.ALPHA;
             float[] uofloatArray = new float[i];
             uofloatArray[i1] = 0x3f800000;
             if (this.C.L != null) {
                i2 = 0x3f800000;
             }
             uofloatArray[1] = i2;
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tx, aLPHA, uofloatArray);
             objectAnimat.setDuration(600);
             objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
             objectAnimat.start();
             objectAnimat.addListener(new y4(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, ow0, "7") && this.J == null) {
             this.J = true;
             ow0 = this.K;
             if (ow0 != null) {
                ow0.addOnLayoutChangeListener(this.O);
             }
          }
          this.X7(this.u.subscribe(new w4(this), t0.b));
          k1.r(this.L, this.C.g);
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "6")) {
          return;
       }
       this.w.x();
       k1.m(this.L);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, w0.class, "5")) {
          return;
       }
       if (this.C == null) {
          return;
       }
       w0 tI = this.I;
       if (tI != null) {
          tI.a();
       }
       tI = this.K;
       if (tI != null) {
          tI.removeOnLayoutChangeListener(this.O);
       }
       this.w.z(this.N);
       this.w.setPlayer(objArray);
       tI = this.E;
       if (tI != null) {
          tI.O(this.R);
          this.E.removeOnPreparedListener(this.Q);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "23")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("SplashAdVideoPlayPresen", "timeout DisplayFinish", objArray);
       if (this.p.get() != null) {
          this.p.get().w();
       }
       if (this.A != null) {
          Object[] objArray1 = new Object[i];
          j0.f("SplashAdVideoPlayPresen", "is playing pop show video", objArray1);
          return;
       }else {
          this.R8();
          if (this.G == null) {
             x0 ox0 = this.p.get();
             if (ox0 != null) {
                ox0.f(i.r);
             }
          }
          return;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdVideoPlayPresen", "displayFinish mDisplayFinished:"+this.H, objArray);
       if (this.H != null) {
          return;
       }
       this.V8(new a(3));
       return;
    }
    public final void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashAdVideoPlayPresen", "exceptionFinish"+this.H+" failReason:"+p0, objArray);
       x0 ox0 = this.p.get();
       if (ox0 != null) {
          ox0.f(p0);
       }
       if (this.H != null) {
          return;
       }else {
          this.V8(new a(1));
          return;
       }
    }
    public final void V8(a p0){
       w0 ow0 = w0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ow0, "19")) {
          return;
       }
       if (this.H != null) {
          return;
       }
       this.H = true;
       k1.m(this.L);
       if (!PatchProxy.applyVoid(null, this, ow0, "20")) {
          ow0 = this.E;
          if (ow0 != null && this.C != null) {
             ow0.releaseAsync(new s4(this));
          }
       }
       if (p0 != null) {
          this.r.onNext(p0);
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "22")) {
          return;
       }
       w0 tE = this.E;
       if (tE != null) {
          tE.setSurface(null);
          tE = this.F;
          if (tE != null) {
             tE.release();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "2")) {
          return;
       }
       this.w = p0.findViewById(0x7f0a3af9);
       this.x = p0.findViewById(0x7f0a0a7a);
       this.y = p0.findViewById(0x7f0a3b07);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w0.class, "1")) {
          return;
       }
       this.p = this.x8("SPLASH_AD_LOG");
       this.q = this.x8("SPLASH_VIDEO_TYPE_PARAM");
       this.r = this.r8("SPLASH_ENHANCE_DISPLAY_EVENT");
       this.s = this.r8("SPLASH_HOLDER_VISIBLE_STATE_CHANGED");
       this.t = this.x8("SPLASH_VIDEO_PLAYER");
       this.u = this.r8("SPLASH_SURPRISED_SHOW_EVENT");
       this.v = this.r8("SPLASH_VIEW_SHOW_EVENT");
       return;
    }
}
