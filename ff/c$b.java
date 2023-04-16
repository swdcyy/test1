package ff.c$b;
import android.view.animation.Animation$AnimationListener;
import ff.c;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.SparseArray;
import ff.g;

public class c$b implements Animation$AnimationListener	// class@001ff2
{
    public final int b;
    public final c c;

    public void c$b(c p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       this.c.d.remove(this.b);
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.c.d.put(this.b, p0);
       return;
    }
}
