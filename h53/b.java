package h53.b;
import brd.x;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneBottomLiveCardMessage;
import java.lang.Object;
import brd.t;
import brd.w;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;

public final class b implements x	// class@002c5a
{
    public final SCGzoneBottomLiveCardMessage b;

    public void b(SCGzoneBottomLiveCardMessage p0){
       this.b = p0;
    }
    public final w apply(t p0){
       SCGzoneBottomLiveCardMessage showDelayMil = this.b.showDelayMillis;
       if (showDelayMil <= null) {
       }else {
          p0 = p0.delaySubscription((long)showDelayMil, TimeUnit.MILLISECONDS, d.a);
       }
       return p0;
    }
}
