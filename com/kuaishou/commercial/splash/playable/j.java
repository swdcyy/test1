package com.kuaishou.commercial.splash.playable.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.playable.j$a;
import ez.c0;
import ez.e0;
import com.kuaishou.commercial.splash.playable.j$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.SplashInfo;
import tw.l;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.SplashInfo$PlayablePopupInfo;
import yx.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.commercial.splash.playable.h;
import com.kuaishou.commercial.splash.playable.i;
import erd.g;
import crd.b;
import brd.t;
import nc6.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c$b;
import com.yxcorp.gifshow.util.t0;
import android.net.Uri;
import com.kwai.framework.player.core.b;
import java.io.File;
import j80.g;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import nc6.d;
import android.app.Activity;
import ez.f0;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import im8.f;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.imagepipeline.request.ImageRequest;
import android.view.animation.AlphaAnimation;
import ez.i0;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import ez.h0;
import java.lang.Runnable;
import ekd.k1;
import android.view.ViewGroup;
import bz.c;
import io.reactivex.subjects.PublishSubject;
import ez.d0;
import ai7.e;
import android.view.Surface;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class j extends PresenterV2	// class@0015c4
{
    public boolean A;
    public String B;
    public Surface C;
    public boolean D;
    public boolean E;
    public final c$b F;
    public final b$b G;
    public final IMediaPlayer$OnErrorListener H;
    public final TextureView$SurfaceTextureListener I;
    public BaseFeed p;
    public BaseFragment q;
    public PublishSubject r;
    public TextureView s;
    public FrameLayout t;
    public ViewGroup u;
    public KwaiImageView v;
    public f w;
    public SplashInfo$PlayablePopupInfo x;
    public t0 y;
    public b z;

    public void j(){
       super();
       this.F = new j$a(this);
       this.G = new c0(this);
       this.H = new e0(this);
       this.I = new j$b(this);
    }
    public void E8(){
       boolean b;
       Object[] objArray1;
       d uod;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "3")) {
          return;
       }
       if (!d.a(-536296199).bY(this.p)) {
          this.P8();
          return;
       }else {
          SplashInfo splashInfo = l.e(this.p);
          if (l.i(splashInfo)) {
             this.P8();
             return;
          }else {
             this.x = splashInfo.mPlayableInfo.mPlayablePopupInfo;
             Object[] obj = PatchProxy.apply(objArray, this, oj, "5");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                j tx = this.x;
                if (tx == null || tx.mPopupMaterialType != true) {
                   String str1 = "not video popup";
                   if (tx != null && tx.mPopupShowType == 2) {
                      obj = new Object[0];
                      j0.f("SplashPlayablePopupVideoPre", str1, obj);
                      this.P8();
                   }
                   obj = new Object[0];
                   j0.f("SplashPlayablePopupVideoPre", str1, obj);
                   b = true;
                }else {
                   b = false;
                }
             }
             if (b) {
                return;
             }else if(TextUtils.x(this.x.mPopupVideoMaterialUri)){
                objArray1 = new Object[0];
                j0.f("SplashPlayablePopupVideoPre", "video mPopupVideoMaterialUri empty", objArray1);
                return;
             }else {
                this.X7(this.r.subscribe(new h(this), i.b));
                this.B = a.a();
                if (this.q.getFragmentManager() != null) {
                   this.q.getFragmentManager().registerFragmentLifecycleCallbacks(this.F, 0);
                }
                if (!PatchProxy.applyVoid(objArray, this, oj, "6")) {
                   obj = new Object[0];
                   j0.f("SplashPlayablePopupVideoPre", "initPlayer", obj);
                   this.y = new t0();
                   Uri uri = Uri.parse(this.x.mPopupVideoMaterialUri);
                   b uob = PatchProxy.applyOneRefs(uri, this, oj, "8");
                   if (uob != patchProxyRe) {
                   }else {
                      File uFile = g.b(uri);
                      if (uFile != null && uFile.exists()) {
                         uod = new d("CommercialSplash");
                         WayneBuildData wayneBuildDa = uod.setBizFt(":ks-features:ft-commercial:commercial-splash");
                         String str = uri.toString();
                         try{
                            wayneBuildDa.setNormalUrl(str, true);
                            uob = c.a(uod);
                         }catch(java.lang.Exception e0){
                            j0.b("SplashPlayablePopupVideoPre", "KpMidVodHlsBuilder, createPlayer failed ", e0);
                         }
                         uob = objArray;
                      }else {
                         objArray1 = new Object[0];
                         j0.c("SplashPlayablePopupVideoPre", "file check failed ", objArray1);
                         goto label_010c ;
                      }
                   }
                   if (uob == null) {
                      this.P8();
                   }else {
                      this.z = uob;
                      uod = uob.x();
                      if (uod != null) {
                         uod.e(true);
                         uod.g(this.B);
                         this.getActivity();
                      }
                      this.z.addOnPreparedListener(new f0(this));
                      this.s.setSurfaceTextureListener(this.I);
                      this.z.w(this.G);
                      this.z.addOnErrorListener(this.H);
                      this.z.setLooping(true);
                      this.z.setVolume(0x3f800000, 0x3f800000);
                      this.z.prepareAsync();
                      this.w.set(this.z);
                   }
                }
                this.t.setClickable(true);
                if (PatchProxy.applyVoid(objArray, this, oj, "16") || (this.v != null && !TextUtils.x(this.x.mPopupImageMaterialUri))) {
                   this.v.setVisibility(0);
                   this.v.setClickable(true);
                   this.v.setPlaceHolderImage(new ColorDrawable(-1));
                   this.v.A(Uri.parse(this.x.mPopupImageMaterialUri), 0, 0);
                   AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
                   uAlphaAnimat.setDuration(500);
                   uAlphaAnimat.setAnimationListener(new i0(this));
                   this.v.startAnimation(uAlphaAnimat);
                }
             label_01b2 :
                return;
             }
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "14")) {
          return;
       }
       this.R8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPlayablePopupVideoPre", "exceptionFinish", objArray);
       k1.r(new h0(this), 1);
       this.u.setVisibility(8);
       this.r.onNext(new c(2, 1));
       return;
    }
    public void R8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "15")) {
          return;
       }
       if (this.D != null) {
          return;
       }
       this.D = true;
       if (!PatchProxy.applyVoid(objArray, this, oj, "11")) {
          oj = this.z;
          if (oj != null) {
             oj.x().f();
             this.z.releaseAsync(new d0(this));
             this.z.O(this.G);
          }
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, j.class, "10")) {
          return;
       }
       j tz = this.z;
       if (tz != null) {
          tz.setSurface(null);
          tz = this.C;
          if (tz != null) {
             tz.release();
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, j.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashPlayablePopupVideoPre", "startPlayer", objArray);
       this.A = false;
       j tz = this.z;
       if (tz != null) {
          tz.start();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a30ea);
       this.u = m1.f(p0, 0x7f0a3177);
       this.t = m1.f(p0, 0x7f0a30ec);
       this.s = m1.f(p0, 0x7f0a30eb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.s8(BaseFeed.class);
       this.q = this.r8("PLAYABLE_FRAGMENT");
       this.r = this.r8("POPUP_HOLDER_VISIBLE_STATE_CHANGED");
       this.w = this.x8("SPLASH_VIDEO_PLAYER");
       return;
    }
}
