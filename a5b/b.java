package a5b.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.StringBuilder;

public final class b	// class@000047
{
    public final MagicEmoji$MagicFace a;
    public final List b;

    public void b(MagicEmoji$MagicFace p0,List p1){
       a.p(p0, "magicFace");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final MagicEmoji$MagicFace a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicFaceSearchWrapper\(magicFace="+this.a+", highlightWords="+this.b+"\)";
    }
}
