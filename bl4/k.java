package bl4.k;
import erd.g;
import bl4.l;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.model.ActionRedirectEventResponse;
import java.util.Objects;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRedirectPayloadInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import tkd.b;
import tkd.d;
import vs3.a;
import androidx.fragment.app.FragmentActivity;
import cl4.a;
import android.app.Activity;
import java.lang.Throwable;

public final class k implements g	// class@000397
{
    public final l b;
    public final EventPayloadInfo c;

    public void k(l p0,EventPayloadInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       ActionRedirectPayloadInfo mRedirectKey = this.c.mRedirectKey;
       if (PatchProxy.applyVoidTwoRefs(p0, mRedirectKey, tb, l.class, "2")) {
       }else if(p0 == null || TextUtils.isEmpty(mRedirectKey)){
          a.s(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "onRequestSuccess,but info == null || key is empty");
       }else {
          p0 = p0.responseStr;
          try{
             p0 = new JSONObject(p0).optString(mRedirectKey);
             a.s(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "get "+mRedirectKey+" is ["+p0+"]");
             if (!TextUtils.isEmpty(p0)) {
                d.a(0x7074b578).XZ(tb.d(), p0);
             }
          }catch(java.lang.Exception e7){
             a.l(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "parse responseStr error", e7);
          }
       }
    }
}
