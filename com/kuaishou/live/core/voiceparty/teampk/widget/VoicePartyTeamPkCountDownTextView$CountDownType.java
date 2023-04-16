package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView$CountDownType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyTeamPkCountDownTextView$CountDownType extends Enum	// class@00193f
{
    public static final VoicePartyTeamPkCountDownTextView$CountDownType[] $VALUES;
    public static final VoicePartyTeamPkCountDownTextView$CountDownType PKING;
    public static final VoicePartyTeamPkCountDownTextView$CountDownType PUNISH;
    public static final VoicePartyTeamPkCountDownTextView$CountDownType REMINDER;

    static {
       VoicePartyTeamPkCountDownTextView$CountDownType uCountDownTy = new VoicePartyTeamPkCountDownTextView$CountDownType("PKING", 0);
       VoicePartyTeamPkCountDownTextView$CountDownType.PKING = uCountDownTy;
       VoicePartyTeamPkCountDownTextView$CountDownType uCountDownTy1 = new VoicePartyTeamPkCountDownTextView$CountDownType("PUNISH", 1);
       VoicePartyTeamPkCountDownTextView$CountDownType.PUNISH = uCountDownTy1;
       VoicePartyTeamPkCountDownTextView$CountDownType uCountDownTy2 = new VoicePartyTeamPkCountDownTextView$CountDownType("REMINDER", 2);
       VoicePartyTeamPkCountDownTextView$CountDownType.REMINDER = uCountDownTy2;
       VoicePartyTeamPkCountDownTextView$CountDownType[] uCountDownTy3 = new VoicePartyTeamPkCountDownTextView$CountDownType[]{uCountDownTy,uCountDownTy1,uCountDownTy2};
       VoicePartyTeamPkCountDownTextView$CountDownType.$VALUES = uCountDownTy3;
    }
    public void VoicePartyTeamPkCountDownTextView$CountDownType(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyTeamPkCountDownTextView$CountDownType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTeamPkCountDownTextView$CountDownType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyTeamPkCountDownTextView$CountDownType.class, p0);
    }
    public static VoicePartyTeamPkCountDownTextView$CountDownType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyTeamPkCountDownTextView$CountDownType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyTeamPkCountDownTextView$CountDownType.$VALUES.clone();
    }
}
