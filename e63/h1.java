package e63.h1;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.gzone.v2.profile.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.View;

public class h1 extends AnimatorListenerAdapter	// class@002652
{
    public final e a;

    public void h1(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1.class, "1")) {
          return;
       }
       this.a.N.setVisibility(4);
       this.a.U.setVisibility(8);
       return;
    }
}
