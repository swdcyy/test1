package b1c.a$b;
import b1c.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
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

public final class a$b extends a	// class@000387
{
    public final MagicEmoji$MagicFace b;
    public final boolean c;
    public final FilterConfig d;

    public void a$b(MagicEmoji$MagicFace p0,boolean p1,FilterConfig p2){
       super(p2, null);
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public FilterConfig a(){
       return this.d;
    }
    public final boolean b(){
       return this.c;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$b && (a.g(this.b, p0.b) && (this.c == p0.c && a.g(this.a(), p0.a()))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$b obj = PatchProxy.apply(null, this, a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$b tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       i1 = (i1 + tc) * 31;
       FilterConfig uFilterConfi = this.a();
       if (uFilterConfi != null) {
          i = uFilterConfi.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicFilterInput\(magicFace="+this.b+", magicDisableFilter="+this.c+", newFilter="+this.a()+"\)";
    }
}
