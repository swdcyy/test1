package b5b.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class b	// class@000365
{
    public final boolean a;
    public final boolean b;

    public void b(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof b && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       b tb = this.b;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicSearchBarSwitchEvent\(isShow="+this.a+", isAutoShow="+this.b+"\)";
    }
}
