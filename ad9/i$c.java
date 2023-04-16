package ad9.i$c;
import ekd.f$j;
import ad9.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$c extends f$j	// class@0000a2
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
          return;
       }
       this.a.b();
       return;
    }
}
