package com.yxcorp.gifshow.init.module.DFPInitModule$5;
import com.kuaishou.android.security.base.util.KSecurityTrack$LEVEL;
import java.lang.Enum;

public class DFPInitModule$5	// class@00196c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KSecurityTrack$LEVEL.values().length];
       try{
          DFPInitModule$5.a = ointArray;
          ointArray[KSecurityTrack$LEVEL.VERBOSE.ordinal()] = 1;
          try{
             DFPInitModule$5.a[KSecurityTrack$LEVEL.DEBUG.ordinal()] = 2;
             try{
                DFPInitModule$5.a[KSecurityTrack$LEVEL.INFO.ordinal()] = 3;
                try{
                   DFPInitModule$5.a[KSecurityTrack$LEVEL.WARN.ordinal()] = 4;
                   try{
                      DFPInitModule$5.a[KSecurityTrack$LEVEL.ERROR.ordinal()] = 5;
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
