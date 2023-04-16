package h82.e;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import h82.r0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;

public class e extends AnimatorListenerAdapter	// class@002cce
{
    public final View a;
    public final int b;
    public final r0 c;

    public void e(View p0,int p1,r0 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
       layoutParams.width = this.b;
       this.a.setLayoutParams(layoutParams);
       e tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
}
