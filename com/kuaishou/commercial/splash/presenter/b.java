package com.kuaishou.commercial.splash.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gz.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import gz.u2;
import yx.j0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import az.a;
import lnc.a1;
import gz.s;
import android.net.Uri;
import com.yxcorp.image.request.a;
import uc.d;
import java.lang.Math;
import s0d.a;
import java.lang.StringBuilder;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import gz.c;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import android.view.ViewGroup;
import com.kuaishou.commercial.splash.presenter.a;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Runnable;
import ekd.k1;
import bz.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import gz.d;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import android.os.SystemClock;
import wkd.b;
import com.yxcorp.gifshow.w;
import brd.y;
import yy.x0;
import com.yxcorp.gifshow.image.KwaiImageView;
import mrd.c;

public class b extends PresenterV2	// class@0015df
{
    public boolean A;
    public boolean p;
    public f q;
    public f r;
    public PublishSubject s;
    public KwaiImageView t;
    public ViewGroup u;
    public View v;
    public u2 w;
    public boolean x;
    public final Runnable y;
    public c z;

    public void b(){
       super();
       this.y = new b(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       u2 ou2 = this.r.get();
       this.w = ou2;
       if (ou2 == null || this.t == null) {
          this.R8(new a(1));
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uob, "5")){
          int i = 0;
          Object[] objArray1 = new Object[i];
          String str = "ImageSplashPresenter";
          j0.f(str, "initView", objArray1);
          this.t.setPlaceHolderImage(new ColorDrawable(-1));
          if (a.a()) {
             this.t.setPlaceHolderImage(new ColorDrawable(0xffff0000));
             this.S8();
          }else {
             int i1 = a1.h();
             int i2 = a1.g();
             a uoa = a.t(this.w.a);
             if (i1 > 0 && i2 > 0) {
                b tw = this.w;
                uoa.p(new d(i1, i2, Math.max((float)Math.max(tw.b, tw.c), 2048.00f)));
             }else {
                Object[] objArray2 = new Object[i];
                j0.c(str, "get screenSize is execption shortAxis:"+i1+"longAxis:"+i2, objArray2);
             }
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.t.getController());
             uod.w(uoa.q());
             uod.s(new c(this));
             this.t.setController(uod.e());
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
             this.u.bringToFront();
          }
       }
       this.s.subscribe(new a(this));
       k1.r(this.y, Math.max(0, this.w.g));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       k1.m(this.y);
       return;
    }
    public boolean P8(){
       boolean b;
       Activity obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       b = (obj != null && !obj.isFinishing())? true: false;
       return b;
    }
    public final void R8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (this.x != null) {
          return;
       }
       this.x = true;
       k1.m(this.y);
       if (p0 != null) {
          this.s.onNext(p0);
       }
       return;
    }
    public void S8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
          return;
       }
       if (!this.P8()) {
          return;
       }
       Object[] objArray1 = new Object[0];
       j0.f("ImageSplashPresenter", "onImageSet", objArray1);
       if (!PatchProxy.applyVoid(objArray, this, uob, "15")) {
          uob = this.u;
          Property aLPHA = View.ALPHA;
          float[] uofloatArray = new float[2];
          int i = 0x3f800000;
          uofloatArray[0] = i;
          if (this.w.L == null) {
             i = 0;
          }
          uofloatArray[1] = i;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uob, aLPHA, uofloatArray);
          objectAnimat.setDuration(600);
          objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
          objectAnimat.start();
          objectAnimat.addListener(new d(this));
       }
       this.v.setVisibility(0);
       CommercialSplashTracker.E().I(SystemClock.elapsedRealtime());
       b.a(-1343064608).q0();
       this.z.onNext(this.v);
       x0 ox0 = this.q.get();
       if (ox0 != null) {
          ox0.x(this.m8(), 0);
       }
       k1.m(this.y);
       k1.r(this.y, Math.max(0, this.w.g));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = p0.findViewById(0x7f0a3af3);
       this.u = p0.findViewById(0x7f0a0a7a);
       this.v = p0.findViewById(0x7f0a137d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.x8("SPLASH_AD_LOG");
       this.r = this.x8("SPLASH_IMAGE_TYPE_PARAM");
       this.s = this.r8("SPLASH_ENHANCE_DISPLAY_EVENT");
       this.z = this.r8("SPLASH_VIEW_SHOW_EVENT");
       return;
    }
}
