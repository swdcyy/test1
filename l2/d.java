package l2.d;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Math;

public abstract class d implements Interpolator	// class@0024fa
{
    public final float[] a;
    public final float b;

    public void d(float[] p0){
       super();
       this.a = p0;
       this.b = 0x3f800000 / (float)(p0.length - 1);
    }
    public float getInterpolation(float p0){
       float f = 0x3f800000;
       if (p0 - f >= 0) {
          return f;
       }
       f = 0;
       if (p0 - f <= 0) {
          return f;
       }
       d ta = this.a;
       int i = Math.min((int)((float)(ta.length - 1) * p0), (ta.length - 2));
       d tb = this.b;
       p0 = (p0 - ((float)i * tb)) / tb;
       d ta1 = this.a;
       return (ta1[i] + (p0 * (ta1[(i + 1)] - ta1[i])));
    }
}
