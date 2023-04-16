package com.yxcorp.gifshow.widget.shimmer.ShimmerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.graphics.Paint;
import com.yxcorp.gifshow.widget.shimmer.b;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.shimmer.a$a;
import com.yxcorp.gifshow.widget.shimmer.a;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public class ShimmerFrameLayout extends FrameLayout	// class@0019c4
{
    public final Paint b;
    public final b c;
    public boolean d;
    public boolean e;

    public void ShimmerFrameLayout(Context p0){
       super(p0);
       this.b = new Paint();
       this.c = new b();
       this.d = true;
       this.e = false;
       this.a(p0, null);
    }
    public void ShimmerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c = new b();
       this.d = true;
       this.e = false;
       this.a(p0, p1);
    }
    public void ShimmerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       this.c = new b();
       this.d = true;
       this.e = false;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShimmerFrameLayout.class, "1")) {
          return;
       }
       this.setWillNotDraw(false);
       this.c.setCallback(this);
       if (p1 == null) {
          this.b(new a$a().a());
          return;
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.a5, false, false);
          this.b(new a$a().b(typedArray).a());
          typedArray.recycle();
          return;
       }
    }
    public ShimmerFrameLayout b(a p0){
       boolean b;
       b f;
       ShimmerFrameLayout obj = PatchProxy.applyOneRefs(p0, this, ShimmerFrameLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, b.class, "1")) {
          obj.f = p0;
          if (p0 != null) {
             obj.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
          }
          obj.d();
          if (!PatchProxy.applyVoid(null, obj, b.class, "7") && obj.f != null) {
             b e = obj.e;
             if (e != null) {
                b = e.isStarted();
                obj.e.cancel();
                obj.e.removeAllUpdateListeners();
             }else {
                b = false;
             }
             float[] uofloatArray = new float[]{0,(float)(f.q / f.p) + 0x3f800000};
             f = obj.f;
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             obj.e = valueAnimato;
             valueAnimato.setInterpolator(new LinearInterpolator());
             obj.e.setRepeatMode(obj.f.o);
             obj.e.setStartDelay(obj.f.r);
             obj.e.setRepeatCount(obj.f.n);
             b f1 = obj.f;
             obj.e.setDuration((f1.p + f1.q));
             obj.e.addUpdateListener(obj.a);
             if (b) {
                obj.e.start();
             }
          }
       label_00b0 :
          obj.invalidateSelf();
       }
       if (p0 != null && p0.l != null) {
          this.setLayerType(2, this.b);
       }else {
          this.setLayerType(0, null);
       }
       return this;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShimmerFrameLayout.class, "4")) {
          return;
       }
       this.e = false;
       ShimmerFrameLayout tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, b.class, "3") && (tc.e != null && tc.a())) {
          tc.e.cancel();
       }
    label_002e :
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShimmerFrameLayout.class, "12")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.d != null) {
          this.c.draw(p0);
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ShimmerFrameLayout.class, "10")) {
          return;
       }
       super.onAttachedToWindow();
       this.c.b();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ShimmerFrameLayout.class, "11")) {
          return;
       }
       super.onDetachedFromWindow();
       this.c();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ShimmerFrameLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShimmerFrameLayout.class, "8")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.c.setBounds(0, 0, this.getWidth(), this.getHeight());
       return;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(ShimmerFrameLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ShimmerFrameLayout.class, "9")) {
          return;
       }
       super.onVisibilityChanged(p0, p1);
       ShimmerFrameLayout tc = this.c;
       if (tc == null) {
          return;
       }
       if (p1) {
          tc = PatchProxy.apply(null, this, ShimmerFrameLayout.class, "5");
          boolean b = (tc != PatchProxyResult.class)? tc.booleanValue(): this.c.a();
          if (b) {
             this.c();
             this.e = true;
          }
       }else if(this.e != null){
          tc.b();
          this.e = false;
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShimmerFrameLayout.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.verifyDrawable(p0) || p0 == this.c)? true: false;
       return b;
    }
}
