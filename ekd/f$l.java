package ekd.f$l;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Math;

public class f$l implements Interpolator	// class@000d43
{
    public float a;

    public void f$l(float p0){
       super();
       this.a = p0;
    }
    public float getInterpolation(float p0){
       f$l ta = this.a;
       return (float)((Math.pow(2.00f, (double)(-10.00f * p0)) * Math.sin((((double)(p0 - (ta / 4.00f)) * 0x401921fb54442d18) / (double)ta))) + 0x3ff0000000000000);
    }
}
