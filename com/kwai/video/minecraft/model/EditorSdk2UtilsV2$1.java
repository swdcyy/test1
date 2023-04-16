package com.kwai.video.minecraft.model.EditorSdk2UtilsV2$1;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import java.lang.Enum;

public class EditorSdk2UtilsV2$1	// class@0009ed
{
    public static final int[] $SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation;

    static {
       int[] ointArray = new int[EditorSdk2Utils$PreviewSizeLimitation.values().length];
       try{
          EditorSdk2UtilsV2$1.$SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation = ointArray;
          ointArray[EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_540P.ordinal()] = 1;
          try{
             EditorSdk2UtilsV2$1.$SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation[EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_576P.ordinal()] = 2;
             try{
                EditorSdk2UtilsV2$1.$SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation[EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1080P.ordinal()] = 3;
                try{
                   EditorSdk2UtilsV2$1.$SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation[EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_1440P.ordinal()] = 4;
                   try{
                      EditorSdk2UtilsV2$1.$SwitchMap$com$kwai$video$editorsdk2$EditorSdk2Utils$PreviewSizeLimitation[EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_MAX_GL_SIZE.ordinal()] = 5;
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
