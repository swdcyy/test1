package rw.d;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Objects;

public abstract class d implements Runnable	// class@002de5
{
    public final String b;

    public void d(String p0){
       super();
       if (p0 == null) {
          p0 = "";
       }
       this.b = p0;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return (this.b).equals(p0.b);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.b};
       return Objects.hash(obj);
    }
}
