package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.a$a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.AppEventRegister$Type;
import java.lang.Enum;

public class a$a	// class@001152
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AppEventRegister$Type.values().length];
       try{
          a$a.a = ointArray;
          ointArray[AppEventRegister$Type.onApplicationBackground.ordinal()] = 1;
          try{
             a$a.a[AppEventRegister$Type.onApplicationForeground.ordinal()] = 2;
             try{
                a$a.a[AppEventRegister$Type.onActivityCreate.ordinal()] = 3;
                try{
                   a$a.a[AppEventRegister$Type.onActivityStart.ordinal()] = 4;
                   try{
                      a$a.a[AppEventRegister$Type.onActivityResume.ordinal()] = 5;
                      try{
                         a$a.a[AppEventRegister$Type.onActivityPause.ordinal()] = 6;
                         try{
                            a$a.a[AppEventRegister$Type.onActivityStop.ordinal()] = 7;
                            try{
                               a$a.a[AppEventRegister$Type.onActivityDestroy.ordinal()] = 8;
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
