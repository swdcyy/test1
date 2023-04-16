package androidx.fragment.app.FragmentManagerImpl$g;
import android.animation.Animator;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.animation.Animation;

public class FragmentManagerImpl$g	// class@00078a
{
    public final Animation a;
    public final Animator b;

    public void FragmentManagerImpl$g(Animator p0){
       super();
       this.a = null;
       this.b = p0;
       if (p0 != null) {
          return;
       }
       throw new IllegalStateException("Animator cannot be null");
    }
    public void FragmentManagerImpl$g(Animation p0){
       super();
       this.a = p0;
       this.b = null;
       if (p0 != null) {
          return;
       }
       throw new IllegalStateException("Animation cannot be null");
    }
}
