package med.f;
import jd.a;
import ded.k;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import nfd.b$b;
import nfd.b$a;
import android.graphics.Color;
import java.lang.Math;

public class f extends a	// class@001d13
{
    public int c;
    public int d;

    public void f(){
       super();
       this.c = k.a;
       this.d = 10;
    }
    public void f(int p0){
       super();
       this.c = k.a;
       this.d = 10;
       this.d = p0;
    }
    public void d(Bitmap p0){
       int i;
       f uof;
       Bitmap uBitmap;
       float f;
       float f1;
       int i7;
       float f2;
       Object obj = this;
       b$b obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f.class, str)) {
          return;
       }
       f d = obj.d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj2 = null;
       if (PatchProxy.isSupport(uob)) {
          Bitmap obj3 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(d), obj2, uob, str);
          if (obj3 != patchProxyRe) {
             i = obj3.intValue();
          }else {
          label_0030 :
             int i1 = 64;
             obj3 = Bitmap.createBitmap(i1, i1, Bitmap$Config.ARGB_8888);
             int i2 = 1;
             int i3 = 0;
             new Canvas(obj3).drawBitmap(obj1, new Rect(i3, i3, (p0.getWidth() - i2), (p0.getHeight() - i2)), new RectF(0, 0, 63.00f, 63.00f), obj2);
             if (PatchProxy.isSupport(uob)) {
                obj1 = PatchProxy.applyTwoRefs(obj3, Integer.valueOf(d), obj2, uob, "2");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }
             }
             obj1 = new b$b(obj2);
             double d1 = 0;
             double d2 = d1;
             double d3 = d2;
             double d4 = d3;
             int i4 = 0;
             while (i4 < i1) {
                i2 = 0;
                while (i2 < i1) {
                   i1 = obj3.getPixel(i4, i2);
                   if (!i1) {
                      uof = d;
                      uBitmap = obj3;
                   }else {
                      i3 = i3 + 1;
                      uBitmap = obj3;
                      int i5 = i1 >> 24;
                      i5 = i5 & 0x00ff;
                      f = (float)i5;
                      obj1.a = f;
                      int i6 = i3;
                      i3 = i1 >> 16;
                      i3 = i3 & 0x00ff;
                      f1 = (float)i3;
                      obj1.b = f1;
                      i7 = i1 >> 8;
                      i7 = i7 & 0x00ff;
                      f2 = (float)i7;
                      obj1.c = f2;
                      i1 = i1 & 0x00ff;
                      float f3 = (float)i1;
                      obj1.d = f3;
                      uof = d;
                      d1 = d1 + (double)f;
                      d2 = d2 + (double)f1;
                      d3 = d3 + (double)f2;
                      d4 = d4 + (double)f3;
                      i3 = i6;
                   }
                   i2 = i2 + 1;
                   obj3 = uBitmap;
                   d = uof;
                   i1 = 64;
                }
                i4 = i4 + 1;
                i1 = 64;
                i7 = this;
             }
             double d5 = (double)i3;
             f2 = (float)(d1 / d5);
             obj1.a = f2;
             float f4 = (float)(d2 / d5);
             obj1.b = f4;
             float f5 = (float)(d3 / d5);
             obj1.c = f5;
             float f6 = (float)(d4 / d5);
             obj1.d = f6;
             float[] uofloatArray = new float[3];
             Color.colorToHSV((((((int)f2 << 24) | ((int)f4 << 16)) | ((int)f5 << 8)) | (int)f6), uofloatArray);
             i7 = 2;
             f = 100.00f;
             f uof1 = d;
             f5 = (float)uof1;
             f1 = ((uofloatArray[i7] * f) - f5 < 0 || ((uofloatArray[i7] * f) - (float)(uof1 - 100) > 0 && (uofloatArray[1] * f) - f5 < 0))? 1: 0;
             if (f1) {
                i7 = ((uofloatArray[i7] * f) - f5 < 0)? b.a: b.b;
             }else {
                uofloatArray[1] = (float)Math.min(Math.max(0x3fd3333333333333, (double)uofloatArray[1]), 0x3ff0000000000000);
                uofloatArray[i7] = (float)Math.min(Math.max(0x3fd3333333333333, (double)uofloatArray[i7]), 0x3fd999999999999a);
                i7 = Color.HSVToColor(uofloatArray);
             }
             i = i7;
          }
       }else {
          goto label_0030 ;
       }
       this.c = i;
       return;
    }
    public String getName(){
       return "TagColorSample";
    }
}
