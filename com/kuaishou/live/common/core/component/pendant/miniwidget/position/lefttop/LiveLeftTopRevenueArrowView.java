package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueArrowView;
import android.widget.RelativeLayout;
import lnc.a1;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.LiveLeftTopRevenueArrowView$a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Path;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.graphics.Canvas;
import java.util.Arrays;
import android.graphics.Path$Direction;
import ekd.r;
import wv1.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class LiveLeftTopRevenueArrowView extends RelativeLayout	// class@0016fd
{
    public int b;
    public int c;
    public final float[] d;
    public final RectF e;
    public final Paint f;
    public final Path g;
    public ImageView h;
    public AnimatorSet i;
    public ValueAnimator j;
    public static final int k;
    public static final int l;
    public static final Property m;

    static {
       LiveLeftTopRevenueArrowView.k = a1.a(0x7f060846);
       LiveLeftTopRevenueArrowView.l = a1.e(6.00f);
       LiveLeftTopRevenueArrowView.m = new LiveLeftTopRevenueArrowView$a(Integer.class, "cornerRadius");
    }
    public void LiveLeftTopRevenueArrowView(Context p0){
       super(p0, null);
    }
    public void LiveLeftTopRevenueArrowView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLeftTopRevenueArrowView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = LiveLeftTopRevenueArrowView.k;
       float[] uofloatArray = new float[8];
       this.d = uofloatArray;
       this.e = new RectF();
       Paint paint = new Paint();
       this.f = paint;
       this.g = new Path();
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftTopRevenueArrowView.class, "1")) {
       }else {
          paint.setColor(this.c);
          this.h = new ImageView(p0);
          Drawable uDrawable = a1.f(R.drawable.arg_RES_7f08058d);
          a.n(a.r(uDrawable).mutate(), a1.a(R.color.arg_RES_7f060801));
          this.h.setImageDrawable(uDrawable);
          RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(a1.e(14.00f), a1.e(14.00f));
          layoutParams.addRule(13);
          this.h.setLayoutParams(layoutParams);
          this.addView(this.h);
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveLeftTopRevenueArrowView.class, "10")) {
          return;
       }
       LiveLeftTopRevenueArrowView ti = this.i;
       if (ti != null && ti.isRunning()) {
          this.i.cancel();
       }
       this.i = null;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveLeftTopRevenueArrowView.class, "11")) {
          return;
       }
       LiveLeftTopRevenueArrowView tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
       }
       this.j = null;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveLeftTopRevenueArrowView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       this.b();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLeftTopRevenueArrowView.class, "3")) {
          return;
       }
       this.g.reset();
       Arrays.fill(this.d, (float)LiveLeftTopRevenueArrowView.l);
       Arrays.fill(this.d, 2, 6, (float)this.b);
       this.g.addRoundRect(this.e, this.d, Path$Direction.CW);
       p0.drawPath(this.g, this.f);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveLeftTopRevenueArrowView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveLeftTopRevenueArrowView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.e.set(0, 0, (float)p0, (float)p1);
       return;
    }
    public void setColorWithAnimator(int p0){
       if (PatchProxy.isSupport(LiveLeftTopRevenueArrowView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveLeftTopRevenueArrowView.class, "7")) {
          return;
       }
       this.b();
       int[] ointArray = new int[]{this.c,p0};
       ValueAnimator valueAnimato = r.c(ointArray);
       this.j = valueAnimato;
       valueAnimato.setDuration(400);
       this.j.addUpdateListener(new b(this));
       this.j.start();
       return;
    }
    public void setLeftCorner(int p0){
       if (PatchProxy.isSupport(LiveLeftTopRevenueArrowView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveLeftTopRevenueArrowView.class, "8")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public final void setPaintColor(int p0){
       if (PatchProxy.isSupport(LiveLeftTopRevenueArrowView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveLeftTopRevenueArrowView.class, "9")) {
          return;
       }
       this.c = p0;
       this.f.setColor(p0);
       this.invalidate();
       return;
    }
}
