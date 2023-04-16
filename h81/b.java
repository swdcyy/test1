package h81.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;
import java.util.Arrays;

public class b	// class@002655
{
    public final int a;
    public final Object b;

    public void b(int p0){
       super(p0, null);
    }
    public void b(int p0,Object p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       boolean b;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uob != p0.getClass()) {
          return false;
       }
       if (this.a == p0.a) {
          uob = this.b;
          p0 = p0.b;
          if (uob == p0 || (uob != null && uob.equals(p0))) {
          label_0039 :
             return b;
          }
       }
       b = false;
       goto label_0039 ;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.a),this.b};
       return Arrays.hashCode(obj);
    }
}
