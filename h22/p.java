package h22.p;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.activityredpacket.o;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o22.b;
import com.kuaishou.live.core.show.activityredpacket.k$b;
import android.view.View;
import android.animation.Animator;
import y22.q;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import h22.u;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import th0.d;
import android.animation.TimeInterpolator;

public final class p implements Observer	// class@002c08
{
    public final o b;

    public void p(o p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       float f;
       p tb = this.b;
       Objects.requireNonNull(tb);
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oo, "6")) {
       }else {
          p0 = tb.R;
          if (p0 != null) {
             boolean b = true;
             p0.a(tb.U0, b);
             if (!PatchProxy.applyVoid(null, tb, oo, "20")) {
                tb.A.setVisibility(8);
                q.q(tb.M);
                float[] uofloatArray = new float[]{0,f};
                f = (float)(- o.b1);
                tb.J = ObjectAnimator.ofFloat(tb.x, View.TRANSLATION_Y, uofloatArray);
                uofloatArray = new float[]{0,f};
                tb.K = ObjectAnimator.ofFloat(tb.G, View.TRANSLATION_Y, uofloatArray);
                tb.L = j.a(tb.y, new float[2]{0x3f800000,0});
                tb.J.addListener(new u(tb));
                p0 = new AnimatorSet();
                tb.M = p0;
                Animator[] uAnimatorArr = new Animator[]{tb.J,tb.K,tb.L};
                p0.playTogether(uAnimatorArr);
                tb.M.setDuration(250).setInterpolator(new d());
                tb.M.start();
             }
          }
       }
       return;
    }
}
