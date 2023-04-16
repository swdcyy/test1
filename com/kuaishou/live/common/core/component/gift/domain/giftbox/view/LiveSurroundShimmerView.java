package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveSurroundShimmerView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zi1.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.Xfermode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;

public class LiveSurroundShimmerView extends View	// class@00122d
{
    public final Path b;
    public final Path c;
    public final RectF d;
    public final RectF e;
    public float f;
    public final Paint g;
    public float h;
    public float i;
    public float j;
    public final float[] k;
    public final float[] l;
    public final PorterDuffXfermode m;
    public PathMeasure n;
    public int o;
    public int p;
    public static final int q;

    public void LiveSurroundShimmerView(Context p0){
       super(p0, null);
    }
    public void LiveSurroundShimmerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveSurroundShimmerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       float[] uofloatArray = new float[2];
       this.k = uofloatArray;
       uofloatArray = new float[2];
       this.l = uofloatArray;
       this.o = 0;
       this.p = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.W2);
       this.h = (float)typedArray.getDimensionPixelOffset(2, 0);
       this.i = (float)typedArray.getDimensionPixelOffset(1, 0);
       this.j = (float)typedArray.getDimensionPixelOffset(0, 0) / 2.00f;
       this.o = a1.a(0x7f060271);
       this.p = a1.a(0x7f060272);
       this.b = new Path();
       this.d = new RectF();
       this.e = new RectF();
       this.g = new Paint();
       this.c = new Path();
       this.m = new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
    }
    public ValueAnimator a(){
       ValueAnimator obj = PatchProxy.apply(null, this, LiveSurroundShimmerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       obj.addUpdateListener(new m(this));
       return obj;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSurroundShimmerView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       p0.save();
       int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       this.b.reset();
       float f = (float)this.getWidth();
       float f1 = (float)this.getHeight();
       this.d.set(0, 0, f, f1);
       this.c.reset();
       this.c.addRoundRect(this.d, this.h, this.h, Path$Direction.CW);
       p0.clipPath(this.c);
       LiveSurroundShimmerView ti = this.i;
       this.e.set(ti, ti, (f - ti), (f1 - ti));
       this.b.addRoundRect(this.e, this.h, this.h, Path$Direction.CW);
       boolean b = false;
       if (this.n == null) {
          this.n = new PathMeasure(this.b, b);
       }
       LiveSurroundShimmerView tn = this.n;
       tn.getPosTan((tn.getLength() * this.f), this.k, this.l);
       LiveSurroundShimmerView tk = this.k;
       RadialGradient radialGradie = new RadialGradient(tk[b], tk[1], this.j, this.o, this.p, Shader$TileMode.CLAMP);
       this.g.setStyle(Paint$Style.FILL);
       this.g.setShader(tn);
       this.g.setColor(-1);
       tn = this.k;
       p0.drawCircle(tn[b], tn[1], this.j, this.g);
       this.g.setShader(null);
       this.g.setXfermode(this.m);
       p0.drawPath(this.b, this.g);
       this.g.setXfermode(null);
       p0.restoreToCount(i);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveSurroundShimmerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveSurroundShimmerView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(LiveSurroundShimmerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveSurroundShimmerView.class, "1")) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
}
