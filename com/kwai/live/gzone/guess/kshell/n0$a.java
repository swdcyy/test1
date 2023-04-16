package com.kwai.live.gzone.guess.kshell.n0$a;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import java.lang.Enum;

public class n0$a	// class@000d51
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KShellGuessResultStatus.values().length];
       try{
          n0$a.a = ointArray;
          ointArray[KShellGuessResultStatus.WIN.ordinal()] = 1;
          try{
             n0$a.a[KShellGuessResultStatus.LOSE.ordinal()] = 2;
             try{
                n0$a.a[KShellGuessResultStatus.ABORT.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
