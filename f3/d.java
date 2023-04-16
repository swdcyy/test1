package f3.d;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;

public class d	// class@001fc0
{

    public static Interpolator a(Context p0,int p1){
       return AnimationUtils.loadInterpolator(p0, p1);
    }
}
