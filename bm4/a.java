package bm4.a;
import com.kuaishou.merchant.transaction.base.model.DistributionSeller;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public final class a	// class@0003a0
{

    public static final boolean a(DistributionSeller p0){
       DistributionSeller uDistributio = null;
       Object obj = PatchProxy.applyOneRefs(p0, uDistributio, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          uDistributio = p0.showType;
       }
       boolean b = true;
       if (uDistributio == null || uDistributio.intValue() != b) {
          b = false;
       }
       return b;
    }
    public static final boolean b(DistributionSeller p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.showType;
       boolean b = (p0 != null && !p0.intValue())? true: false;
       return b;
    }
}
