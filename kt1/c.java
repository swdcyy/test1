package kt1.c;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002df4
{
    public final LiveMultiPkResourceTypes a;
    public final LiveMultiPkResourceTypes b;
    public final String c;

    public void c(LiveMultiPkResourceTypes p0,LiveMultiPkResourceTypes p1,String p2){
       a.p(p0, "backgroundResource");
       a.p(p2, "text");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final LiveMultiPkResourceTypes a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMultiPkGameAnimBottomProps\(backgroundResource="+this.a+", leftTopIconResource="+this.b+", text="+this.c+"\)";
    }
}
