package ff.k;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class k implements Interpolator	// class@001ffd
{
    public final float a;

    public void k(){
       super();
       this.a = 0x3f000000;
    }
    public void k(float p0){
       super();
       this.a = p0;
    }
    public float getInterpolation(float p0){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, k.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       k ta = this.a;
       return (float)((Math.pow(2.00f, (double)(-10.00f * p0)) * Math.sin(((((double)(p0 - (ta / 4.00f)) * 0x400921fb54442d18) * 2.00f) / (double)ta))) + 0x3ff0000000000000);
    }
}
