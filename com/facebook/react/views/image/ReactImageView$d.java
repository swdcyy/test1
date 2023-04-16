package com.facebook.react.views.image.ReactImageView$d;
import jd.a;
import com.facebook.react.views.image.ReactImageView;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.d;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Matrix;
import xb.t$b;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Path$Direction;

public class ReactImageView$d extends a	// class@0013c0
{
    public final ReactImageView c;

    public void ReactImageView$d(ReactImageView p0){
       this.c = p0;
       super();
    }
    public void e(Bitmap p0,Bitmap p1){
       Object obj = this;
       Path obj1 = p0;
       Object obj2 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, ReactImageView$d.class, "2")) {
          return;
       }
       obj.c.r(ReactImageView.U);
       obj1.setHasAlpha(true);
       if (d.a(ReactImageView.U[0], 0) && (d.a(ReactImageView.U[1], 0) && (d.a(ReactImageView.U[2], 0) && d.a(ReactImageView.U[3], 0)))) {
          super.e(p0, p1);
          return;
       }else {
          Paint paint = new Paint();
          paint.setAntiAlias(true);
          paint.setShader(new BitmapShader(obj2, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
          Canvas uCanvas = new Canvas(obj1);
          float[] uofloatArray = new float[8];
          float[] u = ReactImageView.U;
          if (!PatchProxy.applyVoidThreeRefs(p1, u, uofloatArray, this, ReactImageView$d.class, "1")) {
             Matrix v = ReactImageView.V;
             obj.c.v.a(v, new Rect(0, 0, p1.getWidth(), p1.getHeight()), p1.getWidth(), p1.getHeight(), 0, 0);
             Matrix w = ReactImageView.W;
             v.invert(w);
             uofloatArray[0] = w.mapRadius(u[0]);
             uofloatArray[1] = uofloatArray[0];
             uofloatArray[2] = w.mapRadius(u[1]);
             uofloatArray[3] = uofloatArray[2];
             uofloatArray[4] = w.mapRadius(u[2]);
             uofloatArray[5] = uofloatArray[4];
             uofloatArray[6] = w.mapRadius(u[3]);
             uofloatArray[7] = uofloatArray[6];
          }
          obj1 = new Path();
          obj1.addRoundRect(new RectF(0, 0, (float)p1.getWidth(), (float)p1.getHeight()), uofloatArray, Path$Direction.CW);
          uCanvas.drawPath(obj1, paint);
          return;
       }
    }
}
