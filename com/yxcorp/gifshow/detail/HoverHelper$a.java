package com.yxcorp.gifshow.detail.HoverHelper$a;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.component.photofeatures.reward.model.config.RewardGifFrequencyConfig;
import java.lang.reflect.Type;

public final class HoverHelper$a implements x	// class@00133a
{
    public static final HoverHelper$a b;

    static {
       HoverHelper$a.b = new HoverHelper$a();
    }
    public void HoverHelper$a(){
       super();
    }
    public Object get(){
       RewardGifFrequencyConfig rewardGifFre = PatchProxy.apply(null, this, HoverHelper$a.class, "1");
       if (rewardGifFre != PatchProxyResult.class) {
       }else {
          rewardGifFre = a.t().getValue("RewardGifFrequencyConfig", RewardGifFrequencyConfig.class, new RewardGifFrequencyConfig());
       }
       return rewardGifFre;
    }
}
