package com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyTeamPkResult extends Enum	// class@001925
{
    public static final VoicePartyTeamPkResult[] $VALUES;
    public static final VoicePartyTeamPkResult BLUE_TEAM_WIN;
    public static final VoicePartyTeamPkResult DRAW;
    public static final VoicePartyTeamPkResult YELLOW_TEAM_WIN;

    static {
       VoicePartyTeamPkResult voicePartyTe = new VoicePartyTeamPkResult("YELLOW_TEAM_WIN", 0);
       VoicePartyTeamPkResult.YELLOW_TEAM_WIN = voicePartyTe;
       VoicePartyTeamPkResult voicePartyTe1 = new VoicePartyTeamPkResult("BLUE_TEAM_WIN", 1);
       VoicePartyTeamPkResult.BLUE_TEAM_WIN = voicePartyTe1;
       VoicePartyTeamPkResult voicePartyTe2 = new VoicePartyTeamPkResult("DRAW", 2);
       VoicePartyTeamPkResult.DRAW = voicePartyTe2;
       VoicePartyTeamPkResult[] voicePartyTe3 = new VoicePartyTeamPkResult[]{voicePartyTe,voicePartyTe1,voicePartyTe2};
       VoicePartyTeamPkResult.$VALUES = voicePartyTe3;
    }
    public void VoicePartyTeamPkResult(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyTeamPkResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTeamPkResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyTeamPkResult.class, p0);
    }
    public static VoicePartyTeamPkResult[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyTeamPkResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyTeamPkResult.$VALUES.clone();
    }
}
