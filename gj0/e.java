package gj0.e;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@0024f3
{
    public final String launchOptions;
    public final String name;

    public void e(String p0,String p1){
       a.p(p0, "name");
       super();
       this.name = p0;
       this.launchOptions = p1;
    }
    public final String a(){
       return this.name;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && (a.g(this.name, p0.name) && a.g(this.launchOptions, p0.launchOptions)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       e tlaunchOptio = this.launchOptions;
       if (tlaunchOptio != null) {
          i = tlaunchOptio.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnPreloadComponent\(name="+this.name+", launchOptions="+this.launchOptions+"\)";
    }
}
