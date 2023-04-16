package j11.a;
import android.animation.AnimatorListenerAdapter;
import j11.b;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class a extends AnimatorListenerAdapter	// class@002a35
{
    public final View a;
    public final b b;

    public void a(b p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       a tb = this.b;
       a ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, b.class, "6")) {
          ta.setScaleX(0x3f800000);
          ta.setScaleY(0x3f800000);
       }
       return;
    }
}
