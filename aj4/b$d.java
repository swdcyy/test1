package aj4.b$d;
import mu4.d;
import aj4.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import mu4.c;

public final class b$d implements d	// class@000089
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       a.s(MerchantTransactionLogBiz.PURCHASE, "LivePaymentPresenter", "scroll idle");
       this.a.q9();
       return;
    }
    public void destroy(){
       c.a(this);
    }
}
