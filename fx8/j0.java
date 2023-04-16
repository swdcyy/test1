package fx8.j0;
import android.animation.Animator$AnimatorListener;
import fx8.l0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.RecyclerView$l;
import java.util.Objects;

public class j0 implements Animator$AnimatorListener	// class@002383
{
    public final RecyclerView$ViewHolder a;
    public final l0 b;

    public void j0(l0 p0,RecyclerView$ViewHolder p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "2")) {
          return;
       }
       this.b.i.remove(this.a);
       this.b.I(this.a);
       if (!this.b.p()) {
          this.b.i();
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.b);
       return;
    }
}
