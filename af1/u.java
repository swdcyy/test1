package af1.u;
import ok.x;
import af1.j;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$HighFluencyStyle;

public final class u implements x	// class@00007f
{
    public final j b;

    public void u(j p0){
       this.b = p0;
    }
    public final Object get(){
       u tb = this.b;
       Objects.requireNonNull(tb);
       j oj = PatchProxy.apply(null, tb, j.class, "1");
       if (oj != PatchProxyResult.class) {
       }else {
          j b = tb.b;
          if (b == null) {
             b = new LiveAudienceDelayInfosResponse$HighFluencyStyle();
          }
          oj = b;
       }
       return oj;
    }
}
