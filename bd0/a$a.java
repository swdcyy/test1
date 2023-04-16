package bd0.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bd0.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.widget.TextView;
import java.lang.NullPointerException;

public final class a$a implements ValueAnimator$AnimatorUpdateListener	// class@000279
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$a.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.d.getLayoutParams();
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          layoutParams.height = p0.intValue();
          this.a.b.requestLayout();
          PatchProxy.onMethodExit(a$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
