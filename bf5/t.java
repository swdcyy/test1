package bf5.t;
import java.lang.String;
import wx6.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class t	// class@000489
{
    public final String a;
    public final c b;

    public void t(String p0,c p1){
       a.p(p0, "bizTag");
       a.p(p1, "sessionKey");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof t && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       t obj = PatchProxy.apply(null, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       t tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, t.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SharePlayGothamEvent\(bizTag="+this.a+", sessionKey="+this.b+"\)";
    }
}
