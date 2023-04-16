package daa.m;
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

public final class m	// class@001ed9
{
    public final List conditions;

    public void m(List p0){
       a.p(p0, "conditions");
       super();
       this.conditions = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m && a.g(this.conditions, p0.conditions))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m obj = PatchProxy.apply(null, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.conditions;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TriggerConditionConfigs\(conditions="+this.conditions+"\)";
    }
}
