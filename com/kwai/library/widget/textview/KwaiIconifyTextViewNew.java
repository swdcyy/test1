package com.kwai.library.widget.textview.KwaiIconifyTextViewNew;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.text.TextPaint;
import lnc.a1;
import android.content.res.Resources;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import android.graphics.drawable.Drawable;
import android.graphics.Paint$Style;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.Layout;
import android.content.res.ColorStateList;
import java.lang.Math;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.Paint$FontMetrics;
import android.graphics.Canvas;
import android.graphics.PathEffect;
import android.graphics.Path;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.graphics.CornerPathEffect;

public class KwaiIconifyTextViewNew extends View	// class@000a50
{
    public Paint A;
    public String B;
    public int C;
    public int D;
    public float E;
    public int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public int L;
    public float M;
    public boolean N;
    public CornerPathEffect O;
    public boolean P;
    public float Q;
    public int R;
    public int b;
    public Paint c;
    public TextPaint d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public ColorStateList k;
    public int l;
    public CharSequence m;
    public Typeface n;
    public Typeface o;
    public float p;
    public Drawable q;
    public Bitmap r;
    public int s;
    public Drawable t;
    public int u;
    public int v;
    public boolean w;
    public Bitmap x;
    public TextPaint y;
    public int z;
    public static int S;
    public static int T;

