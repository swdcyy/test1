package ad9.i$a;
import ekd.f$j;
import ad9.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;

public class i$a extends f$j	// class@0000a0
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       n.Y(this.a.g, 0, 0);
       return;
    }
}
