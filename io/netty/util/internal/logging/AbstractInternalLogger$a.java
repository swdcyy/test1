package io.netty.util.internal.logging.AbstractInternalLogger$a;
import io.netty.util.internal.logging.InternalLogLevel;
import java.lang.Enum;

public class AbstractInternalLogger$a	// class@001187
{
    public static final int[] a;

    static {
       int[] ointArray = new int[InternalLogLevel.values().length];
       try{
          AbstractInternalLogger$a.a = ointArray;
          ointArray[InternalLogLevel.TRACE.ordinal()] = 1;
          try{
             AbstractInternalLogger$a.a[InternalLogLevel.DEBUG.ordinal()] = 2;
             try{
                AbstractInternalLogger$a.a[InternalLogLevel.INFO.ordinal()] = 3;
                try{
                   AbstractInternalLogger$a.a[InternalLogLevel.WARN.ordinal()] = 4;
                   try{
                      AbstractInternalLogger$a.a[InternalLogLevel.ERROR.ordinal()] = 5;
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
