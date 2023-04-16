package com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import o17.j;
import android.widget.RelativeLayout;
import android.content.Context;
import csb.c;
import android.util.AttributeSet;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.ValueAnimator;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import csb.d;
import android.animation.Animator$AnimatorListener;
import csb.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.library.widget.specific.misc.ClipWidthView;
import android.animation.Animator;
import ekd.f;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView$a;
import th0.m;
import android.animation.TimeInterpolator;
import csb.a;
import csb.f;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView$b;
import android.view.ViewGroup;
import i2b.a;
import java.lang.Runnable;
import android.view.ViewStub;
import java.lang.Float;
import java.lang.CharSequence;
import java.lang.Number;
import lsb.a;
import com.kwai.library.widget.refresh.RefreshLayout;

public class TipRefreshView extends RelativeLayout implements j	// class@002144
{
    public RefreshLayout b;
    public TipRefreshView$a c;
    public j d;
    public ClipWidthView e;
    public TextView f;
    public ImageView g;
    public ViewStub h;
    public int i;
    public ValueAnimator j;
    public ValueAnimator k;
    public TipRefreshView$b l;
    public Runnable m;
    public boolean n;
    public boolean o;
    public a p;

    public void TipRefreshView(Context p0){
       super(p0);
       this.m = new c(this);
       this.d(p0);
    }
    public void TipRefreshView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = new c(this);
       this.d(p0);
    }
    public void TipRefreshView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = new c(this);
       this.d(p0);
    }
    public static void a(TipRefreshView p0){
       ValueAnimator valueAnimato;
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, TipRefreshView.class, "8")) {
       }else {
          TipRefreshView k = p0.k;
          if (k == null) {
             valueAnimato = PatchProxy.apply(objArray, p0, TipRefreshView.class, "7");
             if (valueAnimato != PatchProxyResult.class) {
             }else if(!p0.f.getMeasuredHeight()){
                p0.f.measure(0, 0);
             }
             int measuredHeig = p0.getMeasuredHeight();
             int[] ointArray = new int[]{measuredHeig,p0.f.getMeasuredHeight()};
             valueAnimato = ValueAnimator.ofInt(ointArray);
             valueAnimato.setDuration(300);
             ViewGroup$MarginLayoutParams layoutParams = p0.f.getLayoutParams();
             ViewGroup$MarginLayoutParams layoutParams1 = p0.g.getLayoutParams();
             valueAnimato.addListener(new d(p0, layoutParams, layoutParams1));
             valueAnimato.addUpdateListener(new e(p0, measuredHeig, layoutParams, layoutParams1));
             p0.k = valueAnimato;
          }else {
             k.cancel();
          }
          p0.k.start();
       }
       if (!PatchProxy.applyVoid(objArray, p0, TipRefreshView.class, "9")) {
          p0.d.setVisibility(4);
          p0.e.setVisibility(0);
          p0.e.setClip(0);
          f.a(p0.j);
          valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          p0.j = valueAnimato;
          valueAnimato.setDuration((long)p0.c.c());
          p0.j.setInterpolator(new m());
          p0.j.addUpdateListener(new a(p0));
          p0.j.addListener(new f(p0));
          p0.j.start();
       }
       p0 = p0.l;
       if (p0 != null) {
          p0.onShow();
       }
       return;
    }
    public final boolean c(){
       return this.n;
    }
    public final void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TipRefreshView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d1606, this);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "13")) {
          return;
       }
       TipRefreshView tk = this.k;
       if (tk != null) {
          tk.cancel();
       }
       if (this.e != null) {
          tk = this.f;
          if (tk != null) {
             tk.getLayoutParams().topMargin = 0;
             this.g.getLayoutParams().topMargin = 0;
             this.e.setVisibility(4);
             this.d.setVisibility(0);
             this.removeCallbacks(this.m);
             f.a(this.j);
             f.a(this.k);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "15")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.m);
       f.a(this.j);
       f.a(this.k);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.d = this.findViewById(0x7f0a353b);
       this.h = this.findViewById(0x7f0a3f0a);
       this.i = this.d.refreshedAnimatorDuration();
       this.g = this.findViewById(0x7f0a0782);
       return;
    }
    public void pullProgress(float p0,float p1){
       if (PatchProxy.isSupport(TipRefreshView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, TipRefreshView.class, "12")) {
          return;
       }
       if (!p0) {
          this.e();
       }
       this.d.setVisibility(0);
       this.d.pullProgress(p0, p1);
       return;
    }
    public void pullToRefresh(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "10")) {
          return;
       }
       this.d.pullToRefresh();
       this.e();
       return;
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "6")) {
          return;
       }
       this.d.refreshComplete();
       if (this.c()) {
          TipRefreshView te = this.e;
          if (te != null && te.getVisibility()) {
             this.f.setText(this.c.a());
             if (this.o != null) {
                this.g.setVisibility(0);
             }
             this.postDelayed(this.m, (long)this.i);
          }
       }
       return;
    }
    public int refreshedAnimatorDuration(){
       int i;
       TipRefreshView obj = PatchProxy.apply(null, this, TipRefreshView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i;
       if (this.c()) {
          i = obj + (this.c.b() - this.c.c());
       }
       return i;
    }
    public void refreshing(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "5")) {
          return;
       }
       TipRefreshView te = this.e;
       if (te != null && !te.getVisibility()) {
          this.e();
       }
       this.d.refreshing();
       return;
    }
    public void releaseToRefresh(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "11")) {
          return;
       }
       this.d.releaseToRefresh();
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, TipRefreshView.class, "4")) {
          return;
       }
       this.d.reset();
       return;
    }
    public void setCloseShowAble(boolean p0){
       this.o = p0;
    }
    public void setOnCloseClick(a p0){
       this.p = p0;
    }
    public void setRefreshLayout(RefreshLayout p0){
       this.b = p0;
    }
    public void setTipConfig(TipRefreshView$a p0){
       this.c = p0;
    }
    public void setTipEnable(boolean p0){
       this.n = p0;
    }
    public void setTipShowListener(TipRefreshView$b p0){
       this.l = p0;
    }
}
