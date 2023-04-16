package k71.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f$b	// class@002cad
{
    public int closeType;

    public void f$b(){
       super(0);
    }
    public void f$b(int p0){
       super();
       this.closeType = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof f$b && this.closeType == p0.closeType)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.closeType;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(closeType="+this.closeType+"\)";
    }
}
