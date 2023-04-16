package com.yxcorp.gifshow.NasaFeaturedSearchHotBubbleAnimView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import lnc.a1;
import qrd.l1;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Path$Direction;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public final class NasaFeaturedSearchHotBubbleAnimView extends FrameLayout	// class@0012fc
{
    public final Paint b;
    public final Path c;
    public final RectF d;
    public float e;
    public AnimatorSet f;

    public void NasaFeaturedSearchHotBubbleAnimView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.FILL);
       paint.setColor(a1.a(R.color.arg_RES_7f061e52));
       this.b = paint;
       this.c = new Path();
       this.d = new RectF();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSearchHotBubbleAnimView.class, "6")) {
          return;
       }
       this.c.reset();
       this.c.addRoundRect(this.d, this.e, this.e, Path$Direction.CCW);
       if (p0 != null) {
          p0.clipPath(this.c);
       }
       if (p0 != null) {
          p0.drawPath(this.c, this.b);
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NasaFeaturedSearchHotBubbleAnimView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NasaFeaturedSearchHotBubbleAnimView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          NasaFeaturedSearchHotBubbleAnimView td = this.d;
          td.set(td.left, td.top, (float)p3, (float)this.getHeight());
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(NasaFeaturedSearchHotBubbleAnimView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, NasaFeaturedSearchHotBubbleAnimView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.e = (float)this.getHeight() / 2.00f;
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(NasaFeaturedSearchHotBubbleAnimView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaFeaturedSearchHotBubbleAnimView.class, "7")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
