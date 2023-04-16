package com.yxcorp.gateway.pay.loading.PayLoadingView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gateway.pay.loading.PathLoadingView;
import android.widget.TextView;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import com.yxcorp.gateway.pay.loading.PayLoadingView$a;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gateway.pay.loading.PayLoadingView$b;
import java.lang.CharSequence;
import android.text.TextUtils;

public class PayLoadingView extends FrameLayout	// class@00122c
{
    public View b;
    public PathLoadingView c;
    public TextView d;
    public boolean e;

    public void PayLoadingView(Context p0){
       super(p0, null);
    }
    public void PayLoadingView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PayLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, PayLoadingView.class, "1")) {
       }else {
          a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d1103, this, true);
          this.b = this.findViewById(0x7f0a2fa4);
          this.c = this.findViewById(0x7f0a2fa7);
          this.d = this.findViewById(0x7f0a2fa0);
       }
       return;
    }
    public static View a(PayLoadingView p0){
       return p0.b;
    }
    public static PathLoadingView c(PayLoadingView p0){
       return p0.c;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PayLoadingView.class, "3")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       AnimatorSet uAnimatorSet = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b, View.ALPHA, new float[2]{0,0x3f800000});
       objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       DecelerateInterpolator uDecelerateI = new DecelerateInterpolator(2.50f);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[2]{0x3f666666,0x3f800000});
       objectAnimat1.setInterpolator(uDecelerateI);
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[2]{0x3f666666,0x3f800000});
       objectAnimat2.setInterpolator(uDecelerateI);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(220);
       uAnimatorSet.addListener(new PayLoadingView$a(this));
       uAnimatorSet.start();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PayLoadingView.class, "4")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       this.e = false;
       AnimatorSet uAnimatorSet = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b, View.ALPHA, new float[2]{0x3f800000,0});
       objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       DecelerateInterpolator uDecelerateI = new DecelerateInterpolator(2.50f);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[2]{0x3f800000,0x3f666666});
       objectAnimat1.setInterpolator(uDecelerateI);
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[2]{0x3f800000,0x3f666666});
       objectAnimat2.setInterpolator(uDecelerateI);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(220);
       uAnimatorSet.addListener(new PayLoadingView$b(this));
       uAnimatorSet.start();
       return;
    }
    public void setLoadingText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayLoadingView.class, "2")) {
          return;
       }
       PayLoadingView td = this.d;
       int i = (TextUtils.isEmpty(p0))? 8: 0;
       td.setVisibility(i);
       this.d.setText(p0);
       return;
    }
}
