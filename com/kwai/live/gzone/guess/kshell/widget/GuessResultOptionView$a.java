package com.kwai.live.gzone.guess.kshell.widget.GuessResultOptionView$a;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import java.lang.Enum;

public class GuessResultOptionView$a	// class@000d78
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KShellGuessResultStatus.values().length];
       try{
          GuessResultOptionView$a.a = ointArray;
          ointArray[KShellGuessResultStatus.ABORT.ordinal()] = 1;
          try{
             GuessResultOptionView$a.a[KShellGuessResultStatus.PING.ordinal()] = 2;
             try{
                GuessResultOptionView$a.a[KShellGuessResultStatus.LOSE.ordinal()] = 3;
                try{
                   GuessResultOptionView$a.a[KShellGuessResultStatus.WIN.ordinal()] = 4;
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
