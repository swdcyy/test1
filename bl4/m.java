package bl4.m;
import erd.g;
import bl4.n;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.model.ActionRequestEventResponse;
import cl4.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m implements g	// class@00039a
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       if (tb.f()) {
       }else if(p0 != null){
          p0 = p0.mEvent;
          if (p0 != null) {
             tb.a(p0);
          }
       }
       if (!PatchProxy.applyVoid(null, tb, n.class, "3")) {
          tb.g(2, tb.a);
       }
       return;
    }
}
