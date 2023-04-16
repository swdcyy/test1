package com.kwai.player.KwaiBulletScreenState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiBulletScreenState extends Enum	// class@0012d0
{
    public static final KwaiBulletScreenState[] $VALUES;
    public static final KwaiBulletScreenState KwaiBulletScreenStateClose;
    public static final KwaiBulletScreenState KwaiBulletScreenStateComplete;
    public static final KwaiBulletScreenState KwaiBulletScreenStateFailed;
    public static final KwaiBulletScreenState KwaiBulletScreenStateOpening;
    public static final KwaiBulletScreenState KwaiBulletScreenStatePause;
    public static final KwaiBulletScreenState KwaiBulletScreenStatePlaying;
    public static final KwaiBulletScreenState KwaiBulletScreenStateReady;

    static {
       KwaiBulletScreenState kwaiBulletSc = new KwaiBulletScreenState("KwaiBulletScreenStateReady", 0);
       KwaiBulletScreenState.KwaiBulletScreenStateReady = kwaiBulletSc;
       KwaiBulletScreenState kwaiBulletSc1 = new KwaiBulletScreenState("KwaiBulletScreenStateOpening", 1);
       KwaiBulletScreenState.KwaiBulletScreenStateOpening = kwaiBulletSc1;
       KwaiBulletScreenState kwaiBulletSc2 = new KwaiBulletScreenState("KwaiBulletScreenStatePlaying", 2);
       KwaiBulletScreenState.KwaiBulletScreenStatePlaying = kwaiBulletSc2;
       KwaiBulletScreenState kwaiBulletSc3 = new KwaiBulletScreenState("KwaiBulletScreenStatePause", 3);
       KwaiBulletScreenState.KwaiBulletScreenStatePause = kwaiBulletSc3;
       KwaiBulletScreenState kwaiBulletSc4 = new KwaiBulletScreenState("KwaiBulletScreenStateComplete", 4);
       KwaiBulletScreenState.KwaiBulletScreenStateComplete = kwaiBulletSc4;
       KwaiBulletScreenState kwaiBulletSc5 = new KwaiBulletScreenState("KwaiBulletScreenStateClose", 5);
       KwaiBulletScreenState.KwaiBulletScreenStateClose = kwaiBulletSc5;
       KwaiBulletScreenState kwaiBulletSc6 = new KwaiBulletScreenState("KwaiBulletScreenStateFailed", 6);
       KwaiBulletScreenState.KwaiBulletScreenStateFailed = kwaiBulletSc6;
       KwaiBulletScreenState[] kwaiBulletSc7 = new KwaiBulletScreenState[]{kwaiBulletSc,kwaiBulletSc1,kwaiBulletSc2,kwaiBulletSc3,kwaiBulletSc4,kwaiBulletSc5,kwaiBulletSc6};
       KwaiBulletScreenState.$VALUES = kwaiBulletSc7;
    }
    public void KwaiBulletScreenState(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiBulletScreenState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiBulletScreenState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiBulletScreenState.class, p0);
    }
    public static KwaiBulletScreenState[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiBulletScreenState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiBulletScreenState.$VALUES.clone();
    }
}
