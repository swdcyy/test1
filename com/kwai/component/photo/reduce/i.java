package com.kwai.component.photo.reduce.i;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.o;
import com.kwai.component.photo.reduce.n;
import rkd.b;
import yf5.o;
import im8.c;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.kwai.component.photo.reduce.k;
import java.util.Map;
import java.util.HashMap;

public class i implements PopupInterface$f, g	// class@000aed
{
    public QPhoto b;
    public int c;
    public Rect d;
    public Rect e;
    public boolean f;
    public boolean g;
    public int h;
    public View$OnClickListener i;
    public i$b j;
    public List k;
    public ReduceMode l;
    public String m;
    public GifshowActivity n;
    public Fragment o;
    public final float p;
    public final float q;
    public final long r;
    public PresenterV2 s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;

    public void i(){
       super();
       this.p = 0x3f4ccccd;
       this.q = 0x3f000000;
       this.r = 200;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       boolean b = false;
       View view = a.g(p1, R.layout.arg_RES_7f0d1134, p2, b);
       PresenterV2 presenterV2 = new PresenterV2();
       this.s = presenterV2;
       if (this.w != null) {
          presenterV2.U7(new o(true, this.v));
       }else {
          presenterV2.U7(new o(b, this.t, this.u, this.v));
       }
       this.s.U7(new n(this.v));
       if (b.g()) {
          this.s.U7(new o());
       }
       this.s.f(view);
       Object[] objArray = new Object[]{this,new c("PHOTO_REDUCE_POPUP", p0)};
       this.s.i(objArray);
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.s.destroy();
       return;
    }
    public void c(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "3")) {
          return;
       }
       p0.setAlpha(0);
       p0.setScaleX(0x3f000000);
       p0.setScaleY(0x3f000000);
       float[] uofloatArray = new float[]{0x3f800000};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray);
       objectAnimat.setInterpolator(new LinearInterpolator());
       float[] uofloatArray1 = new float[]{0x3f800000};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray1);
       objectAnimat1.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       float[] uofloatArray2 = new float[]{0x3f800000};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray2);
       objectAnimat2.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       uAnimatorSet.start();
       return;
    }
    public void d(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "4")) {
          return;
       }
       float[] uofloatArray = new float[]{0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray);
       objectAnimat.setInterpolator(new LinearInterpolator());
       float[] uofloatArray1 = new float[]{0x3f000000};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray1);
       objectAnimat1.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       float[] uofloatArray2 = new float[]{0x3f000000};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray2);
       objectAnimat2.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       uAnimatorSet.start();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new k());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
}
