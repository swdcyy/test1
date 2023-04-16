package com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView$a;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkCountDownTextView$CountDownType;
import java.lang.Enum;

public class VoicePartyTeamPkCountDownTextView$a	// class@001940
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VoicePartyTeamPkCountDownTextView$CountDownType.values().length];
       try{
          VoicePartyTeamPkCountDownTextView$a.a = ointArray;
          ointArray[VoicePartyTeamPkCountDownTextView$CountDownType.PUNISH.ordinal()] = 1;
          try{
             VoicePartyTeamPkCountDownTextView$a.a[VoicePartyTeamPkCountDownTextView$CountDownType.REMINDER.ordinal()] = 2;
             try{
                VoicePartyTeamPkCountDownTextView$a.a[VoicePartyTeamPkCountDownTextView$CountDownType.PKING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
