package f4a.y;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class y extends AnimatorListenerAdapter	// class@0022bd
{
    public final View a;

    public void y(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       this.a.setVisibility(4);
       return;
    }
}
