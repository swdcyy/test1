package com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$VoiceInputEnableState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoiceInputGestureView$VoiceInputEnableState extends Enum	// class@0010d5
{
    public static final VoiceInputGestureView$VoiceInputEnableState[] $VALUES;
    public static final VoiceInputGestureView$VoiceInputEnableState DISABLE_CHATING;
    public static final VoiceInputGestureView$VoiceInputEnableState DISABLE_IN_LINE;
    public static final VoiceInputGestureView$VoiceInputEnableState DISABLE_PKING;
    public static final VoiceInputGestureView$VoiceInputEnableState DISABLE_PLAYING_MUSIC;
    public static final VoiceInputGestureView$VoiceInputEnableState ENABLE;

    static {
       VoiceInputGestureView$VoiceInputEnableState voiceInputEn = new VoiceInputGestureView$VoiceInputEnableState("ENABLE", 0);
       VoiceInputGestureView$VoiceInputEnableState.ENABLE = voiceInputEn;
       VoiceInputGestureView$VoiceInputEnableState voiceInputEn1 = new VoiceInputGestureView$VoiceInputEnableState("DISABLE_PKING", 1);
       VoiceInputGestureView$VoiceInputEnableState.DISABLE_PKING = voiceInputEn1;
       VoiceInputGestureView$VoiceInputEnableState voiceInputEn2 = new VoiceInputGestureView$VoiceInputEnableState("DISABLE_IN_LINE", 2);
       VoiceInputGestureView$VoiceInputEnableState.DISABLE_IN_LINE = voiceInputEn2;
       VoiceInputGestureView$VoiceInputEnableState voiceInputEn3 = new VoiceInputGestureView$VoiceInputEnableState("DISABLE_CHATING", 3);
       VoiceInputGestureView$VoiceInputEnableState.DISABLE_CHATING = voiceInputEn3;
       VoiceInputGestureView$VoiceInputEnableState voiceInputEn4 = new VoiceInputGestureView$VoiceInputEnableState("DISABLE_PLAYING_MUSIC", 4);
       VoiceInputGestureView$VoiceInputEnableState.DISABLE_PLAYING_MUSIC = voiceInputEn4;
       VoiceInputGestureView$VoiceInputEnableState[] voiceInputEn5 = new VoiceInputGestureView$VoiceInputEnableState[]{voiceInputEn,voiceInputEn1,voiceInputEn2,voiceInputEn3,voiceInputEn4};
       VoiceInputGestureView$VoiceInputEnableState.$VALUES = voiceInputEn5;
    }
    public void VoiceInputGestureView$VoiceInputEnableState(String p0,int p1){
       super(p0, p1);
    }
    public static VoiceInputGestureView$VoiceInputEnableState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoiceInputGestureView$VoiceInputEnableState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoiceInputGestureView$VoiceInputEnableState.class, p0);
    }
    public static VoiceInputGestureView$VoiceInputEnableState[] values(){
       Object obj = PatchProxy.apply(null, null, VoiceInputGestureView$VoiceInputEnableState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoiceInputGestureView$VoiceInputEnableState.$VALUES.clone();
    }
}
