package iv1.c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.notification.LiveCustomNoticeView;
import java.lang.Object;
import com.kuaishou.live.widget.ShootMarqueeView;

public final class c implements Runnable	// class@00299e
{
    public final LiveCustomNoticeView b;

    public void c(LiveCustomNoticeView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.b.v(1);
    }
}
