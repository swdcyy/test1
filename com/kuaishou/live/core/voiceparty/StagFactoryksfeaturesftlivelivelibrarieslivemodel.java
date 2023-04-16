package com.kuaishou.live.core.voiceparty.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyKtvCommonConfig$TypeAdapter;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivelibrarieslivemodel implements j	// class@001314
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
       if (rawType == LiveVoicePartyTheaterCommonConfig.class) {
          return new LiveVoicePartyTheaterCommonConfig$TypeAdapter(p0);
       }
       if (rawType == LiveVoicePartyKtvCommonConfig.class) {
          return new LiveVoicePartyKtvCommonConfig$TypeAdapter(p0);
       }
       if (rawType == LiveVoicePartyCommonConfig.class) {
          return new LiveVoicePartyCommonConfig$TypeAdapter(p0);
       }
       return null;
    }
}
