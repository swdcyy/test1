package lo1.h;
import erd.g;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import java.lang.Object;
import java.lang.Long;
import lo1.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.y0;

public final class h implements g	// class@002fe0
{
    public final LiveHeartParticleServiceImpl b;

    public void h(LiveHeartParticleServiceImpl p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       if (tb.d >= 60) {
          p0 = tb.p;
          if (p0 != null) {
             p0.b(false);
          }
          tb.d = 0;
       }else if(PatchProxy.applyVoid(null, tb, LiveHeartParticleServiceImpl.class, "24")){
          p0 = tb.p;
          if (p0 != null) {
             if (p0.c()) {
                p0 = tb.m;
                if (p0 != null) {
                   p0.d();
                }
             }else {
                tb.p.b(false);
                tb.d = 0;
             }
          }
       }
       tb.n();
       return;
    }
}