    public void KwaiIconifyTextViewNew(Context p0){
       super(p0, null);
    }
    public void KwaiIconifyTextViewNew(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiIconifyTextViewNew(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new Paint();
       this.d = new TextPaint();
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.m = "";
       this.p = 0x3f800000;
       this.s = 0x7f0823c2;
       this.u = a1.e(3.50f);
       this.v = a1.e(0x3fe00000);
       int i = -1;
       this.z = i;
       this.C = -305064;
       this.D = -164345;
       this.H = false;
       this.I = (float)a1.e(3.50f);
       float f = 0;
       this.Q = f;
       this.R = 1;
       int color = p0.getResources().getColor(R.color.arg_RES_7f060097);
       this.C = color;
       this.D = color;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.V1);
          this.I = typedArray.getDimension(11, this.I);
          this.K = typedArray.getDimension(13, f);
          this.J = (float)typedArray.getDimensionPixelOffset(14, 0);
          this.L = typedArray.getColor(12, i);
          this.u = typedArray.getDimensionPixelOffset(9, this.u);
          this.v = typedArray.getDimensionPixelOffset(10, this.v);
          int i1 = 4;
          this.w = typedArray.getBoolean(i1, 0);
          this.P = typedArray.getBoolean(2, 0);
          this.M = typedArray.getDimension(7, f);
          this.N = typedArray.getBoolean(3, 0);
          int intx = typedArray.getInt(5, 0);
          if (intx != 2) {
             if (intx != 3) {
                if (intx != i1) {
                   i1 = (intx != 5)? 1: 16;
                }else {
                   i1 = 8;
                }
             }
          }else {
             i1 = 2;
          }
          this.g(i1, 1);
          this.m = typedArray.getString(0);
          this.e = typedArray.getDimension(1, f);
          Drawable drawable = typedArray.getDrawable(6);
          this.q = drawable;
          if (drawable == null) {
             this.q = this.getContext().getResources().getDrawable(0x7f0819d7);
          }
          this.R = typedArray.getInteger(8, 0);
          typedArray.recycle();
       }
       this.c.setAntiAlias(1);
       this.c.setStyle(Paint$Style.FILL);
       this.d.setAntiAlias(1);
       this.d.setTextSize(this.e);
       Paint paint = new Paint(5);
       this.A = paint;
       paint.setFilterBitmap(1);
       this.f = (float)n.c(this.getContext(), 11.00f);
       KwaiIconifyTextViewNew.S = n.c(this.getContext(), 7.00f);
       KwaiIconifyTextViewNew.T = n.c(this.getContext(), 5.00f);
       return;
    }
    public void a(){
       if (TextUtils.isEmpty(this.m)) {
          return;
       }
       if (this.F > null && this.G != null) {
          float desiredWidth = Layout.getDesiredWidth(this.m, this.d);
          KwaiIconifyTextViewNew tF = this.F;
          if (desiredWidth - (float)tF > 0) {
             KwaiIconifyTextViewNew te = this.e;
             this.setContentTextSize((te - ((desiredWidth - (float)tF) * (te / desiredWidth))));
          }
       }
       return;
    }
    public void b(){
       this.g(4, false);
    }
    public void c(){
       this.g(2, false);
    }
    public void d(){
       this.g(1, false);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       KwaiIconifyTextViewNew tk = this.k;
       if (tk != null && tk.isStateful()) {
          this.k();
       }
       return;
    }
    public float e(){
       float f2;
       int i = 1;
       float f = 0;
       if ((this.b & i) == i) {
          KwaiIconifyTextViewNew tK = this.K;
          float f1 = (tK - f > 0)? this.I + tK: this.I;
          f2 = Math.max(f, f1);
       }else {
          f2 = 0;
       }
       int i1 = 2;
       if ((this.b & i1) == i1 && this.B != null) {
          f2 = Math.max(f2, this.f());
       }
       if ((this.b & 4) == 4) {
          KwaiIconifyTextViewNew tq = this.q;
          if (tq != null) {
             i = tq.getIntrinsicWidth();
          }else {
             tq = this.r;
             if (tq != null && tq.getWidth()) {
                i = this.r.getWidth();
             }else {
             label_004d :
                f2 = Math.max(f2, f);
             }
          }
          f = (float)i;
          goto label_004d ;
       }
       if ((this.b & 8) == 8) {
          f2 = Math.max(f2, (float)KwaiIconifyTextViewNew.S);
       }
       return f2;
    }
    public final float f(){
       if (this.y == null) {
          TextPaint textPaint = new TextPaint();
          this.y = textPaint;
          textPaint.setAntiAlias(true);
       }
       if (this.B == null) {
          return 0;
       }else {
          this.y.setTextSize(this.f);
          this.y.setColor(this.z);
          KwaiIconifyTextViewNew to = this.o;
          if (to == null) {
             this.y.setTypeface(Typeface.defaultFromStyle(0));
          }else {
             this.y.setTypeface(to);
          }
          int i = (int)Layout.getDesiredWidth(this.B, this.y);
          this.i = i;
          this.g = i + (this.u * 2);
          Paint$FontMetrics fontMetrics = this.y.getFontMetrics();
          i = (int)((Math.abs(fontMetrics.ascent) + Math.abs(fontMetrics.leading)) + Math.abs(fontMetrics.descent)) + (this.v * 2);
          this.h = i;
          if (this.g < i || this.w != null) {
             this.g = i;
          }
          return (float)this.g;
       }
    }
    public final void g(int p0,boolean p1){
       KwaiIconifyTextViewNew tb = this.b;
       this.b = (p1)? p0 | tb: (~ p0) & tb;
       if (this.b != tb) {
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public CharSequence getContentText(){
       return this.m;
    }
    public TextPaint getContentTextPaint(){
       return this.d;
    }
    public float getRedPointStokeWidth(){
       return this.K;
    }
    public int getTextWidth(){
       if (TextUtils.isEmpty(this.m)) {
          return 0;
       }
       int i = (int)Layout.getDesiredWidth(this.m, this.d);
       KwaiIconifyTextViewNew tF = this.F;
       if (tF > null) {
          i = Math.min(tF, i);
       }
       return i;
    }
    public void h(){
       this.g(4, true);
    }
    public void i(){
       this.g(2, true);
    }
    public void j(){
       this.H = false;
       this.g(1, 1);
    }
    public final void k(){
       int colorForStat = this.k.getColorForState(this.getDrawableState(), this.k.getDefaultColor());
       if (colorForStat != this.l) {
          this.l = colorForStat;
          this.d.setColor(colorForStat);
          this.invalidate();
       }
       return;
    }
    public void onDraw(Canvas p0){
       int i4;
       KwaiIconifyTextViewNew tx1;
       KwaiIconifyTextViewNew tq;
       super.onDraw(p0);
       PathEffect pathEffect = null;
       this.c.setPathEffect(pathEffect);
       Context context = this.getContext();
       int width = this.getWidth();
       int height = this.getHeight();
       this.d.setTypeface(this.n);
       Paint$FontMetrics fontMetrics = this.d.getFontMetrics();
       int textWidth = this.getTextWidth();
       int i = 2;
       int i1 = Math.max(this.getPaddingLeft(), ((((width - textWidth) - (int)this.Q) - (int)this.M) / i));
       int i2 = (int)(((((float)height - Math.abs(fontMetrics.descent)) - Math.abs(fontMetrics.ascent)) - Math.abs(fontMetrics.leading)) / 2.00f);
       int i3 = 16;
       if ((this.b & i3) == i3) {
          KwaiIconifyTextViewNew tx = this.x;
          if (tx != null && !tx.isRecycled()) {
             i4 = 1;
          label_006a :
             if (i4) {
                tx1 = this.x;
                p0.drawBitmap(tx1, ((float)(width - tx1.getWidth()) / 2.00f), ((float)(height - this.x.getHeight()) / 2.00f), this.A);
             }else if(!TextUtils.isEmpty(this.m)){
                p0.drawText(this.m.toString(), (float)i1, (((float)i2 + Math.abs(fontMetrics.ascent)) + Math.abs(fontMetrics.leading)), this.d);
             }
             width = (int)((float)(i1 + textWidth) + this.M);
             height = (int)((float)i2 + this.J);
             if ((this.b & 1) == 1) {
                int i5 = (this.N != null)? this.getHeight() / i: height;
                this.c.setAlpha(255);
                if (this.K > 0) {
                   this.c.setColor(this.L);
                   p0.drawCircle((float)width, (float)i5, (this.I + this.K), this.c);
                }
                this.c.setColor(this.C);
                if (this.H != null) {
                   this.c.setColor(0);
                }
                p0.drawCircle((float)width, (float)i5, this.I, this.c);
             }
             if ((this.b & i) == i && this.B != null) {
                this.f();
                tx1 = this.t;
                if (tx1 == null) {
                   Drawable drawable = this.getResources().getDrawable(this.s);
                }
                tx1.setBounds(0, 0, this.g, this.h);
                p0.save();
                KwaiIconifyTextViewNew tR = this.R;
                if ((tR & 0x03) == 3) {
                   p0.translate(((float)width - ((float)this.g / 2.00f)), ((float)height - ((float)this.h / 2.00f)));
                }else if((tR & 0x01) == 1){
                   p0.translate((float)width, ((float)height - ((float)this.h / 2.00f)));
                }else if((tR & 0x02) == i){
                   p0.translate(((float)width - ((float)this.g / 2.00f)), (float)height);
                }else if((tR & 4) == 4){
                   p0.translate((float)width, (float)height);
                }else {
                   p0.translate((float)width, ((float)height - ((float)this.h / 2.00f)));
                }
                tx1.draw(p0);
                fontMetrics = this.y.getFontMetrics();
                p0.drawText(this.B, ((float)(this.g - this.i) / 2.00f), (((((float)this.h + Math.abs(fontMetrics.ascent)) + Math.abs(fontMetrics.leading)) - Math.abs(fontMetrics.descent)) / 2.00f), this.y);
                p0.restore();
             }
             if ((this.b & 4) == 4) {
                width = width - n.c(context, 5.00f);
                height = height - n.c(context, 4.00f);
                tq = this.q;
                if (tq != null) {
                   p0.drawBitmap(tq.getBitmap(), (float)width, (float)height, this.A);
                }else {
                   tq = this.r;
                   if (tq != null) {
                      p0.drawBitmap(tq, (float)width, (float)height, pathEffect);
                   }
                }
             }
             int i6 = 8;
             if ((this.b & i6) == i6) {
                this.c.setColor(this.D);
                this.c.setAlpha((int)(this.p * 0x437f0000));
                tq = this.O;
                if (tq != null) {
                   this.c.setPathEffect(tq);
                }
                float f = (float)KwaiIconifyTextViewNew.S;
                float f1 = (float)KwaiIconifyTextViewNew.T;
                Path path = new Path();
                path.moveTo(0, 0);
                path.lineTo(f, 0);
                f = f / 2.00f;
                path.lineTo(f, f1);
                path.lineTo(0, 0);
                path.close();
                p0.save();
                p0.translate((float)width, (((float)this.getHeight() - f1) / 2.00f));
                p0.rotate(this.E, f, (f1 / 2.00f));
                p0.drawPath(path, this.c);
                p0.restore();
             }
             return;
          }
       }
       i4 = 0;
       goto label_006a ;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       int measuredHeig = this.getMeasuredHeight();
       int measuredWidt = this.getMeasuredWidth();
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          this.a();
          p0 = (int)((float)((this.getTextWidth() + this.getPaddingLeft()) + this.getPaddingRight()) + this.M);
          p1 = View$MeasureSpec.getSize(p1);
          if (this.getLayoutParams().width == -2 && this.P != null) {
             float f = this.e();
             this.Q = f;
             this.setMeasuredDimension(((int)f + p0), Math.max(measuredHeig, p1));
          }else {
             this.setMeasuredDimension(Math.max(measuredWidt, p0), Math.max(measuredHeig, p1));
          }
       }
       return;
    }
    public void setAutoTextSize(boolean p0){
       if (p0 != this.G) {
          this.G = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setCircleNumberBg(boolean p0){
       this.w = p0;
    }
    public void setContentText(CharSequence p0){
       this.m = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setContentTextColor(int p0){
       this.setContentTextColor(ColorStateList.valueOf(p0));
    }
    public void setContentTextColor(ColorStateList p0){
       this.k = p0;
       if (p0 != null) {
          this.k();
       }
       return;
    }
    public void setContentTextSize(float p0){
       if (this.e - p0) {
          this.e = p0;
          this.d.setTextSize(p0);
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setFakeHideRedPoint(boolean p0){
       this.H = p0;
    }
    public void setImageResourceId(int p0){
       this.q = this.getContext().getResources().getDrawable(p0);
       this.r = null;
       this.requestLayout();
       this.invalidate();
    }
    public void setImageSrcBitmap(Bitmap p0){
       this.x = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setMaxTextWidth(int p0){
       if (this.F != p0) {
          this.F = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setNotifyNumberPaintColor(int p0){
       this.z = p0;
    }
    public void setNumberBgDrawable(Drawable p0){
       this.t = p0;
    }
    public void setNumberBgResId(int p0){
       if (this.s != p0) {
          this.s = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setNumberGravity(int p0){
       this.R = p0;
    }
    public void setNumberImageBitmap(Bitmap p0){
       this.q = null;
       this.r = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setNumberText(String p0){
       this.B = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setNumberTextSize(float p0){
       if (this.f - p0) {
          this.f = p0;
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setNumberTypeFace(Typeface p0){
       this.o = p0;
    }
    public void setRedDotColor(int p0){
       this.C = p0;
    }
    public void setRotateDegrees(float p0){
       this.E = p0;
       this.invalidate();
    }
    public void setTriangleAlpha(float p0){
       this.p = p0;
    }
    public void setTriangleColor(int p0){
       this.D = p0;
    }
    public void setTriangleRadius(float p0){
       this.O = new CornerPathEffect(p0);
    }
    public void setTypeface(Typeface p0){
       this.n = p0;
       this.d.setTypeface(p0);
    }
}
