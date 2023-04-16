package bj3.a$b;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$b extends AnimatorListenerAdapter	// class@0003d6
{
    public final View a;

    public void a$b(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       this.a.setVisibility(8);
       this.a.setEnabled(true);
       return;
    }
}
