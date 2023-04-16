package o01.b;
import erd.g;
import o01.d;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.lang.Object;
import java.lang.Long;
import mk1.h;
import bl1.a;

public final class b implements g	// class@003445
{
    public final d b;
    public final boolean c;
    public final SCLiveGiftPanelRefresh d;

    public void b(d p0,boolean p1,SCLiveGiftPanelRefresh p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b tb = this.b;
       tb.q.o.E2(this.c, 1);
       tb.P8(this.d.disablePreloadMagicFaceResource);
    }
}
