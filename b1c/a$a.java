package b1c.a$a;
import b1c.a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a extends a	// class@000386
{
    public final FilterConfig b;
    public final boolean c;

    public void a$a(FilterConfig p0,boolean p1){
       super(p0, null);
       this.b = p0;
       this.c = p1;
    }
    public FilterConfig a(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.a(), p0.a()) && this.c == p0.c))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       FilterConfig obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a();
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       a$a tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       return (i + tc);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExternalFilterInput\(newFilter="+this.a()+", isCancel="+this.c+"\)";
    }
}
