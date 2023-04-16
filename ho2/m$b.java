package ho2.m$b;
import ho2.m;
import java.util.List;
import java.lang.String;
import java.util.Map;
import ho2.m$c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class m$b extends m	// class@002deb
{
    public final List b;
    public final String c;
    public final int d;
    public final Map e;
    public final m$c f;

    public void m$b(List p0,String p1,int p2,Map p3,m$c p4){
       a.p(p0, "resourceUrl");
       a.p(p3, "variablesValue");
       a.p(p4, "staticFallback");
       super(null);
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final String a(){
       return this.c;
    }
    public final List b(){
       return this.b;
    }
    public final m$c c(){
       return this.f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m$b && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (this.d == p0.d && (a.g(this.e, p0.e) && a.g(this.f, p0.f))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m$b obj = PatchProxy.apply(null, this, m$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       m$b tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.d) * 31;
       tc = this.e;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.f;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Dynamic\(resourceUrl="+this.b+", resourceMd5="+this.c+", resourceResType="+this.d+", variablesValue="+this.e+", staticFallback="+this.f+"\)";
    }
}
