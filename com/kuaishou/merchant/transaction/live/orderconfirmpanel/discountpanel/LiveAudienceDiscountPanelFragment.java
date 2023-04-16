package com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment$a;
import gk4.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hk4.a;
import java.util.List;
import java.util.Map;
import y8c.g;
import qvb.i;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.h;

public class LiveAudienceDiscountPanelFragment extends MerchantRecycleFragment	// class@0007ec
{
    public LiveAudienceDiscountPanelFragment$a I;
    public b J;
    public static final int K;

    public void LiveAudienceDiscountPanelFragment(){
       super();
       this.I = new LiveAudienceDiscountPanelFragment$a();
       this.J = new b();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveAudienceDiscountPanelFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a());
       PatchProxy.onMethodExit(LiveAudienceDiscountPanelFragment.class, "2");
       return obj;
    }
    public String C1(){
       return null;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveAudienceDiscountPanelFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.I);
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d0a39;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceDiscountPanelFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveAudienceDiscountPanelFragment.class, null);
       return objectsByTag;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceDiscountPanelFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.J.n1("LIVE_AUDIENCE_CONFIRM_PANEL_BOTTOM_BAR_SERVICE", this.I.c);
       this.J.n1("ADAPTER", this.J);
       this.J.n1("ORDER_CONFIRM_RESPONSE", this.I.d);
       this.J.n1("LIVE_BASE_CONTEXT", this.I.e);
       this.J.n1("discount_item_showed_set", this.I.f);
       return this.J;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceDiscountPanelFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.I);
    }
}
