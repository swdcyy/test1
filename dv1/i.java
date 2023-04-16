package dv1.i;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dv1.j;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.component.newpendant.top.helper.LiveTopPendantLayout;
import android.view.View;
import ks5.m;
import java.util.ArrayList;

public class i extends AnimatorListenerAdapter	// class@002034
{
    public final View a;
    public final m b;
    public final ObjectAnimator c;
    public final j d;

    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.d.b.getRightPendantLayout().removeView(this.a);
       this.d.e(this.b);
       this.d.h.remove(this.c);
       i td = this.d;
       if (td.i == null) {
          td.d();
       }
       return;
    }
}
