package iv1.d;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.notification.LiveCustomNoticeView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.RelativeLayout;

public final class d implements Runnable	// class@00299f
{
    public final LiveCustomNoticeView b;
    public final Runnable c;

    public void d(LiveCustomNoticeView p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, LiveCustomNoticeView.class, "8")) {
       }else {
          b.Z(LiveLogTag.ACTIVITY_TEMPLATE_TOP_NOTIFICATION, "onCustomerNotificationViewHide");
          tb.setVisibility(4);
          if (tc != null) {
             tc.run();
          }
       }
       return;
    }
}
