package jg9.n;
import ekd.f$j;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import android.animation.Animator$AnimatorListener;

public final class n extends f$j	// class@002aa7
{
    public final View a;

    public void n(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       n.Y(this.a, 0, 0);
       return;
    }
    public void onAnimationStart(Animator p0,boolean p1){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, n.class, "2")) {
          return;
       }
       super.onAnimationStart(p0, p1);
       n.Y(this.a, 0, 0);
       return;
    }
}
