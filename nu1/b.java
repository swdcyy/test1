package nu1.b;
import androidx.lifecycle.Observer;
import nu1.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class b implements Observer	// class@0033ce
{
    public final c b;

    public void b(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          LiveMultiPkTeamFrameView liveMultiPkT = c.e3(this.b);
          a.o(p0, "it");
          int i = (p0.booleanValue())? 0: 8;
          liveMultiPkT.setVisibility(i);
          this.b.f3();
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             ObjectAnimator objectAnimat = PatchProxy.apply(null, p0, c.class, "6");
             if (objectAnimat != PatchProxyResult.class) {
             }else {
                c q = p0.q;
                if (q == null) {
                   a.S("teamFrameView");
                }
                objectAnimat = ObjectAnimator.ofFloat(q, View.ALPHA, new float[4]{0,0x3f800000,0x3f000000,0x3f800000});
                a.o(objectAnimat, "alphaAnim");
                objectAnimat.setDuration(1200);
             }
             p0.r = objectAnimat;
             p0 = this.b.r;
             if (p0 != null) {
                p0.start();
             }
          }
       }
       return;
    }
}
