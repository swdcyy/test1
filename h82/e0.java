package h82.e0;
import android.animation.AnimatorListenerAdapter;
import h82.k0;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;

public class e0 extends AnimatorListenerAdapter	// class@002ccd
{
    public boolean a;
    public final View b;
    public final k0 c;

    public void e0(k0 p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = true;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       this.b.setScaleX(0x3f800000);
       this.b.setScaleY(0x3f800000);
       p0.t = null;
       this.a = false;
       return;
    }
    public void onAnimationEnd(Animator p0){
       k0 t;
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       if (this.a != null) {
          t = this.c.t;
          if (t != null) {
             t.start();
             this.a = false;
          label_0021 :
             return;
          }
       }
       t.t = null;
       goto label_0021 ;
    }
}
