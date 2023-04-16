package at7.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.slide.play.detail.traffic.SaveTrafficReminderAnimView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.widget.FrameLayout;
import android.graphics.RectF;
import java.lang.NullPointerException;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@000366
{
    public final SaveTrafficReminderAnimView a;

    public void a(SaveTrafficReminderAnimView p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          a ta = this.a;
          ta.c.set(((float)ta.getWidth() * p0.floatValue()), 0, (float)this.a.getWidth(), (float)this.a.getHeight());
          this.a.invalidate();
          PatchProxy.onMethodExit(a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
