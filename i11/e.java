package i11.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.common.core.component.highfrequency.widget.HighFluencyIncreaseNumberView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class e implements Observer	// class@002804
{
    public final HighFluencyMultiLikeView b;
    public final HighFluencyLikeViewStateController c;

    public void e(HighFluencyMultiLikeView p0,HighFluencyLikeViewStateController p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       this.c.b(p0.intValue());
       if (tb.s == null && p0.intValue() > tb.t) {
          HighFluencyMultiLikeView h = tb.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.isSupport(HighFluencyIncreaseNumberView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(1), h, HighFluencyIncreaseNumberView.class, "4")) {
             h.setNumber((h.g + 1));
          }
          tb.s = true;
       }
       tb.t = p0.intValue();
       return;
    }
}
