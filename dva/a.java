package dva.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class a	// class@002585
{
    public final boolean a;

    public void a(boolean p0){
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof a && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a ta = this.a;
       if (ta != null) {
          ta = 1;
       }
       return ta;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FoldTodayListEvent\(fold="+this.a+"\)";
    }
}
