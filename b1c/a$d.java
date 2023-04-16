package b1c.a$d;
import b1c.a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$d extends a	// class@000389
{
    public final FilterConfig b;
    public final a0 c;

    public void a$d(FilterConfig p0,a0 p1){
       a.p(p1, "source");
       super(p0, null);
       this.b = p0;
       this.c = p1;
    }
    public FilterConfig a(){
       return this.b;
    }
    public final a0 b(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$d && (a.g(this.a(), p0.a()) && a.g(this.c, p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       FilterConfig obj = PatchProxy.apply(null, this, a$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a();
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$d tc = this.c;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserFilterInput\(newFilter="+this.a()+", source="+this.c+"\)";
    }
}
