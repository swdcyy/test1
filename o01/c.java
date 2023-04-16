package o01.c;
import erd.g;
import o01.d;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Object;
import java.lang.Long;
import mk1.h;
import bl1.a;

public final class c implements g	// class@003446
{
    public final d b;
    public final boolean c;
    public final SCLiveGiftPanelRefresh d;

    public void c(d p0,boolean p1,SCLiveGiftPanelRefresh p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.q.o.u2(this.c, 1);
       tb.P8(this.d.disablePreloadMagicFaceResource);
    }
}
