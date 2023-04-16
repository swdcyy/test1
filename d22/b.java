package d22.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import java.lang.Object;
import android.view.View;
import ya1.f0;
import android.view.animation.Animation;
import android.widget.ViewFlipper;

public final class b implements LiveViewFlipper$a	// class@002425
{
    public final LiveCustomViewFlipper b;

    public void b(LiveCustomViewFlipper p0){
       this.b = p0;
    }
    public void a(View p0,int p1){
       f0.a(this, p0, p1);
    }
    public final void b(View p0,int p1){
       b tb = this.b;
       if (tb.getInAnimation() == null && tb.getOutAnimation() == null) {
          tb.setInAnimation(tb.d);
          tb.setOutAnimation(tb.e);
       }
       return;
    }
}
