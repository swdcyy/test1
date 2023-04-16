package com.kuaishou.live.core.basic.widget.LiveGradientBackgroundView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import java.lang.IllegalArgumentException;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Path$Direction;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import java.lang.Integer;

public class LiveGradientBackgroundView extends View	// class@000901
{
    public Paint b;
    public Path c;
    public LinearGradient d;
    public int[] e;
    public float[] f;
    public static final float[] g;

    static {
       LiveGradientBackgroundView.g = new float[2]{0,0x3f800000};
    }
    public void LiveGradientBackgroundView(Context p0){
       super(p0, null);
    }
    public void LiveGradientBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGradientBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveGradientBackgroundView.class, "1")) {
       }else {
          Paint paint = new Paint();
          this.b = paint;
          paint.setAntiAlias(true);
          this.e = new int[2]{0x665200fd,0x333c00fd};
          this.f = LiveGradientBackgroundView.g;
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGradientBackgroundView.class, "4")) {
          return;
       }
       this.c = null;
       this.postInvalidateDelayed(20);
       return;
    }
    public void b(int[] p0,float[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGradientBackgroundView.class, "2")) {
          return;
       }
       if (p0 == null || p1 == null) {
          return;
       }
       if (p0.length != p1.length) {
          throw new IllegalArgumentException("colors and colorPos length not equal");
       }
       this.e = p0;
       this.f = p1;
       this.a();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGradientBackgroundView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (this.c == null && !PatchProxy.applyVoid(null, this, LiveGradientBackgroundView.class, "6")) {
          int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
          int i1 = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
          if (this.c == null) {
             RectF rectF = new RectF((float)0, (float)0, (float)(i + 0), (float)(i1 + 0));
             Path path = new Path();
             this.c = path;
             path.addRoundRect(rectF, 100.00f, 100.00f, Path$Direction.CCW);
             LinearGradient linearGradie = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.e, this.f, Shader$TileMode.CLAMP);
             this.d = path;
          }
       }
       p0.save();
       this.b.setShader(this.d);
       this.b.setStyle(Paint$Style.FILL);
       p0.clipPath(this.c);
       p0.drawPath(this.c, this.b);
       p0.restore();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveGradientBackgroundView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveGradientBackgroundView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a();
       return;
    }
}
