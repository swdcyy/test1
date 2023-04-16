package com.kuaishou.live.core.show.background.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig;
import com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivelibrarieslivemodel implements j	// class@0009dc
{

    public void StagFactoryksfeaturesftlivelivelibrarieslivemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivelibrarieslivemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveBackgroundMusicTipConfig.class) {
          return new LiveBackgroundMusicTipConfig$TypeAdapter(p0);
       }
       return null;
    }
}
