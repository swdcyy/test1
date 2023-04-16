package com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor$AbsorbStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TimeLineGestureProcessor$AbsorbStatus extends Enum	// class@00166b
{
    public static final TimeLineGestureProcessor$AbsorbStatus[] $VALUES;
    public static final TimeLineGestureProcessor$AbsorbStatus ABSORBED;
    public static final TimeLineGestureProcessor$AbsorbStatus BLOCKED_TUNING;
    public static final TimeLineGestureProcessor$AbsorbStatus IDLE;
    public static final TimeLineGestureProcessor$AbsorbStatus TUNING;

    static {
       TimeLineGestureProcessor$AbsorbStatus uAbsorbStatu1;
       TimeLineGestureProcessor$AbsorbStatus[] uAbsorbStatu = new TimeLineGestureProcessor$AbsorbStatus[]{uAbsorbStatu1,uAbsorbStatu1,uAbsorbStatu1,uAbsorbStatu1};
       uAbsorbStatu1 = new TimeLineGestureProcessor$AbsorbStatus("IDLE", 0);
       TimeLineGestureProcessor$AbsorbStatus.IDLE = uAbsorbStatu1;
       uAbsorbStatu1 = new TimeLineGestureProcessor$AbsorbStatus("ABSORBED", 1);
       TimeLineGestureProcessor$AbsorbStatus.ABSORBED = uAbsorbStatu1;
       uAbsorbStatu1 = new TimeLineGestureProcessor$AbsorbStatus("TUNING", 2);
       TimeLineGestureProcessor$AbsorbStatus.TUNING = uAbsorbStatu1;
       uAbsorbStatu1 = new TimeLineGestureProcessor$AbsorbStatus("BLOCKED_TUNING", 3);
       TimeLineGestureProcessor$AbsorbStatus.BLOCKED_TUNING = uAbsorbStatu1;
       TimeLineGestureProcessor$AbsorbStatus.$VALUES = uAbsorbStatu;
    }
    public void TimeLineGestureProcessor$AbsorbStatus(String p0,int p1){
       super(p0, p1);
    }
    public static TimeLineGestureProcessor$AbsorbStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TimeLineGestureProcessor$AbsorbStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TimeLineGestureProcessor$AbsorbStatus.class, p0);
    }
    public static TimeLineGestureProcessor$AbsorbStatus[] values(){
       Object obj = PatchProxy.apply(null, null, TimeLineGestureProcessor$AbsorbStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeLineGestureProcessor$AbsorbStatus.$VALUES.clone();
    }
}
