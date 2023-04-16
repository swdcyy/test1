package com.kwai.video.clipkit.watermark.ClipWatermarkHandler$1;
import com.kwai.video.clipkit.ClipConstant$WatermarkPosition;
import java.lang.Enum;

public class ClipWatermarkHandler$1	// class@001b06
{
    public static final int[] $SwitchMap$com$kwai$video$clipkit$ClipConstant$WatermarkPosition;

    static {
       int[] ointArray = new int[ClipConstant$WatermarkPosition.values().length];
       try{
          ClipWatermarkHandler$1.$SwitchMap$com$kwai$video$clipkit$ClipConstant$WatermarkPosition = ointArray;
          ointArray[ClipConstant$WatermarkPosition.CENTER.ordinal()] = 1;
          try{
             ClipWatermarkHandler$1.$SwitchMap$com$kwai$video$clipkit$ClipConstant$WatermarkPosition[ClipConstant$WatermarkPosition.LEFT_TOP.ordinal()] = 2;
             try{
                ClipWatermarkHandler$1.$SwitchMap$com$kwai$video$clipkit$ClipConstant$WatermarkPosition[ClipConstant$WatermarkPosition.RIGHT_TOP.ordinal()] = 3;
                try{
                   ClipWatermarkHandler$1.$SwitchMap$com$kwai$video$clipkit$ClipConstant$WatermarkPosition[ClipConstant$WatermarkPosition.LEFT_BOTTOM.ordinal()] = 4;
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
