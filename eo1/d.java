package eo1.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@0021d6
{
    public final LiveLeftInfoBarArea a;
    public final int b;
    public final int c;

    public void d(LiveLeftInfoBarArea p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.o(p0, "it");
       this.a.p((int)((float)this.b + (p0.getAnimatedFraction() * (float)this.c)));
       return;
    }
}
