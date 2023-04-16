package iv1.g;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import java.lang.Object;
import com.kuaishou.live.widget.ShootMarqueeView;

public final class g implements Runnable	// class@0029a2
{
    public final LiveOperationNotificationView b;

    public void g(LiveOperationNotificationView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.e.v(1);
    }
}
