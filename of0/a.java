package of0.a;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public final class a implements Interpolator	// class@0034e2
{
    public float a;

    public void a(){
       super();
       this.a = 0x3f000000;
    }
    public void a(float p0){
       super();
       this.a = 0x3f000000;
       this.a = p0;
    }
    public float getInterpolation(float p0){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p0 && p0 - 0x3f800000) {
          a ta = this.a;
          ta = (float)((Math.pow(2.00f, (double)((float)-10 * p0)) * Math.sin(((((double)p0 - ((double)ta / 4.00f)) * 0x401921fb54442d18) / (double)ta))) + (double)1);
       }
       return p0;
    }
}
