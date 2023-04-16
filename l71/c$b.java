package l71.c$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c$b	// class@002e91
{
    public final String tagContent;

    public void c$b(String p0){
       super();
       this.tagContent = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c$b && a.g(this.tagContent, p0.tagContent))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c$b obj = PatchProxy.apply(null, this, c$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tagContent;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(tagContent="+this.tagContent+"\)";
    }
}
