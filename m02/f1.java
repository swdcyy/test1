package m02.f1;
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

public final class f1 implements a	// class@0030b8
{
    public final LivePlayLoader b;

    public void f1(LivePlayLoader p0){
       this.b = p0;
    }
    public final Object invoke(){
       LivePlayLoader d = this.b.d;
       Objects.requireNonNull(d);
       if (PatchProxy.applyVoid(null, d, c.class, "18")) {
       }else if(d.m != null){
          b.c0(d.t, "presenter destroy", "liveStreamId", d.d.getLiveStreamId());
          d.m.destroy();
          d.m = null;
       }
       d.s = true;
       return l1.a;
    }
}
