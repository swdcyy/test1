package bo1.d$c;
import bo1.d;
import com.kuaishou.live.common.core.component.interactwatchdog.LiveInteractWatchDogPluginStopReason;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d$c extends d	// class@0003ce
{
    public final LiveInteractWatchDogPluginStopReason a;

    public void d$c(LiveInteractWatchDogPluginStopReason p0){
       a.p(p0, "reason");
       super(null);
       this.a = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d$c && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d$c obj = PatchProxy.apply(null, this, d$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Stopped\(reason="+this.a+"\)";
    }
}
