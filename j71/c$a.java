package j71.c$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$a	// class@002a55
{
    public final String liveChatId;

    public void c$a(String p0){
       a.p(p0, "liveChatId");
       super();
       this.liveChatId = p0;
    }
    public final String a(){
       return this.liveChatId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$a && a.g(this.liveChatId, p0.liveChatId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c$a obj = PatchProxy.apply(null, this, c$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveChatId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(liveChatId="+this.liveChatId+"\)";
    }
}
