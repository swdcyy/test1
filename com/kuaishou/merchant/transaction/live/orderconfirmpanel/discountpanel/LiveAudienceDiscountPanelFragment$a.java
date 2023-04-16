package com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.LiveAudienceDiscountPanelFragment$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.discountpanel.g;
import java.util.Map;
import java.util.HashMap;

public class LiveAudienceDiscountPanelFragment$a implements g	// class@0007eb
{
    public List b;
    public d c;
    public MerchantLivePurchasePanelResponse d;
    public LiveMerchantBaseContext e;
    public Set f;

    public void LiveAudienceDiscountPanelFragment$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceDiscountPanelFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceDiscountPanelFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceDiscountPanelFragment$a.class, new g());
       }else {
          obj.put(LiveAudienceDiscountPanelFragment$a.class, null);
       }
       return obj;
    }
}
