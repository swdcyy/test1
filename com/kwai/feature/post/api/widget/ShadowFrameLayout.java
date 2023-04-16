package com.kwai.feature.post.api.widget.ShadowFrameLayout;
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

public final class ShadowFrameLayout extends FrameLayout	// class@00147f
{
    public final RectF b;
    public final float c;
    public final int d;
    public final float e;
    public final Paint f;
    public HashMap g;

    public void ShadowFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ShadowFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ShadowFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new RectF();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.g4, 0, 0);
       a.o(typedArray, "context.obtainStyledAttr¡­yleable.PostShadow, 0, 0\)");
       p2 = typedArray.getColor(1, 0);
       this.d = p2;
       this.e = typedArray.getDimension(2, 0);
       float dimension = typedArray.getDimension(0, 0);
       this.c = dimension;
       typedArray.recycle();
       Paint paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(p2);
       paint.setStyle(Paint$Style.FILL);
       paint.setMaskFilter(new BlurMaskFilter(dimension, BlurMaskFilter$Blur.OUTER));
       this.setLayerType(1, null);
       this.f = paint;
    }
    public void ShadowFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, ShadowFrameLayout.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       float f = (float)this.getWidth();
       float f1 = (float)this.getHeight();
       ShadowFrameLayout te = this.e;
       if (PatchProxy.isSupport(ShadowFrameLayout.class)) {
          path = PatchProxy.applyThreeRefs(Float.valueOf(f), Float.valueOf(f1), Float.valueOf(te), this, ShadowFrameLayout.class, "2");
          if (path != PatchProxyResult.class) {
          label_015a :
             p0.drawPath(path, this.f);
             super.dispatchDraw(p0);
             return;
          }
       }
       path = new Path();
       path.moveTo((float)this.getPaddingLeft(), ((float)this.getPaddingTop() + te));
       if (te - (float)0 > 0) {
          this.b.left = (float)this.getPaddingLeft();
          this.b.top = (float)this.getPaddingTop();
          ShadowFrameLayout tb = this.b;
          float f2 = 2.00f * te;
          tb.right = tb.left + f2;
          tb.bottom = tb.top + f2;
          path.arcTo(tb, -180.00f, 90.00f);
          path.lineTo(((f - (float)this.getPaddingRight()) - te), (float)this.getPaddingTop());
          this.b.left = (f - (float)this.getPaddingRight()) - f2;
          this.b.top = (float)this.getPaddingTop();
          tb = this.b;
          tb.right = tb.left + f2;
          tb.bottom = tb.top + f2;
          path.arcTo(tb, -90.00f, 90.00f);
          path.lineTo((f - (float)this.getPaddingRight()), ((f1 - (float)this.getPaddingBottom()) - te));
          float f3 = (float)2 * te;
          this.b.left = (f - (float)this.getPaddingRight()) - f3;
          this.b.top = (f1 - (float)this.getPaddingBottom()) - f3;
          ShadowFrameLayout tb1 = this.b;
          tb1.right = tb1.left + f2;
          tb1.bottom = tb1.top + f2;
          path.arcTo(tb1, 0, 90.00f);
          path.lineTo(((float)this.getPaddingLeft() + te), (f1 - (float)this.getPaddingBottom()));
          this.b.left = (float)this.getPaddingLeft();
          this.b.top = (f1 - (float)this.getPaddingBottom()) - f2;
          tb1 = this.b;
          tb1.right = tb1.left + f2;
          tb1.bottom = tb1.top + f2;
          path.arcTo(tb1, 90.00f, 90.00f);
       }else {
          path.lineTo((f - (float)this.getPaddingRight()), (float)this.getPaddingTop());
          path.lineTo((f - (float)this.getPaddingRight()), (f1 - (float)this.getPaddingBottom()));
          path.lineTo((float)this.getPaddingLeft(), (f1 - (float)this.getPaddingBottom()));
       }
       path.close();
       goto label_015a ;
    }
}
