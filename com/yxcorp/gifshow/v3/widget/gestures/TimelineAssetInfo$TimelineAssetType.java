package com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo$TimelineAssetType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TimelineAssetInfo$TimelineAssetType extends Enum	// class@001670
{
    public static final TimelineAssetInfo$TimelineAssetType[] $VALUES;
    public static final TimelineAssetInfo$TimelineAssetType NONE;
    public static final TimelineAssetInfo$TimelineAssetType STICKER;
    public static final TimelineAssetInfo$TimelineAssetType SUBTITLE;
    public static final TimelineAssetInfo$TimelineAssetType TEXT;
    public static final TimelineAssetInfo$TimelineAssetType TRACK;
    public static final TimelineAssetInfo$TimelineAssetType VIDEO_OPENING;

    static {
       TimelineAssetInfo$TimelineAssetType timelineAsse = new TimelineAssetInfo$TimelineAssetType("NONE", 0);
       TimelineAssetInfo$TimelineAssetType.NONE = timelineAsse;
       TimelineAssetInfo$TimelineAssetType timelineAsse1 = new TimelineAssetInfo$TimelineAssetType("TEXT", 1);
       TimelineAssetInfo$TimelineAssetType.TEXT = timelineAsse1;
       TimelineAssetInfo$TimelineAssetType timelineAsse2 = new TimelineAssetInfo$TimelineAssetType("SUBTITLE", 2);
       TimelineAssetInfo$TimelineAssetType.SUBTITLE = timelineAsse2;
       TimelineAssetInfo$TimelineAssetType timelineAsse3 = new TimelineAssetInfo$TimelineAssetType("STICKER", 3);
       TimelineAssetInfo$TimelineAssetType.STICKER = timelineAsse3;
       TimelineAssetInfo$TimelineAssetType timelineAsse4 = new TimelineAssetInfo$TimelineAssetType("TRACK", 4);
       TimelineAssetInfo$TimelineAssetType.TRACK = timelineAsse4;
       TimelineAssetInfo$TimelineAssetType timelineAsse5 = new TimelineAssetInfo$TimelineAssetType("VIDEO_OPENING", 5);
       TimelineAssetInfo$TimelineAssetType.VIDEO_OPENING = timelineAsse5;
       TimelineAssetInfo$TimelineAssetType[] timelineAsse6 = new TimelineAssetInfo$TimelineAssetType[]{timelineAsse,timelineAsse1,timelineAsse2,timelineAsse3,timelineAsse4,timelineAsse5};
       TimelineAssetInfo$TimelineAssetType.$VALUES = timelineAsse6;
    }
    public void TimelineAssetInfo$TimelineAssetType(String p0,int p1){
       super(p0, p1);
    }
    public static TimelineAssetInfo$TimelineAssetType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TimelineAssetInfo$TimelineAssetType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TimelineAssetInfo$TimelineAssetType.class, p0);
    }
    public static TimelineAssetInfo$TimelineAssetType[] values(){
       Object obj = PatchProxy.apply(null, null, TimelineAssetInfo$TimelineAssetType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimelineAssetInfo$TimelineAssetType.$VALUES.clone();
    }
}
