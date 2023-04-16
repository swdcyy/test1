package com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$a;
import com.kuaishou.live.common.core.component.comments.widget.VoiceInputGestureView$VoiceInputEnableState;
import java.lang.Enum;

public class VoiceInputGestureView$a	// class@0010d6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VoiceInputGestureView$VoiceInputEnableState.values().length];
       try{
          VoiceInputGestureView$a.a = ointArray;
          ointArray[VoiceInputGestureView$VoiceInputEnableState.ENABLE.ordinal()] = 1;
          try{
             VoiceInputGestureView$a.a[VoiceInputGestureView$VoiceInputEnableState.DISABLE_PKING.ordinal()] = 2;
             try{
                VoiceInputGestureView$a.a[VoiceInputGestureView$VoiceInputEnableState.DISABLE_IN_LINE.ordinal()] = 3;
                try{
                   VoiceInputGestureView$a.a[VoiceInputGestureView$VoiceInputEnableState.DISABLE_CHATING.ordinal()] = 4;
                   try{
                      VoiceInputGestureView$a.a[VoiceInputGestureView$VoiceInputEnableState.DISABLE_PLAYING_MUSIC.ordinal()] = 5;
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
