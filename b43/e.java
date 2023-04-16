package b43.e;
import android.animation.AnimatorListenerAdapter;
import b43.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e extends AnimatorListenerAdapter	// class@0002f7
{
    public final f a;

    public void e(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a.V8();
       p0.G = false;
       return;
    }
}
