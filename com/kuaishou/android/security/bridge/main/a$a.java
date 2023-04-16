package com.kuaishou.android.security.bridge.main.a$a;
import com.kuaishou.android.security.KSecurity$ENV;
import java.lang.Enum;

public class a$a	// class@000f2c
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KSecurity$ENV.values().length];
       try{
          a$a.a = ointArray;
          ointArray[KSecurity$ENV.ROOT.ordinal()] = 1;
          try{
             a$a.a[KSecurity$ENV.MALWARE.ordinal()] = 2;
             try{
                a$a.a[KSecurity$ENV.HOOK.ordinal()] = 3;
                try{
                   a$a.a[KSecurity$ENV.EMULATOR.ordinal()] = 4;
                   try{
                      a$a.a[KSecurity$ENV.ANTIDEBUG.ordinal()] = 5;
                      try{
                         a$a.a[KSecurity$ENV.REPACK.ordinal()] = 6;
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
