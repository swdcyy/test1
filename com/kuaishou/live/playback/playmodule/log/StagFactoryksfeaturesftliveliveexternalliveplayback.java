package com.kuaishou.live.playback.playmodule.log.StagFactoryksfeaturesftliveliveexternalliveplayback;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger$TypeAdapter;

public final class StagFactoryksfeaturesftliveliveexternalliveplayback implements j	// class@000d41
{

    public void StagFactoryksfeaturesftliveliveexternalliveplayback(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftliveliveexternalliveplayback.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LivePlaybackPhotoLogger.class) {
          return new LivePlaybackPhotoLogger$TypeAdapter(p0);
       }
       return null;
    }
}
