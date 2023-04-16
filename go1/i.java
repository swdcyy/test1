package go1.i;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class i extends AnimatorListenerAdapter	// class@002537
{
    public final i a;

    public void i(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.X8(false);
       this.a.B.setVisibility(8);
       return;
    }
}
