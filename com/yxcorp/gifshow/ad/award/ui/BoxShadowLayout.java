package com.yxcorp.gifshow.ad.award.ui.BoxShadowLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import qrd.l1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Path;
import android.view.ViewGroup;

public final class BoxShadowLayout extends FrameLayout	// class@00152b
{
    public final RectF b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final Paint i;
    public final int j;
    public final Paint k;
    public HashMap l;

    public void BoxShadowLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void BoxShadowLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void BoxShadowLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new RectF();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.E, 0, 0);
       a.o(typedArray, "context.obtainStyledAttr¡­le.BoxShadowLayout, 0, 0\)");
       int color = typedArray.getColor(2, 0);
       this.d = color;
       this.e = typedArray.getDimension(5, 0);
       float dimension = typedArray.getDimension(1, 0);
       this.c = dimension;
       this.f = typedArray.getDimension(6, 0);
       this.g = typedArray.getDimension(3, 0);
       this.h = typedArray.getDimension(4, 0);
       int color1 = typedArray.getColor(0, 0);
       this.j = color1;
       typedArray.recycle();
       this.setPadding((int)dimension, (int)dimension, (int)dimension, (int)dimension);
       Paint paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(color);
       paint.setStyle(Paint$Style.FILL);
       paint.setMaskFilter(new BlurMaskFilter(dimension, BlurMaskFilter$Blur.OUTER));
       this.i = paint;
       paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(color1);
       paint.setStyle(Paint$Style.FILL);
       this.k = paint;
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
       Path path;
       BoxShadowLayout tb;
       float f5;
       if (PatchProxy.applyVoidOneRefs(p0, this, BoxShadowLayout.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       float f = (float)this.getPaddingLeft();
       float f1 = (float)this.getPaddingTop();
       float f2 = ((float)this.getWidth() - (float)this.getPaddingLeft()) - (float)this.getPaddingRight();
       float f3 = ((float)this.getHeight() - (float)this.getPaddingTop()) - (float)this.getPaddingBottom();
       BoxShadowLayout te = this.e;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(BoxShadowLayout.class)) {
          Object[] objArray = new Object[]{Float.valueOf(f),Float.valueOf(f1),Float.valueOf(f2),Float.valueOf(f3),Float.valueOf(te),Float.valueOf(te),Float.valueOf(te),Float.valueOf(te)};
          path = PatchProxy.apply(objArray, this, BoxShadowLayout.class, "2");
          if (path != PatchProxyResult.class) {
          label_010c :
             path.offset(this.g, this.h);
             p0.drawPath(path, this.i);
             if (this.j != null) {
                p0.drawPath(path, this.k);
             }
             super.dispatchDraw(p0);
             return;
          }
       }
       path = new Path();
       path.moveTo(0, te);
       float f4 = (float)i1;
       if (te - f4 > 0) {
          tb = this.b;
          tb.left = 0;
          tb.top = 0;
          f5 = te * 2.00f;
          tb.right = f5;
          tb.bottom = f5;
          path.arcTo(tb, -180.00f, 90.00f);
       }
       path.lineTo((f2 - te), 0);
       if (te - f4 > 0) {
          tb = this.b;
          f5 = te * 2.00f;
          tb.left = f2 - f5;
          tb.top = 0;
          tb.right = f2;
          tb.bottom = f5;
          path.arcTo(tb, -90.00f, 90.00f);
       }
       path.lineTo(f2, (f3 - te));
       if (te - f4 > 0) {
          tb = this.b;
          float f6 = (float)i * te;
          tb.left = f2 - f6;
          tb.top = f3 - f6;
          tb.right = f2;
          tb.bottom = f3;
          path.arcTo(tb, 0, 90.00f);
       }
       path.lineTo(te, f3);
       if (te - f4 > 0) {
          BoxShadowLayout tb1 = this.b;
          tb1.left = 0;
          float f7 = te * 2.00f;
          tb1.top = f3 - f7;
          tb1.right = f7;
          tb1.bottom = f3;
          path.arcTo(tb1, 90.00f, 90.00f);
       }
       path.offset(f, f1);
       path.close();
       goto label_010c ;
    }
}
