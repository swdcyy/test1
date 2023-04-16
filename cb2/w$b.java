package cb2.w$b;
import ekd.f$j;
import cb2.w;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class w$b extends f$j	// class@00051d
{
    public final w a;

    public void w$b(w p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$b.class, "1")) {
          return;
       }
       this.a.a();
       return;
    }
}
