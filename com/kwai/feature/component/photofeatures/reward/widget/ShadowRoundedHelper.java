package com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$ArrowPosition;
import com.kwai.feature.component.photofeatures.reward.widget.ShadowRoundedHelper$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import qrd.l1;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.PointF;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qz5.b;
import java.lang.Enum;
import android.graphics.Path$Direction;
import kotlin.NoWhenBranchMatchedException;
import java.lang.Float;

public final class ShadowRoundedHelper	// class@001272
{
    public final Paint a;
    public float b;
    public boolean c;
    public final Path d;
    public final RectF e;
    public final PointF[] f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final ShadowRoundedHelper$ArrowPosition n;
    public final ShadowRoundedHelper$a o;

    public void ShadowRoundedHelper(int p0,float p1,float p2,float p3,float p4,ShadowRoundedHelper$ArrowPosition p5,ShadowRoundedHelper$a p6){
       Object obj = p5;
       a.p(obj, "arrowPosition");
       Object obj1 = p6;
       a.p(obj1, "callback");
       super(p0, p1, 0, 0, p2, p3, p4, obj, obj1);
    }
    public void ShadowRoundedHelper(int p0,float p1,int p2,float p3,float p4,float p5,float p6,ShadowRoundedHelper$ArrowPosition p7,ShadowRoundedHelper$a p8){
       a.p(p7, "arrowPosition");
       a.p(p8, "callback");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.l = p5;
       this.m = p6;
       this.n = p7;
       this.o = p8;
       Paint paint = new Paint();
       paint.setColor(p0);
       paint.setStyle(Paint$Style.FILL);
       boolean b = true;
       paint.setAntiAlias(b);
       int i = 0;
       if (p3 - (float)i > 0) {
          paint.setShadowLayer(p3, 0, 0, p2);
       }
       this.a = paint;
       this.b = 0xbf800000;
       this.c = b;
       this.d = new Path();
       this.e = new RectF();
       PointF[] pointFArray = new PointF[5];
       for (; i < 5; i++) {
          pointFArray[i] = new PointF();
       }
       this.f = pointFArray;
       return;
    }
    public final void a(Canvas p0){
       float height;
       Object obj = this;
       Object obj1 = p0;
       ShadowRoundedHelper shadowRounde = ShadowRoundedHelper.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, shadowRounde, "3")) {
          return;
       }
       a.p(obj1, "canvas");
       obj.d.reset();
       ShadowRoundedHelper e = obj.e;
       object oobject = 5;
       int i = 2;
       object oobject1 = 3;
       int i1 = 4;
       if (!PatchProxy.applyVoidOneRefs(e, obj, shadowRounde, "5")) {
          float paddingStart = obj.o.getPaddingStart();
          float f2 = obj.o.getWidth() - obj.o.getPaddingEnd();
          float paddingTop = obj.o.getPaddingTop();
          float f3 = obj.o.getHeight() - obj.o.getPaddingBottom();
          int i4 = b.c[obj.n.ordinal()];
          if (i4 != i) {
             if (i4 != oobject1) {
                if (i4 != i1) {
                   if (i4 == oobject) {
                      f2 = f2 - obj.k;
                   }
                }else {
                   f3 = f3 - obj.k;
                }
             }else {
                paddingStart = paddingStart + obj.k;
             }
          }else {
             paddingTop = paddingTop + obj.k;
          }
          e.set(paddingStart, paddingTop, f2, f3);
       }
       obj.d.addRoundRect(obj.e, obj.h, obj.h, Path$Direction.CW);
       e = obj.n;
       if (e == ShadowRoundedHelper$ArrowPosition.TOP || (e == ShadowRoundedHelper$ArrowPosition.BOTTOM && obj.c != null)) {
          e = obj.e;
          ShadowRoundedHelper f = obj.f;
          if (!PatchProxy.applyVoidTwoRefs(e, f, obj, shadowRounde, "4")) {
             shadowRounde = obj.b;
             if (shadowRounde - (float)0 < 0) {
                int i2 = b.a[obj.n.ordinal()];
                if (i2 != 1 && i2 != i) {
                   if (i2 != oobject1 && i2 != i1) {
                      if (i2 == oobject) {
                         shadowRounde = null;
                      }else {
                         throw new NoWhenBranchMatchedException();
                      }
                   }else {
                      height = obj.o.getHeight();
                   }
                }else {
                   height = obj.o.getWidth();
                }
                height = height / 2.00f;
             }
             oobject = f[0];
             object oobject2 = f[1];
             object oobject3 = f[i];
             object oobject4 = f[oobject1];
             object oobject5 = f[i1];
             float f1 = obj.m / 2.00f;
             int i3 = b.b[obj.n.ordinal()];
             if (i3 != i) {
                if (i3 == i1) {
                   oobject.set((shadowRounde - (obj.l / 2.00f)), e.bottom);
                   oobject2.set((shadowRounde - f1), ((e.bottom + obj.k) - f1));
                   oobject3.set(shadowRounde, (e.bottom + obj.k));
                   oobject4.set((shadowRounde + f1), ((e.bottom + obj.k) - f1));
                   oobject5.set((shadowRounde + (obj.l / 2.00f)), e.bottom);
                }
             }else {
                oobject.set((shadowRounde - (obj.l / 2.00f)), e.top);
                oobject2.set((shadowRounde - f1), ((e.top - obj.k) + f1));
                oobject3.set(shadowRounde, (e.top - obj.k));
                oobject4.set((shadowRounde + f1), ((e.top - obj.k) + f1));
                oobject5.set((shadowRounde + (obj.l / 2.00f)), e.top);
             }
          }
          e = obj.f;
          obj.d.moveTo(e[0].x, e[0].y);
          e = obj.f;
          obj.d.lineTo(e[1].x, e[1].y);
          e = obj.f;
          obj.d.quadTo(e[i].x, e[i].y, e[3].x, e[3].y);
          e = obj.f;
          obj.d.lineTo(e[4].x, e[4].y);
       }
       obj1.drawPath(obj.d, obj.a);
       p0.save();
       return;
    }
    public final void b(float p0){
       ShadowRoundedHelper shadowRounde = ShadowRoundedHelper.class;
       if (PatchProxy.isSupport(shadowRounde) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, shadowRounde, "1")) {
          return;
       }
       this.b = p0;
       this.o.a();
       return;
    }
}
