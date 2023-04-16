package com.kwai.live.gzone.guess.kshell.x$d;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import java.lang.Enum;

public class x$d	// class@000d7f
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KShellGuessQuestionStatus.values().length];
       try{
          x$d.a = ointArray;
          ointArray[KShellGuessQuestionStatus.PAPER_GUESSING.ordinal()] = 1;
          try{
             x$d.a[KShellGuessQuestionStatus.PAPER_GUESS_CUT_OFF.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
