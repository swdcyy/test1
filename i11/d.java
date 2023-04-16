package i11.d;
import android.view.View$OnTouchListener;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class d implements View$OnTouchListener	// class@002803
{
    public final HighFluencyMultiLikeView b;

    public void d(HighFluencyMultiLikeView p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       d tb = this.b;
       tb.u[0] = p1.getRawX();
       tb[1] = p1.getRawY();
       return 0;
    }
}
