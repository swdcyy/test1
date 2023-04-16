package b1c.a$c;
import b1c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
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
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.StringBuilder;

public final class a$c extends a	// class@000388
{
    public final MakeupSuite b;
    public final FilterConfig c;

    public void a$c(MakeupSuite p0,FilterConfig p1){
       super(p1, null);
       this.b = p0;
       this.c = p1;
    }
    public FilterConfig a(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$c && (a.g(this.b, p0.b) && a.g(this.a(), p0.a())))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$c obj = PatchProxy.apply(null, this, a$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FilterConfig uFilterConfi = this.a();
       if (uFilterConfi != null) {
          i = uFilterConfi.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MakeupFilterInput\(makeupSuite="+this.b+", newFilter="+this.a()+"\)";
    }
}
