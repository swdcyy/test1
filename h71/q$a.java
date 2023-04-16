package h71.q$a;
import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class q$a	// class@002643
{
    public final Boolean realSend;
    public final List segments;

    public void q$a(){
       super();
       this.segments = null;
       this.realSend = Boolean.FALSE;
    }
    public final List a(){
       return this.segments;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof q$a && (a.g(this.segments, p0.segments) && a.g(this.realSend, p0.realSend)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       q$a obj = PatchProxy.apply(null, this, q$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.segments;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       q$a trealSend = this.realSend;
       if (trealSend != null) {
          i = trealSend.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, q$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(segments="+this.segments+", realSend="+this.realSend+"\)";
    }
}
