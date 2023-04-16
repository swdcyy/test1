package androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import java.lang.Math;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import o1.g;
import java.lang.IllegalArgumentException;
import android.graphics.Path;

public class ArcMotion extends PathMotion	// class@0009a1
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public static final float g;

    static {
       ArcMotion.g = (float)Math.tan(Math.toRadians(35.00f));
    }
    public void ArcMotion(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 70.00f;
       this.d = 0;
       this.e = 0;
       this.f = ArcMotion.g;
    }
    public void ArcMotion(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       this.b = 0;
       this.c = 70.00f;
       this.d = 0;
       this.e = 0;
       this.f = ArcMotion.g;
       XmlPullParser xmlPullParse = p0.obtainStyledAttributes(p1, c.j);
       this.d(g.f(xmlPullParse, p1, "minimumVerticalAngle", 1, 0));
       this.c(g.f(xmlPullParse, p1, "minimumHorizontalAngle", 0, 0));
       this.b(g.f(xmlPullParse, p1, "maximumAngle", 2, 70.00f));
       xmlPullParse.recycle();
    }
    public static float e(float p0){
       if (p0 >= 0 && p0 - 0x42b40000 <= 0) {
          return (float)Math.tan(Math.toRadians((double)(p0 / 2.00f)));
       }
       throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }
    public Path a(float p0,float p1,float p2,float p3){
       ArcMotion te;
       Path path = new Path();
       path.moveTo(p0, p1);
       float f = p2 - p0;
       float f1 = p3 - p1;
       float f2 = (f * f) + (f1 * f1);
       float f3 = 2.00f;
       float f4 = (p0 + p2) / f3;
       float f5 = (p1 + p3) / f3;
       float f6 = 0.25f * f2;
       float f7 = (p1 - p3 > 0)? Float.MIN_VALUE: 0;
       if (Math.abs(f) - Math.abs(f1) < 0) {
          f = Math.abs((f2 / (f1 * f3)));
          if (f7) {
             f = f + p3;
             f1 = p2;
          }else {
             f = f + p1;
             f1 = p0;
          }
          te = this.e;
       }else {
          f2 = f2 / (f * f3);
          if (f7) {
             f = p1;
             f1 = f2 + p0;
          }else {
             f1 = p2 - f2;
             f = p3;
          }
          te = this.d;
       }
       f7 = (f6 * te) * te;
       f2 = ((f4 - f1) * (f4 - f1)) + ((f5 - f) * (f5 - f));
       ArcMotion tf = this.f;
       f6 = (f6 * tf) * tf;
       if (f2 - f7 >= 0) {
          f7 = (f2 - f6 > 0)? f6: 0;
       }
    label_0070 :
       if (f7) {
          f2 = (float)Math.sqrt((double)(f7 / f2));
          f1 = ((f1 - f4) * f2) + f4;
          f = f5 + (f2 * (f - f5));
       }
       path.cubicTo(((p0 + f1) / f3), ((p1 + f) / f3), ((f1 + p2) / f3), ((f + p3) / f3), p2, p3);
       return path;
    }
    public void b(float p0){
       this.c = p0;
       this.f = ArcMotion.e(p0);
    }
    public void c(float p0){
       this.a = p0;
       this.d = ArcMotion.e(p0);
    }
    public void d(float p0){
       this.b = p0;
       this.e = ArcMotion.e(p0);
    }
}
