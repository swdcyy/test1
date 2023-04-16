package apb.m$c;
import android.animation.AnimatorListenerAdapter;
import apb.m;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import android.widget.TextView;

public class m$c extends AnimatorListenerAdapter	// class@0002b1
{
    public final boolean a;
    public final m b;

    public void m$c(m p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "1")) {
          return;
       }
       m$c tb = this.b;
       m$c ta = this.a;
       Objects.requireNonNull(tb);
       m om = m.class;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), tb, om, "20")) {
          if (ta == null) {
             tb.B.setVisibility(8);
             tb.E.setVisibility(8);
             tb.V8();
          }else {
             tb.R8();
          }
       }
       return;
    }
}
