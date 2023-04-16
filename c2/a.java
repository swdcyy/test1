package c2.a;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.graphics.Path;

public final class a	// class@000cc3
{

    public static Interpolator a(float p0,float p1){
       return new PathInterpolator(p0, p1);
    }
    public static Interpolator b(float p0,float p1,float p2,float p3){
       return new PathInterpolator(p0, p1, p2, p3);
    }
    public static Interpolator c(Path p0){
       return new PathInterpolator(p0);
    }
}
