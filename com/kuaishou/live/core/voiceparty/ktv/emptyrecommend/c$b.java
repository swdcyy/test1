package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c$b;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$Status;
import java.lang.Enum;

public class c$b	// class@00152d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveVoicePartyKtvMusicDownloadHelper$Status.values().length];
       try{
          c$b.a = ointArray;
          ointArray[LiveVoicePartyKtvMusicDownloadHelper$Status.WAITING.ordinal()] = 1;
          try{
             c$b.a[LiveVoicePartyKtvMusicDownloadHelper$Status.DOWNLOADING.ordinal()] = 2;
             try{
                c$b.a[LiveVoicePartyKtvMusicDownloadHelper$Status.FAILED.ordinal()] = 3;
                try{
                   c$b.a[LiveVoicePartyKtvMusicDownloadHelper$Status.SUCCESS.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
