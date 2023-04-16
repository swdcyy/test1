package bf8.d;
import bf8.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Double;
import java.util.Objects;
import java.lang.StringBuilder;

public class d extends b	// class@000348
{
    public boolean c;
    public double d;

    public void d(){
       super();
    }
    public boolean equals(Object p0){
       d uod = d.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uod != p0.getClass()) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (this.c != p0.c || this.d - p0.d) {
          b = false;
       }
       return b;
    }
    public double h(){
       return this.d;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(super.hashCode()),Boolean.valueOf(this.c),Double.valueOf(this.d)};
       return Objects.hash(obj);
    }
    public boolean i(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return super.equals(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MapTargetInfo{super="+super.toString()+"showLocation="+this.c+", scale="+this.d+'}';
    }
}
