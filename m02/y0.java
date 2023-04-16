package m02.y0;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import wj3.a;
import qrd.l1;

public final class y0 implements a	// class@0030f0
{
    public final LivePlayLoader b;

    public void y0(LivePlayLoader p0){
       this.b = p0;
    }
    public final Object invoke(){
       LivePlayLoader c = this.b.c;
       Objects.requireNonNull(c);
       if (PatchProxy.applyVoid(null, c, m0.class, "4")) {
       }else if(c.i != null){
          b.c0(m0.l, "presenter destroy", "liveStreamId", c.j);
          c.i.destroy();
          c.i = null;
       }
       return l1.a;
    }
}
