package ng1.a$a;
import android.animation.AnimatorListenerAdapter;
import ng1.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class a$a extends AnimatorListenerAdapter	// class@00330e
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.s.setVisibility(0);
       return;
    }
}
