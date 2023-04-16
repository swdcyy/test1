package k71.d$a;
import java.util.ArrayList;
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

public final class d$a	// class@002ca8
{
    public final List userIdList;

    public void d$a(){
       super(new ArrayList());
    }
    public void d$a(List p0){
       a.p(p0, "userIdList");
       super();
       this.userIdList = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d$a && a.g(this.userIdList, p0.userIdList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d$a obj = PatchProxy.apply(null, this, d$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.userIdList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(userIdList="+this.userIdList+"\)";
    }
}
