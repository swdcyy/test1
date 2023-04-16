package gra.b$a$b;
import erd.g;
import gra.b$a;
import java.lang.Object;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardServerResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcRewardResponse;
import fra.e;
import com.yxcorp.gifshow.growth.vfc.model.NormalReceiveCouponDialogModel;
import fra.f;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import dra.a;
import fra.b;

public final class b$a$b implements g	// class@002ba2
{
    public final b$a b;

    public void b$a$b(b$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       b$a$b tb;
       e uoe;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$b.class, "1")) {
       }else {
          p0 = p0.dialog;
          if (p0 != null) {
             if (p0.receivableCoupon != null) {
                tb = this.b;
                uoe = new e(p0.normalReceiveCouponDialogModel, tb.c, tb.d);
             }else {
                tb = this.b;
                uoe = new f(p0.nonReceiveCouponDialog, tb.c, tb.d);
             }
             new a(uoe).c();
          }
       }
       return;
    }
}
