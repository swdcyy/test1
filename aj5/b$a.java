package aj5.b$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$a	// class@0000b5
{
    public final boolean a;
    public final String b;

    public void b$a(boolean p0,String p1){
       a.p(p1, "msg");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void b$a(boolean p0,String p1,int p2,u p3){
       p1 = (p2 & 0x02)? "empty": null;
       super(p0, p1);
       return;
    }
    public final String a(){
       return this.b;
    }
    public final boolean b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof b$a) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!a.g(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       int i;
       b$a obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       return ((i * 31) + (this.b).hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OptResult\(isSuccess="+this.a+", msg="+this.b+')';
    }
}
