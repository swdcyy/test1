package com.kwai.library.widget.textview.KwaiHollowTextView;
import com.kwai.library.widget.textview.KwaiBaseTextView;
import android.content.Context;
import android.util.AttributeSet;
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
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.RectF;

public class KwaiHollowTextView extends KwaiBaseTextView	// class@000a4d
{
    public boolean A;
    public Paint n;
    public Paint o;
    public Paint p;
    public Bitmap q;
    public Bitmap r;
    public Canvas s;
    public Canvas t;
    public RectF u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public void KwaiHollowTextView(Context p0){
       super(p0, null);
    }
    public void KwaiHollowTextView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void KwaiHollowTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = true;
       if (p1 == null) {
       }else {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.R1, p2, 0);
          this.v = typedArray.getColor(0, 0);
          this.w = typedArray.getDimensionPixelOffset(b, 0);
          this.x = typedArray.getColor(2, 0);
          typedArray.recycle();
       }
       Paint paint = new Paint();
       this.n = paint;
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.n.setAntiAlias(b);
       this.y = (this.v >> 24) & 0x00ff;
       paint = new Paint();
       this.o = paint;
       paint.setColor(this.v);
       this.o.setAntiAlias(b);
       this.o.setAlpha(this.y);
       KwaiHollowTextView tx = this.x;
       this.z = (tx >> 24) & 0x00ff;
       paint = new Paint();
       this.p = paint;
       paint.setColorFilter(new PorterDuffColorFilter((tx | 0xff000000), PorterDuff$Mode.SRC_IN));
       this.p.setAlpha(this.z);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       if (this.A == null) {
          return super.dispatchTouchEvent(p0);
       }
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == b || action == 3) {
             this.t(false);
          }
       }else {
          this.t(b);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void onDraw(Canvas p0){
       if (this.t != null) {
          KwaiHollowTextView ts = this.s;
          if (ts == null || (this.q != null && this.r != null)) {
             ts.drawColor(0, PorterDuff$Mode.CLEAR);
             this.t.drawColor(0, PorterDuff$Mode.CLEAR);
             super.onDraw(this.t);
             this.u(this.s);
             p0.drawBitmap(this.q, 0, 0, null);
             p0.drawBitmap(this.r, 0, 0, this.n);
             p0.restoreToCount(p0.saveLayer(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), null));
             if (this.x != null) {
                p0.drawBitmap(this.r, 0, 0, this.p);
             }
             return;
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          this.q = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_4444);
          this.s = new Canvas(this.q);
          this.r = Bitmap.createBitmap(p0, p1, Bitmap$Config.ARGB_4444);
          this.t = new Canvas(this.r);
          this.u = new RectF(0, 0, (float)this.getWidth(), (float)this.getHeight());
       }
       return;
    }
    public void setCornerRadius(int p0){
       this.w = p0;
       this.invalidate();
    }
    public void setPressStateEnable(boolean p0){
       this.A = p0;
    }
    public final void t(boolean p0){
       if (p0) {
          this.o.setAlpha((this.y >> 1));
          this.p.setAlpha((this.z >> 1));
       }else {
          this.o.setAlpha(this.y);
          this.p.setAlpha(this.z);
       }
       this.invalidate();
       return;
    }
    public final void u(Canvas p0){
       KwaiHollowTextView tw = this.w;
       if (tw > null) {
          p0.drawRoundRect(this.u, (float)tw, (float)tw, this.o);
       }else {
          p0.drawColor(this.v);
       }
       return;
    }
}
