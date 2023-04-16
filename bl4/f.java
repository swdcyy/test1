package bl4.f;
import cl4.a;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionJumpPayloadInfo;
import tkd.b;
import tkd.d;
import vs3.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public class f extends a	// class@000391
{

    public void f(){
       super();
    }
    public String e(){
       return "MerchantActionJumpEvent";
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       if (!this.f() && p0 instanceof ActionJumpPayloadInfo) {
          d.a(0x7074b578).XZ(this.d(), p0.mJumpUrl);
          this.g(2, this.a);
       }
       return;
    }
}
