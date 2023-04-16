package ee1.g;
import z1.a;
import java.lang.String;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wv4.f1;

public final class g implements a	// class@002107
{
    public final String a;
    public final boolean b;

    public void g(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       g ta = this.a;
       g tb = this.b;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          Object obj = PatchProxy.applyTwoRefs(ta, Boolean.valueOf(tb), p0, uod1, "22");
          if (obj != PatchProxyResult.class) {
             obj.intValue();
          label_002a :
             return;
          }
       }
       p0.h.Z0(ta, tb);
       goto label_002a ;
    }
}
