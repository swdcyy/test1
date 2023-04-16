package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView$ThumbType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyTeamPkScoreView$ThumbType extends Enum	// class@001942
{
    public static final VoicePartyTeamPkScoreView$ThumbType[] $VALUES;
    public static final VoicePartyTeamPkScoreView$ThumbType LARGE;
    public static final VoicePartyTeamPkScoreView$ThumbType SMALL;

    static {
       VoicePartyTeamPkScoreView$ThumbType thumbType = new VoicePartyTeamPkScoreView$ThumbType("LARGE", 0);
       VoicePartyTeamPkScoreView$ThumbType.LARGE = thumbType;
       VoicePartyTeamPkScoreView$ThumbType thumbType1 = new VoicePartyTeamPkScoreView$ThumbType("SMALL", 1);
       VoicePartyTeamPkScoreView$ThumbType.SMALL = thumbType1;
       VoicePartyTeamPkScoreView$ThumbType[] thumbTypeArr = new VoicePartyTeamPkScoreView$ThumbType[]{thumbType,thumbType1};
       VoicePartyTeamPkScoreView$ThumbType.$VALUES = thumbTypeArr;
    }
    public void VoicePartyTeamPkScoreView$ThumbType(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyTeamPkScoreView$ThumbType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTeamPkScoreView$ThumbType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyTeamPkScoreView$ThumbType.class, p0);
    }
    public static VoicePartyTeamPkScoreView$ThumbType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyTeamPkScoreView$ThumbType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyTeamPkScoreView$ThumbType.$VALUES.clone();
    }
}
