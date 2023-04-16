package com.yxcorp.gifshow.hot.spot.model.StagFactoryksfeaturesftfeedhotspot;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.hot.spot.model.HotSpotTrendingInfo;
import com.yxcorp.gifshow.hot.spot.model.HotSpotTrendingInfo$TypeAdapter;
import com.yxcorp.gifshow.hot.spot.model.HotSpotInterestInfo;
import com.yxcorp.gifshow.hot.spot.model.HotSpotInterestInfo$TypeAdapter;

public final class StagFactoryksfeaturesftfeedhotspot implements j	// class@001843
{

    public void StagFactoryksfeaturesftfeedhotspot(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftfeedhotspot.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == HotSpotTrendingInfo.class) {
          return new HotSpotTrendingInfo$TypeAdapter(p0);
       }
       if (rawType == HotSpotInterestInfo.class) {
          return new HotSpotInterestInfo$TypeAdapter(p0);
       }
       return null;
    }
}
