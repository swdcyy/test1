package ni0.e;
import oi0.b;
import ni0.e$a;
import nsd.u;
import java.lang.Object;
import android.graphics.Bitmap;
import oi0.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;
import java.lang.StringBuilder;
import ek0.d;
import android.view.View;
import java.lang.Throwable;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public final class e implements b	// class@003325
{
    public static final e$a a;

    static {
       e.a = new e$a(null);
    }
    public void e(){
       super();
    }
    public void a(Bitmap p0,int p1,float p2,boolean p3,b$a p4){
       double d;
       int i5;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p4;
       e uoe = e.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Float.valueOf(p2),Boolean.valueOf(p3),oobject1};
          if (PatchProxy.applyVoid(objArray, obj, uoe, "4")) {
             return;
          }
       }
       a.p(oobject, "bitmap");
       a.p(oobject1, "callback");
       Object obj1 = PatchProxy.applyOneRefs(oobject, obj, uoe, "5");
       if (obj1 != PatchProxyResult.class) {
          d = obj1.doubleValue();
       }else if(oobject == null){
          d = 0x3ff0000000000000;
       }else {
          int width = p0.getWidth();
          int height = p0.getHeight();
          if (width <= 0 || height <= 0) {
             d = 0x3ff0000000000000;
          }else {
             int[] ointArray = new int[256];
             int i2 = 0;
             int i3 = 0;
             while (i2 < height) {
                int i4 = 0;
                while (i4 < width) {
                   int pixel = oobject.getPixel(i4, i2);
                   double d1 = (double)Color.red(pixel) * 0x3fd322d0e5604189;
                   d = (double)Color.green(pixel) * 0x3fe2c8b439581062;
                   d1 = d1 + d;
                   d = (double)Color.blue(pixel) * 0x3fbd2f1a9fbe76c9;
                   d1 = d1 + d;
                   i5 = (int)d1;
                   int i6 = ointArray[i5] + i;
                   ointArray[i5] = i6;
                   ointArray[i5] = ointArray[i5];
                   i3 = i3 + 1;
                   i4 = i4 + 8;
                   i1 = 0;
                }
                i2 = i2 + 8;
                i1 = 0;
             }
             i5 = -1;
             i1 = 0;
             while (i1 <= 255) {
                if (i5 < ointArray[i1]) {
                   i5 = ointArray[i1];
                }
                i1 = i1 + 1;
             }
             d = ((double)i5 * 0x3ff0000000000000) / (double)i3;
          }
       }
       d.e("WhiteViewVerifyTools isWhiteBitmap: grayValue="+d);
       if (!p3) {
          oobject = null;
       }
       if ((float)d - p2 < 0) {
          i = false;
       }
       oobject1.a(i, oobject);
       return;
    }
    public void b(View p0,int p1,float p2,boolean p3,b$a p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Float.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "1")) {
             return;
          }
       }
       a.p(p0, "view");
       a.p(p4, "callback");
       Bitmap uBitmap = this.c(p0, p1);
       if (uBitmap == null) {
          p4.onError("captured bitmap is null");
          return;
       }else {
          this.a(uBitmap, p1, p2, p3, p4);
          return;
       }
    }
    public final Bitmap c(View p0,int p1){
       Bitmap obj;
       int i;
       Bitmap uBitmap;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (p1 <= 0) {
          i = width;
          p1 = height;
       }else {
          i = width / p1;
          p1 = height / p1;
          if (i < 0 || p1 < 0) {
             p1 = 0;
             i = 0;
          }
       }
       if (i > 0 && (p1 > 0 && (width <= 0 || height <= 0))) {
          d.i("WhiteViewVerifyTools capture failure, because view is invalid");
          return null;
       }else {
          obj = Bitmap.createBitmap(width, height, Bitmap$Config.RGB_565);
          obj.eraseColor(0);
          p0.draw(new Canvas(obj));
          a.o(obj, "bitmap");
          if (PatchProxy.isSupport(uoe)) {
             uBitmap = PatchProxy.applyThreeRefs(obj, Integer.valueOf(i), Integer.valueOf(p1), this, e.class, "3");
             if (uBitmap != patchProxyRe) {
             label_00a3 :
                return uBitmap;
             }
          }
          Matrix matrix = new Matrix();
          matrix.postScale((((float)i * 0x3f800000) / (float)obj.getWidth()), (((float)p1 * 0x3f800000) / (float)obj.getHeight()), 0, 0);
          uBitmap = Bitmap.createBitmap(i, p1, Bitmap$Config.RGB_565);
          new Canvas(uBitmap).drawBitmap(obj, matrix, new Paint());
          a.o(uBitmap, "ret");
          goto label_00a3 ;
       }
    }
}
