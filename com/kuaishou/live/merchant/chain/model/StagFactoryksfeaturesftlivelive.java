package com.kuaishou.live.merchant.chain.model.StagFactoryksfeaturesftlivelive;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse$TypeAdapter;

public final class StagFactoryksfeaturesftlivelive implements j	// class@000ca6
{

    public void StagFactoryksfeaturesftlivelive(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelive.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveMerchantChainPhotoFeedResponse.class) {
          return new LiveMerchantChainPhotoFeedResponse$TypeAdapter(p0);
       }
       return null;
    }
}
