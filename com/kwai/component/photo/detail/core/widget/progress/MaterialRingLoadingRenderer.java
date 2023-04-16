package com.kwai.component.photo.detail.core.widget.progress.MaterialRingLoadingRenderer;
import com.kwai.component.photo.detail.core.widget.progress.b;
import android.graphics.RectF;
import android.graphics.Color;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.photo.detail.core.widget.progress.a;
import android.graphics.Paint;
import com.kwai.component.photo.detail.core.widget.progress.MaterialRingLoadingRenderer$RingPathTransform;
import com.kwai.component.photo.detail.core.widget.progress.MaterialRingLoadingRenderer$RingRotation;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;
import ke5.c;
import android.animation.TimeInterpolator;
import ke5.b;
import ke5.a;
import android.animation.AnimatorSet;
import com.yxcorp.utility.n;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Canvas;
import java.lang.Integer;
import android.graphics.ColorFilter;

public class MaterialRingLoadingRenderer extends b	// class@000a3c
{
    public final Paint j;
    public final MaterialRingLoadingRenderer$RingPathTransform k;
    public final MaterialRingLoadingRenderer$RingRotation l;
    public float m;
    public static final RectF n;
    public static final RectF o;
    public static final RectF p;
    public static final int q;

    static {
       MaterialRingLoadingRenderer.n = new RectF(-21.00f, -21.00f, 21.00f, 21.00f);
       MaterialRingLoadingRenderer.o = new RectF(-24.00f, -24.00f, 24.00f, 24.00f);
       MaterialRingLoadingRenderer.p = new RectF(-19.00f, -19.00f, 19.00f, 19.00f);
       MaterialRingLoadingRenderer.q = Color.argb(30, 0, 0, 0);
    }
    public void MaterialRingLoadingRenderer(Context p0){
       int i2;
       Paint paint = this;
       Object obj = p0;
       MaterialRingLoadingRenderer materialRing = MaterialRingLoadingRenderer.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       super(p0);
       Paint paint1 = new Paint();
       paint.j = paint1;
       MaterialRingLoadingRenderer$RingPathTransform ringPathTran = new MaterialRingLoadingRenderer$RingPathTransform();
       paint.k = ringPathTran;
       MaterialRingLoadingRenderer$RingRotation ringRotation = new MaterialRingLoadingRenderer$RingRotation();
       paint.l = ringRotation;
       int i = 2;
       Animator[] uAnimatorArr = new Animator[i];
       AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(ringPathTran, null, uoa, "1");
       int i1 = -1;
       if (uAnimatorSet != patchProxyRe) {
          i2 = 0;
       }else {
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(ringPathTran, "trimPathStart", new float[i]{0,0x3f400000});
          objectAnimat1.setDuration(1225);
          objectAnimat1.setInterpolator(c.b);
          objectAnimat1.setRepeatCount(i1);
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(ringPathTran, "trimPathEnd", new float[i]{0,0x3f400000});
          objectAnimat2.setDuration(1225);
          objectAnimat2.setInterpolator(b.b);
          objectAnimat2.setRepeatCount(i1);
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(ringPathTran, "trimPathOffset", new float[2]{0,0x3e800000});
          objectAnimat3.setDuration(1225);
          objectAnimat3.setInterpolator(a.a);
          objectAnimat3.setRepeatCount(-1);
          uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr1 = new Animator[]{objectAnimat1,objectAnimat2,objectAnimat3};
          i2 = 0;
          uAnimatorSet.playTogether(uAnimatorArr1);
       }
       uAnimatorArr[i2] = uAnimatorSet;
       ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(ringRotation, null, uoa, "2");
       if (objectAnimat != patchProxyRe) {
       }else {
          objectAnimat = ObjectAnimator.ofFloat(ringRotation, "rotation", new float[2]{0,0x44340000});
          objectAnimat.setDuration(6125);
          objectAnimat.setInterpolator(a.a);
          objectAnimat.setRepeatCount(-1);
       }
       uAnimatorArr[1] = objectAnimat;
       paint.a = uAnimatorArr;
       if (!PatchProxy.applyVoidOneRefs(obj, paint, materialRing, "1")) {
          paint.m = (float)n.c(obj, 0x3f800000);
       }
       if (!PatchProxy.applyVoid(null, paint, materialRing, "2")) {
          paint1.setAntiAlias(true);
          paint1.setStrokeWidth(paint.m);
          paint1.setStyle(Paint$Style.STROKE);
          paint1.setStrokeCap(Paint$Cap.ROUND);
          paint1.setColor(-1);
          paint1.setShadowLayer(2.00f, 0, 0, MaterialRingLoadingRenderer.q);
       }
       return;
    }
    public void a(Canvas p0,int p1,int p2){
       RectF o;
       float this;
       MaterialRingLoadingRenderer materialRing = MaterialRingLoadingRenderer.class;
       if (PatchProxy.isSupport(materialRing) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MaterialRingLoadingRenderer.class, "3")) {
          return;
       }
       float f = 2.00f;
       if (this.b != null) {
          o = MaterialRingLoadingRenderer.o;
          p0.scale(((float)p1 / o.width()), ((float)p2 / o.height()));
          p0.translate((o.width() / f), (o.height() / f));
       }else {
          o = MaterialRingLoadingRenderer.n;
          p0.scale(((float)p1 / o.width()), ((float)p2 / o.height()));
          p0.translate((o.width() / f), (o.height() / f));
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, materialRing, "4")) {
          p0.rotate(this.l.mRotation);
          MaterialRingLoadingRenderer tk = this.k;
          MaterialRingLoadingRenderer$RingPathTransform mTrimPathSta = tk.mTrimPathStart;
          this = ((tk.mTrimPathOffset + mTrimPathSta) * 360.00f) - 90.00f;
          MaterialRingLoadingRenderer$RingPathTransform mTrimPathEnd = tk.mTrimPathEnd;
          float f1 = (mTrimPathEnd - mTrimPathSta) * 360.00f;
          if (this.c - 750 < 0) {
             this.j.setStrokeWidth((mTrimPathEnd * this.m));
          }else {
             this.j.setStrokeWidth(this.m);
          }
          p0.drawArc(MaterialRingLoadingRenderer.p, this, f1, false, this.j);
       }
       return;
    }
    public void b(int p0){
       MaterialRingLoadingRenderer materialRing = MaterialRingLoadingRenderer.class;
       if (PatchProxy.isSupport(materialRing) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, materialRing, "5")) {
          return;
       }
       this.j.setAlpha(p0);
       return;
    }
    public void c(ColorFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MaterialRingLoadingRenderer.class, "6")) {
          return;
       }
       this.j.setColorFilter(p0);
       return;
    }
}
