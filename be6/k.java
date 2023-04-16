package be6.k;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class k	// class@000473
{
    public final String type;

    public void k(String p0){
       a.p(p0, "type");
       super();
       this.type = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k && a.g(this.type, p0.type))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.type;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WarmUpCreateEvent\(type="+this.type+"\)";
    }
}
