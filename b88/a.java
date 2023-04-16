package b88.a;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Matrix;
import android.graphics.Bitmap$Config;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.MotionEvent;
import java.lang.Number;
import java.lang.Math;
import android.graphics.Rect;
import java.lang.Float;
import android.graphics.RectF;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.Display;
import java.lang.Boolean;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.ColorFilter;
import java.lang.StringBuilder;

public final class a	// class@00031c
{

    public void a(){
       super();
    }
    public static Bitmap a(Bitmap p0,int p1){
       Matrix obj1;
       float f1;
       float f2;
       a uoa = a.class;
       float[] obj = null;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uoa, "7");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 == null) {
          return obj;
       }else {
          obj1 = new Matrix();
          float f = 2.00f;
          obj1.setRotate((float)p1, ((float)p0.getWidth() / f), ((float)p0.getHeight() / f));
          if (p1 == 90) {
             f1 = (float)p0.getHeight();
             f2 = 0;
          }else {
             f1 = (float)p0.getHeight();
             f2 = (float)p0.getWidth();
          }
          obj = new float[9];
          obj1.getValues(obj);
          obj1.postTranslate((f1 - obj[2]), (f2 - obj[5]));
          Bitmap uBitmap = Bitmap.createBitmap(p0.getHeight(), p0.getWidth(), Bitmap$Config.ARGB_8888);
          new Canvas(uBitmap).drawBitmap(p0, obj1, new Paint());
          return uBitmap;
       }
    }
    public static float b(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)Math.sqrt((double)(((p0.getX(0) - p0.getX(1)) * (p0.getX(0) - p0.getX(1))) + ((p0.getY(0) - p0.getY(1)) * (p0.getY(0) - p0.getY(1)))));
    }
    public static Rect c(float p0,float p1,float p2,int p3,int p4,int p5,int p6){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, null, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p3 = (int)(((float)p3 * p0) / 2.00f);
       int i = (int)(((float)p4 * p0) / 2.00f);
       int i1 = (int)(((p1 / (float)p5) * 0x44fa0000) - 1000.00f);
       int i2 = (int)(((p2 / (float)p6) * 0x44fa0000) - 1000.00f);
       RectF rectF = new RectF((float)a.d((i1 - p3), -1000, 1000), (float)a.d((i2 - i), -1000, 1000), (float)a.d((i1 + p3), -1000, 1000), (float)a.d((i2 + i), -1000, 1000));
       return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
    public static int d(int p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min(Math.max(p0, p1), p2);
    }
    public static int e(Context p0,float p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)TypedValue.applyDimension(1, p1, c.c(p0.getResources()));
    }
    public static Point f(Context p0){
       Point obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Point();
       p0.getSystemService("window").getDefaultDisplay().getSize(obj);
       return obj;
    }
    public static boolean g(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Point point = a.f(p0);
       boolean b = (point.y > point.x)? true: false;
       return b;
    }
    public static Bitmap h(Bitmap p0,int p1){
       Bitmap obj1;
       a uoa = a.class;
       Paint obj = null;
       if (PatchProxy.isSupport(uoa)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uoa, "8");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (p0 == null) {
          return obj;
       }else {
          obj1 = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), p0.getConfig());
          obj = new Paint();
          obj.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff$Mode.SRC_IN));
          new Canvas(obj1).drawBitmap(p0, 0, 0, obj);
          return obj1;
       }
    }
    public static String i(Rect p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return " centerX£º"+p0.centerX()+" centerY£º"+p0.centerY()+" width£º"+p0.width()+" height£º"+p0.height()+" rectHalfWidth£º"+(p0.width() / 2)+" rectHalfHeight£º"+(p0.height() / 2)+" left£º"+p0.left+" top£º"+p0.top+" right£º"+p0.right+" bottom£º"+p0.bottom;
    }
}
