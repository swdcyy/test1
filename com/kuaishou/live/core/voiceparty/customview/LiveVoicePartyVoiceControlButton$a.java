package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyVoiceControlButton$a;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyVoiceControlButton$VoiceState;
import java.lang.Enum;

public class LiveVoicePartyVoiceControlButton$a	// class@0014ba
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveVoicePartyVoiceControlButton$VoiceState.values().length];
       try{
          LiveVoicePartyVoiceControlButton$a.a = ointArray;
          ointArray[LiveVoicePartyVoiceControlButton$VoiceState.Mute.ordinal()] = 1;
          try{
             LiveVoicePartyVoiceControlButton$a.a[LiveVoicePartyVoiceControlButton$VoiceState.Ready.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
