package fx8.k0;
import android.animation.AnimatorListenerAdapter;
import fx8.l0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.y;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$l;
import java.util.Objects;

public class k0 extends AnimatorListenerAdapter	// class@002385
{
    public final RecyclerView$ViewHolder a;
    public final l0 b;

    public void k0(l0 p0,RecyclerView$ViewHolder p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "2")) {
          return;
       }
       this.b.H(this.a);
       this.b.k.remove(this.a);
       if (!this.b.p()) {
          this.b.i();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.b);
       return;
    }
}
