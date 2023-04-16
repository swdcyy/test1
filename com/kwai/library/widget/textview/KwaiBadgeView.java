package com.kwai.library.widget.textview.KwaiBadgeView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.textview.KwaiBadgeView$b;
import com.kwai.library.widget.textview.KwaiBadgeView$a;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.textview.c;
import com.kwai.library.widget.textview.c$a;
import j17.a;
import android.graphics.drawable.Drawable;
import java.lang.String;
import android.graphics.Paint$Style;
import android.text.TextPaint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetrics;
import java.lang.Math;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.view.View$MeasureSpec;
import java.lang.CharSequence;
import android.text.Layout;
import android.text.TextUtils;
import java.lang.Object;

public class KwaiBadgeView extends View	// class@000a43
{
    public int b;
    public final KwaiBadgeView$b c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public float j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public TextPaint o;
    public String p;
    public int q;
    public int r;
    public Paint s;
    public Drawable t;
    public static final int u;
    public static final int v;

    static {
       KwaiBadgeView.u = a1.e(16.00f);
       KwaiBadgeView.v = 0x7f0823c2;
    }
    public void KwaiBadgeView(Context p0){
       super(p0, null);
    }
    public void KwaiBadgeView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiBadgeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new KwaiBadgeView$b(null);
       Paint paint = new Paint();
       this.d = paint;
       this.f = a1.e(7.00f);
       int i = 0;
       this.k = i;
       this.l = a1.e(3.00f);
       this.m = i;
       this.r = KwaiBadgeView.u;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.D1);
          c$a k = c.k;
          this.f = typedArray.getDimensionPixelOffset(4, a.d(this.getContext(), k.a().e));
          this.g = typedArray.getDimensionPixelOffset(2, a.d(this.getContext(), k.a().f));
          this.h = typedArray.getColor(1, a.a(this.getContext(), k.a().c));
          this.l = typedArray.getDimensionPixelOffset(6, a.d(this.getContext(), k.a().h));
          this.m = typedArray.getDimensionPixelOffset(9, a.d(this.getContext(), k.a().i));
          this.n = typedArray.getBoolean(3, i);
          this.t = typedArray.getDrawable(5);
          this.p = typedArray.getString(7);
          this.q = typedArray.getColor(10, a.a(this.getContext(), k.a().d));
          this.e = typedArray.getColor(i, a.a(this.getContext(), k.a().b));
          this.j = (float)typedArray.getDimensionPixelOffset(8, a.d(this.getContext(), k.a().g));
          typedArray.recycle();
       }
       paint.setAntiAlias(1);
       paint.setStyle(Paint$Style.FILL);
       TextPaint textPaint = new TextPaint();
       this.o = textPaint;
       textPaint.setAntiAlias(1);
       this.o.setColor(this.q);
       Paint paint1 = new Paint(5);
       this.s = paint1;
       paint1.setFilterBitmap(1);
       Drawable drawable = this.getResources().getDrawable(KwaiBadgeView.v);
       this.i = drawable;
       drawable.setFilterBitmap(1);
       if (this.t != null) {
          this.a(4, 1);
       }else if(this.p != null){
          this.a(2, 1);
       }else {
          this.a(1, 1);
       }
       return;
    }
    public final void a(int p0,boolean p1){
       KwaiBadgeView tb = this.b;
       this.b = (p1)? p0 | tb: (~ p0) & tb;
       if (this.b != tb) {
          this.invalidate();
          this.requestLayout();
       }
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       int i = 1;
       float f = 2.00f;
       if ((this.b & i) == i) {
          float f1 = (float)this.getWidth() / f;
          float f2 = (float)this.getHeight() / f;
          float f3 = (float)this.f / f;
          if (this.g > null) {
             this.d.setColor(this.h);
             p0.drawCircle(f1, f2, ((float)this.g + f3), this.d);
          }
          this.d.setColor(this.e);
          p0.drawCircle(f1, f2, f3, this.d);
       }
       i = 2;
       if ((this.b & i) == i) {
          KwaiBadgeView tc = this.c;
          this.i.setBounds(0, 0, tc.a, tc.b);
          this.i.draw(p0);
          Paint$FontMetrics fontMetrics = this.o.getFontMetrics();
          KwaiBadgeView tc1 = this.c;
          p0.drawText(this.p, ((float)(tc1.a - this.k) / f), (((((float)tc1.b + Math.abs(fontMetrics.ascent)) + Math.abs(fontMetrics.leading)) - Math.abs(fontMetrics.descent)) / f), this.o);
       }
       i = 4;
       if ((this.b & i) == i) {
          p0.drawBitmap(this.t.getBitmap(), 0, 0, this.s);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       KwaiBadgeView tg;
       super.onMeasure(p0, p1);
       int i = 1;
       if ((this.b & i) == i) {
          if (View$MeasureSpec.getMode(p0) != 0x40000000) {
             tg = this.g;
             if (tg > null) {
                p1.a = this.f + (tg * 2);
             }else {
                tg.a = this.f;
             }
          }else {
             p0.a = this.getMeasuredWidth();
          }
          tg = this.c;
          tg.b = tg.a;
       }
       if ((this.b & 2) == 2 && this.p != null) {
          this.o.setTextSize(this.j);
          tg = (int)Layout.getDesiredWidth(this.p, this.o);
          this.k = tg;
          KwaiBadgeView tc = this.c;
          tg = tg + (this.l * 2);
          tc.a = tg;
          i = this.r + (this.m * 2);
          tc.b = i;
          if (tg < i || this.n != null) {
             tc.a = i;
          }
       }
       p1 = 4;
       if ((this.b & p1) == p1) {
          tg = this.t;
          if (tg != null) {
             p1.a = tg.getIntrinsicWidth();
             p1.b = tg.getIntrinsicHeight();
          }
       }
       tg = this.c;
       this.setMeasuredDimension(tg.a, tg.b);
       return;
    }
    public void setBadgeNumberText(int p0){
       this.setNumberText(String.valueOf(p0));
    }
    public void setBadgeNumberTextSize(float p0){
       if (!TextUtils.isEmpty(this.p) && this.j - p0) {
          this.j = p0;
          this.invalidate();
          this.requestLayout();
       }
       return;
    }
    public void setNumberText(String p0){
       if (!TextUtils.isEmpty(p0) && !p0.equals(this.p)) {
          this.p = p0;
          this.a(2, true);
       }
       return;
    }
}
