package androidx.transition.Transition$a;
import androidx.transition.PathMotion;
import android.graphics.Path;

public final class Transition$a extends PathMotion	// class@0009d0
{

    public void Transition$a(){
       super();
    }
    public Path a(float p0,float p1,float p2,float p3){
       Path path = new Path();
       path.moveTo(p0, p1);
       path.lineTo(p2, p3);
       return path;
    }
}
