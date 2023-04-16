package am4.b;
import com.kuaishou.merchant.transaction.base.purchasepanel.b$a;
import com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$MoreInfo;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabMoreInfo;
import zl4.a;
import vl4.j;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public final class b implements b$a	// class@00009b
{
    public final OrderTabFunctionTabView a;

    public void b(OrderTabFunctionTabView p0){
       this.a = p0;
    }
    public final void a(int p0,MerchantLivePurchasePanelResponse$MoreInfo p1){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(OrderTabFunctionTabView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, ta, OrderTabFunctionTabView.class, "12") && p1 instanceof OrderTabMoreInfo)) {
          OrderTabFunctionTabView k = ta.K;
          if (k instanceof a) {
             a i = k.I;
             OrderTabFunctionTabView h = ta.H;
             OrderTabFunctionTabView i1 = ta.I;
             String str = String.valueOf(p0);
             MerchantLivePurchasePanelResponse$MoreInfo mTitle = p1.mTitle;
             Objects.requireNonNull(i);
             if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(h), i1, str, mTitle, i, j.class, "6")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "OMIT_FUNCTION_BUTTON";
                i3 oi3 = i3.f();
                oi3.c("order_id", Long.valueOf(h));
                oi3.d("order_status", i1);
                oi3.d("index", str);
                oi3.d("button_name", mTitle);
                uElementPack.params = oi3.e();
                u1.A(i.a(), "", 1, uElementPack, new ClientContent$ContentPackage());
             }
          }
          ta.L(p1.mEventModel);
          ta.M();
       }
       return;
    }
}
