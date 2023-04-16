package k11.f;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f extends AnimatorListenerAdapter	// class@002c61
{
    public final a a;

    public void f(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.f();
       return;
    }
}
