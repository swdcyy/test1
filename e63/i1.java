package e63.i1;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.v2.profile.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class i1 extends AnimatorListenerAdapter	// class@002655
{
    public final e a;

    public void i1(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i1.class, "1")) {
          return;
       }
       this.a.U.setVisibility(0);
       return;
    }
}
