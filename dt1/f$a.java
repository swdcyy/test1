package dt1.f$a;
import dt1.f;
import com.kwai.framework.model.user.UserInfo;
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

public final class f$a extends f	// class@00201a
{
    public final UserInfo a;

    public void f$a(UserInfo p0){
       a.p(p0, "userInfo");
       super(null);
       this.a = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f$a && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       f$a obj = PatchProxy.apply(null, this, f$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HIGH_EFFECT\(userInfo="+this.a+"\)";
    }
}
