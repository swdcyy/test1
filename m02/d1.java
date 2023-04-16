package m02.d1;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.QLivePlayConfig;
import pp.c;
import com.kuaishou.android.live.log.b;
import wj3.a;
import qrd.l1;

public final class d1 implements a	// class@0030b2
{
    public final LivePlayLoader b;

    public void d1(LivePlayLoader p0){
       this.b = p0;
    }
    public final Object invoke(){
       LivePlayLoader d = this.b.d;
       Objects.requireNonNull(d);
       if (PatchProxy.applyVoid(null, d, c.class, "17")) {
       }else if(d.m != null){
          b.c0(d.t, "presenter unbind", "liveStreamId", d.d.getLiveStreamId());
          d.m.unbind();
       }
       return l1.a;
    }
}
