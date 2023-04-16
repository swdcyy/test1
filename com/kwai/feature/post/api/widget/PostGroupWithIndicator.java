package com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import ll8.c$b;
import android.content.res.TypedArray;
import android.animation.TimeInterpolator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import th0.j;
import android.view.View;
import com.yxcorp.utility.Log;
import com.kwai.feature.post.api.widget.CornerView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import java.lang.StringBuilder;
import android.animation.ValueAnimator;
import t46.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Float;
import java.lang.Integer;
import com.yxcorp.utility.n;

public abstract class PostGroupWithIndicator extends FrameLayout	// class@001472
{
    public CornerView b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public ValueAnimator k;
    public static int l = 200;

    public void PostGroupWithIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = -1;
       this.d = a1.e(3.00f);
       this.e = a1.e(12.00f);
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = true;
       this.j = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c4, p2, 0);
       this.d = typedArray.getDimensionPixelSize(2, this.d);
       this.e = typedArray.getDimensionPixelSize(5, this.e);
       this.f = typedArray.getDimensionPixelSize(0, this.f);
       this.g = typedArray.getDimensionPixelSize(3, this.g);
       this.h = typedArray.getDimensionPixelSize(4, this.h);
       this.c = typedArray.getColor(true, this.c);
       typedArray.recycle();
       this.h();
    }
    public abstract void f();
    public abstract void g();
    public long getAnimatorDuration(){
       return (long)PostGroupWithIndicator.l;
    }
    public TimeInterpolator getInterpolator(){
       Object obj = PatchProxy.apply(null, this, PostGroupWithIndicator.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j();
    }
    public abstract View getParentView();
    public final void h(){
       if (PatchProxy.applyVoid(null, this, PostGroupWithIndicator.class, "1")) {
          return;
       }
       PostGroupWithIndicator tb = this.b;
       if (tb != null) {
          this.removeView(tb);
       }
       Log.b("PostGroupWithIndicator", "initIndicatorView\(\) called");
       this.b = new CornerView(this.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.e, this.d);
       layoutParams.bottomMargin = this.f;
       layoutParams.leftMargin = this.g;
       layoutParams.rightMargin = this.h;
       layoutParams.gravity = 83;
       this.b.setLayoutParams(layoutParams);
       this.b.setCornerColor(this.c);
       this.addView(this.b);
       return;
    }
    public void i(float p0){
    }
    public boolean j(View p0,boolean p1){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, PostGroupWithIndicator.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = "PostGroupWithIndicator";
       Log.b(str, "scrollIndicatorTo\(\) called with: view = ["+p0+"], isUseAnim = ["+p1+"]");
       int b = false;
       if (p0 == null || this.b == null) {
          return b;
       }else if(!p0.getWidth()){
          return b;
       }else if(this.j == 8){
          return b;
       }else {
          b = this.b.getLeft() + (int)this.b.getTranslationX();
          int i = 2;
          if (p1 && this.i != null) {
             this.f();
             PostGroupWithIndicator tk = this.k;
             if (tk != null) {
                tk.cancel();
             }
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000}).setDuration(this.getAnimatorDuration());
             this.k = valueAnimato;
             valueAnimato.addUpdateListener(new n(this, p0, b));
             this.k.setInterpolator(this.getInterpolator());
             this.k.addListener(new PostGroupWithIndicator$a(this));
             this.k.start();
          }else {
             int i1 = (this.getParentView().getLeft() + p0.getLeft()) + (p0.getWidth() / i);
             int i2 = i1 - (this.b.getWidth() / i);
             StringBuilder str1 = "buttonCenter: "+i1;
             Log.b(str, str1+" targetX:"+i2+"fromX:"+b);
             this.b.setTranslationX((float)i2);
          }
          return true;
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, PostGroupWithIndicator.class, "3")) {
          return;
       }
       PostGroupWithIndicator tj = this.j;
       if (tj == null) {
          this.b.setVisibility(tj);
       }
       return;
    }
    public void setCorner(float p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PostGroupWithIndicator.class, "11")) {
          return;
       }
       PostGroupWithIndicator tb = this.b;
       if (tb == null) {
          Log.b("PostGroupWithIndicator", "setCorner\(\) called and indicator is null");
          return;
       }else {
          tb.setCorner(p0);
          return;
       }
    }
    public void setIndicatorBottomMargin(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "5")) {
          return;
       }
       this.f = p0;
       this.h();
       this.invalidate();
       return;
    }
    public void setIndicatorColor(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "6")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setIndicatorCornerColor(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "12")) {
          return;
       }
       this.b.setCornerColor(p0);
       this.invalidate();
       return;
    }
    public void setIndicatorHeight(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "7")) {
          return;
       }
       this.d = p0;
       this.h();
       this.invalidate();
       return;
    }
    public void setIndicatorLeftMargin(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "9")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setIndicatorRightMargin(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "10")) {
          return;
       }
       this.h = p0;
       this.invalidate();
       return;
    }
    public void setIndicatorUseAnim(boolean p0){
       this.i = p0;
    }
    public void setIndicatorVisible(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "2")) {
          return;
       }
       this.j = p0;
       PostGroupWithIndicator tb = this.b;
       if (tb != null) {
          n.Y(tb, p0, false);
       }else {
          Log.b("PostGroupWithIndicator", "setIndicatorVisible\(\) called and indicator is null");
       }
       return;
    }
    public void setIndicatorWidth(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicator.class, "8")) {
          return;
       }
       this.e = p0;
       this.h();
       this.invalidate();
       return;
    }
}
