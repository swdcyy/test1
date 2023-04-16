package djc.u;
import djc.u$a;
import nsd.u;
import java.util.ArrayList;
import djc.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import djc.u0;
import djc.r0;
import djc.g0;
import djc.n0;
import djc.a0;
import java.util.Collection;

public final class u	// class@002225
{
    public static final List a;
    public static final u$a b;

    static {
       u.b = new u$a(null);
       ArrayList uArrayList = new ArrayList();
       u.a = uArrayList;
       ArrayList uArrayList1 = PatchProxy.apply(null, null, v.class, "1");
       if (uArrayList1 != PatchProxyResult.class) {
       }else {
          uArrayList1 = new ArrayList();
          uArrayList1.add(new u0());
          uArrayList1.add(new r0());
          uArrayList1.add(new g0());
          uArrayList1.add(new n0());
          uArrayList1.add(new a0());
       }
       uArrayList.addAll(uArrayList1);
    }
}
