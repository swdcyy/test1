package com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo$PlayStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyEmojiPlayInfo$PlayStatus extends Enum	// class@0014de
{
    public static final VoicePartyEmojiPlayInfo$PlayStatus[] $VALUES;
    public static final VoicePartyEmojiPlayInfo$PlayStatus Dispatched;
    public static final VoicePartyEmojiPlayInfo$PlayStatus Finished;
    public static final VoicePartyEmojiPlayInfo$PlayStatus Playing;
    public static final VoicePartyEmojiPlayInfo$PlayStatus Received;

    static {
       VoicePartyEmojiPlayInfo$PlayStatus playStatus = new VoicePartyEmojiPlayInfo$PlayStatus("Received", 0);
       VoicePartyEmojiPlayInfo$PlayStatus.Received = playStatus;
       VoicePartyEmojiPlayInfo$PlayStatus playStatus1 = new VoicePartyEmojiPlayInfo$PlayStatus("Dispatched", 1);
       VoicePartyEmojiPlayInfo$PlayStatus.Dispatched = playStatus1;
       VoicePartyEmojiPlayInfo$PlayStatus playStatus2 = new VoicePartyEmojiPlayInfo$PlayStatus("Playing", 2);
       VoicePartyEmojiPlayInfo$PlayStatus.Playing = playStatus2;
       VoicePartyEmojiPlayInfo$PlayStatus playStatus3 = new VoicePartyEmojiPlayInfo$PlayStatus("Finished", 3);
       VoicePartyEmojiPlayInfo$PlayStatus.Finished = playStatus3;
       VoicePartyEmojiPlayInfo$PlayStatus[] playStatusAr = new VoicePartyEmojiPlayInfo$PlayStatus[]{playStatus,playStatus1,playStatus2,playStatus3};
       VoicePartyEmojiPlayInfo$PlayStatus.$VALUES = playStatusAr;
    }
    public void VoicePartyEmojiPlayInfo$PlayStatus(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyEmojiPlayInfo$PlayStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyEmojiPlayInfo$PlayStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyEmojiPlayInfo$PlayStatus.class, p0);
    }
    public static VoicePartyEmojiPlayInfo$PlayStatus[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyEmojiPlayInfo$PlayStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyEmojiPlayInfo$PlayStatus.$VALUES.clone();
    }
}
