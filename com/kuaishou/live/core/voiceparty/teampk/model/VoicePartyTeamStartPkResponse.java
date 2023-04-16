package com.kuaishou.live.core.voiceparty.teampk.model.VoicePartyTeamStartPkResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.teampk.model.VoicePartyTeamStartPkResponse$VoicePartyTemStartPkInfo;
import java.lang.CharSequence;
import android.text.TextUtils;

public class VoicePartyTeamStartPkResponse implements Serializable	// class@00192d
{
    public VoicePartyTeamStartPkResponse$VoicePartyTemStartPkInfo mPkInfo;
    public static final long serialVersionUID = 0x17959e007bc61f80;

    public void VoicePartyTeamStartPkResponse(){
       super();
    }
    public static boolean isValid(VoicePartyTeamStartPkResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyTeamStartPkResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       p0 = p0.mPkInfo;
       if (p0 == null) {
          return b;
       }
       if (!TextUtils.isEmpty(p0.mPkId) && (p0.mServerTimeMs > 0 && (p0.mPenaltyDeadlineMs > 0 && (p0.mStartTimeMs > 0 && (p0.mVoteDeadlineMs > 0 && p0.mVoteEndWaitDeadlineMs > 0))))) {
          b = true;
       }
    label_0046 :
       return b;
    }
}
