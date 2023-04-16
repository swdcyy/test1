package fy2.c$c;
import aq5.b;
import fy2.c;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c$c implements b	// class@002a11
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       b.S(LiveLogTag.LIVE_ARYA.appendTag("LiveDeepAecHelper"), "videoPlayListener", "BizRelation", p0);
       this.b.P8();
       return;
    }
}
