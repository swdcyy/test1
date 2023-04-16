package com.kwai.library.widget.textview.IconifyTextViewNew;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.text.TextPaint;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import lnc.a1;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import com.yxcorp.utility.n;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import java.lang.Math;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import java.lang.CharSequence;
import android.text.Layout;
import android.graphics.Paint$FontMetrics;
import android.graphics.Canvas;
import android.graphics.PathEffect;
import java.lang.String;
import android.graphics.Path;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.graphics.CornerPathEffect;

public class IconifyTextViewNew extends View	// class@000a40
{
    public int A;
    public int B;
    public boolean C;
    public Bitmap D;
    public Bitmap E;
    public TextPaint F;
    public int G;
    public Paint H;
    public String I;
    public float J;
    public int K;
    public int L;
    public float M;
    public int N;
    public boolean O;
    public float P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public CornerPathEffect U0;
    public int V;
    public boolean V0;
    public int W;
    public float W0;
    public int X0;
    public int b;
    public Paint c;
    public TextPaint d;
    public float e;
    public float f;
    public int g;
    public int h;
    public boolean i;
    public ColorStateList j;
    public int k;
    public CharSequence l;
    public Typeface m;
    public Typeface n;
    public int[] o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public Drawable z;

    public void IconifyTextViewNew(Context p0){
       super(p0, null);
    }
    public void IconifyTextViewNew(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void IconifyTextViewNew(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new Paint();
       this.d = new TextPaint();
       this.g = 0;
       this.h = 0;
       this.i = false;
       this.l = "";
       int[] ointArray = new int[2];
       this.o = ointArray;
       this.p = 0x3f800000;
       this.q = 0;
       this.r = 7.00f;
       this.s = 5.00f;
       this.t = 7.00f;
       this.u = 5.00f;
       this.v = IconifyTextViewNew$a.a;
       this.w = false;
       this.x = 0x7f0819d7;
       this.y = 0x7f0823c2;
       this.A = a1.e(3.50f);
       this.B = a1.e(0x3fe00000);
       this.G = -1;
       this.K = -305064;
       this.L = -164345;
       this.P = (float)a1.e(3.50f);
       this.U = 5;
       this.V = 4;
       this.W = a1.e(3.00f);
       this.W0 = 0;
       this.X0 = 1;
       this.K = p0.getResources().getColor(0x7f060097);
       this.c.setAntiAlias(1);
       this.c.setStyle(Paint$Style.FILL);
       this.d.setAntiAlias(1);
       Paint paint = new Paint(5);
       this.H = paint;
       paint.setFilterBitmap(1);
       this.f = (float)n.c(p0, 11.00f);
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.p1);
          this.P = typedArray.getDimension(6, this.P);
          this.S = typedArray.getDimension(8, 0);
          this.Q = typedArray.getDimensionPixelOffset(9, 0);
          this.T = typedArray.getColor(7, -1);
          this.A = typedArray.getDimensionPixelOffset(4, this.A);
          this.B = typedArray.getDimensionPixelOffset(5, this.B);
          this.C = typedArray.getBoolean(1, 0);
          this.V0 = typedArray.getBoolean(0, 0);
          this.X0 = typedArray.getInteger(3, 0);
          this.R = typedArray.getDimension(2, 0);
          typedArray.recycle();
       }
       return;
    }
    public void a(){
       this.d(4, false);
    }
    public void b(){
       this.d(2, false);
    }
    public void c(){
       this.d(1, false);
    }
    public final void d(int p0,boolean p1){
       IconifyTextViewNew tb = this.b;
       this.b = (p1)? p0 | tb: (~ p0) & tb;
       if (this.b != tb) {
          this.invalidate();
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       IconifyTextViewNew tj = this.j;
       if (tj != null && tj.isStateful()) {
          this.l();
       }
       return;
    }
    public void e(){
       this.d(4, true);
    }
    public void f(){
       this.d(16, true);
    }
    public void g(){
       this.d(2, true);
    }
    public final float getExtraWidth(){
       int i = 1;
       float f = 0;
       if ((this.b & i) == i) {
          f = Math.max(f, this.getExtraWidthWhenDrawRedDot());
       }
       i = 2;
       if ((this.b & i) == i && this.I != null) {
          f = Math.max(f, this.getExtraWidthWhenDrawNumber());
       }
       i = 4;
       if ((this.b & i) == i) {
          f = Math.max(f, this.getExtraWidthWhenDrawBitmap());
       }
       if ((this.b & 8) == 8) {
          f = Math.max(f, this.getExtraWidthWhenDrawTriangle());
       }
       return f;
    }
    public final float getExtraWidthWhenDrawBitmap(){
       int intrinsicWid;
       int i;
       float f = 5.00f;
       if (this.x != null) {
          intrinsicWid = this.getContext().getResources().getDrawable(this.x).getIntrinsicWidth();
          i = n.c(this.getContext(), f);
       }else {
          IconifyTextViewNew tD = this.D;
          if (tD != null && tD.getWidth()) {
             intrinsicWid = this.D.getWidth();
             i = n.c(this.getContext(), f);
          }else {
             return 0;
          }
       }
       return (float)(intrinsicWid - i);
    }
    public final float getExtraWidthWhenDrawNumber(){
       if (this.F == null) {
          TextPaint textPaint = new TextPaint();
          this.F = textPaint;
          textPaint.setAntiAlias(true);
       }
       if (this.I == null) {
          return 0;
       }else {
          this.F.setTextSize(this.f);
          this.F.setColor(-1);
          IconifyTextViewNew tn = this.n;
          if (tn == null) {
             this.F.setTypeface(Typeface.defaultFromStyle(0));
          }else {
             this.F.setTypeface(tn);
          }
          int i = (int)Layout.getDesiredWidth(this.I, this.F);
          Paint$FontMetrics fontMetrics = this.F.getFontMetrics();
          this.getResources().getDrawable(this.y);
          IconifyTextViewNew tg = this.g;
          if (tg == null) {
             tg = (this.A * 2) + i;
          }
          i = (int)((Math.abs(fontMetrics.ascent) + Math.abs(fontMetrics.leading)) + Math.abs(fontMetrics.descent)) + (this.B * 2);
          if (tg < i || this.C != null) {
             tg = i;
          }
          return ((float)tg - this.R);
       }
    }
    public final float getExtraWidthWhenDrawRedDot(){
       IconifyTextViewNew tS = this.S;
       float f = 0x3f000000;
       if (tS > 0) {
          return ((this.P + tS) + (float)n.c(this.getContext(), f));
       }
       return (this.P + (float)n.c(this.getContext(), f));
    }
    public final float getExtraWidthWhenDrawTriangle(){
       return (float)(n.c(this.getContext(), 7.00f) + this.W);
    }
    public float getRedPointStokeWidth(){
       return this.S;
    }
    public CharSequence getText(){
       return this.l;
    }
    public TextPaint getTextPaint(){
       return this.d;
    }
    public final int getTextWidth(){
       int i = (int)Layout.getDesiredWidth(this.l, this.d);
       IconifyTextViewNew tN = this.N;
       if (tN > null) {
          i = Math.min(tN, i);
       }
       return i;
    }
    public void h(){
       this.d(1, 1);
    }
    public void i(){
       this.d(8, true);
    }
    public void j(int p0){
       this.T = p0;
       this.invalidate();
    }
    public void k(float p0){
       this.S = p0;
       this.invalidate();
    }
    public final void l(){
       int colorForStat = this.j.getColorForState(this.getDrawableState(), this.j.getDefaultColor());
       if (colorForStat != this.k) {
          this.k = colorForStat;
          this.d.setColor(colorForStat);
          this.invalidate();
       }
       return;
    }
    public void onDraw(Canvas p0){
       IconifyTextViewNew e;
       IconifyTextViewNew n;
       IconifyTextViewNew iconifyTextV = this;
       Canvas uCanvas = p0;
       super.onDraw(p0);
       PathEffect pathEffect = null;
       iconifyTextV.c.setPathEffect(pathEffect);
       Context context = this.getContext();
       int width = this.getWidth();
       int height = this.getHeight();
       iconifyTextV.d.setTypeface(iconifyTextV.m);
       Paint$FontMetrics fontMetrics = iconifyTextV.d.getFontMetrics();
       int textWidth = this.getTextWidth();
       int i = 2;
       int i1 = Math.max(this.getPaddingLeft(), (((width - textWidth) - (int)iconifyTextV.W0) / i));
       textWidth = textWidth + i1;
       int i2 = (int)(((((float)height - Math.abs(fontMetrics.descent)) - Math.abs(fontMetrics.ascent)) - Math.abs(fontMetrics.leading)) / 2.00f);
       int i3 = 16;
       int i4 = 0;
       if ((iconifyTextV.b & i3) == i3) {
          e = iconifyTextV.E;
          if (e != null && !e.isRecycled()) {
             e = 1;
          label_006b :
             if (e) {
                IconifyTextViewNew o = iconifyTextV.o;
                i2 = i2 + o[1];
                o = iconifyTextV.E;
                uCanvas.drawBitmap(o, ((float)(width - o.getWidth()) / 2.00f), ((float)(height - iconifyTextV.E.getHeight()) / 2.00f), iconifyTextV.H);
                textWidth = ((iconifyTextV.E.getWidth() + width) / i) + o[i4];
             }else {
                uCanvas.drawText(iconifyTextV.l.toString(), (float)i1, (((float)i2 + Math.abs(fontMetrics.ascent)) + Math.abs(fontMetrics.leading)), iconifyTextV.d);
             }
             IconifyTextViewNew iconifyTextV1 = null;
             if ((iconifyTextV.b & 1) == 1) {
                Context context1 = this.getContext();
                int i5 = n.c(context1, 0x3f000000) + textWidth;
                width = (n.c(context1, 2.00f) + i2) + iconifyTextV.Q;
                iconifyTextV.c.setAlpha(255);
                if (iconifyTextV.S - iconifyTextV1 > 0) {
                   iconifyTextV.c.setColor(iconifyTextV.T);
                   uCanvas.drawCircle((float)i5, (float)width, (iconifyTextV.P + iconifyTextV.S), iconifyTextV.c);
                }
                iconifyTextV.c.setColor(iconifyTextV.K);
                uCanvas.drawCircle((float)i5, (float)width, iconifyTextV.P, iconifyTextV.c);
             }
             height = 4;
             if ((iconifyTextV.b & i) == i && iconifyTextV.I != null) {
                textWidth = (int)((float)textWidth - iconifyTextV.R);
                i2 = i2 - iconifyTextV.Q;
                if (iconifyTextV.F == null) {
                   TextPaint textPaint = new TextPaint();
                   iconifyTextV.F = textPaint;
                   textPaint.setAntiAlias(1);
                }
                iconifyTextV.F.setTextSize(iconifyTextV.f);
                iconifyTextV.F.setColor(iconifyTextV.G);
                n = iconifyTextV.n;
                if (n == null) {
                   iconifyTextV.F.setTypeface(Typeface.defaultFromStyle(i4));
                }else {
                   iconifyTextV.F.setTypeface(n);
                }
                width = (int)Layout.getDesiredWidth(iconifyTextV.I, iconifyTextV.F);
                fontMetrics = iconifyTextV.F.getFontMetrics();
                IconifyTextViewNew z = iconifyTextV.z;
                if (z == null) {
                   z = this.getResources().getDrawable(iconifyTextV.y);
                }
                if (iconifyTextV.i == null || iconifyTextV.g == null) {
                   iconifyTextV.g = (iconifyTextV.A * 2) + width;
                }
                int i6 = (int)((Math.abs(fontMetrics.ascent) + Math.abs(fontMetrics.leading)) + Math.abs(fontMetrics.descent)) + (iconifyTextV.B * 2);
                iconifyTextV.h = i6;
                if (iconifyTextV.g < i6 || iconifyTextV.C != null) {
                   iconifyTextV.g = i6;
                }
                z.setBounds(i4, i4, iconifyTextV.g, i6);
                p0.save();
                e = iconifyTextV.X0;
                if ((e & 0x03) == 3) {
                   uCanvas.translate(((float)textWidth - ((float)iconifyTextV.g / 2.00f)), ((float)i2 - ((float)iconifyTextV.h / 2.00f)));
                }else if((e & 0x01) == 1){
                   uCanvas.translate((float)textWidth, ((float)i2 - ((float)iconifyTextV.h / 2.00f)));
                }else if((e & 0x02) == i){
                   uCanvas.translate(((float)textWidth - ((float)iconifyTextV.g / 2.00f)), (float)i2);
                }else if((e & height) == height){
                   uCanvas.translate((float)textWidth, (float)i2);
                }else {
                   uCanvas.translate((float)textWidth, ((float)i2 - ((float)iconifyTextV.h / 2.00f)));
                }
                z.draw(uCanvas);
                uCanvas.drawText(iconifyTextV.I, (float)((iconifyTextV.g - width) / i), (((((float)iconifyTextV.h + Math.abs(fontMetrics.ascent)) + Math.abs(fontMetrics.leading)) - Math.abs(fontMetrics.descent)) / 2.00f), iconifyTextV.F);
                p0.restore();
             }
             if ((iconifyTextV.b & height) == height) {
                if (iconifyTextV.x != null) {
                   uCanvas.drawBitmap(context.getResources().getDrawable(iconifyTextV.x).getBitmap(), (float)(textWidth - n.c(context, (float)iconifyTextV.U)), (float)(i2 - n.c(context, (float)iconifyTextV.V)), iconifyTextV.H);
                }else if(iconifyTextV.D != null){
                   uCanvas.drawBitmap(iconifyTextV.D, (float)(textWidth - n.c(context, (float)iconifyTextV.U)), (float)(i2 - n.c(context, (float)iconifyTextV.V)), pathEffect);
                }
             }
             int i7 = 8;
             if ((iconifyTextV.b & i7) == i7) {
                context = this.getContext();
                iconifyTextV.c.setColor(iconifyTextV.L);
                float f = 0x437f0000;
                iconifyTextV.c.setAlpha((int)(iconifyTextV.p * f));
                IconifyTextViewNew u0 = iconifyTextV.U0;
                if (u0 != null) {
                   iconifyTextV.c.setPathEffect(u0);
                }
                float f1 = (float)n.c(context, iconifyTextV.r);
                float f2 = (float)n.c(context, iconifyTextV.s);
                Path path = new Path();
                path.moveTo(0, 0);
                path.lineTo(f1, 0);
                f1 = f1 / 2.00f;
                path.lineTo(f1, f2);
                path.lineTo(0, 0);
                path.close();
                p0.save();
                uCanvas.translate((float)(iconifyTextV.W + textWidth), (((float)this.getHeight() - f2) / 2.00f));
                uCanvas.rotate(iconifyTextV.M, f1, (f2 / 2.00f));
                uCanvas.drawPath(path, iconifyTextV.c);
                p0.restore();
                context = this.getContext();
                iconifyTextV.c.setColor(iconifyTextV.L);
                iconifyTextV.c.setAlpha((int)(iconifyTextV.q * f));
                u0 = iconifyTextV.U0;
                if (u0 != null) {
                   iconifyTextV.c.setPathEffect(u0);
                }
                f1 = (float)n.c(context, iconifyTextV.t);
                f2 = (float)n.c(context, iconifyTextV.u);
                path = new Path();
                path.moveTo(0, f2);
                path.lineTo(f1, f2);
                f1 = f1 / 2.00f;
                path.lineTo(f1, 0);
                path.lineTo(0, f2);
                path.close();
                p0.save();
                uCanvas.translate((float)(textWidth + iconifyTextV.W), (((float)this.getHeight() - f2) / 2.00f));
                uCanvas.rotate(iconifyTextV.M, f1, (f2 / 2.00f));
                uCanvas.drawPath(path, iconifyTextV.c);
                p0.restore();
             }
             return;
          }
       }
       e = null;
       goto label_006b ;
    }
    public void onMeasure(int p0,int p1){
       float desiredWidth;
       super.onMeasure(p0, p1);
       int measuredHeig = this.getMeasuredHeight();
       int measuredWidt = this.getMeasuredWidth();
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          if (this.N > null && this.O != null) {
             desiredWidth = Layout.getDesiredWidth(this.l, this.d);
             float f = (float)this.N;
             if (desiredWidth - f > 0) {
                IconifyTextViewNew te = this.e;
                this.setTextSize((te - ((desiredWidth - f) * (te / desiredWidth))));
             }
          }
          desiredWidth = (this.getTextWidth() + this.getPaddingLeft()) + this.getPaddingRight();
          p1 = View$MeasureSpec.getSize(p1);
          if (this.getLayoutParams().width == -2 && this.V0 != null) {
             float extraWidth = this.getExtraWidth();
             this.W0 = extraWidth;
             this.setMeasuredDimension(((int)extraWidth + desiredWidth), Math.max(measuredHeig, p1));
          }else {
             this.setMeasuredDimension(Math.max(measuredWidt, desiredWidth), Math.max(measuredHeig, p1));
          }
       }
       return;
    }
    public void setAutoTextSize(boolean p0){
       if (p0 != this.O) {
          this.O = p0;
          this.requestLayout();
       }
       return;
    }
    public void setCircleNumberBg(boolean p0){
       this.C = p0;
    }
    public void setImageBitmap(Bitmap p0){
       this.x = 0;
       this.D = p0;
       this.invalidate();
    }
    public void setImageResourceId(int p0){
       if (this.x != p0) {
          this.x = p0;
          this.D = null;
          this.invalidate();
       }
       return;
    }
    public void setImageSrcBitmap(Bitmap p0){
       this.E = p0;
       this.invalidate();
    }
    public void setMaxTextWidth(int p0){
       if (this.N != p0) {
          this.N = p0;
          this.requestLayout();
       }
       return;
    }
    public void setNotifyNumberPaintColor(int p0){
       this.G = p0;
    }
    public void setNumberBgDrawable(Drawable p0){
       this.z = p0;
    }
    public void setNumberBgResId(int p0){
       if (this.y != p0) {
          this.y = p0;
          this.invalidate();
       }
       return;
    }
    public void setNumberBgWidth(int p0){
       this.g = p0;
       this.i = true;
    }
    public void setNumberGravity(int p0){
       this.X0 = p0;
    }
    public void setNumberTextSize(float p0){
       this.f = p0;
    }
    public void setNumberTypeFace(Typeface p0){
       this.n = p0;
    }
    public void setRedDotColor(int p0){
       this.K = p0;
    }
    public void setRedPointLeftMargin(float p0){
       this.R = p0;
    }
    public void setRedPointTopMargin(int p0){
       this.Q = p0;
    }
    public void setRotateDegrees(float p0){
       this.M = p0;
       this.invalidate();
    }
    public void setText(CharSequence p0){
       this.l = p0;
       this.requestLayout();
       this.invalidate();
    }
    public void setTextColor(int p0){
       this.setTextColor(ColorStateList.valueOf(p0));
    }
    public void setTextColor(ColorStateList p0){
       this.j = p0;
       if (p0 != null) {
          this.l();
       }
       return;
    }
    public void setTextSize(float p0){
       this.e = p0;
       this.d.setTextSize(p0);
    }
    public void setTriangleAlpha(float p0){
       this.p = p0;
    }
    public void setTriangleColor(int p0){
       this.L = p0;
    }
    public void setTriangleDirection(int p0){
       this.v = p0;
    }
    public void setTriangleHeight(float p0){
       this.s = p0;
    }
    public void setTriangleIsAni(boolean p0){
       this.w = p0;
    }
    public void setTriangleLeftMargin(int p0){
       this.W = p0;
    }
    public void setTriangleRadius(float p0){
       this.U0 = new CornerPathEffect(p0);
    }
    public void setTriangleWidth(float p0){
       this.r = p0;
    }
    public void setTypeface(Typeface p0){
       this.m = p0;
       this.d.setTypeface(p0);
    }
    public void setUpTriangleAlpha(float p0){
       this.q = p0;
    }
    public void setUpTriangleHeight(float p0){
       this.u = p0;
    }
    public void setUpTriangleWidth(float p0){
       this.t = p0;
    }
}
