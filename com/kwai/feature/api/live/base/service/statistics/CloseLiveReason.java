package com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CloseLiveReason extends Enum	// class@000fb3
{
    public int mReason;
    public static final CloseLiveReason[] $VALUES;
    public static final CloseLiveReason CLICK_BACK_KEY;
    public static final CloseLiveReason CLICK_CLOSE_BUTTON;
    public static final CloseLiveReason ENTER_OTHER_LIVE;
    public static final CloseLiveReason LIVE_STOP;
    public static final CloseLiveReason NO_DATA_AFTER_REDUCE;
    public static final CloseLiveReason PAID_SHOW_SWITCH_STATUS;
    public static final CloseLiveReason RIGHT_SWIPE;

    static {
       CloseLiveReason uCloseLiveRe = new CloseLiveReason("RIGHT_SWIPE", 0, 1);
       CloseLiveReason.RIGHT_SWIPE = uCloseLiveRe;
       CloseLiveReason uCloseLiveRe1 = new CloseLiveReason("PAID_SHOW_SWITCH_STATUS", 1, 22);
       CloseLiveReason.PAID_SHOW_SWITCH_STATUS = uCloseLiveRe1;
       CloseLiveReason uCloseLiveRe2 = new CloseLiveReason("CLICK_CLOSE_BUTTON", 2, 2);
       CloseLiveReason.CLICK_CLOSE_BUTTON = uCloseLiveRe2;
       CloseLiveReason uCloseLiveRe3 = new CloseLiveReason("CLICK_BACK_KEY", 3, 5);
       CloseLiveReason.CLICK_BACK_KEY = uCloseLiveRe3;
       CloseLiveReason uCloseLiveRe4 = new CloseLiveReason("LIVE_STOP", 4, 6);
       CloseLiveReason.LIVE_STOP = uCloseLiveRe4;
       CloseLiveReason uCloseLiveRe5 = new CloseLiveReason("ENTER_OTHER_LIVE", 5, 13);
       CloseLiveReason.ENTER_OTHER_LIVE = uCloseLiveRe5;
       CloseLiveReason uCloseLiveRe6 = new CloseLiveReason("NO_DATA_AFTER_REDUCE", 6, 23);
       CloseLiveReason.NO_DATA_AFTER_REDUCE = uCloseLiveRe6;
       CloseLiveReason[] uCloseLiveRe7 = new CloseLiveReason[]{uCloseLiveRe,uCloseLiveRe1,uCloseLiveRe2,uCloseLiveRe3,uCloseLiveRe4,uCloseLiveRe5,uCloseLiveRe6};
       CloseLiveReason.$VALUES = uCloseLiveRe7;
    }
    public void CloseLiveReason(String p0,int p1,int p2){
       super(p0, p1);
       this.mReason = p2;
    }
    public static CloseLiveReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CloseLiveReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CloseLiveReason.class, p0);
    }
    public static CloseLiveReason[] values(){
       Object obj = PatchProxy.apply(null, null, CloseLiveReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CloseLiveReason.$VALUES.clone();
    }
    public int getReason(){
       return this.mReason;
    }
}
