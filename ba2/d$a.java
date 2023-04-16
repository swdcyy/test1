package ba2.d$a;
import android.animation.AnimatorListenerAdapter;
import ba2.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import ka2.a$a;

public class d$a extends AnimatorListenerAdapter	// class@000388
{
    public final int a;
    public final d b;

    public void d$a(d p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.b.b.b.getLayoutParams();
       layoutParams.height = this.a;
       this.b.b.b.setLayoutParams(layoutParams);
       this.b.b.h.setVisibility(8);
       LiveFancyRankResultViewV2 o = this.b.b.o;
       if (o != null) {
          o.onDismiss();
       }
       return;
    }
}
