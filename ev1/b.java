package ev1.b;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;

public final class b implements Runnable	// class@0021fd
{
    public final LiveTopPendantViewFlipper b;

    public void b(LiveTopPendantViewFlipper p0){
       this.b = p0;
    }
    public final void run(){
       this.b.showNext();
    }
}
