package com.kwai.video.wayne.player.danmakumask.DanmakuProcessor$5;
import com.kwai.video.wayne.player.danmakumask.KSRenderType;
import java.lang.Enum;
import tv.acfun.core.player.mask.model.ResultCode;
import com.kwai.video.wayne.player.danmakumask.KSDanamkuMaskType;

public class DanmakuProcessor$5	// class@000d12
{
    public static final int[] $SwitchMap$com$kwai$video$wayne$player$danmakumask$KSDanamkuMaskType;
    public static final int[] $SwitchMap$com$kwai$video$wayne$player$danmakumask$KSRenderType;
    public static final int[] $SwitchMap$tv$acfun$core$player$mask$model$ResultCode;

    static {
       int[] ointArray = new int[KSRenderType.values().length];
       DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSRenderType = ointArray;
       try{
          int i = 1;
          ointArray[KSRenderType.TYPE_NORMAL.ordinal()] = i;
          int i1 = 2;
          try{
             DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSRenderType[KSRenderType.TYPE_SURFACE.ordinal()] = i1;
             int i2 = 3;
             try{
                DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSRenderType[KSRenderType.TYPE_TEXTURE.ordinal()] = i2;
                int i3 = 4;
                try{
                   DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSRenderType[KSRenderType.TYPE_OTHER.ordinal()] = i3;
                   int[] ointArray1 = new int[ResultCode.values().length];
                   try{
                      DanmakuProcessor$5.$SwitchMap$tv$acfun$core$player$mask$model$ResultCode = ointArray1;
                      ointArray1[ResultCode.SUCCESS.ordinal()] = i;
                      try{
                         DanmakuProcessor$5.$SwitchMap$tv$acfun$core$player$mask$model$ResultCode[ResultCode.CLEAN_MASK.ordinal()] = e0;
                         try{
                            DanmakuProcessor$5.$SwitchMap$tv$acfun$core$player$mask$model$ResultCode[ResultCode.IGNORE.ordinal()] = i2;
                            ointArray1 = new int[KSDanamkuMaskType.values().length];
                            try{
                               DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSDanamkuMaskType = ointArray1;
                               ointArray1[KSDanamkuMaskType.TYPE_SVG_DATA.ordinal()] = i;
                               try{
                                  DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSDanamkuMaskType[KSDanamkuMaskType.TYPE_PATH_DATA.ordinal()] = e0;
                                  try{
                                     DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSDanamkuMaskType[KSDanamkuMaskType.TYPE_LAYOUT.ordinal()] = i2;
                                     try{
                                        DanmakuProcessor$5.$SwitchMap$com$kwai$video$wayne$player$danmakumask$KSDanamkuMaskType[KSDanamkuMaskType.TYPE_TRANSFORM_PATH_DATA.ordinal()] = i3;
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
