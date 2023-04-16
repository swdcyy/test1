package bf8.b;
import java.lang.Object;
import java.lang.Double;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Number;
import java.lang.StringBuilder;

public class b	// class@000346
{
    public Double a;
    public Double b;

    public void b(){
       super();
    }
    public void b(Double p0,Double p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public Double a(){
       return this.b;
    }
    public Double b(){
       return this.a;
    }
    public boolean c(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (this.b == null || (this.a != null && (this.d() && this.e()))) {
          b = true;
       }
    label_002b :
       return b;
    }
    public boolean d(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.b.doubleValue() - 0xc056800000000000 >= 0 && this.b.doubleValue() - 0x4056800000000000 <= 0)? true: false;
       return b;
    }
    public boolean e(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.a.doubleValue() - 0x4066800000000000 <= 0 && this.a.doubleValue() - 0xc066800000000000 >= 0)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!Objects.equals(this.a, p0.a) || !Objects.equals(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public void f(Double p0){
       this.b = p0;
    }
    public void g(Double p0){
       this.a = p0;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.a,this.b};
       return Objects.hash(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LatLonInfo{longitude="+this.a+", latitude="+this.b+'}';
    }
}
