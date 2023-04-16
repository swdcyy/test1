package b43.d;
import android.animation.AnimatorListenerAdapter;
import b43.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class d extends AnimatorListenerAdapter	// class@0002f6
{
    public final f a;

    public void d(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a.x.setAlpha(0x3f800000);
       return;
    }
}
