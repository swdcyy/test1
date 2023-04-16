package bl4.d;
import sfc.a;
import bl4.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cl4.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public class d extends a	// class@00038f
{
    public final e c;

    public void d(e p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.b(p0);
       d tc = this.c;
       tc.g(3, tc.a);
       return;
    }
}
