package com.yxcorp.gifshow.widget.PopupBackgroundView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import com.yxcorp.gifshow.widget.PopupBackgroundView$ArrowPosition;
import android.graphics.Path;
import android.graphics.RectF;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import java.lang.Math;
import java.lang.Float;
import android.graphics.drawable.GradientDrawable$Orientation;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;

public class PopupBackgroundView extends View	// class@001898
{
    public int b;
    public int c;
    public float d;
    public PopupBackgroundView$ArrowPosition e;
    public float f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public float k;
    public Paint l;
    public Paint m;
    public int[] n;
    public GradientDrawable$Orientation o;
    public final Path p;
    public final RectF q;
    public float r;
    public float s;
    public final float t;
    public final float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;
    public static final String A;

    static {
       PopupBackgroundView.A = "PopupBackgroundView";
    }
    public void PopupBackgroundView(Context p0){
       super(p0, null, -1);
    }
    public void PopupBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void PopupBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = (float)a1.e(8.00f);
       this.e = PopupBackgroundView$ArrowPosition.TOP;
       this.j = false;
       this.n = null;
       this.p = new Path();
       this.q = new RectF();
       this.s = (float)a1.e(6.00f);
       this.t = 0;
       this.u = (float)a1.e(2.00f);
       this.z = true;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.X3);
       this.h = typedArray.getDimension(false, (float)a1.e(8.00f));
       this.g = typedArray.getDimension(2, (float)a1.e(20.00f));
       this.f = typedArray.getDimension(true, (float)a1.e(4.00f));
       this.i = typedArray.getColor(4, a1.a(0x7f062038));
       this.s = typedArray.getDimension(3, (float)a1.e(6.00f));
       this.r = typedArray.getDimension(5, (float)a1.e(4.00f));
       typedArray.recycle();
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PopupBackgroundView.class, "3")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       Paint paint = new Paint();
       this.m = paint;
       paint.setAntiAlias(true);
       this.m.setShader(this.getGradient());
       this.m.setStyle(Paint$Style.FILL);
       paint = new Paint();
       this.l = paint;
       paint.setAntiAlias(true);
       this.l.setColor(0);
       this.l.setShadowLayer(this.r, 0, this.u, this.i);
       this.l.setStyle(Paint$Style.FILL);
       return;
    }
    public final void b(){
       float f4;
       float f5;
       float f6;
       PopupBackgroundView r;
       PopupBackgroundView h;
       float f7;
       float f8;
       PopupBackgroundView d1;
       float f9;
       float f10;
       float f11;
       PopupBackgroundView h1;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, PopupBackgroundView.class, "8")) {
          return;
       }
       PopupBackgroundView b = obj.b;
       if (b != null) {
          PopupBackgroundView c = obj.c;
          if (c != null) {
             PopupBackgroundView e = obj.e;
             double d = 180.00f;
             float f = 180.00f;
             float f1 = -90.00f;
             float f2 = 0;
             float f3 = 90.00f;
             if (e == PopupBackgroundView$ArrowPosition.BOTTOM) {
                f4 = (float)c;
                f5 = (float)b;
                if (obj.z != null) {
                   e = obj.s;
                   f6 = (float)c - e;
                   r = obj.r;
                   h = obj.h;
                   f7 = r + h;
                   f5 = ((float)b - r) - h;
                }else {
                   f6 = f4;
                   f4 = 0;
                   f7 = 0;
                }
                obj.p.reset();
                obj.p.moveTo(e, (f5 - obj.d));
                obj.p.lineTo(e, (obj.d + f7));
                h = obj.d;
                f8 = e + h;
                obj.q.set(e, f7, f8, (h + f7));
                obj.p.arcTo(obj.q, f, f3);
                obj.p.lineTo((f6 - obj.d), f7);
                d1 = obj.d;
                f9 = f6 - d1;
                obj.q.set(f9, f7, f6, (d1 + f7));
                obj.p.arcTo(obj.q, f1, f3);
                obj.p.lineTo(f6, (f5 - obj.d));
                d1 = obj.d;
                f9 = f6 - d1;
                obj.q.set(f9, (f5 - d1), f6, f5);
                obj.p.arcTo(obj.q, f2, f3);
                b = obj.k;
                c = obj.g;
                PopupBackgroundView w = obj.w;
                f8 = ((c / 2.00f) + b) + w;
                f10 = (b - (c / 2.00f)) + w;
                w = obj.f;
                if (!w - f2) {
                   obj.p.lineTo(f8, f5);
                   obj.p.lineTo((obj.k + obj.w), (obj.h + f5));
                   obj.p.lineTo(f10, f5);
                }else {
                   f9 = w / 2.00f;
                   f6 = (float)((Math.atan((double)((obj.h * 2.00f) / c)) * d) / 0x400921fb54442d18);
                   f11 = f8 + f9;
                   obj.p.lineTo(f11, f5);
                   obj.q.set((f8 - f9), f5, f11, (f5 + f9));
                   f11 = f3 - f6;
                   obj.p.arcTo(obj.q, (f1 - f11), f11);
                   PopupBackgroundView k = obj.k;
                   h = obj.w;
                   h1 = obj.h;
                   obj.q.set(((k - f9) + h), ((f5 + h1) - f9), ((k + f9) + h), (h1 + f5));
                   obj.p.arcTo(obj.q, f6, (f - (f6 * 2.00f)));
                   d1 = obj.f;
                   obj.q.set((f10 - (d1 / 2.00f)), f5, (f10 + (d1 / 2.00f)), ((d1 / 2.00f) + f5));
                   obj.p.arcTo(obj.q, f1, f11);
                }
                obj.p.lineTo((obj.d + e), f5);
                c = obj.d;
                f8 = f5 - c;
                obj.q.set(e, f8, (c + e), f5);
                obj.p.arcTo(obj.q, 90.00f, 90.00f);
                obj.p.close();
             }else if(e == PopupBackgroundView$ArrowPosition.TOP){
                f4 = (float)c;
                f5 = (float)b;
                if (obj.z != null) {
                   e = obj.s;
                   f6 = (float)c - e;
                   r = obj.r;
                   d1 = obj.h;
                   f9 = r + d1;
                   f5 = ((float)b - r) - d1;
                }else {
                   f6 = f4;
                   f4 = 0;
                   f9 = 0;
                }
                obj.p.reset();
                obj.p.moveTo(e, (obj.d + f9));
                obj.p.lineTo(e, (f5 - obj.d));
                d1 = obj.d;
                f3 = f5 - d1;
                obj.q.set(e, f3, (d1 + e), f5);
                obj.p.arcTo(obj.q, f, f1);
                obj.p.lineTo((f6 - obj.d), f5);
                d1 = obj.d;
                f3 = f6 - d1;
                obj.q.set(f3, (f5 - d1), f6, f5);
                obj.p.arcTo(obj.q, 90.00f, f1);
                obj.p.lineTo(f6, (obj.d + f9));
                d1 = obj.d;
                f3 = f6 - d1;
                obj.q.set(f3, f9, f6, (d1 + f9));
                obj.p.arcTo(obj.q, f2, f1);
                b = obj.k;
                c = obj.g;
                PopupBackgroundView w1 = obj.w;
                f8 = ((c / 2.00f) + b) + w1;
                f10 = (b - (c / 2.00f)) + w1;
                w1 = obj.f;
                if (!w1 - f2) {
                   obj.p.lineTo(f8, f5);
                   obj.p.lineTo((obj.k + obj.w), (obj.h + f5));
                   obj.p.lineTo(f10, f5);
                }else {
                   f3 = w1 / 2.00f;
                   f6 = (float)((Math.atan((double)((obj.h * 2.00f) / c)) * d) / 0x400921fb54442d18);
                   float f12 = f8 + f3;
                   obj.p.lineTo(f12, f9);
                   f11 = f9 - f3;
                   obj.q.set((f8 - f3), f11, f12, f9);
                   float f13 = f6 - 90.00f;
                   obj.p.arcTo(obj.q, ((90.00f - f6) + 90.00f), f13);
                   d1 = obj.k;
                   PopupBackgroundView w2 = obj.w;
                   f12 = (d1 - f3) + w2;
                   h1 = obj.h;
                   f8 = (d1 + f3) + w2;
                   obj.q.set(f12, (f9 - h1), f8, ((f9 - h1) + f3));
                   f12 = - f6;
                   obj.p.arcTo(obj.q, f12, ((f6 * 2.00f) - f));
                   obj.q.set((f10 - f3), f11, (f10 + f3), f9);
                   obj.p.arcTo(obj.q, 90.00f, f13);
                }
                obj.p.lineTo((obj.d + e), f9);
                c = obj.d;
                f5 = e + c;
                obj.q.set(e, f9, f5, (c + f9));
                obj.p.arcTo(obj.q, -90.00f, -90.00f);
                obj.p.close();
             }
          }
       }
       return;
    }
    public void c(float p0,float p1,float p2){
       if (PatchProxy.isSupport(PopupBackgroundView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, PopupBackgroundView.class, "1")) {
          return;
       }
       this.h = p0;
       this.g = p1;
       this.f = p2;
       this.b();
       return;
    }
    public void d(int p0,int p1,GradientDrawable$Orientation p2){
       int[] ointArray = new int[]{p0,p1};
       this.n = ointArray;
       this.o = p2;
       this.a();
       this.j = true;
    }
    public void e(int[] p0,GradientDrawable$Orientation p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PopupBackgroundView.class, "9")) {
          return;
       }
       int i = 2;
       if (p0 == null) {
          this.n = new int[i]{-1,-1};
       }
       if (p0.length < i) {
          int[] ointArray = new int[i];
          ointArray[0] = p0[0];
          ointArray[1] = p0[0];
          this.n = ointArray;
       }else {
          this.n = p0;
       }
       this.o = p1;
       this.a();
       this.j = true;
       return;
    }
    public final LinearGradient getGradient(){
       float f;
       float f1;
       float f2;
       PopupBackgroundView obj = PatchProxy.apply(null, this, PopupBackgroundView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == GradientDrawable$Orientation.TOP_BOTTOM) {
          f = (float)this.b;
          f1 = 0;
       }else if(obj == GradientDrawable$Orientation.BL_TR){
          f2 = (float)this.b;
          f1 = (float)this.c;
       }else if(obj == GradientDrawable$Orientation.TL_BR){
          f1 = (float)this.c;
          f = (float)this.b;
          f2 = 0;
       }else {
          f1 = (float)this.c;
          f2 = 0;
       }
       f = 0;
       LinearGradient linearGradie = new LinearGradient(0, 0, f1, f, this.n, null, Shader$TileMode.CLAMP);
       return obj;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PopupBackgroundView.class, "7")) {
          return;
       }
       if (this.b != null && (this.c != null && this.m != null)) {
          PopupBackgroundView tp = this.p;
          if (tp != null && this.j != null) {
             p0.drawPath(tp, this.l);
             p0.drawPath(this.p, this.m);
          }
       }
    label_002c :
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(PopupBackgroundView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PopupBackgroundView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       PopupBackgroundView tc = this.c;
       float f = this.v + ((float)tc / 2.00f);
       if (this.y != null) {
          this.k = this.x * (float)tc;
          Log.b(PopupBackgroundView.A, "onLayout mTargetOffset "+this.k+" mRelativeArrowOffset "+this.x+" mViewWidth "+this.c);
       }else {
          Context uContext = null;
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             uContext = (f - (float)n.z(this.getContext()) > 0)? (float)(n.z(this.getContext()) - layoutParams.rightMargin): f + ((float)(layoutParams.leftMargin - layoutParams.rightMargin) / 2.00f);
          }
       label_00ad :
          this.k = (float)this.c - (uContext - this.v);
          Log.b(PopupBackgroundView.A, "onLayout mArrowRightInWindow "+this.v+" viewBgRight "+uContext+" windowWidth "+n.z(this.getContext())+" mViewWidth "+this.c);
       }
       this.a();
       this.b();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(PopupBackgroundView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PopupBackgroundView.class, "5")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.b = this.getMeasuredHeight();
       this.c = this.getMeasuredWidth();
       return;
    }
    public void setArrowOffsetMiddle(float p0){
       this.w = p0;
    }
    public void setArrowPos(PopupBackgroundView$ArrowPosition p0){
       this.e = p0;
    }
    public void setArrowRelativeOffset(float p0){
       this.x = p0;
       this.y = true;
    }
    public void setArrowRightInWindow(float p0){
       this.v = p0;
       this.y = false;
    }
    public void setCornerRadius(float p0){
       this.d = p0;
    }
    public void setLayoutShadow(boolean p0){
       this.z = p0;
    }
}
