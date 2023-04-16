package ho2.m$d;
import ho2.m$c;
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

public final class m$d extends m$c	// class@002ded
{
    public final List b;

    public void m$d(List p0){
       a.p(p0, "imageUrl");
       super();
       this.b = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m$d && a.g(this.b, p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m$d obj = PatchProxy.apply(null, this, m$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StaticImage\(imageUrl="+this.b+"\)";
    }
}
