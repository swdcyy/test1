package com.kuaishou.merchant.live.cart.onsale.audience.BaseLiveAudienceShopFragment;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class BaseLiveAudienceShopFragment extends MerchantRecycleFragment	// class@001919
{

    public void BaseLiveAudienceShopFragment(){
       super();
    }
    public void Mh(String p0){
    }
    public abstract void Nh();
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseLiveAudienceShopFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(BaseLiveAudienceShopFragment.class, null);
       return objectsByTag;
    }
}
