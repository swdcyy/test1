package gi2.a$a;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$a extends AnimatorListenerAdapter	// class@002b23
{
    public final View a;

    public void a$a(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationCancel(p0);
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       return;
    }
}
