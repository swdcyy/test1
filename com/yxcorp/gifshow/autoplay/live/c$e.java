package com.yxcorp.gifshow.autoplay.live.c$e;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;

public class c$e	// class@001c14
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePlayerState.values().length];
       try{
          c$e.a = ointArray;
          ointArray[LivePlayerState.IDLE.ordinal()] = 1;
          try{
             c$e.a[LivePlayerState.PREPARING.ordinal()] = 2;
             try{
                c$e.a[LivePlayerState.PLAYING.ordinal()] = 3;
                try{
                   c$e.a[LivePlayerState.STOP.ordinal()] = 4;
                   try{
                      c$e.a[LivePlayerState.DESTROY.ordinal()] = 5;
                      try{
                         c$e.a[LivePlayerState.ERROR.ordinal()] = 6;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
