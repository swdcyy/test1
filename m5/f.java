package m5.f;
import android.graphics.PathMeasure;
import android.graphics.Path;
import java.lang.Math;
import java.lang.String;
import a5.d;
import m5.e;
import java.io.Closeable;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Matrix;

public final class f	// class@0025b1
{
    public static final PathMeasure a;
    public static final Path b;
    public static final Path c;
    public static final float[] d;
    public static final float e;
    public static float f;

    static {
       f.a = new PathMeasure();
       f.b = new Path();
       f.c = new Path();
       float[] uofloatArray = new float[4];
       f.d = uofloatArray;
       f.e = (float)Math.sqrt(2.00f);
       f.f = 0xbf800000;
    }
    public static void a(Path p0,float p1,float p2,float p3){
       float f;
       d.a("applyTrimPathIfNeeded");
       PathMeasure a = f.a;
       a.setPath(p0, false);
       float length = a.getLength();
       f = 0x3f800000;
       if (!p1 - f && !p2) {
          d.b("applyTrimPathIfNeeded");
          return;
       }else if(length - f < 0 || (double)Math.abs(((p2 - p1) - f)) - 0x3f847ae147ae147b < 0){
          d.b("applyTrimPathIfNeeded");
          return;
       }else {
          p1 = p1 * length;
          p2 = p2 * length;
          f = Math.min(p1, p2);
          p3 = p3 * length;
          f = f + p3;
          p1 = Math.max(p1, p2) + p3;
          if (f - length >= 0 && p1 - length >= 0) {
             f = (float)e.d(f, length);
             p1 = (float)e.d(p1, length);
          }
          if (f < 0) {
             f = (float)e.d(f, length);
          }
          if (p1 < 0) {
             p1 = (float)e.d(p1, length);
          }
          p2 = f - p1;
          if (!p2) {
             p0.reset();
             d.b("applyTrimPathIfNeeded");
             return;
          }else if(p2 >= 0){
             f = f - length;
          }
          Path b = f.b;
          b.reset();
          a.getSegment(f, p1, b, true);
          if (p1 - length > 0) {
             Path c = f.c;
             c.reset();
             a.getSegment(0, (p1 % length), c, true);
             b.addPath(c);
          }else if(f < 0){
             Path c1 = f.c;
             c1.reset();
             a.getSegment((f + length), length, c1, true);
             b.addPath(c1);
          }
          p0.set(b);
          d.b("applyTrimPathIfNeeded");
          return;
       }
    }
    public static void b(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static float c(){
       if (!f.f - 0xbf800000) {
          f.f = c.c(Resources.getSystem()).density;
       }
       return f.f;
    }
    public static float d(Matrix p0){
       float[] d = f.d;
       d[0] = 0;
       d[1] = 0;
       float e = f.e;
       d[2] = e;
       d[3] = e;
       p0.mapPoints(d);
       return ((float)Math.hypot((double)(d[2] - d[0]), (double)(d[3] - d[1])) / 2.00f);
    }
}
