package bi2.f;
import wu1.a;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@0003f8
{
    public final a a;
    public final PendantData b;
    public final int c;

    public void f(a p0,PendantData p1,int p2){
       a.p(p0, "pendantConfig");
       a.p(p1, "pendantData");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final a a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       f tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (((i1 + i) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantInfo\(pendantConfig="+this.a+", pendantData="+this.b+", richCardState="+this.c+"\)";
    }
}
