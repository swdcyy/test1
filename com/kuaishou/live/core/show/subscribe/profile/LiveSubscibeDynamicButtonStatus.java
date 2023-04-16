package com.kuaishou.live.core.show.subscribe.profile.LiveSubscibeDynamicButtonStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveSubscibeDynamicButtonStatus extends Enum	// class@001161
{
    public final int mValue;
    public static final LiveSubscibeDynamicButtonStatus[] $VALUES;
    public static final LiveSubscibeDynamicButtonStatus BOOKED;
    public static final LiveSubscibeDynamicButtonStatus CREATE_RESERVATION;
    public static final LiveSubscibeDynamicButtonStatus EDIT_DYNAMIC;
    public static final LiveSubscibeDynamicButtonStatus NOT_BOOK;
    public static final LiveSubscibeDynamicButtonStatus SEE_MORE;
    public static final LiveSubscibeDynamicButtonStatus UNKNOWN_STATUS;

    static {
       LiveSubscibeDynamicButtonStatus liveSubscibe = new LiveSubscibeDynamicButtonStatus("UNKNOWN_STATUS", 0, 0);
       LiveSubscibeDynamicButtonStatus.UNKNOWN_STATUS = liveSubscibe;
       LiveSubscibeDynamicButtonStatus liveSubscibe1 = new LiveSubscibeDynamicButtonStatus("NOT_BOOK", 1, 1);
       LiveSubscibeDynamicButtonStatus.NOT_BOOK = liveSubscibe1;
       LiveSubscibeDynamicButtonStatus liveSubscibe2 = new LiveSubscibeDynamicButtonStatus("BOOKED", 2, 2);
       LiveSubscibeDynamicButtonStatus.BOOKED = liveSubscibe2;
       LiveSubscibeDynamicButtonStatus liveSubscibe3 = new LiveSubscibeDynamicButtonStatus("SEE_MORE", 3, 3);
       LiveSubscibeDynamicButtonStatus.SEE_MORE = liveSubscibe3;
       LiveSubscibeDynamicButtonStatus liveSubscibe4 = new LiveSubscibeDynamicButtonStatus("CREATE_RESERVATION", 4, 4);
       LiveSubscibeDynamicButtonStatus.CREATE_RESERVATION = liveSubscibe4;
       LiveSubscibeDynamicButtonStatus liveSubscibe5 = new LiveSubscibeDynamicButtonStatus("EDIT_DYNAMIC", 5, 5);
       LiveSubscibeDynamicButtonStatus.EDIT_DYNAMIC = liveSubscibe5;
       LiveSubscibeDynamicButtonStatus[] liveSubscibe6 = new LiveSubscibeDynamicButtonStatus[]{liveSubscibe,liveSubscibe1,liveSubscibe2,liveSubscibe3,liveSubscibe4,liveSubscibe5};
       LiveSubscibeDynamicButtonStatus.$VALUES = liveSubscibe6;
    }
    public void LiveSubscibeDynamicButtonStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveSubscibeDynamicButtonStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSubscibeDynamicButtonStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSubscibeDynamicButtonStatus.class, p0);
    }
    public static LiveSubscibeDynamicButtonStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSubscibeDynamicButtonStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSubscibeDynamicButtonStatus.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
