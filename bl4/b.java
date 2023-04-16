package bl4.b;
import n3d.a;
import bl4.e;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import cl4.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.basic.model.AddressInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionAddressJumpPayloadInfo;
import java.util.HashMap;
import ll4.b;
import ll4.a;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import bl4.c;
import bl4.d;
import erd.g;
import crd.b;

public final class b implements a	// class@00038d
{
    public final e b;
    public final EventPayloadInfo c;

    public void b(e p0,EventPayloadInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       int i = 3;
       String str = "ActionAddressJumpEvent";
       if (p2 == null) {
          a.s(MerchantTransactionLogBiz.MERCHANT_EVENT, str, "onEvent-onActivityResult-requestCode error");
          tb.g(i, tb.a);
       }else {
          AddressInfo serializable = SerializableHook.getSerializableExtra(p2, "KEY_CALLBACK_RESULT_JSON");
          if (serializable == null) {
             a.s(MerchantTransactionLogBiz.MERCHANT_EVENT, str, "onEvent-onActivityResult-requestCode, get address info is null");
             tb.g(i, tb.a);
          }else {
             ActionAddressJumpPayloadInfo mParams = tc.mParams;
             if (mParams == null) {
                mParams = new HashMap();
             }
             mParams.put("addressId", String.valueOf(serializable.mAddressId));
             tb.c(a.a().c(mParams).map(new e()).subscribe(new c(tb, tc, serializable), new d(tb)));
          }
       }
       return;
    }
}
