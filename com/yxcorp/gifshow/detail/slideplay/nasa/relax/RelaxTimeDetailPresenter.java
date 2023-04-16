package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$b;
import p6a.h;
import p6a.j;
import p6a.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$d;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$5;
import com.yxcorp.gifshow.detail.model.TimeManagementConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed;
import p6a.p;
import p6a.k;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Type;
import uw9.c;
import android.view.TextureView;
import android.widget.FrameLayout$LayoutParams;
import lnc.d2;
import android.view.TextureView$SurfaceTextureListener;
import p6a.e;
import android.view.View$OnClickListener;
import p6a.g;
import p6a.f;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.core.c;
import java.lang.Exception;
import uw9.o;
import java.util.Locale;
import q87.c;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import android.view.Surface;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.app.Activity;
import android.view.ViewGroup;
import com.yxcorp.gifshow.widget.SwipeLayout;
import java.lang.Runnable;
import android.animation.AnimatorSet;
import android.animation.Animator;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import le5.f;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewParent;
import hn5.c;
import xa5.a;
import ro5.a;
import oo5.a;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import android.content.Context;
import lnc.a1;
import m01.a;
import uw9.v3;
import uw9.l0;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import ge5.d;
import joc.a0;
import joc.z;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import android.animation.ObjectAnimator;
import th0.i;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$e;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$f;
import com.yxcorp.utility.SystemUtil;
import apd.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class RelaxTimeDetailPresenter extends PresenterV2	// class@0017b1
{
    public KwaiLoadingView A;
    public QPhoto B;
    public BaseFragment C;
    public SlidePlayViewModel D;
    public NasaBizParam E;
    public b F;
    public Surface G;
    public AnimatorSet H;
    public Animator I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final a Q;
    public final TextureView$SurfaceTextureListener R;
    public final Runnable S;
    public final Runnable T;
    public final Runnable U;
    public final a V;
    public final b$b W;
    public final IMediaPlayer$OnInfoListener X;
    public final DefaultLifecycleObserver Y;
    public SwipeLayout p;
    public ViewGroup q;
    public View r;
    public TextureView s;
    public View t;
    public View u;
    public View v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    public void RelaxTimeDetailPresenter(){
       super();
       this.N = true;
       this.O = 720;
       this.P = 1080;
       this.Q = new RelaxTimeDetailPresenter$a(this);
       this.R = new RelaxTimeDetailPresenter$b(this);
       this.S = new h(this);
       this.T = new j(this);
       this.U = new i(this);
       this.V = a.b;
       this.W = new RelaxTimeDetailPresenter$c(this);
       this.X = new RelaxTimeDetailPresenter$d(this);
       this.Y = new RelaxTimeDetailPresenter$5(this);
    }
    public void E8(){
       TimeManagementConfig timeManageme = TimeManagementConfig.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RelaxTimeDetailPresenter.class, "4")) {
          return;
       }
       boolean b = false;
       this.K = b;
       this.L = b;
       this.M = b;
       this.N = true;
       String str = "6";
       if (!PatchProxy.applyVoidWithListener(objArray, this, RelaxTimeDetailPresenter.class, str)) {
          LinearLayout$LayoutParams layoutParams = this.y.getLayoutParams();
          layoutParams.topMargin = (int)((float)this.V8() * 0.11f);
          this.y.setLayoutParams(layoutParams);
          this.u.getLayoutParams().height = this.V8();
          if (p.a(this.B.mEntity) <= 0) {
             PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, str);
          }else {
             this.t.setClipToOutline(true);
             this.t.setOutlineProvider(new k(this));
             TimeManagementConfig timeManageme1 = c.x(timeManageme);
             if (timeManageme1 != null) {
                TimeManagementConfig mWidth = timeManageme1.mWidth;
                if (mWidth > null) {
                   timeManageme1 = timeManageme1.mHeight;
                   if (timeManageme1 > null) {
                      this.O = mWidth;
                      this.P = timeManageme1;
                      FrameLayout$LayoutParams layoutParams1 = this.s.getLayoutParams();
                      int i = this.V8();
                      layoutParams1.height = i;
                      layoutParams1.width = (int)(((float)this.O / (float)this.P) * (float)i);
                      layoutParams1.gravity = 48;
                      layoutParams1.leftMargin = (int)((float)(d2.f() - layoutParams1.width) / 2.00f);
                      this.s.setLayoutParams(layoutParams1);
                   }
                }
             }
             this.s.setSurfaceTextureListener(this.R);
             this.y.setOnClickListener(new e(this));
             this.z.setOnClickListener(new g(this));
             if (p.a(this.B.mEntity) == 1) {
                this.w.setText(R.string.arg_RES_7f104cf5);
                this.x.setText(R.string.arg_RES_7f104cf4);
             }else {
                this.w.setText(R.string.arg_RES_7f104cf7);
                this.x.setText(R.string.arg_RES_7f104cf6);
             }
             this.W8();
             this.t.setOnClickListener(new f(this));
             PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, str);
          }
       }
       if (!PatchProxy.applyVoidWithListener(objArray, this, RelaxTimeDetailPresenter.class, "7")) {
          if (p.a(this.B.mEntity) <= 0) {
             PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "7");
          }else {
             timeManageme = c.x(timeManageme);
             if (timeManageme == null) {
                PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "7");
             }else if(p.a(this.B.mEntity) == 1){
                timeManageme = timeManageme.mTimeManagementRestUrl;
             }else {
                timeManageme = timeManageme.mTimeManagementSleepUrl;
             }
             d uod = new d("relaxTimeCard");
             uod.setBizFt(":ks-features:ft-feed:detail");
             uod.setNormalUrl(timeManageme, true);
             String cacheKey = CacheKeyUtil.getCacheKey(timeManageme, b);
             try{
                uod.setCacheKey(cacheKey);
                this.F = c.a(uod);
             }catch(java.lang.Exception e2){
                e2.printStackTrace();
                Object[] objArray1 = new Object[true];
                objArray1[b] = timeManageme;
                Object[] objArray2 = new Object[b];
                o.C().t("RelaxTimeDetailPresenter", String.format(Locale.US, "[initVideoPlayer] KpMidVodHlsBuilder.createPlayer fail, %s", objArray1), objArray2);
             }
             this.F.setLooping(true);
             this.F.w(this.W);
             this.F.addOnInfoListener(this.X);
             RelaxTimeDetailPresenter tG = this.G;
             if (tG != null) {
                this.F.setSurface(tG);
             }
             this.F.prepareAsync();
             this.A.setVisibility(b);
             PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "7");
          }
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.C.getParentFragment());
       this.D = slidePlayVie;
       slidePlayVie.P(this.C, this.Q);
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "4");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "2")) {
          return;
       }
       this.q = this.getActivity().findViewById(0x1020002);
       this.p = this.getActivity().findViewById(0x7f0a3c34);
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "2");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "20")) {
          return;
       }
       this.X8();
       RelaxTimeDetailPresenter tD = this.D;
       if (tD != null) {
          tD.D(this.C, this.Q);
       }
       this.s.removeCallbacks(this.T);
       this.s.removeCallbacks(this.S);
       this.s.removeCallbacks(this.U);
       tD = this.H;
       if (tD != null) {
          tD.cancel();
       }
       tD = this.I;
       if (tD != null) {
          tD.cancel();
       }
       tD = this.F;
       if (tD != null) {
          tD.O(this.W);
          this.F.removeOnInfoListener(this.X);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "20");
       return;
    }
    public void P8(boolean p0){
       if (PatchProxy.isSupport2(RelaxTimeDetailPresenter.class, "16") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, RelaxTimeDetailPresenter.class, "16")) {
          return;
       }
       if (this.E.getNasaSlideParam().isHomePage() || (this.E.getNasaSlideParam().isTrendingPage() && f.b())) {
          this.D.s2().setClipChildren((p0 ^ 0x01));
          this.D.s2().setClipToPadding((p0 ^ 0x01));
          ViewGroup parent = this.D.s2().getParent();
          parent.setClipChildren((p0 ^ 0x01));
          parent.setClipToPadding((p0 ^ 0x01));
          parent.getParent().setClipChildren((p0 ^ 0x01));
          parent.getParent().setClipToPadding((p0 ^ 0x01));
          this.D.s2().N(p0, true);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "16");
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "11")) {
          return;
       }
       RelaxTimeDetailPresenter tt = this.t;
       tt.setPivotX(((float)tt.getWidth() / 2.00f));
       tt = this.t;
       tt.setPivotY(((float)tt.getHeight() / 4.00f));
       this.L = true;
       tt = this.H;
       if (tt != null) {
          tt.cancel();
          this.H.start();
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "11");
       return;
    }
    public void S8(boolean p0){
       if (PatchProxy.isSupport2(RelaxTimeDetailPresenter.class, "17") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, RelaxTimeDetailPresenter.class, "17")) {
          return;
       }
       if (this.getActivity() instanceof c) {
          int i = 16;
          if (a.h(this.C)) {
             a.p(this.C, p0);
             a.o(this.C, p0, i);
          }
          boolean b = false;
          if (p0) {
             a.j(this.C, b);
          }else {
             a.e(this.C, b);
          }
          a.i(this.C, p0, i);
          q.p0(this.getActivity()).w0(p0, 17);
          String str = "18";
          if (!PatchProxy.isSupport2(RelaxTimeDetailPresenter.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, RelaxTimeDetailPresenter.class, str)) {
             if (p0) {
                RelaxTimeDetailPresenter tr = this.r;
                if (tr != null) {
                   this.q.removeView(tr);
                }
             }else if(this.r == null){
                this.r = new View(this.getContext());
                FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, a1.d(0x7f070254));
                layoutParams.gravity = 80;
                this.r.setLayoutParams(layoutParams);
                this.r.setOnClickListener(a.b);
             }
             this.q.addView(this.r);
             PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, str);
          }
       }
       RelaxTimeDetailPresenter tp = this.p;
       if (tp != null) {
          tp.n(p0, 26);
       }
       this.D.d(p0, 25);
       l0 ol0 = this.D.M0();
       if (ol0 != null) {
          ol0.G1.onNext(Boolean.valueOf((p0 ^ 0x01)));
       }
       Activity activity = this.getActivity();
       if (activity != null && (!activity.isFinishing() && activity instanceof PhotoDetailActivity)) {
          d uod = activity.p();
          if (uod == null) {
             PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "17");
             return;
          }else if(p0){
             uod.b().g(26);
          }else {
             uod.b().a(26);
          }
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "17");
       return;
    }
    public final int V8(){
       RelaxTimeDetailPresenter relaxTimeDet = RelaxTimeDetailPresenter.class;
       Object obj = PatchProxy.applyWithListener(null, this, relaxTimeDet, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = n.j(this.getActivity());
       if (i <= 0) {
          i = d2.e();
       }
       PatchProxy.onMethodExit(relaxTimeDet, "5");
       return i;
    }
    public final void W8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "8")) {
          return;
       }
       this.Z8();
       this.H = new AnimatorSet();
       this.I = ObjectAnimator.ofFloat(this.v, "alpha", new float[2]{0,0x3f800000});
       float[] uofloatArray = new float[]{0x3f800000,((((float)this.V8() * 0.30f) * (float)this.O) / (float)this.P) / (float)d2.f()};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.t, "scaleX", uofloatArray),ObjectAnimator.ofFloat(this.t, "scaleY", new float[2]{0x3f800000,0x3e99999a})};
       this.H.playTogether(uAnimatorArr);
       this.H.setDuration(800);
       this.H.setInterpolator(new i());
       this.I.setDuration(400);
       this.I.setInterpolator(new i());
       this.H.addListener(new RelaxTimeDetailPresenter$e(this));
       this.I.addListener(new RelaxTimeDetailPresenter$f(this));
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "8");
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "22")) {
          return;
       }
       RelaxTimeDetailPresenter tF = this.F;
       if (tF != null) {
          tF.release();
          Object[] objArray = new Object[0];
          o.C().w("RelaxTimeDetailPresenter", "Player release", objArray);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "22");
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "21")) {
          return;
       }
       if (SystemUtil.a(23)) {
          RelaxTimeDetailPresenter tG = this.G;
          if (tG != null) {
             tG.release();
             this.G = null;
          }
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "21");
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "9")) {
          return;
       }
       this.t.setScaleX(0x3f800000);
       this.t.setScaleY(0x3f800000);
       this.v.setVisibility(8);
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "9");
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "10")) {
          return;
       }
       if (this.J != null && this.K != null) {
          this.F.start();
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "10");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RelaxTimeDetailPresenter.class, "3")) {
          return;
       }
       this.t = j.b(p0, 0x7f0a3571);
       this.u = j.b(p0, 0x7f0a356e);
       this.s = j.b(p0, 0x7f0a3570);
       this.v = j.b(p0, 0x7f0a356a);
       this.w = j.b(p0, 0x7f0a356d);
       this.x = j.b(p0, 0x7f0a356f);
       this.y = j.b(p0, 0x7f0a3572);
       this.z = j.b(p0, 0x7f0a356b);
       this.A = j.b(p0, 0x7f0a356c);
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "3");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter.class, "1")) {
          return;
       }
       this.B = this.q8(QPhoto.class);
       this.C = this.q8(BaseFragment.class);
       this.E = this.q8(NasaBizParam.class);
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter.class, "1");
       return;
    }
}
