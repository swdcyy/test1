package ff.c$c;
import android.view.animation.Animation$AnimationListener;
import ff.c;
import ff.d;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$c implements Animation$AnimationListener	// class@001ff3
{
    public final d b;
    public final c c;

    public void c$c(c p0,d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       this.b.onAnimationEnd();
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
