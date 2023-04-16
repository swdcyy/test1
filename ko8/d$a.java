package ko8.d$a;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class d$a implements Interpolator	// class@002bd5
{

    public void d$a(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
