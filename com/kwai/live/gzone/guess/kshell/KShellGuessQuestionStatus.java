package com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KShellGuessQuestionStatus extends Enum	// class@000d22
{
    public int mState;
    public static final KShellGuessQuestionStatus[] $VALUES;
    public static final KShellGuessQuestionStatus PAPER_ABORT;
    public static final KShellGuessQuestionStatus PAPER_GUESSING;
    public static final KShellGuessQuestionStatus PAPER_GUESS_CUT_OFF;
    public static final KShellGuessQuestionStatus PAPER_STOPPED;
    public static final KShellGuessQuestionStatus PAPER_STOPPING;
    public static final KShellGuessQuestionStatus UNKNOWN;
    public static final KShellGuessQuestionStatus USER_INVOLVED;
    public static final KShellGuessQuestionStatus USER_INVOLVED_REVERSE;
    public static final KShellGuessQuestionStatus USER_UNINVOLVED;

    static {
       KShellGuessQuestionStatus kShellGuessQ = new KShellGuessQuestionStatus("UNKNOWN", 0, 0);
       KShellGuessQuestionStatus.UNKNOWN = kShellGuessQ;
       KShellGuessQuestionStatus kShellGuessQ1 = new KShellGuessQuestionStatus("USER_INVOLVED", 1, 21);
       KShellGuessQuestionStatus.USER_INVOLVED = kShellGuessQ1;
       KShellGuessQuestionStatus kShellGuessQ2 = new KShellGuessQuestionStatus("USER_UNINVOLVED", 2, 22);
       KShellGuessQuestionStatus.USER_UNINVOLVED = kShellGuessQ2;
       KShellGuessQuestionStatus kShellGuessQ3 = new KShellGuessQuestionStatus("USER_INVOLVED_REVERSE", 3, 23);
       KShellGuessQuestionStatus.USER_INVOLVED_REVERSE = kShellGuessQ3;
       KShellGuessQuestionStatus kShellGuessQ4 = new KShellGuessQuestionStatus("PAPER_GUESSING", 4, 1);
       KShellGuessQuestionStatus.PAPER_GUESSING = kShellGuessQ4;
       KShellGuessQuestionStatus kShellGuessQ5 = new KShellGuessQuestionStatus("PAPER_GUESS_CUT_OFF", 5, 2);
       KShellGuessQuestionStatus.PAPER_GUESS_CUT_OFF = kShellGuessQ5;
       KShellGuessQuestionStatus kShellGuessQ6 = new KShellGuessQuestionStatus("PAPER_ABORT", 6, 3);
       KShellGuessQuestionStatus.PAPER_ABORT = kShellGuessQ6;
       KShellGuessQuestionStatus kShellGuessQ7 = new KShellGuessQuestionStatus("PAPER_STOPPING", 7, 4);
       KShellGuessQuestionStatus.PAPER_STOPPING = kShellGuessQ7;
       KShellGuessQuestionStatus kShellGuessQ8 = new KShellGuessQuestionStatus("PAPER_STOPPED", 8, 5);
       KShellGuessQuestionStatus.PAPER_STOPPED = kShellGuessQ8;
       KShellGuessQuestionStatus[] kShellGuessQ9 = new KShellGuessQuestionStatus[9];
       kShellGuessQ9[0] = kShellGuessQ;
       kShellGuessQ9[1] = kShellGuessQ1;
       kShellGuessQ9[2] = kShellGuessQ2;
       kShellGuessQ9[3] = kShellGuessQ3;
       kShellGuessQ9[4] = kShellGuessQ4;
       kShellGuessQ9[5] = kShellGuessQ5;
       kShellGuessQ9[6] = kShellGuessQ6;
       kShellGuessQ9[7] = kShellGuessQ7;
       kShellGuessQ9[8] = kShellGuessQ8;
       KShellGuessQuestionStatus.$VALUES = kShellGuessQ9;
    }
    public void KShellGuessQuestionStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.mState = p2;
    }
    public static KShellGuessQuestionStatus fromStatus(int p0){
       switch (p0){
           case 1:
             return KShellGuessQuestionStatus.PAPER_GUESSING;
           case 2:
             return KShellGuessQuestionStatus.PAPER_GUESS_CUT_OFF;
           case 3:
             return KShellGuessQuestionStatus.PAPER_ABORT;
           case 4:
             return KShellGuessQuestionStatus.PAPER_STOPPING;
           case 5:
             return KShellGuessQuestionStatus.PAPER_STOPPED;
           case 6:
             return KShellGuessQuestionStatus.PAPER_ABORT;
           default:
             return KShellGuessQuestionStatus.UNKNOWN;
       }
    }
    public static KShellGuessQuestionStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KShellGuessQuestionStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KShellGuessQuestionStatus.class, p0);
    }
    public static KShellGuessQuestionStatus[] values(){
       Object obj = PatchProxy.apply(null, null, KShellGuessQuestionStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KShellGuessQuestionStatus.$VALUES.clone();
    }
    public int toInt(){
       return this.mState;
    }
}
