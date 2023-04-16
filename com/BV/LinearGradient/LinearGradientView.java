package com.BV.LinearGradient.LinearGradientView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import java.lang.Math;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import com.facebook.react.bridge.ReadableArray;
import ze.p;

public class LinearGradientView extends View	// class@000d48
{
    public final Paint b;
    public Path c;
    public RectF d;
    public LinearGradient e;
    public float[] f;
    public float[] g;
    public float[] h;
    public int[] i;
    public boolean j;
    public float[] k;
    public float l;
    public int[] m;
    public float[] n;

    public void LinearGradientView(Context p0){
       super(p0);
       this.b = new Paint(1);
       this.g = new float[2]{0,0};
       this.h = new float[2]{0,0x3f800000};
       this.j = false;
       this.k = new float[2]{0x3f000000,0x3f000000};
       this.l = 45.00f;
       this.m = new int[2]{0,0};
       this.n = new float[8]{0,0,0,0,0,0,0,0};
    }
    public final void a(){
       double d;
       float[] uofloatArray1;
       float f1;
       float[] uofloatArray2;
       float[] uofloatArray3;
       LinearGradientView ti = this.i;
       if (ti != null) {
          LinearGradientView tf = this.f;
          if (tf == null || ti.length == tf.length) {
             ti = this.g;
             tf = this.h;
             int i = 1;
             int i1 = 0;
             if (this.j != null && this.k != null) {
                float f = (float)Math.sqrt(2.00f);
                float[] uofloatArray = new float[]{(float)Math.cos(d) * f,(float)Math.sin(d) * f};
                d = (double)((this.l - 90.00f) * 0x3c8efa35);
                uofloatArray1 = new float[]{tf[i1] - (uofloatArray[i1] / f1),tf[i] - (uofloatArray[i] / f1)};
                tf = this.k;
                f1 = 2.00f;
                uofloatArray2 = new float[]{tf[i1] + (uofloatArray[i1] / f1),tf[i] + (uofloatArray[i] / f1)};
                uofloatArray3 = uofloatArray2;
             }
             LinearGradientView tm = this.m;
             LinearGradient linearGradie = new LinearGradient(((float)tm[i1] * uofloatArray1[i1]), (uofloatArray1[i] * (float)tm[i]), (uofloatArray3[i1] * (float)tm[i1]), (uofloatArray3[i] * (float)tm[i]), this.i, this.f, Shader$TileMode.CLAMP);
             this.e = uofloatArray2;
             this.b.setShader(uofloatArray2);
             this.invalidate();
          }
       }
       return;
    }
    public final void b(){
       if (this.c == null) {
          this.c = new Path();
          this.d = new RectF();
       }
       this.c.reset();
       LinearGradientView tm = this.m;
       this.d.set(0, 0, (float)tm[0], (float)tm[1]);
       this.c.addRoundRect(this.d, this.n, Path$Direction.CW);
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       LinearGradientView tc = this.c;
       if (tc == null) {
          p0.drawPaint(this.b);
       }else {
          p0.drawPath(tc, this.b);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       int[] ointArray = new int[]{p0,p1};
       this.m = ointArray;
       this.b();
       this.a();
    }
    public void setAngle(float p0){
       this.l = p0;
       this.a();
    }
    public void setAngleCenter(ReadableArray p0){
       float[] uofloatArray = new float[]{(float)p0.getDouble(0),(float)p0.getDouble(1)};
       this.k = uofloatArray;
       this.a();
    }
    public void setBorderRadii(ReadableArray p0){
       int i = p0.size();
       float[] uofloatArray = new float[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uofloatArray[i1] = p.c((float)p0.getDouble(i1));
       }
       this.n = uofloatArray;
       this.b();
       this.a();
       return;
    }
    public void setColors(ReadableArray p0){
       int i = p0.size();
       int[] ointArray = new int[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ointArray[i1] = p0.getInt(i1);
       }
       this.i = ointArray;
       this.a();
       return;
    }
    public void setEndPosition(ReadableArray p0){
       float[] uofloatArray = new float[]{(float)p0.getDouble(0),(float)p0.getDouble(1)};
       this.h = uofloatArray;
       this.a();
    }
    public void setLocations(ReadableArray p0){
       int i = p0.size();
       float[] uofloatArray = new float[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uofloatArray[i1] = (float)p0.getDouble(i1);
       }
       this.f = uofloatArray;
       this.a();
       return;
    }
    public void setStartPosition(ReadableArray p0){
       float[] uofloatArray = new float[]{(float)p0.getDouble(0),(float)p0.getDouble(1)};
       this.g = uofloatArray;
       this.a();
    }
    public void setUseAngle(boolean p0){
       this.j = p0;
       this.a();
    }
}
