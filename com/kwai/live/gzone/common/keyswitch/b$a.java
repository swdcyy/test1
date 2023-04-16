package com.kwai.live.gzone.common.keyswitch.b$a;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys$From;
import java.lang.Enum;

public class b$a	// class@000cb1
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveGzoneKeys$From.values().length];
       try{
          b$a.a = ointArray;
          ointArray[LiveGzoneKeys$From.AB.ordinal()] = 1;
          try{
             b$a.a[LiveGzoneKeys$From.SWITCH.ordinal()] = 2;
             try{
                b$a.a[LiveGzoneKeys$From.DEV.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
