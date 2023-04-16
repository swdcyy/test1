package ba4.i;
import erd.g;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.b;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.marketing.shop.timediscount.couponcenter.model.DiscountCouponsInfoModel;
import y94.c;
import ot3.u0;
import crd.b;
import com.yxcorp.utility.f;
import brd.t;
import ba4.h;

public final class i implements g	// class@000358
{
    public final b b;

    public void i(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Long longx;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          b uob = null;
          if (p0.longValue() - uob <= 0) {
             p0 = this.b;
             b a = p0.A;
             if (a != null) {
                DiscountCouponsInfoModel uDiscountCou = a.c();
                if (uDiscountCou != null) {
                   longx = Long.valueOf(uDiscountCou.getEndTime());
                label_002d :
                   if (!PatchProxy.applyVoidOneRefs(longx, p0, b.class, "7") && longx != null) {
                      long l = longx.longValue() - u0.b();
                      if (l - uob > 0) {
                         p0.S8(l);
                         uob = p0.C;
                         if (uob != null) {
                            uob.dispose();
                         }
                         p0.C = f.d().b(l, 1000).subscribe(new h(p0));
                      }
                   }
                }
             }
             longx = null;
             goto label_002d ;
          }
       }
       return;
    }
}
