package com.kuaishou.live.krn.dialog.internal.LiveRoundCornerWithoutJagLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Xfermode;
import android.graphics.Path$Direction;
import android.graphics.RectF;
import android.graphics.Path$Op;
import android.view.ViewGroup;
import android.graphics.Paint$Style;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.lang.Integer;
import android.view.View;
import java.lang.Float;
import lnc.a1;

public final class LiveRoundCornerWithoutJagLayout extends FrameLayout	// class@001d60
{
    public Xfermode b;
    public Paint c;
    public Path d;
    public Path e;
    public RectF f;
    public float g;
    public HashMap h;

    public void LiveRoundCornerWithoutJagLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveRoundCornerWithoutJagLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveRoundCornerWithoutJagLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new PorterDuffXfermode(PorterDuff$Mode.DST_IN);
       this.c = new Paint(1);
       this.d = new Path();
       this.e = new Path();
    }
    public void LiveRoundCornerWithoutJagLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(Canvas p0,float[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRoundCornerWithoutJagLayout.class, "5")) {
          return;
       }
       this.c.setXfermode(this.b);
       LiveRoundCornerWithoutJagLayout tf = this.f;
       if (tf != null) {
          this.e.addRoundRect(tf, p1, Path$Direction.CCW);
          this.d.reset();
          this.d.addRect(tf, Path$Direction.CCW);
          this.d.op(this.e, Path$Op.DIFFERENCE);
          p0.drawPath(this.d, this.c);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       LiveRoundCornerWithoutJagLayout tg;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRoundCornerWithoutJagLayout.class, "3")) {
          return;
       }
       super.dispatchDraw(p0);
       int i = 0;
       if (this.g - (float)i <= 0 || (p0 != null && !PatchProxy.applyVoidOneRefs(p0, this, LiveRoundCornerWithoutJagLayout.class, "4"))) {
          float[] uofloatArray = new float[]{tg,tg,tg,tg,0,0,0,0};
          tg = this.g;
          tg = this.c;
          tg.reset();
          tg.setAntiAlias(1);
          tg.setStyle(Paint$Style.FILL);
          tg.setXfermode(null);
          tg = this.e;
          try{
             tg.reset();
             Bitmap uBitmap = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap$Config.ARGB_8888);
             if (uBitmap == null) {
                this.a(p0, uofloatArray);
             }else {
                Canvas uCanvas = new Canvas(uBitmap);
                LiveRoundCornerWithoutJagLayout tf = this.f;
                if (tf != null) {
                   this.e.addRoundRect(tf, uofloatArray, Path$Direction.CCW);
                   this.d.reset();
                   this.d.addRect(tf, Path$Direction.CCW);
                   this.d.op(this.e, Path$Op.INTERSECT);
                   uCanvas.drawPath(this.d, this.c);
                }
                this.c.setXfermode(this.b);
                p0.drawBitmap(uBitmap, 0, 0, this.c);
                this.c.setXfermode(null);
             }
          }catch(java.lang.OutOfMemoryError e0){
             this.a(p0, e0);
          }
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveRoundCornerWithoutJagLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveRoundCornerWithoutJagLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.f = new RectF(0, 0, (float)p0, (float)p1);
       return;
    }
    public final void setTopRadius(float p0){
       if (PatchProxy.isSupport(LiveRoundCornerWithoutJagLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveRoundCornerWithoutJagLayout.class, "1")) {
          return;
       }
       this.g = (float)a1.e(p0);
       return;
    }
}
