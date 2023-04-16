package com.yxcorp.utility.i$b;
import java.lang.Runnable;
import android.app.Activity;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Math;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.lang.Exception;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.lang.StringBuilder;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import com.yxcorp.utility.Log;
import ekd.p;
import com.yxcorp.utility.i$d;
import com.yxcorp.utility.i$b$a;
import ekd.k1;
import com.yxcorp.utility.i$b$b;
import com.yxcorp.utility.i$b$c;
import java.lang.Throwable;

public class i$b implements Runnable	// class@0009c9
{
    public final File b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public final WeakReference h;
    public i$d i;

    public void i$b(Activity p0,File p1,String p2,int p3,int p4,int p5){
       super();
       this.b = p1;
       this.h = new WeakReference(p0);
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public static String a(File p0,String p1,int p2,int p3,int p4){
       Matrix matrix;
       BitmapFactory$Options options = new BitmapFactory$Options();
       int b = true;
       options.inJustDecodeBounds = b;
       BitmapFactory.decodeFile(p1, options);
       float f = (float)p2;
       float f1 = (float)p3;
       float f2 = (float)options.outWidth;
       float f3 = (float)options.outHeight;
       float f4 = f2 / f3;
       float f5 = f / f1;
       if (f2 - f > 0 || f3 - f1 > 0) {
          if (f4 - f5 < 0) {
             f = f1 * f4;
          }else if(f4 - f5 > 0){
             f1 = f / f4;
          }
       }else if(new File(p1).length() - (long)p4 < 0){
          return p1;
       }else {
          f = f2;
          f1 = f3;
       }
       f2 = (float)options.outWidth;
       f3 = (float)options.outHeight;
       int i = (f2 - f > 0 || f3 - f1 > 0)? Math.min(Math.round((f2 / f)), Math.round((f3 / f1))): 1;
       options.inSampleSize = i;
       options.inJustDecodeBounds = false;
       Bitmap uBitmap = BitmapFactory.decodeFile(p1, options);
       Bitmap uBitmap1 = Bitmap.createScaledBitmap(uBitmap, (int)f, (int)f1, b);
       if (uBitmap1 != uBitmap) {
          uBitmap.recycle();
       }
       try{
          matrix = new Matrix();
          f = new ExifInterface(p1).getAttributeInt("Orientation", false);
          if (f == 6) {
             matrix.postRotate(90.00f);
          }else if(f == 3){
             matrix.postRotate(180.00f);
          }else if(f == 8){
             matrix.postRotate(270.00f);
          }
       }catch(java.lang.Exception e13){
          e13.printStackTrace();
       }
       Bitmap uBitmap2 = Bitmap.createBitmap(uBitmap1, 0, 0, uBitmap1.getWidth(), uBitmap1.getHeight(), matrix, true);
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       uBitmap2.compress(Bitmap$CompressFormat.JPEG, 85, uByteArrayOu);
       int len = uByteArrayOu.toByteArray().length;
       b = 75;
       while (b > 0 && len > p4) {
          uByteArrayOu.reset();
          uBitmap2.compress(Bitmap$CompressFormat.JPEG, b, uByteArrayOu);
          len = uByteArrayOu.toByteArray().length;
          b = b - 10;
       }
       uBitmap2.recycle();
       String absolutePath = new File(p0, p1.hashCode()+new File(p1).getName()).getAbsolutePath();
       if (new File(absolutePath).exists()) {
          return absolutePath;
       }else {
          byte[] uobyteArray = null;
          try{
             try{
                FileOutputStream uFileOutputS = new FileOutputStream(absolutePath);
                try{
                   BufferedOutputStream uBufferedOut = new BufferedOutputStream(uFileOutputS);
                   uBufferedOut.write(uByteArrayOu.toByteArray());
                   uBufferedOut.flush();
                   Log.g("compress", absolutePath);
                   p.d(uByteArrayOu);
                   p.d(uFileOutputS);
                   p.d(uBufferedOut);
                   return absolutePath;
                }catch(java.lang.Exception e12){
                }
             }catch(java.lang.Exception e15){
                uobyteArray = e15;
             }
          }catch(java.lang.Exception e13){
             uobyteArray = e13;
             uBitmap2 = uobyteArray;
          }
       }
    }
    public boolean b(){
       boolean b = (this.h.get() == null || this.h.get().isFinishing())? true: false;
       return b;
    }
    public void c(i$d p0){
       this.i = p0;
    }
    public void run(){
       k1.o(new i$b$a(this));
       String str = i$b.a(this.b, this.c, this.d, this.e, this.f);
       if (this.i != null && !this.b()) {
          this.i.b(str, this.g);
       }
       k1.o(new i$b$b(this, str));
       return;
    }
}
