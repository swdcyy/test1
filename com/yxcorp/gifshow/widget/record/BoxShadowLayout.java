package com.yxcorp.gifshow.widget.record.BoxShadowLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import qrd.l1;
import android.graphics.Canvas;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;

public final class BoxShadowLayout extends FrameLayout	// class@0019b2
{
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final Paint h;
    public final int i;
    public final Paint j;
    public final boolean k;
    public Path l;
    public boolean m;

    public void BoxShadowLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void BoxShadowLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void BoxShadowLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.b4, 0, 0);
       a.o(typedArray, "context.obtainStyledAttr¡­ostBoxShadowLayout, 0, 0\)");
       int color = typedArray.getColor(4, 0);
       this.c = color;
       this.d = typedArray.getDimension(7, 0);
       float dimension = typedArray.getDimension(3, 0);
       this.b = dimension;
       this.e = typedArray.getDimension(8, 0);
       this.f = typedArray.getDimension(5, 0);
       this.g = typedArray.getDimension(6, 0);
       int color1 = typedArray.getColor(2, 0);
       this.i = color1;
       this.k = typedArray.getBoolean(0, 0);
       this.m = typedArray.getBoolean(1, 0);
       typedArray.recycle();
       if (this.m == null) {
          this.setPadding((int)dimension, (int)dimension, (int)dimension, (int)dimension);
       }
       Paint paint = new Paint(7);
       paint.setAntiAlias(1);
       paint.setColor(color);
       paint.setStyle(Paint$Style.FILL);
       paint.setMaskFilter(new BlurMaskFilter(dimension, BlurMaskFilter$Blur.OUTER));
       this.h = paint;
       paint = new Paint(7);
       paint.setAntiAlias(1);
       paint.setColor(color1);
       paint.setStyle(Paint$Style.FILL);
       this.j = paint;
       this.setLayerType(1, null);
       return;
    }
    public void BoxShadowLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void dispatchDraw(Canvas p0){
       float f;
       float f1;
       Path path;
       l1 a;
       float f5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, BoxShadowLayout.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       if (this.l == null) {
          if (this.k != null) {
             BoxShadowLayout tf = this.f;
             BoxShadowLayout tg = this.g;
             f = (float)this.getWidth();
             f1 = (float)this.getHeight();
             if (PatchProxy.isSupport(BoxShadowLayout.class)) {
                path = PatchProxy.applyFourRefs(Float.valueOf(tf), Float.valueOf(tg), Float.valueOf(f), Float.valueOf(f1), this, BoxShadowLayout.class, "3");
                if (path != patchProxyRe) {
                }
             }
             path = new Path();
             path.addArc(new RectF(0, 0, f, f1), 0, 360.00f);
             path.offset(tf, tg);
             path.close();
          }else {
             float f2 = (float)this.getPaddingLeft();
             float f3 = (float)this.getPaddingTop();
             f = ((float)this.getWidth() - (float)this.getPaddingLeft()) - (float)this.getPaddingRight();
             f1 = ((float)this.getHeight() - (float)this.getPaddingTop()) - (float)this.getPaddingBottom();
             BoxShadowLayout td = this.d;
             int i = 2;
             int i1 = 0;
             if (PatchProxy.isSupport(BoxShadowLayout.class)) {
                Object[] objArray = new Object[]{Float.valueOf(f2),Float.valueOf(f3),Float.valueOf(f),Float.valueOf(f1),Float.valueOf(td),Float.valueOf(td),Float.valueOf(td),Float.valueOf(td)};
                Object obj = PatchProxy.apply(objArray, this, BoxShadowLayout.class, "4");
                if (obj != patchProxyRe) {
                   path = obj;
                label_014d :
                   path.offset(this.f, this.g);
                   a = l1.a;
                }
             }
             Path path1 = new Path();
             path1.moveTo(0, td);
             float f4 = (float)i1;
             if (td - f4 > 0) {
                path1.arcTo(new RectF(0, 0, (td * 2.00f), (td * 2.00f)), -180.00f, 90.00f);
             }
             path1.lineTo((f - td), 0);
             if (td - f4 > 0) {
                f5 = td * 2.00f;
                RectF rectF = new RectF((f - f5), 0, f, f5);
                path1.arcTo(rectF, -90.00f, 90.00f);
             }
             path1.lineTo(f, (f1 - td));
             if (td - f4 > 0) {
                float f6 = (float)i * td;
                f5 = f - f6;
                path1.arcTo(new RectF(f5, (f1 - f6), f, f1), 0, 90.00f);
             }
             path1.lineTo(td, f1);
             if (td - f4 > 0) {
                float f7 = td * 2.00f;
                path1.arcTo(new RectF(0, (f1 - f7), f7, f1), 90.00f, 90.00f);
             }
             path1.offset(f2, f3);
             path1.close();
             path = path1;
             goto label_014d ;
          }
          this.l = path;
       }
       BoxShadowLayout tl = this.l;
       a.m(tl);
       p0.drawPath(tl, this.h);
       if (this.i != null) {
          tl = this.l;
          a.m(tl);
          p0.drawPath(tl, this.j);
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(BoxShadowLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, BoxShadowLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.l = null;
       return;
    }
}
