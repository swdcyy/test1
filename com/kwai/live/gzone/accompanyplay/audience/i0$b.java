package com.kwai.live.gzone.accompanyplay.audience.i0$b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState$State;
import java.lang.Enum;

public class i0$b	// class@000b84
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveGzoneAudienceAccompanyState$State.values().length];
       try{
          i0$b.a = ointArray;
          ointArray[LiveGzoneAudienceAccompanyState$State.IDLE.ordinal()] = 1;
          try{
             i0$b.a[LiveGzoneAudienceAccompanyState$State.VERSION_LIMIT.ordinal()] = 2;
             try{
                i0$b.a[LiveGzoneAudienceAccompanyState$State.UN_PAYMENT.ordinal()] = 3;
                try{
                   i0$b.a[LiveGzoneAudienceAccompanyState$State.QUEUE.ordinal()] = 4;
                   try{
                      i0$b.a[LiveGzoneAudienceAccompanyState$State.WAIT_LOCK.ordinal()] = 5;
                      try{
                         i0$b.a[LiveGzoneAudienceAccompanyState$State.WAIT_START.ordinal()] = 6;
                         try{
                            i0$b.a[LiveGzoneAudienceAccompanyState$State.PLAYING.ordinal()] = 7;
                            try{
                               i0$b.a[LiveGzoneAudienceAccompanyState$State.RATE.ordinal()] = 8;
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
