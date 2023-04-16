package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason extends Enum	// class@000fcf
{
    public static final LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason[] $VALUES;
    public static final LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason REASON_DELETE;
    public static final LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason REASON_INVALID;
    public static final LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason REASON_PUBLISH;
    public static final LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason REASON_SERVER_INTERRUPT;

    static {
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason liveScreenRe = new LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason("REASON_INVALID", 0);
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_INVALID = liveScreenRe;
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason liveScreenRe1 = new LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason("REASON_PUBLISH", 1);
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_PUBLISH = liveScreenRe1;
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason liveScreenRe2 = new LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason("REASON_DELETE", 2);
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_DELETE = liveScreenRe2;
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason liveScreenRe3 = new LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason("REASON_SERVER_INTERRUPT", 3);
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.REASON_SERVER_INTERRUPT = liveScreenRe3;
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason[] liveScreenRe4 = new LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason[]{liveScreenRe,liveScreenRe1,liveScreenRe2,liveScreenRe3};
       LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.$VALUES = liveScreenRe4;
    }
    public void LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.class, p0);
    }
    public static LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudienceScreenRecordBottomBarPresenter$LiveScreenRecordStopReason.$VALUES.clone();
    }
}
