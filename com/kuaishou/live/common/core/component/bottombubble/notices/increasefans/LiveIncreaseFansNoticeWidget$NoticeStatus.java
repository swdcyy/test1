package com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeWidget$NoticeStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveIncreaseFansNoticeWidget$NoticeStatus extends Enum	// class@000fdb
{
    public static final LiveIncreaseFansNoticeWidget$NoticeStatus[] $VALUES;
    public static final LiveIncreaseFansNoticeWidget$NoticeStatus STATUS_SHOWING;
    public static final LiveIncreaseFansNoticeWidget$NoticeStatus STATUS_UNKNOWN;
    public static final LiveIncreaseFansNoticeWidget$NoticeStatus STATUS_UNSHOW;

    static {
       LiveIncreaseFansNoticeWidget$NoticeStatus noticeStatus = new LiveIncreaseFansNoticeWidget$NoticeStatus("STATUS_UNKNOWN", 0);
       LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_UNKNOWN = noticeStatus;
       LiveIncreaseFansNoticeWidget$NoticeStatus noticeStatus1 = new LiveIncreaseFansNoticeWidget$NoticeStatus("STATUS_SHOWING", 1);
       LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_SHOWING = noticeStatus1;
       LiveIncreaseFansNoticeWidget$NoticeStatus noticeStatus2 = new LiveIncreaseFansNoticeWidget$NoticeStatus("STATUS_UNSHOW", 2);
       LiveIncreaseFansNoticeWidget$NoticeStatus.STATUS_UNSHOW = noticeStatus2;
       LiveIncreaseFansNoticeWidget$NoticeStatus[] noticeStatus3 = new LiveIncreaseFansNoticeWidget$NoticeStatus[]{noticeStatus,noticeStatus1,noticeStatus2};
       LiveIncreaseFansNoticeWidget$NoticeStatus.$VALUES = noticeStatus3;
    }
    public void LiveIncreaseFansNoticeWidget$NoticeStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveIncreaseFansNoticeWidget$NoticeStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveIncreaseFansNoticeWidget$NoticeStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveIncreaseFansNoticeWidget$NoticeStatus.class, p0);
    }
    public static LiveIncreaseFansNoticeWidget$NoticeStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveIncreaseFansNoticeWidget$NoticeStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveIncreaseFansNoticeWidget$NoticeStatus.$VALUES.clone();
    }
}
