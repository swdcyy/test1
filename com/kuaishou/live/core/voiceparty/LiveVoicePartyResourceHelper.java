package com.kuaishou.live.core.voiceparty.LiveVoicePartyResourceHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyResourceHelper$LiveVoicePartyResourceType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;

public class LiveVoicePartyResourceHelper	// class@00130f
{

    public void LiveVoicePartyResourceHelper(){
       super();
    }
    public void a(){
       LiveVoicePartyResourceHelper liveVoicePar = LiveVoicePartyResourceHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveVoicePar, "1")) {
          return;
       }
       LiveVoicePartyResourceHelper$LiveVoicePartyResourceType[] obj = PatchProxy.apply(objArray, this, liveVoicePar, "2");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.values();
          int len = obj.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (obj[i].isFileReady()) {
                   i = i + 1;
                }
             }else {
                b = true;
             }
          }
       }
       if (!b) {
          LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.VOICE_PARTY);
       }
       LiveResourceFileUtil.j(LiveResourceFileUtil$LiveResourceFileType.VOICE_PARTY, LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.KTV_APPLAUSE.getFilePath());
       return;
    }
}
