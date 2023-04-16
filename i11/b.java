package i11.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.view.MotionEvent;
import lq5.a;

public final class b implements View$OnClickListener	// class@002801
{
    public final HighFluencyMultiLikeView b;

    public void b(HighFluencyMultiLikeView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, HighFluencyMultiLikeView.class, "17")) {
       }else if(tb.g.p()){
          tb.g.s();
       }
       tb.v.onClick(p0);
       if (tb.l != null) {
          HighFluencyMultiLikeView u = tb.u;
          tb.l.A(MotionEvent.obtain(0, 0, 1, u[0], u[1], 0));
       }
       return;
    }
}
