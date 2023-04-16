package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveFloatingWindowCloseType extends Enum	// class@000b5f
{
    public final int mUploadReason;
    public static final LiveFloatingWindowCloseType[] $VALUES;
    public static final LiveFloatingWindowCloseType BACK_TO_SAME_LIVE;
    public static final LiveFloatingWindowCloseType CLICK_CLOSE_BUTTON;
    public static final LiveFloatingWindowCloseType ENTER_OTHER_LIVE;
    public static final LiveFloatingWindowCloseType ENTER_OTHER_PAGE_TEMP_CLOSE;
    public static final LiveFloatingWindowCloseType ENTER_SHOOT;
    public static final LiveFloatingWindowCloseType EXTERNAL_CLOSE;
    public static final LiveFloatingWindowCloseType LIVE_END;
    public static final LiveFloatingWindowCloseType LOGOUT;
    public static final LiveFloatingWindowCloseType NO_FLOAT_WINDOW_PERMISSION;
    public static final LiveFloatingWindowCloseType SLIDE_CLOSE;
    public static final LiveFloatingWindowCloseType UNKNOWN;

    static {
       LiveFloatingWindowCloseType liveFloating = new LiveFloatingWindowCloseType("UNKNOWN", 0, 0);
       LiveFloatingWindowCloseType.UNKNOWN = liveFloating;
       LiveFloatingWindowCloseType liveFloating1 = new LiveFloatingWindowCloseType("LIVE_END", 1, 6);
       LiveFloatingWindowCloseType.LIVE_END = liveFloating1;
       LiveFloatingWindowCloseType liveFloating2 = new LiveFloatingWindowCloseType("NO_FLOAT_WINDOW_PERMISSION", 2, 11);
       LiveFloatingWindowCloseType.NO_FLOAT_WINDOW_PERMISSION = liveFloating2;
       LiveFloatingWindowCloseType liveFloating3 = new LiveFloatingWindowCloseType("BACK_TO_SAME_LIVE", 3, 10);
       LiveFloatingWindowCloseType.BACK_TO_SAME_LIVE = liveFloating3;
       LiveFloatingWindowCloseType liveFloating4 = new LiveFloatingWindowCloseType("ENTER_OTHER_LIVE", 4, 13);
       LiveFloatingWindowCloseType.ENTER_OTHER_LIVE = liveFloating4;
       LiveFloatingWindowCloseType liveFloating5 = new LiveFloatingWindowCloseType("ENTER_SHOOT", 5, 14);
       LiveFloatingWindowCloseType.ENTER_SHOOT = liveFloating5;
       LiveFloatingWindowCloseType liveFloating6 = new LiveFloatingWindowCloseType("LOGOUT", 6, 9);
       LiveFloatingWindowCloseType.LOGOUT = liveFloating6;
       LiveFloatingWindowCloseType liveFloating7 = new LiveFloatingWindowCloseType("CLICK_CLOSE_BUTTON", 7, 2);
       LiveFloatingWindowCloseType.CLICK_CLOSE_BUTTON = liveFloating7;
       LiveFloatingWindowCloseType liveFloating8 = new LiveFloatingWindowCloseType("SLIDE_CLOSE", 8, 12);
       LiveFloatingWindowCloseType.SLIDE_CLOSE = liveFloating8;
       LiveFloatingWindowCloseType liveFloating9 = new LiveFloatingWindowCloseType("EXTERNAL_CLOSE", 9, 18);
       LiveFloatingWindowCloseType.EXTERNAL_CLOSE = liveFloating9;
       LiveFloatingWindowCloseType liveFloating10 = new LiveFloatingWindowCloseType("ENTER_OTHER_PAGE_TEMP_CLOSE", 10, 18);
       LiveFloatingWindowCloseType.ENTER_OTHER_PAGE_TEMP_CLOSE = liveFloating10;
       LiveFloatingWindowCloseType[] liveFloating11 = new LiveFloatingWindowCloseType[11];
       liveFloating11[0] = liveFloating;
       liveFloating11[1] = liveFloating1;
       liveFloating11[2] = liveFloating2;
       liveFloating11[3] = liveFloating3;
       liveFloating11[4] = liveFloating4;
       liveFloating11[5] = liveFloating5;
       liveFloating11[6] = liveFloating6;
       liveFloating11[7] = liveFloating7;
       liveFloating11[8] = liveFloating8;
       liveFloating11[9] = liveFloating9;
       liveFloating11[10] = liveFloating10;
       LiveFloatingWindowCloseType.$VALUES = liveFloating11;
    }
    public void LiveFloatingWindowCloseType(String p0,int p1,int p2){
       super(p0, p1);
       this.mUploadReason = p2;
    }
    public static LiveFloatingWindowCloseType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFloatingWindowCloseType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFloatingWindowCloseType.class, p0);
    }
    public static LiveFloatingWindowCloseType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFloatingWindowCloseType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFloatingWindowCloseType.$VALUES.clone();
    }
    public int getUploadReason(){
       return this.mUploadReason;
    }
}
