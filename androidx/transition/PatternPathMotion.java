package androidx.transition.PatternPathMotion;
import androidx.transition.PathMotion;
import android.graphics.Path;
import android.graphics.Matrix;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import java.lang.String;
import o1.g;
import p1.d;
import java.lang.RuntimeException;
import java.lang.Math;
import android.graphics.PathMeasure;
import java.lang.IllegalArgumentException;

public class PatternPathMotion extends PathMotion	// class@0009c5
{
    public Path a;
    public final Path b;
    public final Matrix c;

    public void PatternPathMotion(){
       super();
       Path path = new Path();
       this.b = path;
       this.c = new Matrix();
       path.lineTo(0x3f800000, 0);
       this.a = path;
    }
    public void PatternPathMotion(Context p0,AttributeSet p1){
       super();
       this.b = new Path();
       this.c = new Matrix();
       XmlPullParser xmlPullParse = p0.obtainStyledAttributes(p1, c.k);
       String str = g.i(xmlPullParse, p1, "patternPathData", 0);
       if (str == null) {
          throw new RuntimeException("pathData must be supplied for patternPathMotion");
       }
       this.c(d.e(str));
       xmlPullParse.recycle();
       return;
    }
    public void PatternPathMotion(Path p0){
       super();
       this.b = new Path();
       this.c = new Matrix();
       this.c(p0);
    }
    public static float b(float p0,float p1){
       return (float)Math.sqrt((double)((p0 * p0) + (p1 * p1)));
    }
    public Path a(float p0,float p1,float p2,float p3){
       p2 = p2 - p0;
       p3 = p3 - p1;
       float f = PatternPathMotion.b(p2, p3);
       this.c.setScale(f, f);
       this.c.postRotate((float)Math.toDegrees(Math.atan2((double)p3, (double)p2)));
       this.c.postTranslate(p0, p1);
       Path path = new Path();
       this.b.transform(this.c, path);
       return path;
    }
    public void c(Path p0){
       PathMeasure pathMeasure = new PathMeasure(p0, false);
       float[] uofloatArray = new float[2];
       float[] uofloatArray1 = null;
       pathMeasure.getPosTan(pathMeasure.getLength(), uofloatArray, uofloatArray1);
       int i = uofloatArray[0];
       int i1 = 1;
       int i2 = uofloatArray[i1];
       pathMeasure.getPosTan(0, uofloatArray, uofloatArray1);
       int i3 = uofloatArray[0];
       int i4 = uofloatArray[i1];
       if (!i3 - i && !i4 - i2) {
          throw new IllegalArgumentException("pattern must not end at the starting point");
       }
       this.c.setTranslate((- i3), (- i4));
       float f = i - i3;
       float f1 = i2 - i4;
       this.c.postScale((0x3f800000 / PatternPathMotion.b(f, f1)), (0x3f800000 / PatternPathMotion.b(f, f1)));
       this.c.postRotate((float)Math.toDegrees((- Math.atan2((double)f1, (double)f))));
       p0.transform(this.c, this.b);
       this.a = p0;
       return;
    }
}
