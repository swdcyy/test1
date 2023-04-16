package com.kwai.live.gzone.guess.bean.KShellGuessResultStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KShellGuessResultStatus extends Enum	// class@000d14
{
    public static final KShellGuessResultStatus[] $VALUES;
    public static final KShellGuessResultStatus ABORT;
    public static final KShellGuessResultStatus INVOKE;
    public static final KShellGuessResultStatus LOSE;
    public static final KShellGuessResultStatus PING;
    public static final KShellGuessResultStatus UNKNOWN;
    public static final KShellGuessResultStatus WIN;

    static {
       KShellGuessResultStatus kShellGuessR = new KShellGuessResultStatus("UNKNOWN", 0);
       KShellGuessResultStatus.UNKNOWN = kShellGuessR;
       KShellGuessResultStatus kShellGuessR1 = new KShellGuessResultStatus("INVOKE", 1);
       KShellGuessResultStatus.INVOKE = kShellGuessR1;
       KShellGuessResultStatus kShellGuessR2 = new KShellGuessResultStatus("WIN", 2);
       KShellGuessResultStatus.WIN = kShellGuessR2;
       KShellGuessResultStatus kShellGuessR3 = new KShellGuessResultStatus("LOSE", 3);
       KShellGuessResultStatus.LOSE = kShellGuessR3;
       KShellGuessResultStatus kShellGuessR4 = new KShellGuessResultStatus("PING", 4);
       KShellGuessResultStatus.PING = kShellGuessR4;
       KShellGuessResultStatus kShellGuessR5 = new KShellGuessResultStatus("ABORT", 5);
       KShellGuessResultStatus.ABORT = kShellGuessR5;
       KShellGuessResultStatus[] kShellGuessR6 = new KShellGuessResultStatus[]{kShellGuessR,kShellGuessR1,kShellGuessR2,kShellGuessR3,kShellGuessR4,kShellGuessR5};
       KShellGuessResultStatus.$VALUES = kShellGuessR6;
    }
    public void KShellGuessResultStatus(String p0,int p1){
       super(p0, p1);
    }
    public static KShellGuessResultStatus fromStatus(int p0){
       if (p0 == 1) {
          return KShellGuessResultStatus.INVOKE;
       }
       if (p0 == 2) {
          return KShellGuessResultStatus.ABORT;
       }
       if (p0 == 3) {
          return KShellGuessResultStatus.WIN;
       }
       if (p0 == 4) {
          return KShellGuessResultStatus.LOSE;
       }
       if (p0 != 5) {
          return KShellGuessResultStatus.UNKNOWN;
       }
       return KShellGuessResultStatus.PING;
    }
    public static KShellGuessResultStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KShellGuessResultStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KShellGuessResultStatus.class, p0);
    }
    public static KShellGuessResultStatus[] values(){
       Object obj = PatchProxy.apply(null, null, KShellGuessResultStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KShellGuessResultStatus.$VALUES.clone();
    }
}
