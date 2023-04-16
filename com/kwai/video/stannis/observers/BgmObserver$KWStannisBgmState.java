package com.kwai.video.stannis.observers.BgmObserver$KWStannisBgmState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BgmObserver$KWStannisBgmState extends Enum	// class@000c55
{
    public static final BgmObserver$KWStannisBgmState[] $VALUES;
    public static final BgmObserver$KWStannisBgmState KWStannisBgmStateCompleted;
    public static final BgmObserver$KWStannisBgmState KWStannisInvalidSeekPos;

    static {
       BgmObserver$KWStannisBgmState kWStannisBgm = new BgmObserver$KWStannisBgmState("KWStannisBgmStateCompleted", 0);
       BgmObserver$KWStannisBgmState.KWStannisBgmStateCompleted = kWStannisBgm;
       BgmObserver$KWStannisBgmState kWStannisBgm1 = new BgmObserver$KWStannisBgmState("KWStannisInvalidSeekPos", 1);
       BgmObserver$KWStannisBgmState.KWStannisInvalidSeekPos = kWStannisBgm1;
       BgmObserver$KWStannisBgmState[] kWStannisBgm2 = new BgmObserver$KWStannisBgmState[]{kWStannisBgm,kWStannisBgm1};
       BgmObserver$KWStannisBgmState.$VALUES = kWStannisBgm2;
    }
    public void BgmObserver$KWStannisBgmState(String p0,int p1){
       super(p0, p1);
    }
    public static BgmObserver$KWStannisBgmState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BgmObserver$KWStannisBgmState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BgmObserver$KWStannisBgmState.class, p0);
    }
    public static BgmObserver$KWStannisBgmState[] values(){
       Object obj = PatchProxy.apply(null, null, BgmObserver$KWStannisBgmState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BgmObserver$KWStannisBgmState.$VALUES.clone();
    }
}
