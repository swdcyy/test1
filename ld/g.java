package ld.g;
import ld.c;
import java.lang.Object;
import com.facebook.imageformat.a;
import android.graphics.Bitmap$CompressFormat;
import nc.a;
import bd.d;
import uc.e;
import uc.d;
import ld.a;
import java.io.OutputStream;
import java.lang.Integer;
import ld.b;
import android.graphics.BitmapFactory$Options;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.String;
import cb.a;
import ld.e;
import java.util.ArrayList;
import android.graphics.Matrix;
import java.lang.Throwable;

public class g implements c	// class@002548
{
    public final boolean a;
    public final int b;

    public void g(boolean p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static Bitmap$CompressFormat d(a p0){
       if (p0 == null) {
          return Bitmap$CompressFormat.JPEG;
       }
       if (p0 == a.a) {
          return Bitmap$CompressFormat.JPEG;
       }
       if (p0 == a.b) {
          return Bitmap$CompressFormat.PNG;
       }
       if (a.a(p0)) {
          return Bitmap$CompressFormat.WEBP;
       }
       return Bitmap$CompressFormat.JPEG;
    }
    public boolean a(d p0,e p1,d p2){
       if (p1 == null) {
          p1 = e.a();
       }
       boolean b = true;
       if (this.a == null || a.a(p1, p2, p0, this.b) <= b) {
          b = false;
       }
       return b;
    }
    public boolean b(a p0){
       boolean b = (p0 == a.k || p0 == a.a)? true: false;
       return b;
    }
    public b c(d p0,OutputStream p1,e p2,d p3,a p4,Integer p5){
       int i2;
       int i3;
       Rect rect1;
       Bitmap uBitmap2;
       g og = this;
       d uod = p0;
       Integer integer = (p5 == null)? Integer.valueOf(85): p5;
       e uoe = (p2 == null)? e.a(): p2;
       int i = 1;
       int i1 = (og.a == null)? 1: a.a(uoe, p3, uod, og.b);
       BitmapFactory$Options options = new BitmapFactory$Options();
       options.inSampleSize = i1;
       try{
          i2 = 2;
          Rect rect = null;
          Bitmap uBitmap = BitmapFactory.decodeStream(p0.k(), rect, options);
          if (uBitmap == null) {
             a.g("SimpleImageTranscoder", "Couldn\'t decode the EncodedImage InputStream ! ");
             return new b(i2);
          }else if(e.a.contains(Integer.valueOf(p0.g()))){
             i3 = e.a(uoe, uod);
             Matrix matrix = new Matrix();
             float f = 0x3f800000;
             Bitmap uBitmap1 = 0xbf800000;
             if (i3 != i2) {
                if (i3 != 7) {
                   if (i3 != 4) {
                      if (i3 == 5) {
                         matrix.setRotate(90.00f);
                         matrix.postScale(uBitmap1, f);
                      }
                   }else {
                      matrix.setRotate(180.00f);
                      matrix.postScale(uBitmap1, f);
                   }
                }else {
                   matrix.setRotate(-90.00f);
                   matrix.postScale(uBitmap1, f);
                }
             }else {
                matrix.setScale(uBitmap1, f);
             }
             rect1 = matrix;
          label_00a4 :
             if (rect1 != null) {
                int i4 = 0;
                try{
                   uBitmap2 = Bitmap.createBitmap(uBitmap, 0, i4, uBitmap.getWidth(), uBitmap.getHeight(), rect1, false);
                }catch(java.lang.OutOfMemoryError e0){
                   uBitmap2 = uBitmap;
                }
                a.h("SimpleImageTranscoder", "Out-Of-Memory during transcode", e0);
                uBitmap2.recycle();
                uBitmap.recycle();
                return new b(i2);
             }else {
                uBitmap2 = uBitmap;
             }
             try{
                uBitmap2.compress(g.d(p4), integer.intValue(), p1);
                if (i1 > i) {
                   i = 0;
                }
                uBitmap2.recycle();
                uBitmap.recycle();
                return new b(i);
             }catch(java.lang.OutOfMemoryError e0){
                goto label_00df ;
             }
          }else {
             i3 = e.b(uoe, uod);
             if (i3) {
                rect = new Matrix();
                rect.setRotate((float)i3);
             }
          }
          rect1 = rect;
          goto label_00a4 ;
       }catch(java.lang.OutOfMemoryError e0){
          a.h("SimpleImageTranscoder", "Out-Of-Memory during transcode", e0);
          return new b(i2);
       }
    }
    public String getIdentifier(){
       return "SimpleImageTranscoder";
    }
}
