package com.kuaishou.live.core.voiceparty.LiveVoicePartyResourceHelper$LiveVoicePartyResourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.lang.Boolean;
import java.io.File;
import qkd.b;

public final class LiveVoicePartyResourceHelper$LiveVoicePartyResourceType extends Enum	// class@00130e
{
    public String mFileName;
    public static final LiveVoicePartyResourceHelper$LiveVoicePartyResourceType[] $VALUES;
    public static final LiveVoicePartyResourceHelper$LiveVoicePartyResourceType KTV_APPLAUSE;

    static {
       LiveVoicePartyResourceHelper$LiveVoicePartyResourceType liveVoicePar = new LiveVoicePartyResourceHelper$LiveVoicePartyResourceType("KTV_APPLAUSE", 0, "live_voice_party_ktv_applause.m4a");
       LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.KTV_APPLAUSE = liveVoicePar;
       LiveVoicePartyResourceHelper$LiveVoicePartyResourceType[] liveVoicePar1 = new LiveVoicePartyResourceHelper$LiveVoicePartyResourceType[]{liveVoicePar};
       LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.$VALUES = liveVoicePar1;
    }
    public void LiveVoicePartyResourceHelper$LiveVoicePartyResourceType(String p0,int p1,String p2){
       super(p0, p1);
       this.mFileName = p2;
    }
    public static LiveVoicePartyResourceHelper$LiveVoicePartyResourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.class, p0);
    }
    public static LiveVoicePartyResourceHelper$LiveVoicePartyResourceType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.$VALUES.clone();
    }
    public String getFilePath(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil.k("live_voice_party")+"/"+this.mFileName;
    }
    public boolean isFileReady(){
       String[] obj = PatchProxy.apply(null, this, LiveVoicePartyResourceHelper$LiveVoicePartyResourceType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new String[]{this.getFilePath()};
       return b.B(obj).exists();
    }
}
