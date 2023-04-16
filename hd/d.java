package hd.d;
import jd.a;
import com.facebook.cache.common.CacheKey;
import ta.d;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Object;
import ab.e;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.System;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Canvas;

public class d extends a	// class@002122
{
    public CacheKey c;
    public final boolean d;
    public static final boolean e = true;

    public void d(){
       super(true);
    }
    public void d(boolean p0){
       super();
       this.d = p0;
    }
    public CacheKey a(){
       if (this.c == null) {
          this.c = (d.e)? new d("XferRoundFilter"): new d("InPlaceRoundFilter");
       }
    label_001b :
       return this.c;
    }
    public void d(Bitmap p0){
       boolean b;
       int i8;
       int i11;
       int i15;
       int b2;
       e.d(p0);
       int width = p0.getWidth();
       int height = p0.getHeight();
       int i = Math.min(width, height) / 2;
       int i1 = width / 2;
       int i2 = height / 2;
       if (!i) {
       }else if(i >= 1){
          b = true;
       }else {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       b = 0x45000000;
       boolean b1 = (width > 0 && (float)width - b <= 0)? true: false;
       e.a(Boolean.valueOf(b1));
       b = (height > 0 && (float)height - b <= 0)? true: false;
       e.a(Boolean.valueOf(b));
       b = (i1 > 0 && i1 < width)? true: false;
       e.a(Boolean.valueOf(b));
       b = (i2 > 0 && i2 < height)? true: false;
       e.a(Boolean.valueOf(b));
       int[] ointArray = new int[(width * height)];
       p0.getPixels(ointArray, 0, width, 0, 0, width, height);
       b = i - 1;
       b1 = i1 + b;
       int i3 = i2 + b;
       int i4 = i2 - b;
       b1 = ((i1 - b) >= 0 && (i4 >= 0 && (b1 < width && i3 < height)))? true: false;
       e.a(Boolean.valueOf(b1));
       b1 = (- i) * 2;
       int[] ointArray1 = new int[width];
       int i5 = b1 + 1;
       i4 = 0;
       int i6 = 1;
       int i7 = 1;
       while (b >= i4) {
          i8 = i1 + b;
          int i9 = i1 - b;
          int i10 = i1 + i4;
          i11 = i;
          i = i1 - i4;
          int i12 = i2 + b;
          int i13 = i2 - b;
          int i14 = i1;
          i1 = i2 + i4;
          i15 = i2 - i4;
          b2 = (b >= 0 && (i10 < width && (i >= 0 && (i1 < height && i15 >= 0))))? true: false;
          e.a(Boolean.valueOf(b2));
          i1 = i1 * width;
          b2 = height;
          height = width * i15;
          i15 = i2;
          i2 = width * i12;
          i12 = b1;
          b1 = width * i13;
          i13 = i6;
          i6 = 0;
          System.arraycopy(ointArray1, i6, ointArray, i1, i9);
          System.arraycopy(ointArray1, i6, ointArray, height, i9);
          System.arraycopy(ointArray1, i6, ointArray, i2, i);
          System.arraycopy(ointArray1, i6, ointArray, b1, i);
          i1 = i1 + i8;
          i = width - i8;
          System.arraycopy(ointArray1, i6, ointArray, i1, i);
          height = height + i8;
          System.arraycopy(ointArray1, i6, ointArray, height, i);
          i2 = i2 + i10;
          i8 = width - i10;
          System.arraycopy(ointArray1, i6, ointArray, i2, i8);
          b1 = b1 + i10;
          System.arraycopy(ointArray1, i6, ointArray, b1, i8);
          if (i5 <= 0) {
             i4 = i4 + 1;
             i7 = i7 + 2;
             i5 = i5 + i7;
          }
          if (i5 > 0) {
             b = b - 1;
             i6 = i13 + 2;
             b1 = i6 + i12;
             i5 = i5 + b1;
          }else {
             i6 = i13;
          }
          i = i11;
          b1 = i12;
          i1 = i14;
          i2 = i15;
          height = b2;
          i9 = 1;
       }
       b2 = height;
       i11 = i;
       i15 = i2;
       for (i2 = i15 - i11; i2 >= 0; i2 = i2 - 1) {
          b = i2 * width;
          System.arraycopy(ointArray1, 0, ointArray, b, width);
       }
       b1 = 0;
       i8 = b2;
       for (i2 = i15 + i11; i2 < i8; i2 = i2 + 1) {
          b = i2 * width;
          System.arraycopy(ointArray1, b1, ointArray, b, width);
       }
       p0.setPixels(ointArray, 0, width, 0, 0, width, i8);
       return;
    }
    public void e(Bitmap p0,Bitmap p1){
       Paint paint;
       Paint paint1;
       e.d(p0);
       e.d(p1);
       if (d.e) {
          e.d(p1);
          e.d(p0);
          boolean b = true;
          p0.setHasAlpha(b);
          if (this.d != null) {
             paint = new Paint(b);
             paint1 = new Paint(b);
          }else {
             paint = new Paint();
             paint1 = new Paint();
          }
          paint.setColor(0xff000000);
          paint1.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
          Canvas uCanvas = new Canvas(p0);
          float f = (float)p1.getWidth() / 2.00f;
          float f1 = (float)p1.getHeight() / 2.00f;
          uCanvas.drawCircle(f, f1, Math.min(f, f1), paint);
          uCanvas.drawBitmap(p1, 0, 0, paint1);
       }else {
          super.e(p0, p1);
       }
       return;
    }
}
