package bl2.d;
import erd.g;
import bl2.j;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribeDetailResponse$LiveSubscribeDetailInfo;
import java.lang.String;
import bl2.j$a;
import j26.c;

public final class d implements g	// class@00040c
{
    public final j b;

    public void d(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       j b = tb.B;
       if (b != null) {
          b.a(p0.mStartPushTimeDesc);
       }
       j z = tb.z;
       if (z != null) {
          z.f(p0.mStartPushTimeDesc);
       }
       return;
    }
}
