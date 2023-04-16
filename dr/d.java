package dr.d;
import dr.b;
import java.lang.Object;
import com.kuaishou.android.vader.type.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.type.b;

public class d implements b	// class@0014dd
{

    public void d(){
       super();
    }
    public c a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof MessageNano) {
          return new c(p0);
       }
       return null;
    }
    public b accept(Object p0){
       return this.a(p0);
    }
}
