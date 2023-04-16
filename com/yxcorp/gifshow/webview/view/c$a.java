package com.yxcorp.gifshow.webview.view.c$a;
import com.kwai.yoda.model.ButtonParams$PositionId;
import java.lang.Enum;

public class c$a	// class@0017a1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ButtonParams$PositionId.values().length];
       try{
          c$a.a = ointArray;
          ointArray[ButtonParams$PositionId.LEFT1.ordinal()] = 1;
          try{
             c$a.a[ButtonParams$PositionId.LEFT2.ordinal()] = 2;
             try{
                c$a.a[ButtonParams$PositionId.RIGHT1.ordinal()] = 3;
                try{
                   c$a.a[ButtonParams$PositionId.RIGHT2.ordinal()] = 4;
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
