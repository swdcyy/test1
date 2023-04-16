package com.yxcorp.gifshow.pendant.response.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.pendant.response.WatchVideoStyle;
import com.yxcorp.gifshow.pendant.response.WatchVideoStyle$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.UIParams;
import com.yxcorp.gifshow.pendant.response.UIParams$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.PendantBubbleConfig;
import com.yxcorp.gifshow.pendant.response.PendantBubbleConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig;
import com.yxcorp.gifshow.pendant.response.EntranceParams$PendantConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.EntranceParams;
import com.yxcorp.gifshow.pendant.response.EntranceParams$TypeAdapter;
import com.yxcorp.gifshow.pendant.response.BubbleConfig;
import com.yxcorp.gifshow.pendant.response.BubbleConfig$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@00127a
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == WatchVideoStyle.class) {
          return new WatchVideoStyle$TypeAdapter(p0);
       }
       if (rawType == UIParams.class) {
          return new UIParams$TypeAdapter(p0);
       }
       if (rawType == PendantLocationParam.class) {
          return new PendantLocationParam$TypeAdapter(p0);
       }
       if (rawType == PendantBubbleConfig.class) {
          return new PendantBubbleConfig$TypeAdapter(p0);
       }
       if (rawType == EntranceParams$PendantConfig.class) {
          return new EntranceParams$PendantConfig$TypeAdapter(p0);
       }
       if (rawType == EntranceParams.class) {
          return new EntranceParams$TypeAdapter(p0);
       }
       if (rawType == BubbleConfig.class) {
          return new BubbleConfig$TypeAdapter(p0);
       }
       return null;
    }
}
