package abc.c0;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.relation.intimate.dialog.p;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class c0 extends AnimatorListenerAdapter	// class@0000c8
{
    public final p a;

    public void c0(p p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       this.a.n.setVisibility(8);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.a.n.setVisibility(8);
       return;
    }
}
