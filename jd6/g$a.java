package jd6.g$a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g$a	// class@001b49
{
    public final List moduleConfigList;

    public void g$a(List p0){
       super();
       this.moduleConfigList = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g$a && a.g(this.moduleConfigList, p0.moduleConfigList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g$a obj = PatchProxy.apply(null, this, g$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.moduleConfigList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ModuleConfigModel\(moduleConfigList="+this.moduleConfigList+"\)";
    }
}
