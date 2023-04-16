package b11.h;
import ekd.f$j;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class h extends f$j	// class@0002fd
{
    public final e a;

    public void h(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.a.r.setVisibility(8);
       return;
    }
}
