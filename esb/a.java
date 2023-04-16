package esb.a;
import lsb.b;
import lsb.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@0027d7
{
    public final boolean a;
    public final b b;
    public final a c;

    public void a(boolean p0,b p1,a p2){
       super();
       this.a = p0;
       this.b = null;
       this.c = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (this.a == p0.a && (a.g(this.b, p0.b) && a.g(this.c, p0.c))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       a tb = this.b;
       int i1 = 0;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i = (i + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HometownPanelShowEvent\(isShow="+this.a+", onSure="+this.b+", onCancel="+this.c+"\)";
    }
}
