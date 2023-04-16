package hod.a$c;
import android.animation.Animator$AnimatorListener;
import hod.a;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import iod.a;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.ImageView;

public final class a$c implements Animator$AnimatorListener	// class@000f9f
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "3")) {
          return;
       }
       this.a.D(true);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "2")) {
          return;
       }
       this.a.D(true);
       if (a.g(this.a.d.o0().getValue(), Boolean.TRUE)) {
          this.a.g.setVisibility(8);
          this.a.e.setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       this.a.D(false);
       return;
    }
}
