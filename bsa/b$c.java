package bsa.b$c;
import ekd.f$j;
import bsa.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class b$c extends f$j	// class@000453
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       b t = this.a.t;
       if (t == null) {
          a.S("mRootView");
       }
       t.setVisibility(8);
       t = this.a.y;
       if (t != null) {
          t.setVisibility(8);
       }
       return;
    }
}
