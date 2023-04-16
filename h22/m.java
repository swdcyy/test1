package h22.m;
import ekd.f$j;
import com.kuaishou.live.core.show.activityredpacket.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class m extends f$j	// class@002c02
{
    public final k a;

    public void m(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.a.R8(0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.a.r.setVisibility(0);
       return;
    }
}
