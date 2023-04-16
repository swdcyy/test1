package com.yxcorp.gifshow.camera.record.album.AlbumPopupBackgroundView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import com.yxcorp.gifshow.camera.record.album.AlbumPopupBackgroundView$ArrowPosition;
import android.graphics.Path;
import android.graphics.RectF;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import java.lang.Boolean;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;

public class AlbumPopupBackgroundView extends View	// class@001ca6
{
    public int b;
    public int c;
    public float d;
    public AlbumPopupBackgroundView$ArrowPosition e;
    public float f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public float k;
    public Paint l;
    public Paint m;
    public int[] n;
    public GradientDrawable$Orientation o;
    public final Path p;
    public final RectF q;
    public float r;
    public float s;
    public final float t;
    public final float u;
    public float v;
    public boolean w;
    public boolean x;
    public static final String y;

    static {
       AlbumPopupBackgroundView.y = "AlbumPopupBackgroundView";
    }
    public void AlbumPopupBackgroundView(Context p0){
       super(p0, null, -1);
    }
    public void AlbumPopupBackgroundView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void AlbumPopupBackgroundView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = (float)a1.e(8.00f);
       this.e = AlbumPopupBackgroundView$ArrowPosition.BOTTOM;
       this.j = false;
       this.n = null;
       this.p = new Path();
       this.q = new RectF();
       this.s = (float)a1.e(6.00f);
       this.t = 0;
       this.u = (float)a1.e(2.00f);
       this.v = 0.20f;
       this.w = true;
       this.x = true;
       this.h = (float)a1.e(6.00f);
       this.g = (float)a1.e(12.00f);
       this.f = (float)a1.e(2.00f);
       this.i = a1.a(0x7f061d68);
       this.s = (float)a1.e(6.00f);
       this.r = (float)a1.e(4.00f);
       p0.obtainStyledAttributes(p1, c$b.X3).recycle();
       int i = a1.a(R.color.arg_RES_7f06060a);
       int i1 = a1.a(R.color.arg_RES_7f06060a);
       GradientDrawable$Orientation tOP_BOTTOM = GradientDrawable$Orientation.TOP_BOTTOM;
       if (!PatchProxy.isSupport(AlbumPopupBackgroundView.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), tOP_BOTTOM, this, AlbumPopupBackgroundView.class, "7")) {
          int[] ointArray = new int[]{i,i1};
          this.n = ointArray;
          this.o = tOP_BOTTOM;
          this.a();
          this.j = true;
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, AlbumPopupBackgroundView.class, "1")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       Paint paint = new Paint();
       this.m = paint;
       paint.setAntiAlias(true);
       this.m.setShader(this.getGradient());
       this.m.setStyle(Paint$Style.FILL);
       paint = new Paint();
       this.l = paint;
       paint.setAntiAlias(true);
       this.l.setColor(0);
       this.l.setShadowLayer(this.r, 0, this.u, this.i);
       this.l.setStyle(Paint$Style.FILL);
       return;
    }
    public final LinearGradient getGradient(){
       float f;
       float f1;
       float f2;
       AlbumPopupBackgroundView obj = PatchProxy.apply(null, this, AlbumPopupBackgroundView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == GradientDrawable$Orientation.TOP_BOTTOM) {
          f = (float)this.b;
          f1 = 0;
       }else if(obj == GradientDrawable$Orientation.BL_TR){
          f2 = (float)this.b;
          f1 = (float)this.c;
       }else if(obj == GradientDrawable$Orientation.TL_BR){
          f1 = (float)this.c;
          f = (float)this.b;
          f2 = 0;
       }else {
          f1 = (float)this.c;
          f2 = 0;
       }
       f = 0;
       LinearGradient linearGradie = new LinearGradient(0, 0, f1, f, this.n, null, Shader$TileMode.CLAMP);
       return obj;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumPopupBackgroundView.class, "5")) {
          return;
       }
       if (this.b != null && (this.c != null && this.m != null)) {
          AlbumPopupBackgroundView tp = this.p;
          if (tp != null && this.j != null) {
             p0.drawPath(tp, this.l);
             p0.drawPath(this.p, this.m);
          }
       }
    label_002c :
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       AlbumPopupBackgroundView ts;
       AlbumPopupBackgroundView tr;
       AlbumPopupBackgroundView th;
       float f3;
       float f8;
       int i = 0;
       if (PatchProxy.isSupport(AlbumPopupBackgroundView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, AlbumPopupBackgroundView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.k = this.v * (float)this.c;
       Object[] objArray1 = new Object[i];
       a.D().s(AlbumPopupBackgroundView.y, "onLayout mTargetOffset "+this.k+" mRelativeArrowOffset "+this.v+" mViewWidth "+this.c, objArray1);
       this.a();
       if (!PatchProxy.applyVoid(null, this, AlbumPopupBackgroundView.class, "6")) {
          AlbumPopupBackgroundView tb = this.b;
          if (tb != null) {
             AlbumPopupBackgroundView tc = this.c;
             if (tc != null) {
                float f = (float)tc;
                float f1 = (float)tb;
                float f2 = 0;
                if (this.x != null) {
                   ts = this.s;
                   f = f - ts;
                   tr = this.r;
                   th = this.h;
                   f3 = tr + th;
                   f1 = (f1 - tr) - th;
                }else {
                   ts = 0;
                   f3 = 0;
                }
                this.p.reset();
                this.p.moveTo(ts, (f1 - this.d));
                this.p.lineTo(ts, (this.d + f3));
                th = this.d;
                float f4 = ts + th;
                this.q.set(ts, f3, f4, (th + f3));
                f4 = 180.00f;
                this.p.arcTo(this.q, f4, 90.00f);
                this.p.lineTo((f - this.d), f3);
                th = this.d;
                float f5 = f - th;
                this.q.set(f5, f3, f, (th + f3));
                this.p.arcTo(this.q, -90.00f, 90.00f);
                this.p.lineTo(f, (f1 - this.d));
                th = this.d;
                f5 = f - th;
                this.q.set(f5, (f1 - th), f, f1);
                this.p.arcTo(this.q, f2, 90.00f);
                tc = this.k;
                tr = this.g;
                float f6 = 2.00f;
                f5 = tr / f6;
                float f7 = f5 + tc;
                f = tc - f5;
                AlbumPopupBackgroundView tf = this.f;
                if (!tf - f2) {
                   this.p.lineTo(f7, f1);
                   this.p.lineTo(this.k, (this.h + f1));
                   this.p.lineTo(f, f1);
                }else {
                   f5 = tf / f6;
                   f2 = (float)((Math.atan((double)((this.h * f6) / tr)) * 180.00f) / 0x400921fb54442d18);
                   float f9 = f7 + f5;
                   this.p.lineTo(f9, f1);
                   this.q.set((f7 - f5), f1, f9, (f1 + f5));
                   f9 = 90.00f - f2;
                   this.p.arcTo(this.q, (-90.00f - f9), f9);
                   AlbumPopupBackgroundView tk = this.k;
                   float f10 = tk - f5;
                   float f11 = this.h + f1;
                   this.q.set(f10, (f11 - f5), (tk + f5), f11);
                   this.p.arcTo(this.q, f2, (f4 - (f2 * f6)));
                   f8 = this.f / f6;
                   f6 = f - f8;
                   f = f + f8;
                   this.q.set(f6, f1, f, (f8 + f1));
                   this.p.arcTo(this.q, -90.00f, f9);
                }
                this.p.lineTo((this.d + ts), f1);
                AlbumPopupBackgroundView td = this.d;
                f8 = f1 - td;
                this.q.set(ts, f8, (td + ts), f1);
                this.p.arcTo(this.q, 90.00f, 90.00f);
                this.p.close();
             }
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AlbumPopupBackgroundView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AlbumPopupBackgroundView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.b = this.getMeasuredHeight();
       this.c = this.getMeasuredWidth();
       return;
    }
}
