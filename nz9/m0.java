package nz9.m0;
import java.lang.Runnable;
import nz9.z0;
import com.yxcorp.gifshow.autoplay.live.g;
import java.lang.Object;
import as7.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.autoplay.live.LiveStopReason;

public final class m0 implements Runnable	// class@003232
{
    public final z0 b;
    public final g c;

    public void m0(z0 p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m0 tb = this.b;
       _monitor_enter(tb);
       Object[] objArray = new Object[0];
       a.C().s("AvatarAndFollowBaseElement", "onStopLivePlay", objArray);
       this.c.g0(LiveStopReason.LIVE_HIDE);
       _monitor_exit(tb);
    }
}
