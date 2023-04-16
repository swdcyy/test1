package bf8.e;
import bf8.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import brd.t;
import java.lang.Number;
import java.lang.Integer;
import java.lang.StringBuilder;

public class e extends b	// class@000349
{
    public String c;
    public t d;
    public String e;
    public boolean f;

    public void e(){
       super();
    }
    public boolean equals(Object p0){
       e uoe = e.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoe, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoe != p0.getClass()) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (!Objects.equals(this.c, p0.c) || !Objects.equals(this.e, p0.e)) {
          b = false;
       }
       return b;
    }
    public t h(){
       return this.d;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(super.hashCode()),this.c,this.e};
       return Objects.hash(obj);
    }
    public String i(){
       return this.e;
    }
    public boolean j(){
       return this.f;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MarkersInfo{"+"sourcePath=\'"+this.c+'''+", title=\'"+this.e+'''+", defaultShowTitle="+this.f+'}';
    }
}
