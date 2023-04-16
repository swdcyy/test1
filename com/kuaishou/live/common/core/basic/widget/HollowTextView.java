package com.kuaishou.live.common.core.basic.widget.HollowTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.ColorFilter;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.RectF;
import android.graphics.Color;

public class HollowTextView extends AppCompatTextView	// class@000f0c
{
    public Paint f;
    public Paint g;
    public Paint h;
    public Bitmap i;
    public Bitmap j;
    public Canvas k;
    public Canvas l;
    public RectF m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public void HollowTextView(Context p0){
       super(p0, null);
    }
    public void HollowTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void HollowTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = true;
       if (!PatchProxy.isSupport(HollowTextView.class) || (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, HollowTextView.class, "1") && p1 != null)) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.d1, p2, 0);
          this.n = typedArray.getColor(0, 0);
          this.o = typedArray.getDimensionPixelOffset(b, 0);
          this.p = typedArray.getColor(2, 0);
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, this, HollowTextView.class, "2")) {
          Paint paint = new Paint();
          this.f = paint;
          paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.f.setAntiAlias(b);
          this.setBackgroundColor(this.n);
          HollowTextView tp = this.p;
          this.r = (tp >> 24) & 0x00ff;
          Paint paint1 = new Paint();
          this.h = paint1;
          paint1.setColorFilter(new PorterDuffColorFilter((tp | 0xff000000), PorterDuff$Mode.SRC_IN));
          this.h.setAlpha(this.r);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HollowTextView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.s == null) {
          return super.dispatchTouchEvent(p0);
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == b || action == 3) {
             this.p(false);
          }
       }else {
          this.p(b);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HollowTextView.class, "4")) {
          return;
       }
       if (this.l != null) {
          HollowTextView tk = this.k;
          if (tk == null || (this.i != null && this.j != null)) {
             tk.drawColor(0, PorterDuff$Mode.CLEAR);
             this.l.drawColor(0, PorterDuff$Mode.CLEAR);
             super.onDraw(this.l);
             this.q(this.k);
             p0.drawBitmap(this.i, 0, 0, null);
             p0.drawBitmap(this.j, 0, 0, this.f);
             p0.restoreToCount(p0.saveLayer(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), null));
             if (this.p != null) {
                p0.drawBitmap(this.j, 0, 0, this.h);
             }
             return;
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(HollowTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HollowTextView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          this.i = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_4444);
          this.k = new Canvas(this.i);
          this.j = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_4444);
          this.l = new Canvas(this.j);
          this.m = new RectF(0, 0, (float)this.getWidth(), (float)this.getHeight());
       }
       return;
    }
    public final void p(boolean p0){
       if (PatchProxy.isSupport(HollowTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HollowTextView.class, "6")) {
          return;
       }
       if (p0) {
          this.g.setAlpha((this.q >> 1));
          this.h.setAlpha((this.r >> 1));
       }else {
          this.g.setAlpha(this.q);
          this.h.setAlpha(this.r);
       }
       this.invalidate();
       return;
    }
    public final void q(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HollowTextView.class, "9")) {
          return;
       }
       HollowTextView to = this.o;
       if (to > null) {
          p0.drawRoundRect(this.m, (float)to, (float)to, this.g);
       }else {
          p0.drawColor(this.n);
       }
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(HollowTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HollowTextView.class, "8")) {
          return;
       }
       this.n = p0;
       this.q = Color.alpha(p0);
       Paint paint = new Paint();
       this.g = paint;
       paint.setColor(this.n);
       this.g.setAntiAlias(true);
       this.g.setAlpha(this.q);
       return;
    }
    public void setCornerRadius(int p0){
       if (PatchProxy.isSupport(HollowTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HollowTextView.class, "7")) {
          return;
       }
       this.o = p0;
       this.invalidate();
       return;
    }
    public void setPressStateEnable(boolean p0){
       this.s = p0;
    }
}
