package com.yxcorp.gifshow.webview.yoda.e$a;
import com.kwai.yoda.model.ButtonParams$PositionId;
import java.lang.Enum;
import com.kwai.yoda.model.ButtonParams$Icon;

public class e$a	// class@0017ac
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[ButtonParams$PositionId.values().length];
       e$a.b = ointArray;
       try{
          int i = 1;
          ointArray[ButtonParams$PositionId.LEFT1.ordinal()] = i;
          int i1 = 2;
          try{
             e$a.b[ButtonParams$PositionId.LEFT2.ordinal()] = i1;
             int i2 = 3;
             try{
                e$a.b[ButtonParams$PositionId.RIGHT1.ordinal()] = i2;
                int i3 = 4;
                try{
                   e$a.b[ButtonParams$PositionId.RIGHT2.ordinal()] = i3;
                   int[] ointArray1 = new int[ButtonParams$Icon.values().length];
                   try{
                      e$a.a = ointArray1;
                      ointArray1[ButtonParams$Icon.BACK.ordinal()] = i;
                      try{
                         e$a.a[ButtonParams$Icon.CLOSE.ordinal()] = e0;
                         try{
                            e$a.a[ButtonParams$Icon.SHARE.ordinal()] = i2;
                            try{
                               e$a.a[ButtonParams$Icon.CUSTOM.ordinal()] = i3;
                               try{
                                  e$a.a[ButtonParams$Icon.DEFAULT.ordinal()] = 5;
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
