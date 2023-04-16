package com.kuaishou.live.core.basic.widget.LiveGradientBorderView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import java.lang.Integer;

public class LiveGradientBorderView extends View	// class@000902
{
    public Paint b;
    public RectF c;
    public LinearGradient d;
    public float e;
    public int[] f;
    public float[] g;
    public static final float[] h;

    static {
       LiveGradientBorderView.h = new float[2]{0,0x3f800000};
    }
    public void LiveGradientBorderView(Context p0){
       super(p0, null);
    }
    public void LiveGradientBorderView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGradientBorderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveGradientBorderView.class, "1")) {
       }else {
          Paint paint = new Paint();
          this.b = paint;
          paint.setAntiAlias(true);
          this.f = new int[2]{0xffab5bed,0x40d200fd};
          this.g = LiveGradientBorderView.h;
          this.e = 5.00f;
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGradientBorderView.class, "5")) {
          return;
       }
       this.c = null;
       this.postInvalidateDelayed(50);
       return;
    }
    public void onDraw(Canvas p0){
       RectF rectF = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, rectF, LiveGradientBorderView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoid(null, rectF, LiveGradientBorderView.class, "6") && rectF.c == null) {
          int paddingLeft = this.getPaddingLeft();
          int paddingTop = this.getPaddingTop();
          float f = (float)paddingLeft;
          float f1 = (float)paddingTop;
          RectF rectF1 = new RectF(f, f1, (float)(paddingLeft + ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight())), (float)(paddingTop + ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())));
          rectF.c = rectF1;
          LinearGradient linearGradie = new LinearGradient(rectF1.left, rectF1.top, rectF1.right, rectF1.bottom, rectF.f, rectF.g, Shader$TileMode.CLAMP);
          rectF.d = v2;
       }
       rectF.b.setStrokeWidth(rectF.e);
       rectF.b.setShader(rectF.d);
       rectF.b.setStyle(Paint$Style.STROKE);
       obj.drawRoundRect(rectF.c, 100.00f, 100.00f, rectF.b);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGradientBorderView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGradientBorderView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
       return;
    }
    public void setBorderWidthPx(float p0){
       this.e = p0;
    }
}
