package ab0.t$c;
import ekd.f$j;
import ab0.t;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;

public final class t$c extends f$j	// class@000050
{
    public final t a;

    public void t$c(t p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$c.class, "1")) {
          return;
       }
       t q = this.a.q;
       if (q == null) {
          a.S("mSettingsViewContainer");
       }
       q.setVisibility(8);
       return;
    }
}
