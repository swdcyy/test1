package bl4.h;
import cl4.a;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionOpenHalfRnPayloadInfo;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public class h extends a	// class@000393
{

    public void h(){
       super();
    }
    public String e(){
       return "MerchantActionOpenHalfRnEvent";
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       if (!p0 instanceof ActionOpenHalfRnPayloadInfo) {
          return;
       }
       b.k(this.d(), TextUtils.e(p0.mUrl, p0.mParams));
       this.g(2, this.a);
       return;
    }
}
