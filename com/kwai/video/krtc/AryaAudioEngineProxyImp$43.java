package com.kwai.video.krtc.AryaAudioEngineProxyImp$43;
import com.kwai.video.stannis.observers.AudioSegmentPlayerObserver$ErrorType;
import java.lang.Enum;
import com.kwai.video.stannis.observers.BgmObserver$BgmErrorType;

public class AryaAudioEngineProxyImp$43	// class@0006e2
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[AudioSegmentPlayerObserver$ErrorType.values().length];
       AryaAudioEngineProxyImp$43.b = ointArray;
       try{
          int i = 1;
          ointArray[AudioSegmentPlayerObserver$ErrorType.None.ordinal()] = i;
          int i1 = 2;
          try{
             AryaAudioEngineProxyImp$43.b[AudioSegmentPlayerObserver$ErrorType.ErrorIo.ordinal()] = i1;
             int i2 = 3;
             try{
                AryaAudioEngineProxyImp$43.b[AudioSegmentPlayerObserver$ErrorType.Unknown.ordinal()] = i2;
                int i3 = 4;
                try{
                   AryaAudioEngineProxyImp$43.b[AudioSegmentPlayerObserver$ErrorType.Malformed.ordinal()] = i3;
                   int i4 = 5;
                   try{
                      AryaAudioEngineProxyImp$43.b[AudioSegmentPlayerObserver$ErrorType.NotSupported.ordinal()] = i4;
                      int[] ointArray1 = new int[BgmObserver$BgmErrorType.values().length];
                      try{
                         AryaAudioEngineProxyImp$43.a = ointArray1;
                         ointArray1[BgmObserver$BgmErrorType.None.ordinal()] = i;
                         try{
                            AryaAudioEngineProxyImp$43.a[BgmObserver$BgmErrorType.ErrorIo.ordinal()] = e0;
                            try{
                               AryaAudioEngineProxyImp$43.a[BgmObserver$BgmErrorType.Unknown.ordinal()] = i2;
                               try{
                                  AryaAudioEngineProxyImp$43.a[BgmObserver$BgmErrorType.Malformed.ordinal()] = i3;
                                  try{
                                     AryaAudioEngineProxyImp$43.a[BgmObserver$BgmErrorType.NotSupported.ordinal()] = i4;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
