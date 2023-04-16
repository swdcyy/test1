package ja1.d;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@002a68
{
    public boolean enablePatch;
    public Map resourceTypeMap;

    public void d(boolean p0,Map p1){
       super();
       this.enablePatch = p0;
       this.resourceTypeMap = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (this.enablePatch == p0.enablePatch && a.g(this.resourceTypeMap, p0.resourceTypeMap)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enablePatch;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       d tresourceTyp = this.resourceTypeMap;
       int i1 = (tresourceTyp != null)? tresourceTyp.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveControlFileOptimizeConfig\(enablePatch="+this.enablePatch+", resourceTypeMap="+this.resourceTypeMap+"\)";
    }
}
