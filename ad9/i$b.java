package ad9.i$b;
import ekd.f$j;
import ad9.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import ad9.l;

public class i$b extends f$j	// class@0000a1
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "2")) {
          return;
       }
       n.Y(this.a.g, 4, false);
       i$b ta = this.a;
       ta.b.a(ta.g);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       n.Y(this.a.g, 0, 0);
       return;
    }
}
