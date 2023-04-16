package com.kwai.video.ksmemorykit.EditorSmartClipTask$3;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$PresentType;
import java.lang.Enum;
import com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import com.kwai.kve.Rotation;
import com.kwai.video.ksmemorykit.EditorSmartClipTask$EditorVoiceDetectStatus;

public class EditorSmartClipTask$3	// class@0008f9
{
    public static final int[] $SwitchMap$com$kwai$kve$Rotation;
    public static final int[] $SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipTask$EditorVoiceDetectStatus;
    public static final int[] $SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$PresentType;
    public static final int[] $SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType;

    static {
       int[] ointArray = new int[EditorSmartClipThemeConfig$PresentType.values().length];
       EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$PresentType = ointArray;
       try{
          int i = 1;
          ointArray[EditorSmartClipThemeConfig$PresentType.Loop.ordinal()] = i;
          int i1 = 2;
          try{
             EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$PresentType[EditorSmartClipThemeConfig$PresentType.OnceRandomStart.ordinal()] = i1;
             int i2 = 3;
             try{
                EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$PresentType[EditorSmartClipThemeConfig$PresentType.OnceFixedStart.ordinal()] = i2;
                int[] ointArray1 = new int[EditorSmartClipThemeConfig$RandomType.values().length];
                try{
                   EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType = ointArray1;
                   ointArray1[EditorSmartClipThemeConfig$RandomType.ALL.ordinal()] = i;
                   try{
                      EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType[EditorSmartClipThemeConfig$RandomType.AVOID_DUPLICATE.ordinal()] = e0;
                      try{
                         EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipThemeConfig$RandomType[EditorSmartClipThemeConfig$RandomType.FOLLOW_LIST.ordinal()] = i2;
                         ointArray1 = new int[Rotation.values().length];
                         try{
                            EditorSmartClipTask$3.$SwitchMap$com$kwai$kve$Rotation = ointArray1;
                            ointArray1[Rotation.ROT90.ordinal()] = i;
                            try{
                               EditorSmartClipTask$3.$SwitchMap$com$kwai$kve$Rotation[Rotation.ROT180.ordinal()] = e0;
                               try{
                                  EditorSmartClipTask$3.$SwitchMap$com$kwai$kve$Rotation[Rotation.ROT270.ordinal()] = i2;
                                  ointArray1 = new int[EditorSmartClipTask$EditorVoiceDetectStatus.values().length];
                                  try{
                                     EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipTask$EditorVoiceDetectStatus = ointArray1;
                                     ointArray1[EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusSuspended.ordinal()] = i;
                                     try{
                                        EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipTask$EditorVoiceDetectStatus[EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusExecuting.ordinal()] = e0;
                                        try{
                                           EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipTask$EditorVoiceDetectStatus[EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusFinished.ordinal()] = i2;
                                           try{
                                              EditorSmartClipTask$3.$SwitchMap$com$kwai$video$ksmemorykit$EditorSmartClipTask$EditorVoiceDetectStatus[EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusError.ordinal()] = 4;
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
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
