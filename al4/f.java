package al4.f;
import java.lang.Object;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import al4.b;
import al4.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.Throwable;
import p74.a;
import o74.a;

public class f	// class@000098
{
    public List a;
    public b b;

    public void f(){
       super();
       this.a = new ArrayList(6);
    }
    public void a(Fragment p0,MerchantEventModel p1,ClientEvent$UrlPackage p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "3")) {
          return;
       }
       this.b(p0, p1, null, p2);
       return;
    }
    public void b(Fragment p0,MerchantEventModel p1,Map p2,ClientEvent$UrlPackage p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "4")) {
          return;
       }
       if (p0 != null && (!p0.isAdded() || p1 == null)) {
          a.l(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantEventManager", "startEvent", new Throwable("activity is exception or model is null"));
          return;
       }else {
          b uob = a.a(p1.mType);
          this.b = uob;
          if (uob != null) {
             uob.b(p0, p1, this, p2, p3);
          }else {
             a.l(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantEventManager", "startEvent", new Throwable("event is null"));
          }
          return;
       }
    }
}
