package m9a.d0$b;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d0$b extends AnimatorListenerAdapter	// class@002f77
{
    public final View a;

    public void d0$b(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d0$b.class, "1")) {
          return;
       }
       this.a.setTag(null);
       PatchProxy.onMethodExit(d0$b.class, "1");
       return;
    }
}
