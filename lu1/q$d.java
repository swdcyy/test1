package lu1.q$d;
import android.animation.AnimatorListenerAdapter;
import lu1.q;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class q$d extends AnimatorListenerAdapter	// class@00304c
{
    public final q a;

    public void q$d(q p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$d.class, "1")) {
          return;
       }
       this.a.w3(8, true);
       return;
    }
}
