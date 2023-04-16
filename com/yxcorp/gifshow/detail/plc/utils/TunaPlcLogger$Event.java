package com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaPlcLogger$Event extends Enum	// class@00169e
{
    public final String mEventName;
    public static final TunaPlcLogger$Event[] $VALUES;
    public static final TunaPlcLogger$Event AUTO_DISMISS;
    public static final TunaPlcLogger$Event INIT_STRONG_PLC;
    public static final TunaPlcLogger$Event INIT_WEAK_PLC;
    public static final TunaPlcLogger$Event PLC_REFRESH_INIT;
    public static final TunaPlcLogger$Event STRONG_TO_WEAK;
    public static final TunaPlcLogger$Event TRY_USE_TK;
    public static final TunaPlcLogger$Event USE_TK_FAILED;
    public static final TunaPlcLogger$Event WEAK_TO_STRONG;

    static {
       TunaPlcLogger$Event uEvent;
       TunaPlcLogger$Event[] uEventArray = new TunaPlcLogger$Event[]{uEvent,uEvent,uEvent,uEvent,uEvent,uEvent,uEvent,uEvent};
       uEvent = new TunaPlcLogger$Event("TRY_USE_TK", 0, "TRY_USE_TK");
       TunaPlcLogger$Event.TRY_USE_TK = uEvent;
       uEvent = new TunaPlcLogger$Event("USE_TK_FAILED", 1, "USE_TK_FAILED");
       TunaPlcLogger$Event.USE_TK_FAILED = uEvent;
       uEvent = new TunaPlcLogger$Event("INIT_WEAK_PLC", 2, "INIT_WEAK_PLC");
       TunaPlcLogger$Event.INIT_WEAK_PLC = uEvent;
       uEvent = new TunaPlcLogger$Event("INIT_STRONG_PLC", 3, "INIT_STRONG_PLC");
       TunaPlcLogger$Event.INIT_STRONG_PLC = uEvent;
       uEvent = new TunaPlcLogger$Event("WEAK_TO_STRONG", 4, "WEAK_TO_STRONG");
       TunaPlcLogger$Event.WEAK_TO_STRONG = uEvent;
       uEvent = new TunaPlcLogger$Event("STRONG_TO_WEAK", 5, "STRONG_TO_WEAK");
       TunaPlcLogger$Event.STRONG_TO_WEAK = uEvent;
       uEvent = new TunaPlcLogger$Event("AUTO_DISMISS", 6, "AUTO_DISMISS");
       TunaPlcLogger$Event.AUTO_DISMISS = uEvent;
       uEvent = new TunaPlcLogger$Event("PLC_REFRESH_INIT", 7, "PLC_REFRESH_INIT");
       TunaPlcLogger$Event.PLC_REFRESH_INIT = uEvent;
       TunaPlcLogger$Event.$VALUES = uEventArray;
    }
    public void TunaPlcLogger$Event(String p0,int p1,String p2){
       super(p0, p1);
       this.mEventName = p2;
    }
    public static TunaPlcLogger$Event valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TunaPlcLogger$Event.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TunaPlcLogger$Event.class, p0);
    }
    public static TunaPlcLogger$Event[] values(){
       Object obj = PatchProxy.apply(null, null, TunaPlcLogger$Event.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TunaPlcLogger$Event.$VALUES.clone();
    }
    public final String eventName(){
       return this.mEventName;
    }
}
