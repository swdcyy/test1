package com.kuaishou.live.common.core.component.watchingcount.updater.WatchingCountData$SourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WatchingCountData$SourceType extends Enum	// class@0017c5
{
    public static final WatchingCountData$SourceType[] $VALUES;
    public static final WatchingCountData$SourceType API_LOOP;
    public static final WatchingCountData$SourceType API_START_PLAY;
    public static final WatchingCountData$SourceType API_START_PLAY_OF_TOTAL;
    public static final WatchingCountData$SourceType SC_ACTIVITY_LIVE_INFO;
    public static final WatchingCountData$SourceType SC_FEED_PUSH;
    public static final WatchingCountData$SourceType SC_LIVE_WATCHING_LIST;

    static {
       WatchingCountData$SourceType sourceType = new WatchingCountData$SourceType("API_LOOP", 0);
       WatchingCountData$SourceType.API_LOOP = sourceType;
       WatchingCountData$SourceType sourceType1 = new WatchingCountData$SourceType("API_START_PLAY", 1);
       WatchingCountData$SourceType.API_START_PLAY = sourceType1;
       WatchingCountData$SourceType sourceType2 = new WatchingCountData$SourceType("SC_FEED_PUSH", 2);
       WatchingCountData$SourceType.SC_FEED_PUSH = sourceType2;
       WatchingCountData$SourceType sourceType3 = new WatchingCountData$SourceType("SC_LIVE_WATCHING_LIST", 3);
       WatchingCountData$SourceType.SC_LIVE_WATCHING_LIST = sourceType3;
       WatchingCountData$SourceType sourceType4 = new WatchingCountData$SourceType("API_START_PLAY_OF_TOTAL", 4);
       WatchingCountData$SourceType.API_START_PLAY_OF_TOTAL = sourceType4;
       WatchingCountData$SourceType sourceType5 = new WatchingCountData$SourceType("SC_ACTIVITY_LIVE_INFO", 5);
       WatchingCountData$SourceType.SC_ACTIVITY_LIVE_INFO = sourceType5;
       WatchingCountData$SourceType[] sourceTypeAr = new WatchingCountData$SourceType[]{sourceType,sourceType1,sourceType2,sourceType3,sourceType4,sourceType5};
       WatchingCountData$SourceType.$VALUES = sourceTypeAr;
    }
    public void WatchingCountData$SourceType(String p0,int p1){
       super(p0, p1);
    }
    public static WatchingCountData$SourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WatchingCountData$SourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WatchingCountData$SourceType.class, p0);
    }
    public static WatchingCountData$SourceType[] values(){
       Object obj = PatchProxy.apply(null, null, WatchingCountData$SourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WatchingCountData$SourceType.$VALUES.clone();
    }
}
