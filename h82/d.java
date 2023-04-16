package h82.d;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d extends AnimatorListenerAdapter	// class@002ccc
{
    public final View a;

    public void d(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       this.a.setAlpha(0x3f800000);
       this.a.setScaleX(0x3f800000);
       this.a.setScaleY(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       return;
    }
}
