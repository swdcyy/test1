package com.yxcorp.gifshow.player.KsAudioPlayer$a;
import com.yxcorp.gifshow.player.KsAudioPlayerState;
import java.lang.Enum;

public class KsAudioPlayer$a	// class@000fb1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KsAudioPlayerState.values().length];
       try{
          KsAudioPlayer$a.a = ointArray;
          ointArray[KsAudioPlayerState.IDLE.ordinal()] = 1;
          try{
             KsAudioPlayer$a.a[KsAudioPlayerState.INITIALIZED.ordinal()] = 2;
             try{
                KsAudioPlayer$a.a[KsAudioPlayerState.STARTED.ordinal()] = 3;
                try{
                   KsAudioPlayer$a.a[KsAudioPlayerState.PAUSED.ordinal()] = 4;
                   try{
                      KsAudioPlayer$a.a[KsAudioPlayerState.RELEASED.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
