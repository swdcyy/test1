package androidx.viewpager.widget.ViewPager$b;
import android.view.animation.Interpolator;
import java.lang.Object;

public final class ViewPager$b implements Interpolator	// class@000a12
{

    public void ViewPager$b(){
       super();
    }
    public float getInterpolation(float p0){
       p0 = p0 - 0x3f800000;
       return (((((p0 * p0) * p0) * p0) * p0) + 0x3f800000);
    }
}
