package am4.d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.order.orderlist.tab.widget.OrderTabFunctionTabView;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.ButtonTabInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zl4.a;
import java.util.Objects;
import vl4.j;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;

public class d extends m	// class@00009d
{
    public final int c;
    public final ButtonTabInfo d;
    public final OrderTabFunctionTabView e;

    public void d(OrderTabFunctionTabView p0,int p1,ButtonTabInfo p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d te = this.e;
       OrderTabFunctionTabView k = te.K;
       if (k instanceof a) {
          a i = k.I;
          OrderTabFunctionTabView h = te.H;
          OrderTabFunctionTabView i1 = te.I;
          String str = String.valueOf(this.c);
          ButtonTabInfo mContent = this.d.mContent;
          Objects.requireNonNull(i);
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(h), i1, str, mContent, i, j.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FUNCTION_BUTTON";
             i3 oi3 = i3.f();
             oi3.c("order_id", Long.valueOf(h));
             oi3.d("order_status", i1);
             oi3.d("index", str);
             oi3.d("button_name", mContent);
             uElementPack.params = oi3.e();
             u1.A(i.a(), "", 1, uElementPack, new ClientContent$ContentPackage());
          }
       }
       this.e.L(this.d.mEvent);
       return;
    }
}
