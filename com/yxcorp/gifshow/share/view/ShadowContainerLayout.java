package com.yxcorp.gifshow.share.view.ShadowContainerLayout;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.share.view.ShadowContainerLayout$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import qrd.l1;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Float;
import java.lang.Integer;

public final class ShadowContainerLayout extends FrameLayout	// class@001c93
{
    public float b;
    public final Paint c;
    public final RectF d;
    public static final ShadowContainerLayout$a e;

    static {
       ShadowContainerLayout.e = new ShadowContainerLayout$a(null);
    }
    public void ShadowContainerLayout(Context p0){
       a.p(p0, "context");
       super(p0);
       this.setWillNotDraw(false);
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setAlpha(128);
       this.c = paint;
       this.d = new RectF();
    }
    public void ShadowContainerLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.setWillNotDraw(false);
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setAlpha(128);
       this.c = paint;
       this.d = new RectF();
    }
    public void ShadowContainerLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setWillNotDraw(false);
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setAlpha(128);
       this.c = paint;
       this.d = new RectF();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShadowContainerLayout.class, "4")) {
          return;
       }
       if (p0 != null) {
          int i = 1;
          if (this.getLayerType() != i) {
             this.setLayerType(i, null);
          }
          if (this.getChildCount() > 0) {
             View childAt = this.getChildAt(0);
             a.o(childAt, "child");
             this.d.set((float)childAt.getLeft(), (float)childAt.getTop(), (float)childAt.getRight(), (float)childAt.getBottom());
             p0.drawRoundRect(this.d, this.b, this.b, this.c);
          }
       }
       return;
    }
    public final void setCornerRadius(float p0){
       if (PatchProxy.isSupport(ShadowContainerLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ShadowContainerLayout.class, "1")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public final void setShadowAlpha(int p0){
       if (PatchProxy.isSupport(ShadowContainerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ShadowContainerLayout.class, "3")) {
          return;
       }
       this.c.setAlpha(p0);
       this.invalidate();
       return;
    }
}
