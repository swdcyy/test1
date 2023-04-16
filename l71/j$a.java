package l71.j$a;
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

public final class j$a	// class@002e9c
{
    public final String bizEndExtraInfo;
    public final String bizStartExtraInfo;
    public final Integer targetBiz;

    public final Integer a(){
       return this.targetBiz;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof j$a && (a.g(this.targetBiz, p0.targetBiz) && (a.g(this.bizStartExtraInfo, p0.bizStartExtraInfo) && a.g(this.bizEndExtraInfo, p0.bizEndExtraInfo))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       j$a obj = PatchProxy.apply(null, this, j$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.targetBiz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       j$a tbizStartExt = this.bizStartExtraInfo;
       int i2 = (tbizStartExt != null)? tbizStartExt.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbizStartExt = this.bizEndExtraInfo;
       if (tbizStartExt != null) {
          i = tbizStartExt.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(targetBiz="+this.targetBiz+", bizStartExtraInfo="+this.bizStartExtraInfo+", bizEndExtraInfo="+this.bizEndExtraInfo+"\)";
    }
}
