package a12.c;
import ck2.i;
import tq5.c;
import com.kuaishou.live.core.show.floatingwindow.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;

public class c implements i	// class@000010
{
    public final c a;
    public final c$b b;

    public void c(c p0,c$b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a.Qf() != null) {
          return this.a.Qf().getReason();
       }
       if (this.b.a()) {
          return 24;
       }
       return 7;
    }
}
