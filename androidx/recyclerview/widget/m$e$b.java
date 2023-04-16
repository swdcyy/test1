package androidx.recyclerview.widget.m$e$b;
import android.view.animation.Interpolator;
import java.lang.Object;

public class m$e$b implements Interpolator	// class@000923
{

    public void m$e$b(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
