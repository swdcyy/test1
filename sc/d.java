package sc.d;
import java.lang.Object;
import ab.e;
import android.graphics.Bitmap;
import com.facebook.common.references.a;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import sc.d$a;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class d	// class@00240a
{

    public void d(){
       super();
    }
    public static void a(int p0,int p1){
       boolean b = true;
       boolean b1 = (p0 > 0)? true: false;
       e.b(b1, "width must be > 0");
       if (p1 <= 0) {
          b = false;
       }
       e.b(b, "height must be > 0");
       return;
    }
    public static void k(Bitmap p0,Bitmap p1){
       p1.setDensity(p0.getDensity());
       p1.setHasAlpha(p0.hasAlpha());
       p1.setPremultiplied(p0.isPremultiplied());
    }
    public a b(int p0,int p1){
       return this.c(p0, p1, Bitmap$Config.ARGB_8888);
    }
    public a c(int p0,int p1,Bitmap$Config p2){
       return this.i(p0, p1, p2);
    }
    public final a d(int p0,int p1,Bitmap$Config p2,boolean p3,Object p4){
       d.a(p0, p1);
       a uoa = this.i(p0, p1, p2);
       Bitmap uBitmap = uoa.j();
       uBitmap.setHasAlpha(p3);
       if (p2 == Bitmap$Config.ARGB_8888 && !p3) {
          uBitmap.eraseColor(0xff000000);
       }
       return uoa;
    }
    public a e(Bitmap p0){
       return this.h(p0, 0, 0, p0.getWidth(), p0.getHeight(), null);
    }
    public a f(Bitmap p0,int p1,int p2,int p3,int p4){
       return this.h(p0, p1, p2, p3, p4, null);
    }
    public a g(Bitmap p0,int p1,int p2,int p3,int p4,Matrix p5,boolean p6,Object p7){
       a uoa;
       Canvas uCanvas;
       Paint paint;
       Object obj = p0;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       int i3 = p4;
       Matrix matrix = p5;
       e.e(obj, "Source bitmap cannot be null");
       boolean b = (i >= 0)? true: false;
       e.b(b, "x must be >= 0");
       b = (i1 >= 0)? true: false;
       e.b(b, "y must be >= 0");
       d.a(p3, p4);
       b = i + i2;
       int b1 = (b <= p0.getWidth())? true: false;
       e.b(b1, "x + width must be <= bitmap.width\(\)");
       b1 = i1 + i3;
       boolean b2 = (b1 <= p0.getHeight())? true: false;
       e.b(b2, "y + height must be <= bitmap.height\(\)");
       Rect rect = new Rect(i, i1, b, b1);
       RectF rectF = new RectF(0, 0, (float)i2, (float)i3);
       Bitmap$Config aRGB_8888 = Bitmap$Config.ARGB_8888;
       Bitmap$Config config = p0.getConfig();
       if (config != null) {
          i = d$a.a[config.ordinal()];
          if (i != 1) {
             aRGB_8888 = (i != 2)? Bitmap$Config.ARGB_8888: Bitmap$Config.ALPHA_8;
          }else {
             aRGB_8888 = Bitmap$Config.RGB_565;
          }
       }
       Bitmap$Config uConfig = aRGB_8888;
       if (!matrix || p5.isIdentity()) {
          uoa = this.d(p3, p4, uConfig, p0.hasAlpha(), p7);
          d.k(obj, uoa.j());
          uCanvas = new Canvas(uoa.j());
          paint = null;
       }else {
          i = p5.rectStaysRect() ^ 1;
          RectF rectF1 = new RectF();
          matrix.mapRect(rectF1, rectF);
          int i4 = Math.round(rectF1.width());
          int i5 = Math.round(rectF1.height());
          if (i) {
             uConfig = Bitmap$Config.ARGB_8888;
          }
          Bitmap$Config uConfig1 = uConfig;
          boolean b3 = (i || p0.hasAlpha())? true: false;
          uoa = this.d(i4, i5, uConfig1, b3, p7);
          d.k(obj, uoa.j());
          uCanvas = new Canvas(uoa.j());
          uCanvas.translate((- rectF1.left), (- rectF1.top));
          uCanvas.concat(matrix);
          paint = new Paint();
          paint.setFilterBitmap(p6);
          if (i) {
             paint.setAntiAlias(1);
          }
       }
       uCanvas.drawBitmap(obj, rect, rectF, paint);
       uCanvas.setBitmap(null);
       return uoa;
    }
    public a h(Bitmap p0,int p1,int p2,int p3,int p4,Object p5){
       return this.g(p0, p1, p2, p3, p4, null, false, p5);
    }
    public abstract a i(int p0,int p1,Bitmap$Config p2);
    public a j(Bitmap p0,int p1,int p2,boolean p3){
       d.a(p1, p2);
       Matrix matrix = new Matrix();
       int width = p0.getWidth();
       int height = p0.getHeight();
       matrix.setScale(((float)p1 / (float)width), ((float)p2 / (float)height));
       return this.g(p0, 0, 0, width, height, matrix, p3, null);
    }
}
