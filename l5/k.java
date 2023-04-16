package l5.k;
import android.view.animation.LinearInterpolator;
import java.lang.Object;
import android.util.JsonReader;
import a5.e;
import l5.s;
import n5.a;
import java.lang.String;
import java.util.Objects;
import android.graphics.PointF;
import l5.j;
import m5.e;
import m5.f;
import androidx.collection.SparseArrayCompat;
import java.lang.ref.WeakReference;
import android.view.animation.Interpolator;
import c2.a;
import java.lang.Float;

public class k	// class@002522
{
    public static final Interpolator a;
    public static SparseArrayCompat b;

    static {
       k.a = new LinearInterpolator();
    }
    public void k(){
       super();
    }
    public static a a(JsonReader p0,e p1,float p2,s p3,boolean p4){
       Interpolator interpolator;
       WeakReference obj2;
       JsonReader jsonReader = p0;
       float f = p2;
       s os = p3;
       if (!p4) {
          return new a(os.a(jsonReader, f));
       }
       k ok = k.class;
       p0.beginObject();
       PathMeasure pathMeasure = 1;
       int i = 0;
       PointF pointF = null;
       PointF pointF1 = null;
       Object obj = null;
       Object obj1 = null;
       PointF pointF2 = null;
       PointF pointF3 = null;
       float f1 = 0;
       while (p0.hasNext()) {
          String str = p0.nextName();
          Objects.requireNonNull(str);
          int i1 = -1;
          switch (str.hashCode()){
              case 'e':
                if (str.equals("e")) {
                   i1 = 0;
                }
                break;
              case 'h':
                if (str.equals("h")) {
                   i1 = 1;
                }
                break;
              case 'i':
                if (str.equals("i")) {
                   i1 = 2;
                }
                break;
              case 'o':
                if (str.equals("o")) {
                   i1 = 3;
                }
                break;
              case 's':
                if (str.equals("s")) {
                   i1 = 4;
                }
                break;
              case 't':
                if (str.equals("t")) {
                   i1 = 5;
                }
                break;
              case 3701:
                if (str.equals("ti")) {
                   i1 = 6;
                }
                break;
              case 3707:
                if (str.equals("to")) {
                   i1 = 7;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                obj = os.a(jsonReader, f);
                break;
              case 1:
                if (p0.nextInt() == pathMeasure) {
                   i = 1;
                }else {
                   i = 0;
                }
                break;
              case 2:
                pointF1 = j.b(jsonReader, f);
                break;
              case 3:
                pointF = j.b(jsonReader, f);
                break;
              case 4:
                obj1 = os.a(jsonReader, f);
                break;
              case 5:
                f1 = (float)p0.nextDouble();
                break;
              case 6:
                pointF2 = j.b(jsonReader, f);
                break;
              case 7:
                pointF3 = j.b(jsonReader, f);
                break;
              default:
                p0.skipValue();
          }
       }
       try{
          p0.endObject();
          if (i) {
             interpolator = k.a;
             obj2 = obj1;
          }else if(pointF != null && pointF1 != null){
             float f2 = - f;
             pointF.x = e.b(pointF.x, f2, f);
             pointF.y = e.b(pointF.y, -100.00f, 100.00f);
             pointF1.x = e.b(pointF1.x, f2, f);
             float f3 = e.b(pointF1.y, -100.00f, 100.00f);
             pointF1.y = f3;
             PointF x = pointF.x;
             PointF y = pointF.y;
             PointF x1 = pointF1.x;
             PointF pointF4 = null;
             int i2 = (x - pointF4)? (int)((float)527 * x): 17;
             if (y - pointF4) {
                i2 = (int)((float)(i2 * 31) * y);
             }
             if (x1 - pointF4) {
                i2 = (int)((float)(i2 * 31) * x1);
             }
             if (f3 - pointF4) {
                i2 = (int)((float)(i2 * 31) * f3);
             }
             _monitor_enter(ok);
             if (k.b == null) {
                k.b = new SparseArrayCompat();
             }
             obj2 = k.b.get(i2);
             _monitor_exit(ok);
             interpolator = (obj2 != null)? obj2.get(): null;
             if (obj2 == null || interpolator == null) {
                interpolator = a.b((pointF.x / f), (pointF.y / f), (pointF1.x / f), (pointF1.y / f));
                _monitor_enter(ok);
                k.b.put(i2, new WeakReference(interpolator));
                _monitor_exit(ok);
             }
          }else {
             interpolator = k.a;
          }
          obj2 = obj;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
       }
          a uoa = new a(p1, obj1, obj2, interpolator, f1, null);
          f.m = pointF3;
          f.n = pointF2;
          return f;
    }
}
