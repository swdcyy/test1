package com.kuaishou.live.livestage.CloseCameraReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CloseCameraReason extends Enum	// class@000bcb
{
    public static final CloseCameraReason[] $VALUES;
    public static final CloseCameraReason CAMERA_CHANGED;
    public static final CloseCameraReason LEAVE_RTC_MEDIA_ROOM;
    public static final CloseCameraReason RELEASE_CAMERA_MANAGER;
    public static final CloseCameraReason RELEASE_LIVE_STAGE_MANAGER;
    public static final CloseCameraReason STAGE_INITIAL_STATE;
    public static final CloseCameraReason USER_CLOSE;

    static {
       CloseCameraReason uCloseCamera1;
       CloseCameraReason[] uCloseCamera = new CloseCameraReason[]{uCloseCamera1,uCloseCamera1,uCloseCamera1,uCloseCamera1,uCloseCamera1,uCloseCamera1};
       uCloseCamera1 = new CloseCameraReason("USER_CLOSE", 0);
       CloseCameraReason.USER_CLOSE = uCloseCamera1;
       uCloseCamera1 = new CloseCameraReason("LEAVE_RTC_MEDIA_ROOM", 1);
       CloseCameraReason.LEAVE_RTC_MEDIA_ROOM = uCloseCamera1;
       uCloseCamera1 = new CloseCameraReason("STAGE_INITIAL_STATE", 2);
       CloseCameraReason.STAGE_INITIAL_STATE = uCloseCamera1;
       uCloseCamera1 = new CloseCameraReason("RELEASE_LIVE_STAGE_MANAGER", 3);
       CloseCameraReason.RELEASE_LIVE_STAGE_MANAGER = uCloseCamera1;
       uCloseCamera1 = new CloseCameraReason("RELEASE_CAMERA_MANAGER", 4);
       CloseCameraReason.RELEASE_CAMERA_MANAGER = uCloseCamera1;
       uCloseCamera1 = new CloseCameraReason("CAMERA_CHANGED", 5);
       CloseCameraReason.CAMERA_CHANGED = uCloseCamera1;
       CloseCameraReason.$VALUES = uCloseCamera;
    }
    public void CloseCameraReason(String p0,int p1){
       super(p0, p1);
    }
    public static CloseCameraReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CloseCameraReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CloseCameraReason.class, p0);
    }
    public static CloseCameraReason[] values(){
       Object obj = PatchProxy.apply(null, null, CloseCameraReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CloseCameraReason.$VALUES.clone();
    }
}
