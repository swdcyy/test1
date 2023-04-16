package com.kwai.live.gzone.guess.kshell.widget.GuessOptionViewV2$a;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import java.lang.Enum;

public class GuessOptionViewV2$a	// class@000d76
{
    public static final int[] a;

    static {
       int[] ointArray = new int[KShellGuessQuestionStatus.values().length];
       try{
          GuessOptionViewV2$a.a = ointArray;
          ointArray[KShellGuessQuestionStatus.USER_UNINVOLVED.ordinal()] = 1;
          try{
             GuessOptionViewV2$a.a[KShellGuessQuestionStatus.USER_INVOLVED.ordinal()] = 2;
             try{
                GuessOptionViewV2$a.a[KShellGuessQuestionStatus.USER_INVOLVED_REVERSE.ordinal()] = 3;
                try{
                   GuessOptionViewV2$a.a[KShellGuessQuestionStatus.UNKNOWN.ordinal()] = 4;
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
