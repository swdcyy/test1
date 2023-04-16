package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType extends Enum	// class@001943
{
    public int voicePartyScoreTextAnimatorType;
    public static final VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType[] $VALUES;
    public static final VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType LARGE;
    public static final VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType NONE;
    public static final VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType SMALL;

    static {
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType voicePartySc = new VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType("NONE", 0, -1);
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.NONE = voicePartySc;
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType voicePartySc1 = new VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType("SMALL", 1, 0);
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.SMALL = voicePartySc1;
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType voicePartySc2 = new VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType("LARGE", 2, 1);
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.LARGE = voicePartySc2;
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType[] voicePartySc3 = new VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType[]{voicePartySc,voicePartySc1,voicePartySc2};
       VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.$VALUES = voicePartySc3;
    }
    public void VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType(String p0,int p1,int p2){
       super(p0, p1);
       this.voicePartyScoreTextAnimatorType = -1;
       this.voicePartyScoreTextAnimatorType = p2;
    }
    public static VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.class, p0);
    }
    public static VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyTeamPkScoreView$VoicePartyScoreTextAnimatorType.$VALUES.clone();
    }
    public int getVoicePartyScoreTextAnimatorType(){
       return this.voicePartyScoreTextAnimatorType;
    }
}
