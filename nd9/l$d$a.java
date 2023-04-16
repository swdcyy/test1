package nd9.l$d$a;
import android.animation.AnimatorListenerAdapter;
import nd9.l$d;
import android.widget.ImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class l$d$a extends AnimatorListenerAdapter	// class@00314a
{
    public final ImageView a;
    public final l$d b;

    public void l$d$a(l$d p0,ImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$d$a.class, "2")) {
          return;
       }
       this.a.setVisibility(4);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$d$a.class, "1")) {
          return;
       }
       if (this.b.g != null) {
          this.a.setVisibility(0);
       }
       return;
    }
}
