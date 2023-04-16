package com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$e;
import y8c.f$b;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.c;
import java.util.Map;

public class VoicePartyTheaterTubeDetailFragment$e extends f$b	// class@001a07
{
    public VoicePartyTheaterTubeDetailFragment$d h;

    public void VoicePartyTheaterTubeDetailFragment$e(f$b p0,VoicePartyTheaterTubeDetailFragment$d p1){
       super(p0);
       this.h = p1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeDetailFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeDetailFragment$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(VoicePartyTheaterTubeDetailFragment$e.class, new c());
       }else {
          obj.put(VoicePartyTheaterTubeDetailFragment$e.class, null);
       }
       return obj;
    }
}
