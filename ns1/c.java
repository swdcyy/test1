package ns1.c;
import androidx.lifecycle.Observer;
import ns1.d;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import ns1.e;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class c implements Observer	// class@0033b2
{
    public final d b;
    public final LiveMultiPkTeamFrameView c;

    public void c(d p0,LiveMultiPkTeamFrameView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          c tc = this.c;
          a.o(p0, "visible");
          int i = (p0.booleanValue())? 0: 8;
          tc.setVisibility(i);
          b.P(e.a, "teamFrameVisible: "+this.c.getVisibility());
          this.b.a();
          if (p0.booleanValue()) {
             p0 = this.b;
             tc = this.c;
             Objects.requireNonNull(p0);
             ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(tc, p0, d.class, "2");
             if (objectAnimat != PatchProxyResult.class) {
             }else {
                objectAnimat = ObjectAnimator.ofFloat(tc, View.ALPHA, new float[4]{0,0x3f800000,0x3f000000,0x3f800000});
                a.o(objectAnimat, "alphaAnim");
                objectAnimat.setDuration(1200);
             }
             p0.a = objectAnimat;
             p0 = this.b.a;
             if (p0 != null) {
                p0.start();
             }
          }
       }
       return;
    }
}
