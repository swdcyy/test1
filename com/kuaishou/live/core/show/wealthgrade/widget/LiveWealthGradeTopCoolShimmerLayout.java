package com.kuaishou.live.core.show.wealthgrade.widget.LiveWealthGradeTopCoolShimmerLayout;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.Paint;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import java.lang.Float;
import android.widget.LinearLayout;
import android.graphics.RectF;
import com.kwai.robust.PatchProxyResult;
import ar5.b;
import android.animation.TimeInterpolator;
import java.lang.Number;

public class LiveWealthGradeTopCoolShimmerLayout extends LiveWealthGradeShimmerLayout	// class@001284
{
    public Bitmap D;

    public void LiveWealthGradeTopCoolShimmerLayout(Context p0){
       super(p0, null);
    }
    public void LiveWealthGradeTopCoolShimmerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveWealthGradeTopCoolShimmerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = 800;
    }
    public void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeTopCoolShimmerLayout.class, "1")) {
          return;
       }
       if (this.D == null) {
          return;
       }
       if (this.b == null) {
          BitmapShader uBitmapShade = new BitmapShader(this.D, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
          this.b = uBitmapShade;
          this.e.setShader(uBitmapShade);
       }
       LiveWealthGradeShimmerLayout tf = this.f;
       float f = 0;
       if (tf == null || !tf.isRunning()) {
          this.g.reset();
          this.g.postTranslate((float)(- this.getWidth()), f);
          this.e.getShader().setLocalMatrix(this.g);
       }else {
          this.g.reset();
          this.g.setScale(this.getScale(), this.getScale());
          this.g.postTranslate(this.f.getAnimatedValue().floatValue(), f);
          this.e.getShader().setLocalMatrix(this.g);
       }
       this.m.set(f, f, (float)this.getWidth(), (float)this.getHeight());
       LiveWealthGradeShimmerLayout tk = this.k;
       float f1 = (float)tk;
       p0.drawRoundRect(this.m, f1, (float)tk, this.e);
       return;
    }
    public ValueAnimator getAnimator(){
       float f1;
       ValueAnimator obj = PatchProxy.apply(null, this, LiveWealthGradeTopCoolShimmerLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = (float)this.getWidth();
       if (this.D != null) {
          f1 = 0 - (this.getScale() * (float)this.D.getWidth());
          f = f - ((this.getScale() * (float)this.D.getWidth()) / 2.00f);
       }else {
          f1 = 0;
       }
       float[] uofloatArray = new float[]{f1,f};
       obj = ValueAnimator.ofFloat(uofloatArray);
       obj.setInterpolator(new b(0, 0, 0x3f147ae1, 0x3f800000));
       return obj;
    }
    public final float getScale(){
       Object obj = PatchProxy.apply(null, this, LiveWealthGradeTopCoolShimmerLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (((float)this.getHeight() * 0x3f800000) / (float)this.D.getHeight());
    }
    public void setShimmerBitmap(Bitmap p0){
       this.D = p0;
       this.b = null;
    }
}
