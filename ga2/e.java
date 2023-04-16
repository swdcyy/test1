package ga2.e;
import ekd.f$j;
import ga2.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class e extends f$j	// class@002aef
{
    public final f a;

    public void e(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a.a.setVisibility(0);
       return;
    }
}
