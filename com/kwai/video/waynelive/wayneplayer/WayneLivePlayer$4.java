package com.kwai.video.waynelive.wayneplayer.WayneLivePlayer$4;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;

public class WayneLivePlayer$4	// class@000e45
{
    public static final int[] $SwitchMap$com$kwai$video$waynelive$LivePlayerState;

    static {
       int[] ointArray = new int[LivePlayerState.values().length];
       try{
          WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState = ointArray;
          ointArray[LivePlayerState.STOP.ordinal()] = 1;
          try{
             WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.PREPARING.ordinal()] = 2;
             try{
                WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.DESTROY.ordinal()] = 3;
                try{
                   WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.PLAYING.ordinal()] = 4;
                   try{
                      WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.ERROR.ordinal()] = 5;
                      try{
                         WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.IDLE.ordinal()] = 6;
                         try{
                            WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.INIT.ordinal()] = 7;
                            try{
                               WayneLivePlayer$4.$SwitchMap$com$kwai$video$waynelive$LivePlayerState[LivePlayerState.CREATED.ordinal()] = 8;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
