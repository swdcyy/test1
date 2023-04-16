package com.yxcorp.gifshow.ad.widget.RoundCornerLayout;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import android.view.ViewGroup;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import ll8.c$b;
import android.content.res.TypedArray;

public class RoundCornerLayout extends FrameLayout	// class@001923
{
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    public RectF g;
    public Path h;
    public static final float i;

    static {
       RoundCornerLayout.i = (float)a1.e(4.00f);
    }
    public void RoundCornerLayout(Context p0){
       super(p0, null);
    }
    public void RoundCornerLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundCornerLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = true;
       this.c = true;
       this.d = true;
       this.e = true;
       this.f = RoundCornerLayout.i;
       this.setupAttributes(p1);
    }
    public void b(boolean p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(RoundCornerLayout.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, RoundCornerLayout.class, "3")) {
          return;
       }
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.invalidate();
       return;
    }
    public void dispatchDraw(Canvas p0){
       RoundCornerLayout tf;
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundCornerLayout.class, "1")) {
          return;
       }
       int i = p0.save();
       RoundCornerLayout tg = this.g;
       if (tg == null) {
          this.h = new Path();
          this.g = new RectF(0, 0, (float)p0.getWidth(), (float)p0.getHeight());
       }else {
          tg.right = (float)p0.getWidth();
          this.g.bottom = (float)p0.getHeight();
          this.h.reset();
       }
       float[] uofloatArray = new float[8]{0,0,0,0,0,0,0,0};
       if (this.b != null) {
          tf = this.f;
          uofloatArray[0] = tf;
          uofloatArray[1] = tf;
       }
       if (this.c != null) {
          tf = this.f;
          uofloatArray[2] = tf;
          uofloatArray[3] = tf;
       }
       if (this.e != null) {
          tf = this.f;
          uofloatArray[4] = tf;
          uofloatArray[5] = tf;
       }
       if (this.d != null) {
          tf = this.f;
          uofloatArray[6] = tf;
          uofloatArray[7] = tf;
       }
       this.h.addRoundRect(this.g, uofloatArray, Path$Direction.CW);
       p0.clipPath(this.h);
       super.dispatchDraw(p0);
       p0.restoreToCount(i);
       return;
    }
    public float getRadius(){
       return this.f;
    }
    public void setRadius(float p0){
       if (PatchProxy.isSupport(RoundCornerLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundCornerLayout.class, "2")) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
    public final void setupAttributes(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundCornerLayout.class, "4")) {
          return;
       }
       float i = RoundCornerLayout.i;
       if (PatchProxy.isSupport(RoundCornerLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(i), this, RoundCornerLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             i = obj.floatValue();
          label_0039 :
             TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.F4);
             this.f = typedArray.getDimension(3, i);
             boolean i1 = 4;
             if (typedArray.hasValue(i1)) {
                i1 = typedArray.getBoolean(i1, true);
                this.b = i1;
                this.c = i1;
             }else {
                this.b = typedArray.getBoolean(5, true);
                this.c = typedArray.getBoolean(6, true);
             }
             i1 = 0;
             if (typedArray.hasValue(i1)) {
                i1 = typedArray.getBoolean(i1, true);
                this.d = i1;
                this.e = i1;
             }else {
                this.d = typedArray.getBoolean(true, true);
                this.e = typedArray.getBoolean(2, true);
             }
             typedArray.recycle();
             return;
          }
       }
       i = TypedValue.applyDimension(true, i, c.c(this.getResources()));
       goto label_0039 ;
    }
}
