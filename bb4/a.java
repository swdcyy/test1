package bb4.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bb4.b;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressListActivity;
import com.kuaishou.merchant.router.annotation.RouteType;
import com.kuaishou.merchant.container.rndialog.MerchantRnDialog;
import com.kuaishou.merchant.transaction.detail.skupanel.TransactionSkuPanelFragment;
import com.kuaishou.merchant.customerservice.live.size.LiveCustomerServiceSizeFragment;
import com.kuaishou.merchant.marketing.shop.auction.setting.AuctionSettingFragment;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import com.kuaishou.merchant.transaction.order.orderlist.tab.MerchantOrderTabFragment;
import jj4.h;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import ue4.t;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelContainerFragment;
import bb4.a$a;
import bb4.a$b;
import java.util.Map;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;

public class a	// class@000366
{
    public static final Map a;

    static {
       a.a = new HashMap();
    }
    public void a(){
       super();
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, a.class, str)) {
       }else {
          a.c("/addressList", new b(MerchantAddressListActivity.class, RouteType.ACTIVITY));
          RouteType fRAGMENT = RouteType.FRAGMENT;
          a.c("/merchantrndialog", new b(MerchantRnDialog.class, fRAGMENT));
          a.c("/transaction/sku/panel", new b(TransactionSkuPanelFragment.class, fRAGMENT));
          a.c("/customservicesize", new b(LiveCustomerServiceSizeFragment.class, fRAGMENT));
          a.c("kwai://merchant", new b(AuctionSettingFragment.class, fRAGMENT));
          a.c("/auctionManagementPage", new b(AuctionSettingFragment.class, fRAGMENT));
          a.c("/merchant_yoda", new b(MerchantYodaWebViewFragment.class, fRAGMENT));
          a.c("/ordertab", new b(MerchantOrderTabFragment.class, fRAGMENT));
          if (!PatchProxy.applyVoid(objArray, objArray, h.class, str)) {
             a.s(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "PurchasePanelRouterRegister", "register");
             b uob = (t.b())? new b(MerchantLivePurchasePanelContainerV2Fragment.class, fRAGMENT): new b(MerchantLivePurchasePanelContainerFragment.class, fRAGMENT);
             a.c("/orderconfirmpanel", uob);
             a.c("/live/purchasepanelv2", new b(MerchantLivePurchasePanelContainerV2Fragment.class, fRAGMENT));
          }
       }
       return;
    }
    public void a(a$a p0){
       super();
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, a.class, str)) {
       }else {
          a.c("/addressList", new b(MerchantAddressListActivity.class, RouteType.ACTIVITY));
          RouteType fRAGMENT = RouteType.FRAGMENT;
          a.c("/merchantrndialog", new b(MerchantRnDialog.class, fRAGMENT));
          a.c("/transaction/sku/panel", new b(TransactionSkuPanelFragment.class, fRAGMENT));
          a.c("/customservicesize", new b(LiveCustomerServiceSizeFragment.class, fRAGMENT));
          a.c("kwai://merchant", new b(AuctionSettingFragment.class, fRAGMENT));
          a.c("/auctionManagementPage", new b(AuctionSettingFragment.class, fRAGMENT));
          a.c("/merchant_yoda", new b(MerchantYodaWebViewFragment.class, fRAGMENT));
          a.c("/ordertab", new b(MerchantOrderTabFragment.class, fRAGMENT));
          if (!PatchProxy.applyVoid(objArray, objArray, h.class, str)) {
             a.s(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "PurchasePanelRouterRegister", "register");
             b uob = (t.b())? new b(MerchantLivePurchasePanelContainerV2Fragment.class, fRAGMENT): new b(MerchantLivePurchasePanelContainerFragment.class, fRAGMENT);
             a.c("/orderconfirmpanel", uob);
             a.c("/live/purchasepanelv2", new b(MerchantLivePurchasePanelContainerV2Fragment.class, fRAGMENT));
          }
       }
       return;
    }
    public static a b(){
       return a$b.a;
    }
    public static void c(String p0,b p1){
       Map a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       a = a.a;
       if (a.containsKey(p0)) {
          throw new RuntimeException("duplicate path, path: "+p0+", class1: "+p1.a()+", class2:"+a.get(p0).a());
       }
       if (a.get(p0) == null) {
          a.put(p0, p1);
       }
       return;
    }
    public b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.get(p0);
    }
}
