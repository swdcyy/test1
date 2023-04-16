package i11.f;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.state.HighFluencyLikeViewStateController$a;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import java.lang.Object;
import java.util.Objects;
import e93.f;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.a;
import android.widget.TextView;

public final class f implements HighFluencyLikeViewStateController$a	// class@002805
{
    public final HighFluencyMultiLikeView a;

    public void f(HighFluencyMultiLikeView p0){
       this.a = p0;
    }
    public final void a(int p0,int p1){
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (!p0) {
          f.g(ta);
          ta.o.f();
          ta.j.setVisibility(8);
       }
       return;
    }
}
