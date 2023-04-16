package com.kuaishou.commercial.splash.d0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.a;
import yy.f2;
import com.kuaishou.commercial.splash.d0$a;
import com.kuaishou.commercial.splash.z;
import com.kuaishou.commercial.splash.d0$b;
import com.kuaishou.commercial.splash.presenter.SplashEyemaxPhotoSyncPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gz.e3;
import com.kuaishou.commercial.splash.presenter.q0;
import com.kuaishou.commercial.splash.presenter.c1;
import com.kuaishou.commercial.splash.presenter.y0;
import gz.u;
import gz.f2;
import gz.v3;
import gz.m2;
import gz.y3;
import gz.g3;
import gz.p3;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter;
import gz.l3;
import gz.i1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.kuaishou.commercial.splash.presenter.r0;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import yy.d2;
import erd.g;
import crd.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.View;
import yx.j0;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import tkd.b;
import tkd.d;
import nl9.h0;
import androidx.fragment.app.c;
import yy.i2;
import androidx.fragment.app.c$b;
import wkd.b;
import tjc.c;
import tjc.b;
import gz.s;
import java.lang.Runnable;
import ekd.k1;
import yy.c2;
import com.kuaishou.commercial.splash.b0;
import p5a.e;
import de5.a;
import yy.b2;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.kuaishou.commercial.splash.d0$c;
import com.kwai.framework.player.multisource.e;
import p5a.c;
import vy6.a;
import java.util.List;
import tc6.a;
import rkd.b;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import android.content.Context;
import com.kuaishou.commercial.splash.presenter.h;
import yy.g2;
import t45.c;
import java.util.Set;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.sdk.switchconfig.a;
import gz.k3;
import java.lang.StringBuilder;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import yy.j2;
import android.view.animation.Animation$AnimationListener;
import yy.e2;
import com.kuaishou.commercial.splash.c0;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;
import com.kuaishou.commercial.splash.SplashUtils;
import yy.z1;
import msd.q;
import com.yxcorp.gifshow.util.l;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import o56.f;
import yy.x0;
import com.kuaishou.commercial.splash.i;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import yy.m2;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import sc6.c;
import mrd.c;

public class d0 extends a implements g	// class@0015a9
{
    public View A;
    public PublishSubject B;
    public c C;
    public f D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public View I;
    public View J;
    public View K;
    public View L;
    public View M;
    public KwaiImageView N;
    public View O;
    public View P;
    public SlidePlayViewModel Q;
    public r0 R;
    public boolean S;
    public boolean T;
    public final Runnable U;
    public final b U0;
    public boolean V;
    public final View$OnLayoutChangeListener V0;
    public boolean W;
    public final a W0;
    public boolean X;
    public b Y;
    public f Z;
    public QPhoto r;
    public a s;
    public f t;
    public List u;
    public BaseFragment v;
    public f w;
    public PublishSubject x;
    public boolean y;
    public c z;
    public static final int X0;

