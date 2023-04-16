package k71.x$a;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class x$a	// class@002cce
{
    public List roleInfos;
    public final Integer visible;

    public void x$a(){
       super();
       this.visible = Integer.valueOf(0);
       this.roleInfos = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof x$a && (a.g(this.visible, p0.visible) && a.g(this.roleInfos, p0.roleInfos)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       x$a obj = PatchProxy.apply(null, this, x$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.visible;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       x$a troleInfos = this.roleInfos;
       if (troleInfos != null) {
          i = troleInfos.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveJsSyncWealthGradeStatusParams\(visible="+this.visible+", roleInfos="+this.roleInfos+"\)";
    }
}
