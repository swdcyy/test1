package ou1.b;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b extends AnimatorListenerAdapter	// class@00358d
{
    public final TextView a;

    public void b(TextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
}
