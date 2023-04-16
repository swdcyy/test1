package eo1.c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class c extends AnimatorListenerAdapter	// class@0021d5
{
    public final LiveLeftInfoBarArea a;
    public final float b;
    public final float c;

    public void c(LiveLeftInfoBarArea p0,float p1,float p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.a.o(this.c);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.a);
       int i = 0;
       if (this.b - (float)i > 0) {
          i = 1;
       }
       if (i) {
          this.a.o(this.c);
       }
       return;
    }
}
