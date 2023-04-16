package iv1.i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import java.lang.Object;

public final class i implements Runnable	// class@0029a4
{
    public final LiveOperationNotificationView b;
    public final Runnable c;

    public void i(LiveOperationNotificationView p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.d(this.c);
    }
}
