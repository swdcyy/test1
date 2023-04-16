package at7.d;
import androidx.lifecycle.Observer;
import at7.e;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.traffic.SaveTrafficReminderAnimView;
import java.util.Objects;
import android.animation.Animator;
import android.animation.ValueAnimator;
import at7.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import at7.a;

public final class d implements Observer	// class@000369
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       SaveTrafficReminderAnimView e;
       ValueAnimator valueAnimato;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, str)) {
       }else {
          a.o(p0, "show");
          int i = 2;
          if (p0.booleanValue()) {
             p0 = e.v(this.b);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, SaveTrafficReminderAnimView.class, str)) {
                e = p0.e;
                if (e != null) {
                   e.end();
                }
                valueAnimato = ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
                valueAnimato.setDuration(280);
                valueAnimato.addUpdateListener(new b(p0));
                valueAnimato.start();
             }
          }else {
             p0 = e.v(this.b);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, SaveTrafficReminderAnimView.class, "2")) {
                e = p0.e;
                if (e != null) {
                   e.end();
                }
                valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                valueAnimato.setDuration(280);
                valueAnimato.addUpdateListener(new a(p0));
                valueAnimato.start();
             }
          }
       }
       return;
    }
}
