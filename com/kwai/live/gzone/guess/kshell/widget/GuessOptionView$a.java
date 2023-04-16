package com.kwai.live.gzone.guess.kshell.widget.GuessOptionView$a;
import com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import java.lang.Enum;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;

public class GuessOptionView$a	// class@000d74
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[KShellGuessResultStatus.values().length];
       GuessOptionView$a.b = ointArray;
       try{
          int i = 1;
          ointArray[KShellGuessResultStatus.LOSE.ordinal()] = i;
          int i1 = 2;
          try{
             GuessOptionView$a.b[KShellGuessResultStatus.WIN.ordinal()] = i1;
             int i2 = 3;
             try{
                GuessOptionView$a.b[KShellGuessResultStatus.ABORT.ordinal()] = i2;
                try{
                   GuessOptionView$a.b[KShellGuessResultStatus.UNKNOWN.ordinal()] = 4;
                   int[] ointArray1 = new int[KShellGuessQuestionStatus.values().length];
                   try{
                      GuessOptionView$a.a = ointArray1;
                      ointArray1[KShellGuessQuestionStatus.USER_UNINVOLVED.ordinal()] = i;
                      try{
                         GuessOptionView$a.a[KShellGuessQuestionStatus.USER_INVOLVED.ordinal()] = e0;
                         try{
                            GuessOptionView$a.a[KShellGuessQuestionStatus.UNKNOWN.ordinal()] = i2;
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
