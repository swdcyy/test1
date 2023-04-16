package bf8.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class c	// class@000347
{
    public final boolean a;
    public final boolean b;

    public void c(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof c && (this.a == p0.a && this.b == p0.b))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c ta = this.a;
       int i = 1;
       if (ta != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       c tb = this.b;
       if (tb == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LocationStatus\(requireLocation="+this.a+", locationHasStart="+this.b+"\)";
    }
}
