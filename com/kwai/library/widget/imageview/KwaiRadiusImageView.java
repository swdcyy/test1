package com.kwai.library.widget.imageview.KwaiRadiusImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import android.view.View;
import java.lang.Math;
import com.yxcorp.utility.n;

public class KwaiRadiusImageView extends AppCompatImageView	// class@00094d
{
    public Context d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public Xfermode q;
    public int r;
    public int s;
    public float t;
    public float[] u;
    public float[] v;
    public RectF w;
    public RectF x;
    public Path y;
    public Paint z;

    public void KwaiRadiusImageView(Context p0){
       super(p0, null);
    }
    public void KwaiRadiusImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiRadiusImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = -1;
       this.j = -1;
       this.y = new Path();
       this.z = new Paint();
       this.d = p0;
       int i = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c2, i, i);
       KwaiRadiusImageView kwaiRadiusIm = 8;
       while (i < typedArray.getIndexCount()) {
          int index = typedArray.getIndex(i);
          if (index == 10) {
             this.f = typedArray.getBoolean(index, this.f);
          }else if(index == 9){
             this.e = typedArray.getBoolean(index, this.e);
          }else if(index == 1){
             this.g = typedArray.getDimensionPixelSize(index, this.g);
          }else if(!index){
             this.h = typedArray.getColor(index, this.h);
          }else if(index == kwaiRadiusIm){
             this.i = typedArray.getDimensionPixelSize(index, this.i);
          }else if(index == 7){
             this.j = typedArray.getColor(index, this.j);
          }else if(index == 4){
             this.k = typedArray.getDimensionPixelSize(index, this.k);
          }else if(index == 5){
             this.l = typedArray.getDimensionPixelSize(index, this.l);
          }else if(index == 6){
             this.m = typedArray.getDimensionPixelSize(index, this.m);
          }else if(index == 2){
             this.n = typedArray.getDimensionPixelSize(index, this.n);
          }else if(index == 3){
             this.o = typedArray.getDimensionPixelSize(index, this.o);
          }else if(index == 11){
             this.p = typedArray.getColor(index, this.p);
          }
          i = i + 1;
       }
       typedArray.recycle();
       float[] uofloatArray = new float[kwaiRadiusIm];
       this.u = uofloatArray;
       uofloatArray = new float[kwaiRadiusIm];
       this.v = uofloatArray;
       this.x = new RectF();
       this.w = new RectF();
       this.q = new PorterDuffXfermode(PorterDuff$Mode.DST_IN);
       this.a();
       this.d();
       return;
    }
    public final void a(){
       KwaiRadiusImageView u;
       KwaiRadiusImageView k;
       KwaiRadiusImageView kwaiRadiusIm = this;
       if (kwaiRadiusIm.e != null) {
          return;
       }
       int i = 0;
       float f = 2.00f;
       if (kwaiRadiusIm.k > null) {
          u = kwaiRadiusIm.u;
          while (i < u.length) {
             k = kwaiRadiusIm.k;
             u[i] = (float)k;
             float f1 = (float)kwaiRadiusIm.g / f;
             float f2 = (float)k - f1;
             kwaiRadiusIm.v[i] = f2;
             i = i + 1;
          }
       }else {
          u = kwaiRadiusIm.u;
          k = kwaiRadiusIm.l;
          u[i] = (float)k;
          u[1] = (float)k;
          KwaiRadiusImageView m = kwaiRadiusIm.m;
          u[2] = (float)m;
          u[3] = (float)m;
          KwaiRadiusImageView o = kwaiRadiusIm.o;
          u[4] = (float)o;
          u[5] = (float)o;
          KwaiRadiusImageView n = kwaiRadiusIm.n;
          u[6] = (float)n;
          u[7] = (float)n;
          u = kwaiRadiusIm.v;
          KwaiRadiusImageView g = kwaiRadiusIm.g;
          u[i] = (float)k - ((float)g / f);
          u[1] = u[i];
          u[2] = (float)m - ((float)g / f);
          u[3] = u[2];
          u[4] = (float)o - ((float)g / f);
          u[5] = u[4];
          u[6] = (float)n - ((float)g / f);
          u[7] = u[6];
       }
       return;
    }
    public final void c(boolean p0){
       if (p0) {
          this.k = 0;
       }
       this.a();
       this.i();
       this.invalidate();
       return;
    }
    public final void d(){
       if (this.e == null) {
          this.i = 0;
       }
       return;
    }
    public final void e(Canvas p0,int p1,int p2,float p3){
       this.f(p1, p2);
       this.y.addCircle(((float)this.r / 2.00f), ((float)this.s / 2.00f), p3, Path$Direction.CCW);
       p0.drawPath(this.y, this.z);
    }
    public final void f(int p0,int p1){
       this.y.reset();
       this.z.setStrokeWidth((float)p0);
       this.z.setColor(p1);
       this.z.setStyle(Paint$Style.STROKE);
    }
    public final void i(){
       if (this.e == null) {
          KwaiRadiusImageView tg = this.g;
          this.x.set(((float)tg / 2.00f), ((float)tg / 2.00f), ((float)this.r - ((float)tg / 2.00f)), ((float)this.s - ((float)tg / 2.00f)));
       }
       return;
    }
    public void onDraw(Canvas p0){
       KwaiRadiusImageView tr;
       Paint paint = null;
       p0.saveLayer(this.w, paint, 31);
       float f = 2.00f;
       if (this.f == null) {
          tr = this.r;
          KwaiRadiusImageView tg = this.g;
          KwaiRadiusImageView ti = this.i;
          float f1 = 0x3f800000;
          KwaiRadiusImageView ts = this.s;
          p0.scale((((float)((tr - (tg * 2)) - (ti * 2)) * f1) / (float)tr), (((float)((ts - (tg * 2)) - (ti * 2)) * f1) / (float)ts), ((float)tr / f), ((float)ts / f));
       }
       super.onDraw(p0);
       this.z.reset();
       this.y.reset();
       if (this.e != null) {
          this.y.addCircle(((float)this.r / f), ((float)this.s / f), this.t, Path$Direction.CCW);
       }else {
          this.y.addRoundRect(this.w, this.v, Path$Direction.CCW);
       }
       this.z.setAntiAlias(true);
       this.z.setStyle(Paint$Style.FILL);
       this.z.setXfermode(this.q);
       p0.drawPath(this.y, this.z);
       this.z.setXfermode(paint);
       tr = this.p;
       if (tr != null) {
          this.z.setColor(tr);
          p0.drawPath(this.y, this.z);
       }
       p0.restore();
       if (this.e != null) {
          tr = this.g;
          if (tr > null) {
             this.e(p0, tr, this.h, (this.t - ((float)tr / f)));
          }
          tr = this.i;
          if (tr > null) {
             this.e(p0, tr, this.j, ((this.t - (float)this.g) - ((float)tr / f)));
          }
       }else {
          tr = this.g;
          if (tr > null) {
             this.f(tr, this.h);
             this.y.addRoundRect(this.x, this.u, Path$Direction.CCW);
             p0.drawPath(this.y, this.z);
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.r = p0;
       this.s = p1;
       this.i();
       if (this.e != null) {
          float f = (float)Math.min(this.r, this.s) / 2.00f;
          this.t = f;
          float f1 = (float)this.r / 2.00f;
          float f2 = f1 - f;
          float f3 = (float)this.s / 2.00f;
          float f4 = f3 - f;
          this.w.set(f2, f4, (f1 + f), (f3 + f));
       }else {
          this.w.set(0, 0, (float)this.r, (float)this.s);
          if (this.f != null) {
             this.w = this.x;
          }
       }
       return;
    }
    public void setBorderColor(int p0){
       this.h = p0;
       this.invalidate();
    }
    public void setBorderWidth(float p0){
       this.g = n.c(this.d, p0);
       this.c(false);
    }
    public void setCornerBottomLeftRadius(int p0){
       this.n = p0;
       this.c(true);
    }
    public void setCornerBottomRightRadius(int p0){
       this.o = p0;
       this.c(true);
    }
    public void setCornerRadius(int p0){
       this.k = p0;
       this.c(false);
    }
    public void setCornerTopLeftRadius(int p0){
       this.l = p0;
       this.c(true);
    }
    public void setCornerTopRightRadius(int p0){
       this.m = p0;
       this.c(true);
    }
    public void setInnerBorderColor(int p0){
       this.j = p0;
       this.invalidate();
    }
    public void setInnerBorderWidth(int p0){
       this.i = n.c(this.d, (float)p0);
       this.d();
       this.invalidate();
    }
    public void setMaskColor(int p0){
       this.p = p0;
       this.invalidate();
    }
}
