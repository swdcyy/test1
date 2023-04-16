package bj5.a$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$b	// class@0004af
{
    public final int a;
    public final String b;

    public void a$b(int p0,String p1){
       a.p(p1, "msg");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return this.b;
    }
    public final int b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof a$b) {
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
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.a * 31) + (this.b).hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SwitchResult\(statusCode="+this.a+", msg="+this.b+')';
    }
}
