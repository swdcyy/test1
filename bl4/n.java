package bl4.n;
import cl4.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRequestPayloadInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.HashMap;
import ekd.q;
import ll4.b;
import ll4.a;
import cjd.e;
import erd.o;
import bl4.m;
import bl4.n$a;
import erd.g;
import crd.b;

public class n extends a	// class@00039c
{

    public void n(){
       super();
    }
    public String e(){
       return "MerchantActionRequestEvent";
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       this.g(3, this.a);
       return;
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       n on = n.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, on, "1")) {
          return;
       }
       if (!this.f() && p0 instanceof ActionRequestPayloadInfo) {
          if (TextUtils.isEmpty(p0.mPath)) {
             a.s(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "onEvent-path is null");
             return;
          }else {
             a.t(MerchantTransactionLogBiz.MERCHANT_EVENT, "MerchantActionRequestEvent", "onEvent", "mContinuationInfo", this.a.mContinuationInfo);
             t ot = PatchProxy.applyTwoRefs(p0, p1, this, on, "2");
             if (ot != PatchProxyResult.class) {
             }else {
                HashMap hashMap = new HashMap();
                if (!q.h(p1)) {
                   hashMap.putAll(p1);
                }
                if (!q.h(p0.mParams)) {
                   hashMap.putAll(p0.mParams);
                }
                if (p0.mLegacyResponse != null) {
                   ot = a.a().g(p0.mPath, hashMap).map(new e());
                }else {
                   ot = a.a().m(p0.mPath, hashMap).map(new e());
                }
             }
             this.c(ot.subscribe(new m(this), new n$a(this)));
          }
       }
       return;
    }
}
