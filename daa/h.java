package daa.h;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class h	// class@001ed3
{
    public final List configs;

    public void h(List p0){
       a.p(p0, "configs");
       super();
       this.configs = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof h && a.g(this.configs, p0.configs))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       h obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.configs;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PokeConfigs\(configs="+this.configs+"\)";
    }
}