    public void d0(int p0){
       super();
       this.y = true;
       this.G = -1000;
       this.H = -1000;
       this.U = new f2(this);
       this.V = false;
       this.U0 = new d0$a(this);
       this.V0 = new z(this);
       this.W0 = new d0$b(this);
       this.U7(new SplashEyemaxPhotoSyncPresenter());
       this.U7(new e3());
       this.U7(new q0());
       this.U7(new c1());
       this.U7(new y0());
       this.U7(new u());
       this.U7(new f2());
       switch (p0){
           case 1:
             this.R8();
             this.U7(new l3());
             break;
           case 2:
             this.U7(new SplashShakePresenter());
             break;
           case 3:
             this.U7(new p3());
             break;
           case 5:
             this.R8();
             this.U7(new g3());
             break;
           case 6:
             this.R8();
             this.U7(new y3());
             break;
           case 7:
             this.R8();
             this.U7(new m2());
             break;
           case 8:
             this.U7(new v3());
             break;
           default:
       }
       this.U7(new i1());
       return;
    }
    public void E8(){
       d0 uod0 = d0.class;
       if (PatchProxy.applyVoid(null, this, uod0, "5")) {
          return;
       }
       if (this.I != null) {
          d0 tw = this.w;
          if (tw != null) {
             r0 or0 = tw.get();
             this.R = or0;
             if (or0 == null) {
                return;
             }else {
                Activity activity = this.getActivity();
                if (activity == null) {
                   return;
                }else if(!l.j(this.r.mEntity)){
                   return;
                }else if(activity instanceof GifshowActivity){
                   Activity uActivity = activity;
                   if (!PatchProxy.applyVoidOneRefs(uActivity, this, uod0, "6")) {
                      b uob = uActivity.m().subscribe(new d2(this));
                      this.Y = uob;
                      this.X7(uob);
                   }
                }
                this.Q = SlidePlayViewModel.S0(this.v.getParentFragment());
                this.A = activity.findViewById(0x1020002);
                int i = -536296199;
                if (!PatchProxy.applyVoid(null, this, uod0, "12")) {
                   int i1 = 0;
                   Object[] objArray = new Object[i1];
                   j0.f("SplashTopPlayControlPresenter", "setSplashingCover", objArray);
                   if (this.W == null) {
                      a.k(this.m8(), R.layout.arg_RES_7f0d08bd, true);
                      int i2 = 8;
                      this.m8().findViewById(R.id.splash_video_cover).setVisibility(i2);
                      this.W = true;
                      d0 tP = this.P;
                      if (tP instanceof ScaleHelpView) {
                         tP.setScaleEnabled(i1);
                      }
                      tP = this.O;
                      if (tP != null) {
                         tP.setVisibility(i2);
                      }
                      tP = this.I;
                      if (tP != null) {
                         tP.setVisibility(i2);
                         this.B.onNext(Boolean.FALSE);
                      }
                      this.Y8(i2);
                      d.a(i).Li(true);
                      if (this.v.getFragmentManager() != null) {
                         this.v.getFragmentManager().registerFragmentLifecycleCallbacks(new i2(this), i1);
                      }else {
                         this.W8();
                      }
                   }
                }
                d.a(i).b70(b.a(-1608526086).a());
                k1.r(this.U, this.R.g);
                tw = this.x;
                if (tw != null) {
                   this.X7(tw.subscribe(new c2(this), b0.b));
                }
                this.s.getPlayer().addOnInfoListener(new b2(this));
                this.s.getPlayer().d(new d0$c(this));
                tw = this.Q;
                if (tw != null) {
                   tw.P(this.v, this.W0);
                }else {
                   tw = this.u;
                   if (tw != null) {
                      tw.add(this.W0);
                   }
                }
                this.z.e(this.U0);
                if (!PatchProxy.applyVoid(null, this, uod0, "10") && (!b.g() && this.X == null)) {
                   this.X = true;
                   this.A.addOnLayoutChangeListener(this.V0);
                }
             label_016f :
                CommercialSplashTracker.E().V(null, this.L.getContext());
                if (!PatchProxy.applyVoid(null, this, uod0, "7")) {
                   c.a(new g2(this));
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "18")) {
          return;
       }
       d0 tI = this.I;
       if (tI != null) {
          tI.setAlpha(0x3f800000);
          int i = 0;
          this.I.setVisibility(i);
          this.Y8(i);
       }
       tI = this.Q;
       if (tI != null) {
          tI.D(this.v, this.W0);
       }else {
          tI = this.u;
          if (tI != null) {
             tI.remove(this.W0);
          }
       }
       this.z.b.remove(this.U0);
       if (!b.g()) {
          tI = this.A;
          if (tI != null) {
             tI.removeOnLayoutChangeListener(this.V0);
          }
       }
       ViewGroup$MarginLayoutParams layoutParams = this.L.getLayoutParams();
       d0 tG = this.G;
       if (tG != -1000) {
          layoutParams.leftMargin = tG;
       }
       tG = this.H;
       if (tG != -1000) {
          layoutParams.topMargin = tG;
       }
       this.L.setLayoutParams(layoutParams);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "4")) {
          return;
       }
       if (a.t().d("splashInteractionDebugLog", false)) {
          this.U7(new k3());
       }
       return;
    }
    public void S8(){
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "22")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       j0.f("SplashTopPlayControlPresenter", "displayFinish mDisplayFinished:"+this.S, objArray1);
       if (this.S != null) {
          return;
       }
       this.S = true;
       if (!PatchProxy.applyVoid(objArray, this, uod0, "20")) {
          View view = this.m8().findViewById(R.id.splash_video_cover);
          if (view != null) {
             AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
             uAlphaAnimat.setDuration(300);
             view.startAnimation(uAlphaAnimat);
             uAlphaAnimat.setAnimationListener(new j2(this, view));
             if (this.V != null) {
                view.setVisibility(8);
             }
          }
          k1.r(new e2(view), 500);
       }
       k1.r(new c0(this), 300);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashTopPlayControlPresenter", "enterFullScreen", objArray);
       Activity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       Window window = activity.getWindow();
       if (window != null) {
          boolean b = true;
          this.E = b;
          window.clearFlags(2048);
          window.addFlags(1024);
          WindowManager$LayoutParams attributes = window.getAttributes();
          if (Build$VERSION.SDK_INT >= 28) {
             attributes.layoutInDisplayCutoutMode = b;
             window.setAttributes(attributes);
          }
          if (SplashUtils.f()) {
             SplashUtils.A(window);
             l.b(this.m8(), new z1(this));
          }
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashTopPlayControlPresenter", "finishSplash", objArray);
       this.Z8();
       this.S8();
       return;
    }
    public final VerticalViewPager X8(){
       d0 obj = PatchProxy.apply(null, this, d0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q;
       if (obj != null) {
          return obj.s2();
       }
       return null;
    }
    public final void Y8(int p0){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod0, "17")) {
          return;
       }
       uod0 = this.J;
       if (uod0 != null) {
          uod0.setVisibility(p0);
       }
       uod0 = this.K;
       if (uod0 != null) {
          uod0.setVisibility(p0);
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SplashTopPlayControlPresenter", "splashOver", objArray);
       k1.m(this.U);
       b.a(-1608526086).a0();
       CommercialSplashTracker.E().W(this.L.getContext());
       d.a(-536296199).Li(0);
       return;
    }
    public final void a9(){
       d0 uod0 = d0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod0, "23")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       j0.f("SplashTopPlayControlPresenter", "splashTimer:", objArray1);
       k1.m(this.U);
       this.S8();
       if (!SplashUtils.I()) {
          RxBus.f.b(new x(this.r));
          if (b.g()) {
             Activity uActivity = f.a();
             if (uActivity != null) {
                uActivity.setRequestedOrientation(-1);
             }
          }
          d.a(-536296199).Qu(this.r.getEntity());
          if (!PatchProxy.applyVoid(objArray, this, uod0, "24")) {
             Object[] objArray2 = new Object[0];
             j0.f("SplashTopPlayControlPresenter", "logEnterDetail:", objArray2);
             uod0 = this.t;
             if (uod0 != null) {
                uod0.get().s();
             }
          }
       }
    label_006f :
       if (this.T == null) {
          uod0 = this.t;
          if (uod0 != null) {
             uod0.get().f(i.r);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.I = m1.f(p0, 0x7f0a30cf);
       this.J = m1.f(p0, 0x7f0a400c);
       this.K = m1.f(p0, 0x7f0a04db);
       this.L = m1.f(p0, 0x7f0a3120);
       this.M = m1.f(p0, 0x7f0a3e7f);
       this.N = m1.f(p0, 0x7f0a319f);
       this.O = m1.f(p0, 0x7f0a302f);
       this.P = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d0.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d0.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d0.class, new m2());
       }else {
          obj.put(d0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(a.class);
       this.t = this.x8("SPLASH_AD_LOG");
       this.u = this.t8("DETAIL_ATTACH_LISTENERS");
       this.v = this.r8("DETAIL_FRAGMENT");
       this.w = this.w8("SPLASH_VIDEO_TYPE_PARAM");
       this.x = this.t8("SPLASH_ENHANCE_DISPLAY_EVENT");
       this.z = this.r8("DETAIL_SURFACE_LISTENERS");
       this.C = this.r8("SPLASH_VIEW_SHOW_EVENT");
       this.B = this.r8("SPLASH_EYEMAX_PLAY_COVER_VISIBLE_STATE_CHANGED");
       this.Z = this.x8("SPLASH_EYEMAX_FULL_SCREEN_ADAPTER");
       this.D = this.x8("HAS_TOKEN");
       return;
    }
}
