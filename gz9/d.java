package gz9.d;
import erd.g;
import gz9.b;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.PayCourseOrderResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import gz9.i;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gifshow.model.response.PayCourseOrderResponse$OrderPayData;
import android.content.Context;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams;

public final class d implements g	// class@002519
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          a.p(p0, "response");
          d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "13")) {
             b e = tb.e;
             a.o(e, "mActivity");
             if (e.isFinishing()) {
                tb.c();
             }else {
                i oi = new i(tb);
                if (p0.isOrderPayType()) {
                   p0 = p0.mOrderPayParams;
                   PayManager.getInstance().startKspayOrderPrepay(tb.e, p0.mMerchantId, p0.mOrderNo, oi);
                }else {
                   GatewayPayInputParams gatewayPayIn = new GatewayPayInputParams();
                   gatewayPayIn.mOrder = p0.mParams;
                   PayManager.getInstance().startPay(tb.e, gatewayPayIn, oi);
                }
             }
          }
       }
       return;
    }
}
