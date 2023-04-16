package com.kwai.feature.post.api.widget.bubble.GrowthPopupView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.feature.post.api.widget.bubble.GrowthPopupView$ArrowPosition;
import android.graphics.Path;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import java.lang.Math;
import com.kwai.feature.post.api.widget.bubble.GrowthPopupView$a;
import java.lang.Enum;
import android.graphics.Matrix;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;

public class GrowthPopupView extends View	// class@001496
{
    public int b;
    public int c;
    public float d;
    public GrowthPopupView$ArrowPosition e;
    public float f;
    public float g;
    public float h;
    public int i;
    public Paint j;
    public Paint k;
    public int[] l;
    public GradientDrawable$Orientation m;
    public final Path n;
    public final RectF o;
    public float p;
    public float q;
    public float r;
    public float s;

    public void GrowthPopupView(Context p0){
       super(p0, null, -1);
    }
    public void GrowthPopupView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void GrowthPopupView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = GrowthPopupView$ArrowPosition.TOP;
       this.l = null;
       this.n = new Path();
       this.o = new RectF();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, GrowthPopupView.class, "3")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       Paint paint = new Paint();
       this.k = paint;
       paint.setAntiAlias(true);
       this.k.setShader(this.getGradient());
       this.k.setStyle(Paint$Style.FILL);
       paint = new Paint();
       this.j = paint;
       paint.setAntiAlias(true);
       this.j.setColor(0);
       this.j.setShadowLayer(this.p, this.q, this.r, this.i);
       this.j.setStyle(Paint$Style.FILL);
       return;
    }
    public final void b(){
       float f;
       float f1;
       float f2;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, GrowthPopupView.class, "8")) {
          return;
       }
       GrowthPopupView b = obj.b;
       if (b != null) {
          GrowthPopupView c = obj.c;
          if (c != null) {
             GrowthPopupView s = obj.s;
             GrowthPopupView e = obj.e;
             if (e == GrowthPopupView$ArrowPosition.TOP || e == GrowthPopupView$ArrowPosition.RIGHT) {
                s = s * 0xbf800000;
             }
             GrowthPopupView$ArrowPosition lEFT = GrowthPopupView$ArrowPosition.LEFT;
             if (e == lEFT || e == GrowthPopupView$ArrowPosition.RIGHT) {
                f = (float)b;
                f1 = (float)b / 2.00f;
                f2 = (float)c;
             }else {
                f = (float)c;
                f2 = (float)b;
                f1 = (float)c / 2.00f;
             }
             obj.n.reset();
             float f3 = 0;
             obj.n.moveTo(f3, (f2 - obj.d));
             obj.n.lineTo(f3, (obj.d + f3));
             GrowthPopupView d = obj.d;
             float f4 = f3 + d;
             obj.o.set(f3, f3, f4, (d + f3));
             float f5 = 90.00f;
             obj.n.arcTo(obj.o, 180.00f, f5);
             obj.n.lineTo((f - obj.d), f3);
             d = obj.d;
             float f6 = f - d;
             obj.o.set(f6, f3, f, (d + f3));
             obj.n.arcTo(obj.o, -90.00f, f5);
             obj.n.lineTo(f, (f2 - obj.d));
             d = obj.d;
             float f7 = f - d;
             obj.o.set(f7, (f2 - d), f, f2);
             obj.n.arcTo(obj.o, f3, f5);
             GrowthPopupView g = obj.g;
             float f8 = ((g / 2.00f) + f1) + s;
             f7 = (f1 - (g / 2.00f)) + s;
             GrowthPopupView f9 = obj.f;
             if (!f9 - f3) {
                obj.n.lineTo(f8, f2);
                obj.n.lineTo((f1 + s), (obj.h + f2));
                obj.n.lineTo(f7, f2);
             }else {
                float f11 = f9 / 2.00f;
                f3 = (float)((Math.atan((double)((obj.h * 2.00f) / g)) * 180.00f) / 0x400921fb54442d18);
                float f12 = f8 + f11;
                obj.n.lineTo(f12, f2);
                obj.o.set((f8 - f11), f2, f12, (f2 + f11));
                f4 = f5 - f3;
                obj.n.arcTo(obj.o, (-90.00f - f4), f4);
                GrowthPopupView h = obj.h;
                obj.o.set(((f1 - f11) + s), ((f2 + h) - f11), ((f1 + f11) + s), (h + f2));
                obj.n.arcTo(obj.o, f3, (180.00f - (f3 * 2.00f)));
                s = obj.f;
                obj.o.set((f7 - (s / 2.00f)), f2, (f7 + (s / 2.00f)), ((s / 2.00f) + f2));
                obj.n.arcTo(obj.o, -90.00f, f4);
             }
             float f10 = 0;
             obj.n.lineTo((f10 + obj.d), f2);
             s = obj.d;
             obj.o.set(f10, (f2 - s), (f10 + s), f2);
             obj.n.arcTo(obj.o, 90.00f, 90.00f);
             obj.n.close();
             c = obj.e;
             if (c != GrowthPopupView$ArrowPosition.BOTTOM) {
                int i = 0;
                int i1 = GrowthPopupView$a.a[c.ordinal()];
                if (i1 != 1) {
                   if (i1 != 2) {
                      if (i1 == 3) {
                         i = 270;
                      }
                   }else {
                      i = 90;
                   }
                }else {
                   i = 180;
                }
                Matrix matrix = new Matrix();
                matrix.setRotate((float)i, ((0 + f) / 2.00f), ((f2 + 0) / 2.00f));
                b = obj.e;
                if (b == lEFT || b == GrowthPopupView$ArrowPosition.RIGHT) {
                   b = obj.c;
                   s = obj.b;
                   matrix.postTranslate(((float)(b - s) / 2.00f), ((float)(s - b) / 2.00f));
                }
                obj.n.transform(matrix);
             }
          }
       }
       return;
    }
    public float getArrowH(){
       return this.h;
    }
    public float getArrowW(){
       return this.g;
    }
    public final LinearGradient getGradient(){
       float f;
       float f1;
       float f2;
       GrowthPopupView obj = PatchProxy.apply(null, this, GrowthPopupView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
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
       LinearGradient linearGradie = new LinearGradient(0, 0, f1, f, this.l, null, Shader$TileMode.CLAMP);
       return obj;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthPopupView.class, "7")) {
          return;
       }
       if (this.b != null && (this.c != null && this.k != null)) {
          GrowthPopupView tn = this.n;
          if (tn != null) {
             p0.drawPath(tn, this.j);
             p0.drawPath(this.n, this.k);
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(GrowthPopupView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, GrowthPopupView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.a();
       this.b();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(GrowthPopupView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, GrowthPopupView.class, "5")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.b = this.getMeasuredHeight();
       this.c = this.getMeasuredWidth();
       return;
    }
    public void setArrowOffsetMiddle(float p0){
       if (PatchProxy.isSupport(GrowthPopupView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, GrowthPopupView.class, "10")) {
          return;
       }
       this.s = p0;
       this.b();
       this.invalidate();
       return;
    }
    public void setArrowPos(GrowthPopupView$ArrowPosition p0){
       this.e = p0;
    }
    public void setCornerRadius(float p0){
       this.d = p0;
    }
}
