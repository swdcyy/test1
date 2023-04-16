package jg9.f$c;
import ekd.f$j;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class f$c extends f$j	// class@002a94
{
    public final View a;

    public void f$c(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.a.setVisibility(0);
       return;
    }
}
