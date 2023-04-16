package ga.a$b;
import android.view.animation.Animation$AnimationListener;
import ga.a;
import java.lang.Object;
import android.view.animation.Animation;

public class a$b implements Animation$AnimationListener	// class@002051
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       this.b.b();
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
