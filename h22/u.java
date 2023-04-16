package h22.u;
import ekd.f$j;
import com.kuaishou.live.core.show.activityredpacket.o;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import y22.q;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import th0.d;
import android.animation.TimeInterpolator;
import h22.v;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;

public class u extends f$j	// class@002c10
{
    public final o a;

    public void u(o p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       u ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, o.class, "21")) {
          q.q(ta.P);
          float[] uofloatArray = new float[]{(float)((- o.b1) + o.c1)};
          PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray);
          PropertyValuesHolder propertyValu1 = j.b(new float[2]{0x3f800000,0});
          PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{propertyValu,propertyValu1};
          ta.N = ObjectAnimator.ofPropertyValuesHolder(ta.x, propertyValu2);
          propertyValu2 = new PropertyValuesHolder[]{propertyValu,propertyValu1};
          ta.O = ObjectAnimator.ofPropertyValuesHolder(ta.G, propertyValu2);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          ta.P = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[]{ta.N,ta.O};
          uAnimatorSet.playTogether(uAnimatorArr);
          ta.P.setDuration(500).setInterpolator(new d());
          ta.P.addListener(new v(ta));
          ta.P.start();
       }
       o w = this.a.w;
       if (w != null) {
          w.bringToFront();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       View view = this.a.x.findViewById(R.id.live_activity_red_packet_grab_button_view);
       if (view != null) {
          view.setVisibility(8);
       }
       return;
    }
}
