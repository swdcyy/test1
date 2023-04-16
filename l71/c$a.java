package l71.c$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$a	// class@002e90
{
    public final String currentUserTag;

    public void c$a(String p0){
       super();
       this.currentUserTag = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$a && a.g(this.currentUserTag, p0.currentUserTag))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c$a obj = PatchProxy.apply(null, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.currentUserTag;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(currentUserTag="+this.currentUserTag+"\)";
    }
}
