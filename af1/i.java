package af1.i;
import java.lang.Runnable;
import vf1.a;
import vf1.b;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class i implements Runnable	// class@000073
{
    public final a b;
    public final b c;

    public void i(a p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.uh(this.c);
       b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "HighFluencyStyleController.fetchStyleConfig unregister listener");
    }
}
