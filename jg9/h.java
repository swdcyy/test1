package jg9.h;
import ekd.f$j;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;

public final class h extends f$j	// class@002a9b
{
    public final View a;

    public void h(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       n.Y(this.a, 4, false);
       return;
    }
}
