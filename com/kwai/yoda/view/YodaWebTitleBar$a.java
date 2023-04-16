package com.kwai.yoda.view.YodaWebTitleBar$a;
import com.kwai.yoda.model.ButtonParams$PositionId;
import java.lang.Enum;

public class YodaWebTitleBar$a	// class@0012fc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ButtonParams$PositionId.values().length];
       try{
          YodaWebTitleBar$a.a = ointArray;
          ointArray[ButtonParams$PositionId.LEFT1.ordinal()] = 1;
          try{
             YodaWebTitleBar$a.a[ButtonParams$PositionId.LEFT2.ordinal()] = 2;
             try{
                YodaWebTitleBar$a.a[ButtonParams$PositionId.RIGHT1.ordinal()] = 3;
                try{
                   YodaWebTitleBar$a.a[ButtonParams$PositionId.RIGHT2.ordinal()] = 4;
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
