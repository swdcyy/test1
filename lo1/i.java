package lo1.i;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.y0;
import lo1.l;

public final class i implements Runnable	// class@002fe1
{
    public final LiveHeartParticleServiceImpl b;

    public void i(LiveHeartParticleServiceImpl p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveHeartParticleServiceImpl.class, "25")) {
       }else {
          LiveHeartParticleServiceImpl d = tb.d;
          if (d == null) {
             LiveHeartParticleServiceImpl m = tb.m;
             if (m != null) {
                m.e();
             }
          }else {
             int i = d - 1;
             tb.d = i;
             LiveHeartParticleServiceImpl p = tb.p;
             if (p != null) {
                if (i == 9 && !p.k()) {
                   tb.p.b(false);
                }
                tb.p.i(tb.d);
             }
          }
       }
       return;
    }
}
