package h82.k0;
import android.view.View;
import java.lang.Object;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import ne1.k;
import android.graphics.Typeface;
import d61.f0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import cw9.c;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import h82.e0;
import android.animation.Animator$AnimatorListener;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import com.kuaishou.live.core.show.fansgroup.b;
import android.graphics.drawable.Drawable;
import f82.c;

public class k0	// class@002cd9
{
    public final String a;
    public final View b;
    public final View c;
    public final KwaiImageView d;
    public final ImageView e;
    public final View f;
    public final KwaiImageView g;
    public final TextView h;
    public final LottieAnimationView i;
    public final KwaiImageView j;
    public final View k;
    public final KwaiImageView l;
    public final TextView m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public ObjectAnimator s;
    public AnimatorSet t;
    public AnimatorSet u;
    public Animator v;
    public r0 w;
    public m x;
    public b y;

    public void k0(View p0){
       super();
       this.a = "LiveAudienceFollowBottomBarViewController";
       this.n = 0;
       this.r = false;
       this.b = m1.f(p0, 0x7f0a191e);
       this.c = m1.f(p0, 0x7f0a192e);
       this.d = m1.f(p0, 0x7f0a191f);
       this.e = m1.f(p0, 0x7f0a1920);
       this.f = m1.f(p0, 0x7f0a1918);
       this.g = m1.f(p0, 0x7f0a1919);
       TextView textView = m1.f(p0, R.id.live_audience_bottom_bar_fans_group_entrance_level);
       this.h = textView;
       if (k.a()) {
          f0.j(textView, Typeface.DEFAULT_BOLD, 1);
          ViewGroup$MarginLayoutParams layoutParams = textView.getLayoutParams();
          layoutParams.bottomMargin = 1;
          textView.setLayoutParams(layoutParams);
       }else {
          f0.j(textView, Typeface.DEFAULT_BOLD, 3);
       }
       this.k = m1.f(p0, 0x7f0a191b);
       this.l = m1.f(p0, 0x7f0a191c);
       textView = m1.f(p0, R.id.live_audience_bottom_bar_fans_group_entrance_temp_level);
       this.m = textView;
       f0.j(textView, Typeface.DEFAULT_BOLD, 3);
       this.i = m1.f(p0, 0x7f0a1922);
       this.j = m1.f(p0, 0x7f0a1921);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, k0.class, "13")) {
          return;
       }
       k0 tt = this.t;
       if (tt != null) {
          tt.removeAllListeners();
          this.t.cancel();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, k0.class, "11")) {
          return;
       }
       if (this.i.p()) {
          this.i.f();
       }
       k0 tv = this.v;
       if (tv != null) {
          tv.removeAllListeners();
          this.v.cancel();
          this.v = null;
       }
       tv = this.u;
       if (tv != null) {
          tv.removeAllListeners();
          this.u.cancel();
          this.u = null;
       }
       tv = this.s;
       if (tv != null) {
          tv.removeAllListeners();
          this.s.cancel();
          this.s = null;
       }
       return;
    }
    public final int c(int p0){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok0, "31");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return c.a(this.b.getResources(), p0);
    }
    public final int d(){
       Object obj = PatchProxy.apply(null, this, k0.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.o != null)? this.c(R.dimen.arg_RES_7f0705b6): 0;
       return i;
    }
    public final int e(){
       Object obj = PatchProxy.apply(null, this, k0.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c(0x7f0705b8);
    }
    public void f(){
       k0 ok0 = k0.class;
       if (PatchProxy.applyVoid(null, this, ok0, "12")) {
          return;
       }
       if (this.t == null) {
          k0 tg = this.g;
          if (!PatchProxy.applyVoidOneRefs(tg, this, ok0, "17")) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f99999a,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tg, propertyValu);
             objectAnimat.setDuration(500);
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f99999a}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f99999a})};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(tg, propertyValu1);
             objectAnimat1.setDuration(500);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.t = uAnimatorSet;
             Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
             uAnimatorSet.playSequentially(uAnimatorArr);
             this.t.addListener(new e0(this, tg));
          }
          this.t.start();
       }
       return;
    }
    public final void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "23")) {
          return;
       }
       if (p0.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.removeRule(13);
          layoutParams.addRule(14);
          layoutParams.addRule(12);
          layoutParams.bottomMargin = a1.e(8.00f);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void h(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "24")) {
          return;
       }
       if (p0.getLayoutParams() instanceof RelativeLayout$LayoutParams) {
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.removeRule(14);
          layoutParams.removeRule(12);
          layoutParams.addRule(13);
          layoutParams.bottomMargin = a1.e(0);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, k0.class, "15")) {
          return;
       }
       k0 ty = this.y;
       if (ty != null && ty.a()) {
          this.y.b();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, k0.class, "21")) {
          return;
       }
       if (this.n == null) {
          this.c.setVisibility(0);
          this.c.setAlpha(0x3f800000);
       }else {
          this.c.setVisibility(8);
       }
       k0 tb = this.b;
       int i = (this.n == null)? 0x7f0802c9: 0x7f08018e;
       tb.setBackground(a1.f(i));
       return;
    }
    public void k(){
       ViewGroup$LayoutParams layoutParams;
       k0 ok0 = k0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok0, "8")) {
          return;
       }
       if (this.i.p()) {
          return;
       }
       this.j();
       k0 tn = this.n;
       int i = 8;
       if (tn != null) {
          if (tn != 2) {
             if (tn == 3 && !PatchProxy.applyVoid(objArray, this, ok0, "20")) {
                this.f.setVisibility(0);
                this.e.setVisibility(i);
                this.d.setVisibility(i);
                this.i.setVisibility(i);
                if (this.q != null && !PatchProxy.applyVoid(objArray, this, ok0, "14")) {
                   if (this.y == null) {
                      this.y = new b(this.k, this.f);
                   }
                   if (!this.y.a()) {
                      this.y.c(true, c.a, 0);
                   }
                }
             label_0073 :
                layoutParams = this.b.getLayoutParams();
                layoutParams.width = this.d();
                this.b.setLayoutParams(layoutParams);
             }
          }else if(PatchProxy.applyVoid(objArray, this, ok0, "19")){
             this.e.setVisibility(i);
             this.d.setVisibility(i);
             this.i.setVisibility(i);
             this.f.setVisibility(0);
             layoutParams = this.b.getLayoutParams();
             layoutParams.width = this.d();
             this.b.setLayoutParams(layoutParams);
          }
       }else if(PatchProxy.applyVoid(objArray, this, ok0, "18")){
          this.d.setVisibility(0);
          this.i.setVisibility(i);
          this.f.setVisibility(i);
          this.e.setVisibility(0);
          this.e.setImageResource(R.drawable.arg_RES_7f08132e);
          layoutParams = this.b.getLayoutParams();
          layoutParams.width = this.e();
          this.b.setLayoutParams(layoutParams);
       }
       return;
    }
}
