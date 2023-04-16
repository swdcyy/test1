package com.kuaishou.krn.title.KrnTopBar$a;
import com.kuaishou.krn.title.ButtonParams$PositionId;
import java.lang.Enum;

public class KrnTopBar$a	// class@00091a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ButtonParams$PositionId.values().length];
       try{
          KrnTopBar$a.a = ointArray;
          ointArray[ButtonParams$PositionId.LEFT1.ordinal()] = 1;
          try{
             KrnTopBar$a.a[ButtonParams$PositionId.RIGHT1.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
