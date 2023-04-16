package androidx.constraintlayout.motion.widget.a$a;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.a;
import d1.c;
import java.lang.Object;

public class a$a implements Interpolator	// class@000672
{
    public final c a;
    public final a b;

    public void a$a(a p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public float getInterpolation(float p0){
       return (float)this.a.a((double)p0);
    }
}
