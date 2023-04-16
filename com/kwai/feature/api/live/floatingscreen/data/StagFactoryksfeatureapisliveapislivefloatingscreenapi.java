package com.kwai.feature.api.live.floatingscreen.data.StagFactoryksfeatureapisliveapislivefloatingscreenapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo;
import com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter;

public final class StagFactoryksfeatureapisliveapislivefloatingscreenapi implements j	// class@000fbf
{

    public void StagFactoryksfeatureapisliveapislivefloatingscreenapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapisliveapislivefloatingscreenapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveEnterRoomEffectBackgroudPicInfo.class) {
          return new LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter(p0);
       }
       return null;
    }
}
