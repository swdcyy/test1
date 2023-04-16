package com.yxcorp.gifshow.init.module.DesignWidgetInitModule$1;
import com.kwai.library.widget.gray.inter.KwaiGrayLogEvent;
import java.lang.Enum;

public class DesignWidgetInitModule$1	// class@001976
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KwaiGrayLogEvent.values().length];
       try{
          DesignWidgetInitModule$1.a = ointArray;
          ointArray[KwaiGrayLogEvent.ENTER.ordinal()] = 1;
          try{
             DesignWidgetInitModule$1.a[KwaiGrayLogEvent.GRAY_START.ordinal()] = 2;
             try{
                DesignWidgetInitModule$1.a[KwaiGrayLogEvent.GRAY_SUCCESS.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
