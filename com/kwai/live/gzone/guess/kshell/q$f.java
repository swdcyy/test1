package com.kwai.live.gzone.guess.kshell.q$f;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import java.lang.Enum;

public class q$f	// class@000d61
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KShellGuessQuestionStatus.values().length];
       try{
          q$f.a = ointArray;
          ointArray[KShellGuessQuestionStatus.PAPER_GUESSING.ordinal()] = 1;
          try{
             q$f.a[KShellGuessQuestionStatus.PAPER_GUESS_CUT_OFF.ordinal()] = 2;
             try{
                q$f.a[KShellGuessQuestionStatus.PAPER_ABORT.ordinal()] = 3;
                try{
                   q$f.a[KShellGuessQuestionStatus.PAPER_STOPPED.ordinal()] = 4;
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
