package bl4.l;
import bl4.n;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cl4.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRedirectPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRequestPayloadInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import ll4.b;
import ll4.a;
import java.util.HashMap;
import cjd.e;
import erd.o;
import bl4.k;
import bl4.l$a;
import erd.g;
import crd.b;

public class l extends n	// class@000399
{

    public void l(){
       super();
    }
    public String e(){
       return "MerchantActionRedirectEvent";
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       b uob;
       ActionRequestPayloadInfo mPath;
       ActionRequestPayloadInfo mParams;
       HashMap hashMap;
       l ol = l.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ol, "1")) {
          return;
       }
       if (!this.f() && p0 instanceof ActionRedirectPayloadInfo) {
          String str = "MerchantActionRequestEvent";
          if (TextUtils.isEmpty(p0.mPath)) {
             a.s(MerchantTransactionLogBiz.MERCHANT_EVENT, str, "onEvent-path is null");
             return;
          }else {
             a.t(MerchantTransactionLogBiz.MERCHANT_EVENT, str, "onEvent", "mContinuationInfo", this.a.mContinuationInfo);
             p1 = p0;
             t ot = PatchProxy.applyOneRefs(p1, this, ol, "3");
             if (ot != PatchProxyResult.class) {
             }else if(p1.mLegacyResponse != null){
                uob = a.a();
                mPath = p1.mPath;
                mParams = p1.mParams;
                if (mParams == null) {
                   mParams = new HashMap();
                }
                ot = uob.l(mPath, mParams).map(new e());
             }else {
                uob = a.a();
                mPath = p1.mPath;
                mParams = p1.mParams;
                if (mParams == null) {
                   hashMap = new HashMap();
                }
                ot = uob.q(mPath, hashMap).map(new e());
             }
             this.c(ot.subscribe(new k(this, p0), new l$a(this)));
          }
       }
       return;
    }
}
