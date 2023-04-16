package bl4.n$a;
import sfc.a;
import bl4.n;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;

public class n$a extends a	// class@00039b
{
    public final n c;

    public void n$a(n p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       super.b(p0);
       a.l(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "load request error", p0);
       this.c.h();
       return;
    }
}
