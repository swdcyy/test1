package iv1.m;
import erd.g;
import com.kuaishou.live.common.core.component.notification.LiveOperationNotificationView;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Throwable;

public final class m implements g	// class@0029a8
{
    public final LiveOperationNotificationView b;
    public final Runnable c;

    public void m(LiveOperationNotificationView p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.d(this.c);
    }
}
