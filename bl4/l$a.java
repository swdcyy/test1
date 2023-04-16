package bl4.l$a;
import sfc.a;
import bl4.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import bl4.n;

public class l$a extends a	// class@000398
{
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       super.b(p0);
       a.l(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "load request error", p0);
       this.c.h();
       return;
    }
}
