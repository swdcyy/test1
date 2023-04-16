package bl4.e;
import cl4.a;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kc4.x;
import com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionAddressJumpPayloadInfo;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.o5;
import bl4.b;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressListActivity;
import com.kwai.library.widget.popup.common.c;

public class e extends a	// class@000390
{
    public c g;

    public void e(){
       super();
    }
    public String e(){
       return "ActionAddressJumpEvent";
    }
    public void onEvent(EventPayloadInfo p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       x.l("ActionAddressJumpEvent", "¶©µ¥ÁÐ±í", 2);
       if (!this.f() && p0 instanceof ActionAddressJumpPayloadInfo) {
          MerchantAddressListActivity.B3(this.d(), 2, o5.d(p0.mAddressId, 0), 1, "", "", new b(this, p0));
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e tg = this.g;
       if (tg != null && tg.K()) {
          this.g.o();
       }
       this.g = null;
       return;
    }
}
