package d32.u;
import java.lang.Runnable;
import d32.v;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Object;
import t02.a0;
import p91.m;
import com.kuaishou.live.core.basic.model.LiveAnnounceInfo;
import d32.s;

public final class u implements Runnable	// class@00243c
{
    public final v b;
    public final LiveTimeConsumingUserStatusResponse c;

    public void u(v p0,LiveTimeConsumingUserStatusResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       s.b(this.b.K.Z2, this.c.mLiveAnnounceInfo);
    }
}
