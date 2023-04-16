package m02.e1;
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

public final class e1 implements a	// class@0030b5
{
    public final LivePlayLoader b;

    public void e1(LivePlayLoader p0){
       this.b = p0;
    }
    public final Object invoke(){
       LivePlayLoader c = this.b.c;
       Objects.requireNonNull(c);
       if (PatchProxy.applyVoid(null, c, m0.class, "3")) {
       }else if(c.i != null){
          b.c0(m0.l, "presenter unbind", "liveStreamId", c.j);
          c.i.unbind();
       }
       return l1.a;
    }
}
