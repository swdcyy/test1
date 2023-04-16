package com.vivo.push.util.c;
import android.graphics.Bitmap;
import android.graphics.Matrix;

public final class c	// class@0010b1
{

    public static Bitmap a(Bitmap p0,int p1,int p2){
       int width = p0.getWidth();
       int height = p0.getHeight();
       float f = (float)p1 / (float)width;
       float f1 = (float)p2;
       float f2 = (float)height;
       try{
          f1 = f1 / f2;
          Matrix matrix = new Matrix();
          matrix.postScale(f, f1);
          p0 = Bitmap.createBitmap(p0, 0, 0, width, height, matrix, true);
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
}
