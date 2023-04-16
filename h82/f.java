package h82.f;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f extends AnimatorListenerAdapter	// class@002cd0
{
    public final View a;

    public void f(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       this.a.setAlpha(0x3f800000);
       return;
    }
}
