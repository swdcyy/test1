package i11.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyLocalLikeView;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import j11.b;
import android.animation.Animator;

public final class a implements Observer	// class@002800
{
    public final HighFluencyLocalLikeView b;
    public final HighFluencyLikeViewStateController c;

    public void a(HighFluencyLocalLikeView p0,HighFluencyLikeViewStateController p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       if (!PatchProxy.isSupport(HighFluencyLocalLikeView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, HighFluencyLocalLikeView.class, "9")) {
          tb.e.setText(String.valueOf(i));
          tb.e.setPivotX(0);
          HighFluencyLocalLikeView e = tb.e;
          e.setPivotY((float)e.getMeasuredHeight());
          HighFluencyLocalLikeView i1 = tb.i;
          Objects.requireNonNull(i1);
          if (!PatchProxy.applyVoid(null, i1, b.class, "1")) {
             if (i1.a.isRunning()) {
                i1.a.cancel();
             }
             i1.a.start();
          }
       }
       tc.b(p0.intValue());
       return;
    }
}
