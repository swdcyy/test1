package com.kwai.video.stannis.observers.BgmObserver$BgmErrorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BgmObserver$BgmErrorType extends Enum	// class@000c54
{
    public static final BgmObserver$BgmErrorType[] $VALUES;
    public static final BgmObserver$BgmErrorType ErrorIo;
    public static final BgmObserver$BgmErrorType Malformed;
    public static final BgmObserver$BgmErrorType None;
    public static final BgmObserver$BgmErrorType NotSupported;
    public static final BgmObserver$BgmErrorType Unknown;

    static {
       BgmObserver$BgmErrorType uBgmErrorTyp = new BgmObserver$BgmErrorType("None", 0);
       BgmObserver$BgmErrorType.None = uBgmErrorTyp;
       BgmObserver$BgmErrorType uBgmErrorTyp1 = new BgmObserver$BgmErrorType("Unknown", 1);
       BgmObserver$BgmErrorType.Unknown = uBgmErrorTyp1;
       BgmObserver$BgmErrorType uBgmErrorTyp2 = new BgmObserver$BgmErrorType("NotSupported", 2);
       BgmObserver$BgmErrorType.NotSupported = uBgmErrorTyp2;
       BgmObserver$BgmErrorType uBgmErrorTyp3 = new BgmObserver$BgmErrorType("ErrorIo", 3);
       BgmObserver$BgmErrorType.ErrorIo = uBgmErrorTyp3;
       BgmObserver$BgmErrorType uBgmErrorTyp4 = new BgmObserver$BgmErrorType("Malformed", 4);
       BgmObserver$BgmErrorType.Malformed = uBgmErrorTyp4;
       BgmObserver$BgmErrorType[] uBgmErrorTyp5 = new BgmObserver$BgmErrorType[]{uBgmErrorTyp,uBgmErrorTyp1,uBgmErrorTyp2,uBgmErrorTyp3,uBgmErrorTyp4};
       BgmObserver$BgmErrorType.$VALUES = uBgmErrorTyp5;
    }
    public void BgmObserver$BgmErrorType(String p0,int p1){
       super(p0, p1);
    }
    public static BgmObserver$BgmErrorType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BgmObserver$BgmErrorType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BgmObserver$BgmErrorType.class, p0);
    }
    public static BgmObserver$BgmErrorType[] values(){
       Object obj = PatchProxy.apply(null, null, BgmObserver$BgmErrorType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BgmObserver$BgmErrorType.$VALUES.clone();
    }
}
