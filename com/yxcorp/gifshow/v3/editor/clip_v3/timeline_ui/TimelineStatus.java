package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TimelineStatus extends Enum	// class@000dd9
{
    public static final TimelineStatus[] $VALUES;
    public static final TimelineStatus DRAGGING;
    public static final TimelineStatus IDLE;
    public static final TimelineStatus SCROLLING;

    static {
       TimelineStatus timelineStat1;
       TimelineStatus[] timelineStat = new TimelineStatus[]{timelineStat1,timelineStat1,timelineStat1};
       timelineStat1 = new TimelineStatus("IDLE", 0);
       TimelineStatus.IDLE = timelineStat1;
       timelineStat1 = new TimelineStatus("DRAGGING", 1);
       TimelineStatus.DRAGGING = timelineStat1;
       timelineStat1 = new TimelineStatus("SCROLLING", 2);
       TimelineStatus.SCROLLING = timelineStat1;
       TimelineStatus.$VALUES = timelineStat;
    }
    public void TimelineStatus(String p0,int p1){
       super(p0, p1);
    }
    public static TimelineStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TimelineStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TimelineStatus.class, p0);
    }
    public static TimelineStatus[] values(){
       Object obj = PatchProxy.apply(null, null, TimelineStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimelineStatus.$VALUES.clone();
    }
}
