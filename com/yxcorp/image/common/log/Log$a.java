package com.yxcorp.image.common.log.Log$a;
import com.yxcorp.image.common.log.Log$LEVEL;
import java.lang.Enum;

public class Log$a	// class@001a07
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Log$LEVEL.values().length];
       try{
          Log$a.a = ointArray;
          ointArray[Log$LEVEL.VERBOSE.ordinal()] = 1;
          try{
             Log$a.a[Log$LEVEL.DEBUG.ordinal()] = 2;
             try{
                Log$a.a[Log$LEVEL.INFO.ordinal()] = 3;
                try{
                   Log$a.a[Log$LEVEL.WARN.ordinal()] = 4;
                   try{
                      Log$a.a[Log$LEVEL.ERROR.ordinal()] = 5;
                      try{
                         Log$a.a[Log$LEVEL.ASSERT.ordinal()] = 6;
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
