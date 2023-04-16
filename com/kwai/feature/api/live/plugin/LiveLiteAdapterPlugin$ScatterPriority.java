package com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteAdapterPlugin$ScatterPriority extends Enum	// class@000fec
{
    public static final LiveLiteAdapterPlugin$ScatterPriority[] $VALUES;
    public static final LiveLiteAdapterPlugin$ScatterPriority BottomBarContainer;
    public static final LiveLiteAdapterPlugin$ScatterPriority BottomBarItem;
    public static final LiveLiteAdapterPlugin$ScatterPriority Comment;
    public static final LiveLiteAdapterPlugin$ScatterPriority Default;
    public static final LiveLiteAdapterPlugin$ScatterPriority SideBarContainer;
    public static final LiveLiteAdapterPlugin$ScatterPriority SideBarItem;
    public static final LiveLiteAdapterPlugin$ScatterPriority SignalBlock;
    public static final LiveLiteAdapterPlugin$ScatterPriority UserStatusRequest;
    public static final LiveLiteAdapterPlugin$ScatterPriority WatchingCount;

    static {
       LiveLiteAdapterPlugin$ScatterPriority[] scatterPrior = new LiveLiteAdapterPlugin$ScatterPriority[9];
       LiveLiteAdapterPlugin$ScatterPriority scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("UserStatusRequest", 0);
       LiveLiteAdapterPlugin$ScatterPriority.UserStatusRequest = scatterPrior1;
       scatterPrior[0] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("SideBarItem", 1);
       LiveLiteAdapterPlugin$ScatterPriority.SideBarItem = scatterPrior1;
       scatterPrior[1] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("WatchingCount", 2);
       LiveLiteAdapterPlugin$ScatterPriority.WatchingCount = scatterPrior1;
       scatterPrior[2] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("SideBarContainer", 3);
       LiveLiteAdapterPlugin$ScatterPriority.SideBarContainer = scatterPrior1;
       scatterPrior[3] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("BottomBarItem", 4);
       LiveLiteAdapterPlugin$ScatterPriority.BottomBarItem = scatterPrior1;
       scatterPrior[4] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("BottomBarContainer", 5);
       LiveLiteAdapterPlugin$ScatterPriority.BottomBarContainer = scatterPrior1;
       scatterPrior[5] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("SignalBlock", 6);
       LiveLiteAdapterPlugin$ScatterPriority.SignalBlock = scatterPrior1;
       scatterPrior[6] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("Comment", 7);
       LiveLiteAdapterPlugin$ScatterPriority.Comment = scatterPrior1;
       scatterPrior[7] = scatterPrior1;
       scatterPrior1 = new LiveLiteAdapterPlugin$ScatterPriority("Default", 8);
       LiveLiteAdapterPlugin$ScatterPriority.Default = scatterPrior1;
       scatterPrior[8] = scatterPrior1;
       LiveLiteAdapterPlugin$ScatterPriority.$VALUES = scatterPrior;
    }
    public void LiveLiteAdapterPlugin$ScatterPriority(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteAdapterPlugin$ScatterPriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteAdapterPlugin$ScatterPriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteAdapterPlugin$ScatterPriority.class, p0);
    }
    public static LiveLiteAdapterPlugin$ScatterPriority[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteAdapterPlugin$ScatterPriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAdapterPlugin$ScatterPriority.$VALUES.clone();
    }
}
