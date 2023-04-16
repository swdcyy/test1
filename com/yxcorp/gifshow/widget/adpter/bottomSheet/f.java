package com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;
import android.animation.Animator;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$c;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$a;
import android.animation.Animator$AnimatorListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$b;
import android.view.animation.Animation$AnimationListener;
import android.widget.FrameLayout;
import java.lang.Integer;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.LayoutInflater;
import ag6.a;
import uyc.b;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.e;
import android.view.View$OnTouchListener;

public class f	// class@0018f7
{
    public BottomSheetBehavior a;
    public FrameLayout b;
    public f$d c;
    public final Context d;
    public View e;
    public int f;
    public boolean g;
    public ViewGroup$LayoutParams h;
    public f$c i;
    public f$c j;
    public View k;
    public FrameLayout l;
    public boolean m;
    public boolean n;

    public void f(Context p0,View p1){
       super();
       this.g = true;
       this.m = true;
       this.n = true;
       this.d = p0;
       this.e = p1;
    }
    public static View b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a0a9d);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.n == null) {
          this.c.p1();
          return;
       }else {
          f tj = this.j;
          if (tj != null) {
             Animator uAnimator = tj.a(this.l);
             uAnimator.addListener(new f$a(this));
             uAnimator.start();
          }else {
             Animation uAnimation = AnimationUtils.loadAnimation(this.d, R.anim.arg_RES_7f01010d);
             uAnimation.setAnimationListener(new f$b(this));
             this.b.startAnimation(uAnimation);
          }
          return;
       }
    }
    public View c(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, uof, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.k == null) {
          obj = this.f;
          f te = this.e;
          f th = this.h;
          if (PatchProxy.isSupport(uof)) {
             uof = PatchProxy.applyThreeRefs(Integer.valueOf(obj), te, th, this, f.class, "3");
             if (uof != patchProxyRe) {
             label_00b0 :
                this.k = uof;
             }
          }
          FrameLayout uFrameLayout = View.inflate(this.d, R.layout.arg_RES_7f0d0258, objArray);
          this.b = uFrameLayout;
          CoordinatorLayout uCoordinator = uFrameLayout.findViewById(R.id.coordinator);
          if (obj != null && te == null) {
             a.c(LayoutInflater.from(this.d), obj, uCoordinator, false);
          }
          this.l = uCoordinator.findViewById(0x7f0a0a9d);
          f.F(this.b, new b(this));
          BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(this.l);
          this.a = uBottomSheet;
          uBottomSheet.setHideable(this.g);
          if (th == null) {
             this.l.addView(te);
          }else {
             this.l.addView(te, th);
          }
          uCoordinator.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
          this.a.setBottomSheetCallback(new e(this));
          this.l.setOnTouchListener(e.b);
          this.a.setState(3);
          uof = this.b;
          goto label_00b0 ;
       }
       return this.k;
    }
    public void d(f$d p0){
       this.c = p0;
    }
}
