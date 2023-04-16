package com.kuaishou.live.core.show.share.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.share.LiveCommonShareConfig;
import com.kuaishou.live.core.show.share.LiveCommonShareConfig$TypeAdapter;
import com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig;
import com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivelibrarieslivemodel implements j	// class@00100e
{

    public void StagFactoryksfeaturesftlivelivelibrarieslivemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivelibrarieslivemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == LiveCommonShareConfig.class) {
          return new LiveCommonShareConfig$TypeAdapter(p0);
       }
       if (rawType == LiveAudienceShareHighlightConfig.class) {
          return new LiveAudienceShareHighlightConfig$TypeAdapter(p0);
       }
       return null;
    }
}
