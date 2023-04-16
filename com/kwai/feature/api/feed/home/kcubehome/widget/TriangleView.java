package com.kwai.feature.api.feed.home.kcubehome.widget.TriangleView;
import android.view.View;
import com.kwai.feature.api.feed.home.kcubehome.widget.TriangleView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.graphics.PathEffect;
import com.yxcorp.utility.n;
import android.graphics.Path;
import java.lang.Float;
import android.graphics.CornerPathEffect;

public final class TriangleView extends View	// class@000f10
{
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public boolean i;
    public final Paint j;
    public int k;
    public CornerPathEffect l;
    public float m;
    public int n;
    public static final TriangleView$a o;

    static {
       TriangleView.o = new TriangleView$a(null);
    }
    public void TriangleView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void TriangleView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void TriangleView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = 0x3f800000;
       this.d = 7.00f;
       this.e = 4.00f;
       this.f = 7.00f;
       this.g = 4.00f;
       this.h = IconifyTextViewNew$a.a;
       Paint paint = new Paint();
       this.j = paint;
       this.k = (int)0xfffd7e07;
       paint.setAntiAlias(true);
       paint.setStyle(Paint$Style.FILL);
    }
    public void TriangleView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(int p0,boolean p1){
       if (PatchProxy.isSupport(TriangleView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, TriangleView.class, "9")) {
          return;
       }
       TriangleView tn = this.n;
       p0 = (p1)? p0 | tn: (~ p0) & tn;
       this.n = p0;
       if (p0 != tn) {
          p0 = ((p0 & 1) == 1)? 0: 8;
          this.setVisibility(p0);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, TriangleView.class, "7")) {
          return;
       }
       this.a(1, 1);
       return;
    }
    public void onDraw(Canvas p0){
       Context context;
       float f2;
       if (PatchProxy.applyVoidOneRefs(p0, this, TriangleView.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       int i = 2;
       float f = 0;
       int i1 = 255;
       if (!PatchProxy.applyVoidOneRefs(p0, this, TriangleView.class, "5")) {
          context = this.getContext();
          this.j.setColor(this.k);
          this.j.setAlpha((int)(this.b * (float)i1));
          TriangleView tl1 = this.l;
          if (tl1 != null) {
             this.j.setPathEffect(tl1);
          }
          float f4 = (float)n.c(context, this.d);
          f2 = (float)n.c(context, this.e);
          Path path1 = new Path();
          path1.moveTo(f, f);
          path1.lineTo(f4, f);
          float f5 = (float)i;
          f4 = f4 / f5;
          path1.lineTo(f4, f2);
          path1.lineTo(f, f);
          path1.close();
          p0.save();
          p0.rotate(this.m, f4, (f2 / f5));
          p0.drawPath(path1, this.j);
          p0.restore();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, TriangleView.class, "6")) {
          context = this.getContext();
          this.j.setColor(this.k);
          this.j.setAlpha((int)(this.c * (float)i1));
          TriangleView tl = this.l;
          if (tl != null) {
             this.j.setPathEffect(tl);
          }
          float f1 = (float)n.c(context, this.f);
          f2 = (float)n.c(context, this.g);
          Path path = new Path();
          path.moveTo(f, f2);
          path.lineTo(f1, f2);
          float f3 = (float)i;
          f1 = f1 / f3;
          path.lineTo(f1, f);
          path.lineTo(f, f2);
          path.close();
          p0.save();
          p0.rotate(this.m, f1, (f2 / f3));
          p0.drawPath(path, this.j);
          p0.restore();
       }
       return;
    }
    public final void setRotateDegrees(float p0){
       if (PatchProxy.isSupport(TriangleView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TriangleView.class, "3")) {
          return;
       }
       this.m = p0;
       this.invalidate();
       return;
    }
    public final void setTriangleAlpha(float p0){
       this.b = p0;
    }
    public final void setTriangleColor(int p0){
       if (PatchProxy.isSupport(TriangleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TriangleView.class, "1")) {
          return;
       }
       this.k = p0;
       this.invalidate();
       return;
    }
    public final void setTriangleDirection(int p0){
       this.h = p0;
    }
    public final void setTriangleHeight(float p0){
       this.e = p0;
    }
    public final void setTriangleIsAni(boolean p0){
       this.i = p0;
    }
    public final void setTriangleRadius(float p0){
       if (PatchProxy.isSupport(TriangleView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TriangleView.class, "2")) {
          return;
       }
       this.l = new CornerPathEffect(p0);
       return;
    }
    public final void setTriangleWidth(float p0){
       this.d = p0;
    }
    public final void setUpTriangleAlpha(float p0){
       this.c = p0;
    }
    public final void setUpTriangleHeight(float p0){
       this.g = p0;
    }
    public final void setUpTriangleWidth(float p0){
       this.f = p0;
    }
}
