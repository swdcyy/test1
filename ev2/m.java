package ev2.m;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class m	// class@002803
{
    public final UserInfo a;
    public final int b;

    public void m(UserInfo p0,int p1){
       a.p(p0, "user");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof m && (a.g(this.a, p0.a) && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       m obj = PatchProxy.apply(null, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((i * 31) + this.b);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoOpenInviter\(user="+this.a+", relation="+this.b+"\)";
    }
}
