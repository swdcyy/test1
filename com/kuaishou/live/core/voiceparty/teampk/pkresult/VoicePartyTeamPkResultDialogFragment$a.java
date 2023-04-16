package com.kuaishou.live.core.voiceparty.teampk.pkresult.VoicePartyTeamPkResultDialogFragment$a;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import java.lang.Enum;

public class VoicePartyTeamPkResultDialogFragment$a	// class@00192e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VoicePartyTeamPkResult.values().length];
       try{
          VoicePartyTeamPkResultDialogFragment$a.a = ointArray;
          ointArray[VoicePartyTeamPkResult.YELLOW_TEAM_WIN.ordinal()] = 1;
          try{
             VoicePartyTeamPkResultDialogFragment$a.a[VoicePartyTeamPkResult.BLUE_TEAM_WIN.ordinal()] = 2;
             try{
                VoicePartyTeamPkResultDialogFragment$a.a[VoicePartyTeamPkResult.DRAW.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
