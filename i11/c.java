package i11.c;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.like.highfluencymessage.view.HighFluencyMultiLikeView;
import df1.e;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.Objects;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements Runnable	// class@002802
{
    public final HighFluencyMultiLikeView b;
    public final e c;

    public void c(HighFluencyMultiLikeView p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.dismiss();
       Objects.requireNonNull(this.c);
       b.d0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "onMessageRemoved#", "reason", "bindDelayDismiss", "message", "HighFluencyMultiLikeMessage{}");
    }
}
