package gy2.b$b;
import gy2.a;
import gy2.b$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$b	// class@002bc1
{
    public final a a;
    public final b$a b;

    public void b$b(a p0,b$a p1){
       a.p(p0, "dialog");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final a a(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b$b && (a.g(this.a, p0.a) && a.g(this.b, p0.b)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b$b obj = PatchProxy.apply(null, this, b$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b$b tb = this.b;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DialogItem\(dialog="+this.a+", dialogDelegate="+this.b+"\)";
    }
}
