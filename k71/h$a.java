package k71.h$a;
import k71.h$a$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class h$a	// class@002cb3
{
    public String iconPath;
    public String resPackId;
    public String resourceName;
    public String type;
    public static final h$a$a a;

    static {
       h$a.a = new h$a$a(null);
    }
    public void h$a(){
       a.p("", "type");
       a.p("", "resourceName");
       a.p("", "resPackId");
       a.p("", "iconPath");
       super();
       this.type = "";
       this.resourceName = "";
       this.resPackId = "";
       this.iconPath = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof h$a && (a.g(this.type, p0.type) && (a.g(this.resourceName, p0.resourceName) && (a.g(this.resPackId, p0.resPackId) && a.g(this.iconPath, p0.iconPath)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       h$a obj = PatchProxy.apply(null, this, h$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       h$a tresourceNam = this.resourceName;
       int i2 = (tresourceNam != null)? tresourceNam.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tresourceNam = this.resPackId;
       i2 = (tresourceNam != null)? tresourceNam.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tresourceNam = this.iconPath;
       if (tresourceNam != null) {
          i = tresourceNam.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(type="+this.type+", resourceName="+this.resourceName+", resPackId="+this.resPackId+", iconPath="+this.iconPath+"\)";
    }
}
