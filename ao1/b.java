package ao1.b;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.live.common.core.component.hotspot.slide.SlideSwitchLayout;
import msd.a;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ViewSwitcher;

public final class b implements Animation$AnimationListener	// class@00026a
{
    public final SlideSwitchLayout b;
    public final a c;

    public void b(SlideSwitchLayout p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.setInAnimation(null);
       this.b.setOutAnimation(null);
       this.c.invoke();
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
