package bf8.a;
import bf8.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;
import java.lang.StringBuilder;

public class a extends b	// class@000345
{
    public String c;
    public String d;
    public int e;
    public int f;

    public void a(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof a) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (this.e != p0.e || (this.f != p0.f || (!k.a(this.c, p0.c) || !k.a(this.d, p0.d)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(super.hashCode()),this.c,this.d,Integer.valueOf(this.e),Integer.valueOf(this.f)};
       return k.b(obj);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CircleInfo{super "+super.toString()+" \ncolor=\'"+this.c+'''+", fillColor=\'"+this.d+'''+", radius="+this.e+", strokeWidth="+this.f+'}';
    }
}
