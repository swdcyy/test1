package im1.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import im1.e;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeInfo;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeTextInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.drawable.Drawable;

public class f implements ValueAnimator$AnimatorUpdateListener	// class@00294f
{
    public final e a;

    public void f(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       long l = (long)p0.getAnimatedValue().intValue();
       Objects.requireNonNull(ta);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), ta, uoe, "23")) {
          e p = ta.P;
          if (p == 4 || (p == 3 && ta.U != null)) {
             p = ta.z;
             if (p != null) {
                p.setText(ta.U.textInfo.closeMsg2+(l / 1000)+"s");
             }
          }
          if (PatchProxy.isSupport(uoe) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(l), ta, uoe, "24") && ta.T > 0)) {
             ta.S8().setLevel((int)((((float)l * 0x3f800000) / (float)ta.T) * 10000.00f));
          }
       }
    label_0092 :
       return;
    }
}
