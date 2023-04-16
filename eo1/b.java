package eo1.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import dp3.a;
import kotlin.jvm.internal.a;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@0021d4
{
    public final LiveLeftInfoBarArea a;
    public final float b;
    public final float c;

    public void b(LiveLeftInfoBarArea p0,float p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       ViewGroup view = this.a.getView();
       a.o(view, "view");
       a.o(p0, "it");
       view.setAlpha((this.b + (p0.getAnimatedFraction() * this.c)));
       return;
    }
}
