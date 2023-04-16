package lz1.d;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@00308d
{
    public final boolean a;
    public final List b;
    public final int c;

    public void d(boolean p0,List p1,int p2){
       a.p(p1, "bizList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int a(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (this.a == p0.a && (a.g(this.b, p0.b) && this.c == p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       d tb = this.b;
       int i1 = (tb != null)? tb.hashCode(): 0;
       return (((i + i1) * 31) + this.c);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceSeiFallbackPluginConfig\(isEnabled="+this.a+", bizList="+this.b+", seiFaultMinTimeInterval="+this.c+"\)";
    }
}
