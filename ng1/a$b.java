package ng1.a$b;
import android.animation.AnimatorListenerAdapter;
import ng1.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class a$b extends AnimatorListenerAdapter	// class@00330f
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.a.s.setVisibility(8);
       return;
    }
}
